package com.example.home.categoriesprodcut;

import android.content.Intent;

import com.example.home.categoriesprodcut.CategoryPojo;
import com.example.home.categoriesprodcut.ProductsPojo;
import com.google.gson.JsonObject;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {
    String id = null;
//    final Intent innn = getIntent();
//    basicemail.setText(innn.getStringExtra("getid"));

    @GET("V1/categories?Authorization Bearer=cr06algj5vje0ofset5if4jqkysg2l0d")
    Call<CategoryPojo> getCategories();

    @GET("categories/3")
    Call<CategoryidPojo> getCategoriesid();


   @GET("V1/products/?searchCriteria[filter_groups][0][filters][0][field]=category_id&searchCriteria[filter_groups][0][filters][0][value]=3&searchCriteria[filter_groups][0][filters][0][condition_type]=eq&Authorization Bearer=cr06algj5vje0ofset5if4jqkysg2l0d")
    Call<ProductsPojo> getProducts();
}
