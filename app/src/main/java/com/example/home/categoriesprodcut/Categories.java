package com.example.home.categoriesprodcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class Categories extends AppCompatActivity {

    OkHttpClient client;
    public static String BASE_URL = "http://co2.techrecto.com/rest/all/";
    Retrofit retrofit;
    KProgressHUD dialog;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        recyclerView = findViewById(R.id.rv);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
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

        dialog = KProgressHUD.create(Categories.this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Please wait")
                .setCancellable(false)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)
                .show();

        retrofit.create(Api.class).getCategories().enqueue(new Callback<CategoryPojo>() {
            @Override
            public void onResponse(Call<CategoryPojo> call, retrofit2.Response<CategoryPojo> response) {
                dialog.dismiss();
                if(response.isSuccessful())
                {
                    recyclerView.setAdapter(new CategoriesAdapter(response.body().getChildrenData().get(0).getChildrenData(),Categories.this));
                    recyclerView.setLayoutManager(new LinearLayoutManager(Categories.this));
                }
                else
                {
                    Toast.makeText(Categories.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CategoryPojo> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(Categories.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
