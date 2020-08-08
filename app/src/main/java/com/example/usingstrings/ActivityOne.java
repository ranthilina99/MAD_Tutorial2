package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        TextView textView=findViewById(R.id.textView2);
        textView.setText(R.string.Msg2);

        Log.i("Lifecycle","onCreate() Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","onStart() Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","onRestart() Invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","onResume() Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","onPause() Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop() Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() Invoked");
    }
}