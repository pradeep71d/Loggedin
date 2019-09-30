package com.example.logedin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button bu1;
    public static final String Success = "200";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.e1);
        et2 = findViewById(R.id.e2);
        et3 = findViewById(R.id.e3);
        bu1 = findViewById(R.id.b1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString();
                String email = et2.getText().toString();
                String pass = et3.getText().toString();
                LoginPost loginPost = new LoginPost(name, email, pass);
                Call<LoginPojo> pojoCall = BaseUrl.getClient().create(ApiInterface.class).loginUser(loginPost);
                if (et1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter name", Toast.LENGTH_SHORT).show();
                } else if (et2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter email", Toast.LENGTH_SHORT).show();
                } else if (!isEmailValid()) {
                    Toast.makeText(MainActivity.this, "enter valid email address", Toast.LENGTH_SHORT).show();
                } else if (et3.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "enter the password", Toast.LENGTH_SHORT).show();
                } else {
                    pojoCall.enqueue(new Callback<LoginPojo>() {
                        @Override
                        public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {
if (response.body()==null){
    Toast.makeText(MainActivity.this, response.raw().message(), Toast.LENGTH_SHORT).show();
}
                        }

                        @Override
                        public void onFailure(Call<LoginPojo> call, Throwable t) {

                        }
                    });
                }
            }

            private boolean isEmailValid() {

            }
        });
    }
}
