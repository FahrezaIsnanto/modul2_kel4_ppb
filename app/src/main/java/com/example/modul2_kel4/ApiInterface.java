package com.example.modul2_kel4;

import com.example.modul2_kel4.ListUserResponse;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiInterface {
    @GET("api/users?page=2")
    Call<ListUserResponse> getList();
}
