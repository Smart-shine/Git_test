package com.example.niuanqi.git_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Log.d("String","niuanqi");
        Log.d("","牛安琪");
        Intent intents = new Intent(this,second.class);
    }
}
