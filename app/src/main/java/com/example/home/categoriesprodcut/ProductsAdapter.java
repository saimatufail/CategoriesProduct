package com.example.home.categoriesprodcut;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.CustomViewHolder> {

    List<ProductListModel> list;
    Context con;

    public ProductsAdapter(List<ProductListModel> list, Context con) {
        this.list = list;
        this.con = con;
    }

    @Override
    public ProductsAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_item, parent, false);

        return new ProductsAdapter.CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductsAdapter.CustomViewHolder holder, final int position) {
        holder.id.setText("Number of Colors : "+((list.get(position).productList.size()-1)/2));
        holder.name.setText(""+list.get(position).productName);
        holder.mainLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((list.get(position).productList.size()-1)/2) > 0)
                {
                    ProductDetailActivity.itemList = list.get(position).productList;
                    con.startActivity(new Intent(con,ProductDetailActivity.class));
                }
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