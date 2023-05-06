package com.suhun.fragmentcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();
    private MyData myData;
    private F1Fragment f1;
    private F2Fragment f2;
    private F3Fragment f3;
    private FragmentManager fmgr;
    private Button goF1Btn, goF2Btn, goF3Btn, createMainLottyBtn;
    private TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "++++onCreate++++");
        myData = (MyData) getApplication();
        ininView();
        initFragment();
    }

    private void ininView(){
        goF1Btn = findViewById(R.id.goF1);
        goF2Btn = findViewById(R.id.goF2);
        goF3Btn = findViewById(R.id.goF3);
        createMainLottyBtn = findViewById(R.id.createMainLottery);
        showResult = findViewById(R.id.mainText);
    }

    private void initFragment(){
        f1 = new F1Fragment();
        f2 = new F2Fragment();
        f3 = new F3Fragment();
        fmgr = getSupportFragmentManager();
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        transaction.commit();
    }

    public void goF1Fun(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit();
    }

    public void goF2Fun(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit();
    }

    public  void createMainLottery(View view){

    }

    public void goF3Fun(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit();
    }

    public void showFragment2Lottery(View view) {
        f2.createFragment2Lottery();
    }

    public void createMLottery(){
        myData.mainLottery = new Random().nextInt(49) + 1;
        showResult.setText("" + myData.mainLottery);
    }
}