package com.example.retrofit.remote.fallback;

import com.example.retrofit.domain.User;
import com.example.retrofit.remote.HttpApi;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;

import java.util.List;

@Component
public class HttpApiFallback implements HttpApi {

    @Override
    public Response<User> user(Long id) {
        return null;
    }

    @Override
    public Call<List<User>> users() {
        return null;
    }

    @Override
    public Call<ResponseBody> addUser(User user) {
        return null;
    }

    @Override
    public Call<ResponseBody> updateUser(User user) {
        return null;
    }

    @Override
    public Call<ResponseBody> deleteUser(Long id) {
        return null;
    }

    @Override
    public Call<ResponseBody> upload(MultipartBody.Part file) {
        return null;
    }
}