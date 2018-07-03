package com.example.acer.majorproject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class UserManager {

    private static String baseUrl = "https://dev2qa.com/demo/";

    public static UserManagerInterface getUserManagerService() {
        // Create retrofit builder.
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
        retrofitBuilder.baseUrl(baseUrl);
        retrofitBuilder.addConverterFactory(GsonConverterFactory.create());


        // Build the retrofit object.
        Retrofit retrofit = retrofitBuilder.build();

        //Create instance for user manager interface and return it.
        UserManagerInterface userManagerService = retrofit.create(UserManagerInterface.class);
        return userManagerService;
    }
}