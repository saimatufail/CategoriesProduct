package com.example.home.categoriesprodcut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductDetailActivity extends AppCompatActivity {

    public static List<ProductsPojo.Item> itemList;
    TextView productName, productPrice, productSku, productColor, colorOneTV, colorTwoTV, colorThreeTV, colorFourTV, selectedProductID;
    RelativeLayout oneRL, twoRL, threeRL, fourRL;
    ImageView oneIV, twoIV, threeIV, fourIV;
    String previousColor = "";
    int selectedID = 0;
    String selelctedname ,selectedsku;
    Button automaticBtn, manualBtn;
    ImageView image;
    RadioButton genderradioButton;
    RadioGroup radioGroup, cordradio;
    TextView cord, getTextview;
    RadioGroup radioGroupmanaual;
    RadioButton left, right;
    EditText inside, outside;
    LinearLayout linear;
    Button showselectedbutton;
    TextView price, remote, remoteprice, rate;
    private Button btnDisplay, order, deselct;
    Button tokenaddtocart;
    String gettoken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        productName = findViewById(R.id.productName);
        String[] splitedName = itemList.get(0).getName().split("-");
        productName.setText(splitedName[0]);

        productPrice = findViewById(R.id.productPrice);
        productPrice.setText("Rs : " + itemList.get(0).getPrice());

//        rate = findViewById(R.id.rate);
//        rate.setText(itemList.get(0).getPrice());

        productSku = findViewById(R.id.productSku);
        String[] splitedSKU = itemList.get(0).getSku().split("-");
        productSku.setText(splitedSKU[0]);

        productColor = findViewById(R.id.productColor);
        String[] splitedSelectedColor = itemList.get(0).getName().split("-");
        productColor.setText(splitedSelectedColor[1]);

        colorOneTV = findViewById(R.id.colorOneTV);
        colorTwoTV = findViewById(R.id.colorTwoTV);
        colorThreeTV = findViewById(R.id.colorThreeTV);
        colorFourTV = findViewById(R.id.colorFourTV);

        oneIV = findViewById(R.id.oneIV);
        twoIV = findViewById(R.id.twoIV);
        threeIV = findViewById(R.id.threeIV);
        fourIV = findViewById(R.id.fourIV);

        oneRL = findViewById(R.id.oneRL);
        oneRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productColor.setText(colorOneTV.getText().toString());
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString())) {
                        selectedID = itemList.get(a).getId();
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                        selectedProductID.setText("" + selectedID);
                    }
                }
            }
        });
        twoRL = findViewById(R.id.twoRL);
        twoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productColor.setText(colorTwoTV.getText().toString());
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString())) {
                        selectedID = itemList.get(a).getId();
                        selectedProductID.setText("" + selectedID);
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                    }
                }
            }
        });
        threeRL = findViewById(R.id.threeRL);
        threeRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productColor.setText(colorThreeTV.getText().toString());
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString())) {
                        selectedID = itemList.get(a).getId();
                        selectedProductID.setText("" + selectedID);
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                    }
                }
            }
        });
        fourRL = findViewById(R.id.fourRL);
        fourRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                productColor.setText(colorFourTV.getText().toString());
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString())) {
                        selectedID = itemList.get(a).getId();
                        selectedProductID.setText("" + selectedID);
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                    }
                }
            }
        });

        int numberOfColors = (itemList.size() - 1) / 2;
        if (numberOfColors == 1) {
            twoRL.setVisibility(View.INVISIBLE);
            threeRL.setVisibility(View.INVISIBLE);
            fourRL.setVisibility(View.INVISIBLE);
        } else if (numberOfColors == 2) {
            threeRL.setVisibility(View.INVISIBLE);
            fourRL.setVisibility(View.INVISIBLE);
        } else if (numberOfColors == 3) {
            fourRL.setVisibility(View.INVISIBLE);
        }

        automaticBtn = findViewById(R.id.automaticBtn);
        automaticBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString()) && itemList.get(a).getName().contains("Automatic")) {
                        selectedID = itemList.get(a).getId();
                        selectedProductID.setText("" + selectedID);
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                    }
                }
            }
        });

        manualBtn = findViewById(R.id.manualBtn);
        manualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int a = 0; a < itemList.size(); a++) {
                    if (itemList.get(a).getName().contains(productColor.getText().toString()) && itemList.get(a).getName().contains("Manual")) {
                        selectedID = itemList.get(a).getId();
                        selectedProductID.setText("" + selectedID);
                        selelctedname = itemList.get(a).getName();
                        productName.setText(""+selelctedname);
                        selectedsku = itemList.get(a).getSku();
                        productSku.setText(""+selectedsku);
                    }
                }
            }
        });

        for (int a = 0; a < itemList.size(); a++) {
            String[] splitedColor = itemList.get(a).getName().split("-");
            if (splitedColor.length > 1) {
                if (!productColor.equals(splitedColor[1])) {
                    previousColor = splitedColor[1];
                    if (a == 0) {
                        colorOneTV.setText(previousColor);
                        setColor(previousColor, oneIV);
                    } else if (a == 2) {
                        colorTwoTV.setText(previousColor);
                        setColor(previousColor, twoIV);
                    } else if (a == 4) {
                        colorThreeTV.setText(previousColor);
                        setColor(previousColor, threeIV);
                    } else if (a == 6) {
                        colorFourTV.setText(previousColor);
                        setColor(previousColor, fourIV);
                    }
                }
            }
        }

        selectedID = itemList.get(0).getId();
        selectedProductID = findViewById(R.id.selectedID);
        selectedProductID.setText("" + selectedID);
    }

    private void setColor(String color, ImageView imageView) {
        if (color.equalsIgnoreCase("Red")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_red_color));
        } else if (color.equalsIgnoreCase("Brown")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_brown_color));
        } else if (color.equalsIgnoreCase("Cyan")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_cyan_color));
        } else if (color.equalsIgnoreCase("Black")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_black_color));
        } else if (color.equalsIgnoreCase("Pink")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_pink_color));
        } else if (color.equalsIgnoreCase("Blue")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_blue_color));
        } else if (color.equalsIgnoreCase("Grey")) {
            imageView.setBackgroundColor(getResources().getColor(R.color.product_grey_color));
        }
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupmanaual);
        cordradio = (RadioGroup) findViewById(R.id.cordradio);


        radioGroupmanaual = (RadioGroup) findViewById(R.id.radioGroupmanaual);

        cord = (TextView) findViewById(R.id.cord);
//        cordradio = (RadioGroup) findViewById(R.id.cordradio);
        cordradio = (RadioGroup) findViewById(R.id.cordradio);
        left = (RadioButton) findViewById(R.id.Left);
        right = (RadioButton) findViewById(R.id.right);
        inside = (EditText) findViewById(R.id.inside);
        outside = (EditText) findViewById(R.id.outside);
        showselectedbutton = (Button) findViewById(R.id.showselectedbutton);
//        order = (Button) findViewById(R.id.order);
        final int selectedId = radioGroup.getCheckedRadioButtonId();
        cord = (TextView) findViewById(R.id.cord);
        getTextview = (TextView) findViewById(R.id.get);
//        linear = (LinearLayout) findViewById(R.id.linear);
        genderradioButton = (RadioButton) findViewById(selectedId);
        remote = (TextView) findViewById(R.id.Remote);
        remoteprice = (TextView) findViewById(R.id.remoteprice);
        //price = (TextView) findViewById(R.id.price);
        radioGroupmanaual.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.radioMale) {

                    cord.setVisibility(View.VISIBLE);
                    //  cordradio.setVisibility(View.VISIBLE);
                    inside.setVisibility(View.VISIBLE);
                    outside.setVisibility(View.VISIBLE);
                    cordradio.setVisibility(View.VISIBLE);
                    left.setVisibility(View.VISIBLE);
                    right.setVisibility(View.VISIBLE);
                    inside.setVisibility(View.VISIBLE);
                    outside.setVisibility(View.VISIBLE);
                    showselectedbutton.setVisibility(View.GONE);
                    tokenaddtocart.setVisibility(View.VISIBLE);
                    remote.setVisibility(View.GONE);
                    remoteprice.setVisibility(View.GONE);

                } else if (checkedId == R.id.radioFemale) {

//                    Toast.makeText(getApplicationContext(), "choice: Sound",
//
//                            Toast.LENGTH_SHORT).show();
                    cord.setVisibility(View.GONE);
                    //  cordradio.setVisibility(View.VISIBLE);
                    inside.setVisibility(View.GONE);
                    remote.setVisibility(View.VISIBLE);
//                   remoteprice.setVisibility(View.VISIBLE);
                    outside.setVisibility(View.GONE);
                    cordradio.setVisibility(View.GONE);
                    left.setVisibility(View.GONE);
                    right.setVisibility(View.GONE);
                    inside.setVisibility(View.GONE);
                    outside.setVisibility(View.GONE);

                    showselectedbutton.setVisibility(View.GONE);
                    tokenaddtocart.setVisibility(View.VISIBLE);
                    remote.setVisibility(View.VISIBLE);
                    remoteprice.setVisibility(View.VISIBLE);
                    TextView rate = (TextView) findViewById(R.id.rate);
                    //  rate.setText(itemList.get(0).getPrice());


                    String getprice = (productPrice.getText().toString());
                    // String getrate = (rate.getText().toString());
                    String getremoteprice = getprice + 25;
                    remoteprice.setText("PKR:" + (getremoteprice));

//                    res=Integer.parseInt(mynum1)+Integer.parseInt(mynum2);
//                    resu.setText(Integer.toString(res));


                } else {

//                    Toast.makeText(getApplicationContext(), "choice: Vibration",
//

//                            Toast.LENGTH_SHORT).show();

                }

            }


        });
        tokenaddtocart = (Button) findViewById(R.id.tokenaddtocart);
        tokenaddtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JsonObject raw = new JsonObject();
//                raw.addProperty("username", loginEmail.getText().toString());
//                raw.addProperty("password", loginPassword.getText().toString());
                ApiClient.getWebServices().generatecard(raw).enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        if (response.isSuccessful()) {
                            Toast.makeText(ProductDetailActivity.this, "" + response.body(), Toast.LENGTH_SHORT).show();
                            gettoken = String.valueOf("" + response.body());
                            //Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                            //  Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();

                            //  intent.putExtra("gettbasicemail", String.valueOf(""+response.body()));


                            //startActivity(intent);
                        } else {
                            Toast.makeText(ProductDetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Toast.makeText(ProductDetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    }

                });
            }
        });
    }

}

