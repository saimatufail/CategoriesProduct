package com.example.home.categoriesprodcut;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductImagesAdapter extends RecyclerView.Adapter<ProductImagesAdapter.CustomViewHolder> {

    public static List<CategoryidPojo.custom_attributes_> list;
    Context con;

    public ProductImagesAdapter(List<CategoryidPojo.custom_attributes_> list,Context con) {
        this.list = list;
        this.con = con;
    }

    @Override
    public ProductImagesAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_item, parent, false);

        return new ProductImagesAdapter.CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductImagesAdapter.CustomViewHolder holder, final int position) {
        holder.id.setText(""+list.get(position).getattribute_code());
//        holder.name.setText(""+list.get(position).));
        holder.mainLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                SubCategoryActivity.list = list.get(position).getChildrenData();
//                con.startActivity(new Intent(con,SubCategoryActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView id ,name;
        RelativeLayout mainLL;

        public CustomViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.idTV);
            name = (TextView) view.findViewById(R.id.nameTV);
            mainLL = view.findViewById(R.id.mainLL);
        }
    }
}