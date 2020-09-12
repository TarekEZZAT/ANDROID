package com.example.j0036010_fragments_01_draft;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    FragmentOne firstFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View mAction = findViewById(R.id.action);
        View mRemove = findViewById(R.id.remove);

        mAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentOne firstFragment = new FragmentOne();
                firstFragment.setArguments(getIntent().getExtras());

                FragmentManager fragManager =
                        getSupportFragmentManager();
                FragmentTransaction transaction =
                        fragManager.beginTransaction();

                transaction.add(R.id.fragment_one, firstFragment);
                transaction.commit();

                /*
                The last four lines can, however, be abbreviated into a
                single line of code as follows:
                getSupportFragmentManager().beginTransaction()
                    .add(R.id.LinearLayout1, firstFragment).commit();
                 */
            }
        });

        mRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentManager fragManager =
                        getSupportFragmentManager();
                FragmentTransaction transaction =
                        fragManager.beginTransaction();

                transaction.remove (firstFragment);
                transaction.commit();
            }

        });
    }

}