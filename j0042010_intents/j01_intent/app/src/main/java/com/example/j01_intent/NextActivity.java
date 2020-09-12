package com.example.j01_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        txtName = (TextView) findViewById(R.id.text2);
        Intent intename = getIntent();
//Get the USERNAME passed from IntentExampleActivity
        String uname = (String) intename.getSerializableExtra("USERNAME");
//Set text for greetMsg TextView
        txtName.setText("Welcome " + uname);
    }
}