package com.suhun.fragmentcourse;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class F2Fragment extends Fragment {
    public String tag = F2Fragment.class.getSimpleName();
    private View view;
    private MainActivity activity;
    private MyData myData;
    private TextView showFragment2Lottery;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag, "++++F2 onCreate++++");
        // Inflate the layout for this fragment
        if(view==null) {
            view = inflater.inflate(R.layout.fragment_f2, container, false);
            showFragment2Lottery = view.findViewById(R.id.showMainCreateresult);
        }
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(tag, "++++F2 onAttach++++");
        activity = (MainActivity) context;
        myData = (MyData) activity.getApplication();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "++++F2 onStop++++");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "++++F2 onResume++++");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "++++F2 onPause++++");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "++++F2 onStop++++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "++++F2 onDestory++++");
    }

    public void createFragment2Lottery(){
        myData.fragment2Lottery = new Random().nextInt(49) + 1;
        showFragment2Lottery.setText(""+ myData.fragment2Lottery);
    }

}