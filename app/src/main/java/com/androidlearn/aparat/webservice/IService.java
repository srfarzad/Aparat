package com.androidlearn.aparat.webservice;


import com.androidlearn.aparat.models.Category;
import com.androidlearn.aparat.models.News;
import com.androidlearn.aparat.models.Videos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IService {

    @GET("getNewVideos.php")
    Call<List<Videos>>  getNewVideos();

    @GET("getSpecial.php")
    Call<List<Videos>> getSpecial();

    @GET("getCategory.php")
    Call<List<Category>> getCategories();

    @FormUrlEncoded
    @POST("getVideosCategory.php")
    Call<List<Videos>> getVideosCategory(@Field("catId") int id);


    @GET("getNews.php")
    Call<List<News>> getNews();


}
