package com.example.home.categoriesprodcut;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import com.kaopiz.kprogresshud.KProgressHUD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsActivity extends AppCompatActivity
{
    List<ProductListModel> productModelList = new ArrayList<>();

    OkHttpClient client;
    String BASE_URL = "http://co2.techrecto.com/rest/all/";
    Retrofit retrofit;
    KProgressHUD dialog;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));

        recyclerView = findViewById(R.id.rv);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request.Builder requestBuilder = original.newBuilder()
                        .header("Authorization", "Bearer cr06algj5vje0ofset5if4jqkysg2l0d");

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        client = httpClient.build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                //.addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        dialog = KProgressHUD.create(ProductsActivity.this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait")
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();

        retrofit.create(Api.class).getProducts().enqueue(new Callback<ProductsPojo>() {
            @Override
            public void onResponse(Call<ProductsPojo> call, retrofit2.Response<ProductsPojo> response) {
                dialog.dismiss();
                if (response.isSuccessful()) {
                    String previousProduct = "";
                    ProductListModel productListModel;
                    for (int a = 0; a < response.body().getItems().size(); a++) {
                        String[] splitedName = response.body().getItems().get(a).getName().split("-");
                        if (!previousProduct.equals(splitedName[0])) {
                            previousProduct = splitedName[0];
                            productListModel = new ProductListModel();
                            productListModel.setProductName(previousProduct);
                            if (response.body().getItems().get(a).getName().contains(previousProduct)) {
                                productListModel.productList = new ArrayList<>();
                                for (int i = 0; i < response.body().getItems().size(); i++) {
                                    if (response.body().getItems().get(i).getName().contains(previousProduct)) {
                                        productListModel.productList.add(response.body().getItems().get(i));
                                    }
                                }
                            }
                            productModelList.add(productListModel);
                        }
                    }
                    recyclerView.setAdapter(new ProductsAdapter(productModelList, ProductsActivity.this));
                    recyclerView.setLayoutManager(new LinearLayoutManager(ProductsActivity.this));
                } else {
                    Toast.makeText(ProductsActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ProductsPojo> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(ProductsActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case android.R.id.home:
                    this.finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);


            }
        }

    }
