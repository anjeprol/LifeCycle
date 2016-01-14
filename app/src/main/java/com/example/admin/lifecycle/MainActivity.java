package com.example.admin.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this,Second.class);
        startActivity(myIntent);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FT app","I'm restart 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FT app","I'm Destroy 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FT app","I'm Stop 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FT app","I'm Pause 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FT app", "I'm Resume 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FT app", "I'm Start 1");
    }

    public void goX(View view) {
        Log.d("FT app","Button Click");
    }
}
