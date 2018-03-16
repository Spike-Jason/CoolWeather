package com.example.aiphonse_aispeech.coolweaher.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by AiPhonse_AISpeech on 3/16/2018.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
