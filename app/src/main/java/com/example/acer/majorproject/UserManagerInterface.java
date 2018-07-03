package com.example.acer.majorproject;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserManagerInterface {

    /*
     * @FormUrlEncoded : Point out this method will construct a form submit action.
     * @POST : Point out the form submit will use post method, the form action url is the parameter of @POST annotation.
     * @Field("form_field_name") : Indicate the form filed name, the filed value will be assigned to input parameter userNameValue.
     * */
    @FormUrlEncoded
    @POST("user/register.html")
    public Call<ResponseBody> registerUser(@Field("userName") String userNameValue,
                                           @Field("password") String passwordValue,
                                           @Field("email") String emailValue);


    /*
    *  @GET : Indicate this method will perform a http get action with the specified url.
    *  @Query("userName") : Parse out the userName query parameter in the url and
    *  assign the parsed out value to userNameValue parameter.
    * */
    @GET("user/listUser.html")
    public Call<UserDTO> getUserByName(@Query("userName") String userNameValue);


    /*
    *  Similar with getUserByName method, this method will return all users in a list.
    * */
    @GET("user/listAllUser.html")
    public Call<List<UserDTO>> getUserAllList();
}