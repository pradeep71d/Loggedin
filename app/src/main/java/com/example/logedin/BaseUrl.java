package com.example.logedin;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseUrl {
    private static Retrofit retrofit = null;
    public static final String Base_url = "https://dev.monetrewards.com/MonetApp/Monetsdk/api/";
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
