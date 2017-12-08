package com.myweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/12/8.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
