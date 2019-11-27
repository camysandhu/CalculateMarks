package com.example.calculatemarks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    EditText m1;
    EditText m2;
    EditText m3;
    EditText m4;
    EditText m5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate()");

        m1 = findViewById(R.id.ed3004);
        m1 = findViewById(R.id.ed3005);
        m1 = findViewById(R.id.ed3006);
        m1 = findViewById(R.id.ed3007);
        m1 = findViewById(R.id.ed3008);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.d(TAG, "ORIENTATION_LANDSCAPE");
        }
        else
        {
            Log.d(TAG, "ORIENTATION_PORTRAIT");
        }
    }
}
