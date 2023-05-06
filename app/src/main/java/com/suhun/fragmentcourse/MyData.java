package com.suhun.fragmentcourse;

import android.app.Application;
import android.util.Log;

public class MyData extends Application {
    public String tag = MyData.class.getSimpleName();
    public int mainLottery;
    public int fragment2Lottery;

    public MyData(){
        Log.d(tag, "++++MyData was born++++");
    }
}
