package com.example.home.categoriesprodcut;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupActivity extends AppCompatActivity {

    Button btnLogin;
    EditText loginfirstname, loginlastname, loginPassword, loginEmail;
    Button btnSignup;
    TextView login;
    EditText basicemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setHomeButtonEnabled(true);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignupActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

      basicemail = (EditText) findViewById(R.id.getbasicemail);
        final Intent innn = getIntent();
    basicemail.setText(innn.getStringExtra("gettbasicemail"));

        btnSignup = (Button) findViewById(R.id.btnsignup);
        loginfirstname = (EditText) findViewById(R.id.firstname);
        loginlastname = (EditText) findViewById(R.id.lastname);
        loginEmail = findViewById(R.id.email);
        loginPassword = findViewById(R.id.password);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JsonObject raw = new JsonObject();
                raw.addProperty("password", loginPassword.getText().toString());
                JsonObject customerJSON = new JsonObject();
                customerJSON.addProperty("email", loginEmail.getText().toString());
                customerJSON.addProperty("firstname", loginfirstname.getText().toString());
                customerJSON.addProperty("lastname", loginlastname.getText().toString());
                raw.add("customer", customerJSON);

                ApiClient.getWebServices().signUpUser(raw).enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        if(response.isSuccessful())
                        {
                            Toast.makeText(SignupActivity.this,"SignUp Successful",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(SignupActivity.this,"Error : "+response.message(),Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Toast.makeText(SignupActivity.this,"Error",Toast.LENGTH_SHORT).show();
                    }
                });
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
