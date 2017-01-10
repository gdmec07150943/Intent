package com.example.asus1.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by asus1 on 2016/10/30.
 */
public class IntentDemo2 extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }
    public void  upper(View v){
        Intent intent =getIntent();
        Bundle bundle=intent.getExtras();
        final  String value=bundle.getString("value").toUpperCase();

        Intent intentresult=new Intent();
        intentresult.putExtra("result",value);
        setResult(RESULT_OK,intentresult);
        finish();
    }
}
