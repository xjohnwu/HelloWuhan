package com.example.hellowuhan;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity_main);
        Intent a = getIntent();
        Bundle b = a.getBundleExtra("context");
        String wh = b.getString("wh");
        TextView v = (TextView) findViewById(R.id.secondactivity_textview);
        v.setText(wh);    
        

    }
}
