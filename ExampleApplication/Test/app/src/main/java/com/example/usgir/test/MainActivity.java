package com.example.usgir.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.usgir.mylibrary.toastclass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastclass t = new toastclass();
        t.show(getApplicationContext(),"showing");
    }
}
