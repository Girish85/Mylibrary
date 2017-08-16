package com.example.usgir.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by usgir on 8/15/2017.
 */

public class toastclass {
    public void show(Context c,String s)
    {
        Toast.makeText(c,s,Toast.LENGTH_SHORT).show();
    }
}
