package com.ebookfrenzy.explicitintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ActivityC  extends AppCompatActivity {
    private static final int request_code = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Bundle extras = getIntent().getExtras();

        String returnString = extras.getString("returnData");

        final TextView textView = findViewById(R.id.text_answer);
        textView.setText(returnString);

    }

}
