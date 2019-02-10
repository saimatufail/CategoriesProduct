package com.example.home.categoriesprodcut;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CustomViewHolder> {

    public static List<CategoryPojo.ChildData_> list;
    Context con;

    public CategoriesAdapter(List<CategoryPojo.ChildData_> list,Context con) {
        this.list = list;
        this.con = con;
    }

    @Override
    public CategoriesAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_categories_adapter, parent, false);

        return new CategoriesAdapter.CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoriesAdapter.CustomViewHolder holder, final int position) {
        holder.id.setText(""+list.get(position).getId());
        final String temp = (String) holder.id.getText();

        holder.name.setText(""+list.get(position).getName());
        holder.mainLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(con ,ProductsActivity.class);
                i.putExtra("getid", temp);
                con.startActivity(i);
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
        LinearLayout mainLL;

        public CustomViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.idTV);
            name = (TextView) view.findViewById(R.id.nameTV);
            mainLL = view.findViewById(R.id.mainLL);
        }
    }
}