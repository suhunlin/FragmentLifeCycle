package com.suhun.fragmentcourse;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F3Fragment extends Fragment {
    public String tag = F3Fragment.class.getSimpleName();
    private View view;
    private MainActivity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag, "++++F3 onCreate++++");
        if(view==null){
            view = inflater.inflate(R.layout.fragment_f3, container, false);
        }
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(tag, "++++F3 onAttach++++");
        activity = (MainActivity) context;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "++++F3 onStart++++");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "++++F3 onResume++++");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "++++F3 onPause++++");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "++++F3 onStop++++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "++++F3 onDestory++++");
    }
}