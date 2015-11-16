package com.vamsi.learningfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void update(int i) {
        MySecondFragment fragment = (MySecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        fragment.updateDescription(i);
    }
}
