package com.rohit.rohit_uas.service;

import com.rohit.rohit_uas.GitRepo;
import com.rohit.rohit_uas.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GitRepoServiceAPI {

    @GET("search/users")
    Call<GitUsersResponse> searchUsers(@Query("q") String query);

    @GET("users/{u}/repos")
    Call<List<GitRepo>> userRepositories(@Path("u") String login);
}
