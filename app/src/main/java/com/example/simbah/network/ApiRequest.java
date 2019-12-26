package com.example.simbah.network;

import com.example.simbah.model.ArtikelResponse;
import com.example.simbah.model.ContactResponse;
import com.example.simbah.model.UserResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiRequest {
    @GET("user")
    Call<UserResponse> getUser();

    @GET("contact")
    Call<ContactResponse> getContact();

    @GET("artikel")
    Call<ArtikelResponse> getArtikel();

    @FormUrlEncoded
    @POST("artikel")
    Call<ArtikelResponse> setArtikel(
            @Field("title")String title,
            @Field("news_title")String news_title
    );

    @DELETE("artikel/{id}")
    Call<ArtikelResponse> deleteArtikel(@Path("id")int id);

    @FormUrlEncoded
    @PUT("artikel/{id}")
    Call<ArtikelResponse> updateArtikel(
            @Path("id")int id,
            @Field("title")String title,
            @Field("news_title")String news_title
    );
}
