package com.mk.activityanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void go(View view){
        Intent myIntent = new Intent(this, MyActivity.class);
        this.startActivity(myIntent);
        overridePendingTransition(R.anim.up_in, R.anim.up_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
