package com.example.activitymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        lauchActivity2();
                    }
                }
        );

    }

    public void ExecClick(View view) {
        lauchActivity2();
    }

    private void lauchActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}