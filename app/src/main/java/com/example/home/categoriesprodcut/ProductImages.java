package com.example.home.categoriesprodcut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.kaopiz.kprogresshud.KProgressHUD;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductImages extends AppCompatActivity {

    OkHttpClient client;
    public static String BASE_URL = "http://co2.techrecto.com/rest/V1/";
    Retrofit retrofit;
    KProgressHUD dialog;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_images);

        recyclerView = findViewById(R.id.rv);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                Request.Builder requestBuilder = original.newBuilder()
                        .header("Authorization", "cr06algj5vje0ofset5if4jqkysg2l0d");

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

        dialog = KProgressHUD.create(ProductImages.this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait")
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();

        retrofit.create(Api.class).getCategoriesid().enqueue(new Callback<CategoryidPojo>() {
            @Override
            public void onResponse(Call<CategoryidPojo> call, retrofit2.Response<CategoryidPojo> response) {
                dialog.dismiss();
                if(response.isSuccessful())
                {
                    recyclerView.setAdapter(new ProductImagesAdapter(response.body().getChildrenData().get(0).getChildrenData(),ProductImages.this));
                    recyclerView.setLayoutManager(new LinearLayoutManager(ProductImages.this));
                }
                else
                {
                    Toast.makeText(ProductImages.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CategoryidPojo> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(ProductImages.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
