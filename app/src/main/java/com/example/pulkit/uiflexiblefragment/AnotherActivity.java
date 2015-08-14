package com.example.pulkit.uiflexiblefragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by pulkit on 8/14/15.
 */
public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);

        Intent intent = getIntent();
        int data = intent.getIntExtra("data", 0);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragmentB);
        if (fragmentB != null) {
            fragmentB.changeText(data);
        }
    }
}
