package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button curButton;
    Button comButton;
    Button time;
    FragmentManager fragmentManager;
    CurrentTasksFragments currentTasksFragments;
    CompleteTasksFragments completeTasksFragments;
    TimeTasksFragments timeTasksFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        curButton = findViewById(R.id.cur_tasks);
        comButton = findViewById(R.id.compl_tasks);
        time = findViewById(R.id.time);
        currentTasksFragments = new CurrentTasksFragments();
        completeTasksFragments = new CompleteTasksFragments();
        timeTasksFragments = new TimeTasksFragments();

        fragmentManager = getSupportFragmentManager();
        if(savedInstanceState == null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, currentTasksFragments);
            fragmentTransaction.commit();
        }
        if(savedInstanceState == null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, completeTasksFragments);
            fragmentTransaction.commit();
        }
        if(savedInstanceState == null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, timeTasksFragments);
            fragmentTransaction.commit();
        }
        curButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, currentTasksFragments);
                fragmentTransaction.commit();
            }
        });
        comButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, completeTasksFragments);
                fragmentTransaction.commit();
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, timeTasksFragments);
                fragmentTransaction.commit();
            }
        });
    }
}