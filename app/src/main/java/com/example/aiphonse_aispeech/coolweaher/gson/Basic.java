package com.example.aiphonse_aispeech.coolweaher.gson;

import android.support.v4.media.session.MediaSessionCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by AiPhonse_AISpeech on 3/16/2018.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;
    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
