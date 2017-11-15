package com.example.aninuryani.siobat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String ROOT_URL = "http://siobat.byethost33.com/api/";
    private static int TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View obatLayout = findViewById(R.id.daftar_obat);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, DataObat.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
