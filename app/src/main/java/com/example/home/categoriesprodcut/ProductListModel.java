package com.example.home.categoriesprodcut;

import java.util.List;

public class ProductListModel {

    public List<ProductsPojo.Item> productList;
    String productName;

    public List<ProductsPojo.Item> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductsPojo.Item> productList) {
        this.productList = productList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
