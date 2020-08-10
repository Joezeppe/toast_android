package com.example.helloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.EventLog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount = mCount + 12;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        else
            Log.e("MainActivity", "mShowCount is not set yet");
        Button button_zero = (Button) findViewById(R.id.button_zero);
        if (mCount != 0)
            button_zero.setBackgroundColor(Color.GREEN);


    }

    public void initializeCount(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(0));
        Button button_zero = (Button) findViewById(R.id.button_zero);
        button_zero.setBackgroundColor(Color.GRAY);

    }
}