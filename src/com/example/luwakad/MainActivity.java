package com.example.luwakad;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.adluwak.luwakad.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the 8 if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
