package com.example.j01_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText nameEdit;
    Button btnSubmit;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEdit = (EditText) findViewById(R.id.editText);
        btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEdit.getText().toString();
                Intent intObj = new Intent(MainActivity.this,NextActivity.class);
                intObj.putExtra("USERNAME", name);
                startActivity(intObj);
            }
        });
    }
}



