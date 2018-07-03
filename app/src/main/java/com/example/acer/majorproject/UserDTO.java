package com.example.acer.majorproject;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by acer on 6/30/2018.
 */

public class UserDTO {

    @SerializedName("userId")
    @Expose
    public String userId;
    @SerializedName("userName")
    @Expose
    public String userName;
    @SerializedName("password")
    @Expose
    public String password;
    @SerializedName("email")
    @Expose
    public String email;

}

