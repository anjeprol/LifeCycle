package com.example.admin.lifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FT app", "I'm restart 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FT app","I'm Destroy 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FT app","I'm Stop 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FT app","I'm Pause 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FT app", "I'm Resume 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FT app", "I'm Start 2");
    }

    public void goX(View view) {
        Log.d("FT app", "Button Click 2");
    }


    public void makeStop(View view) {
        this.finish();
    }
}
