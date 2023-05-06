package com.suhun.fragmentcourse;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class F1Fragment extends Fragment {
    public String tag = F1Fragment.class.getSimpleName();
    private View view;
    private MainActivity activity;
    private Button createMainLotteryBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(tag, "++++F1 onCreate++++");
        if(view==null){
            // Inflate the layout for this fragment
            view = inflater.inflate(R.layout.fragment_f1, container, false);
            createMainLotteryBtn = view.findViewById(R.id.createMainLottery);
            createMainLotteryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.createMLottery();
                }
            });
        }
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(tag, "++++F1 onAttach++++");
        activity = (MainActivity) context;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "++++F1 onStart++++");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "++++F1 onResume++++");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "++++F1 onPause++++");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "++++F1 onStop++++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "++++F1 onDestory++++");
    }

}