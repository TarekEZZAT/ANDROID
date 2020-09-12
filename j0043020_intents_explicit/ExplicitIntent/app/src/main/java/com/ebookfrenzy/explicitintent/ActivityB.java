package com.ebookfrenzy.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    private static final int request_code = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");

        final TextView textView = findViewById(R.id.textView1);
        textView.setText(qString);

    }



//    public void answerQuestion(View view) { finish(); }

    public void sendAnswer(View view) {
        Intent i2 = new Intent(this, ActivityC.class);
        EditText editText1 = findViewById(R.id.editText1);
        String returnString = editText1.getText().toString();
        i2.putExtra("returnData", returnString);
        startActivity(i2);
    }

    public void answerQuestion(View view) {
        finish();
    }

    @Override
    public void finish() {
        Intent data = new Intent();

        EditText editText1 = findViewById(R.id.editText1);

        String returnString = editText1.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        super.finish();
    }



}