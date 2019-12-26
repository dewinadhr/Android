package com.example.simbah.network;

public class ApiService {
    public static ApiRequest getServices(){
        return ApiClient.getClient("http://10.100.52.229/").create(ApiRequest.class);
    }
}