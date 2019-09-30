package com.example.logedin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
@POST("login")
    Call<LoginPojo>loginUser(@Body LoginPost loginPost); //here Loginpojo stores server response(data of server) using Call method,and we send data using loginUser method.

}
