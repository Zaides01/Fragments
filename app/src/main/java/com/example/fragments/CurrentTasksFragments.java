package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CurrentTasksFragments extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //создаем элемент интерфейса для активности на базе фрагмента
        View view = inflater.inflate(R.layout.carrent_tasks, null);
        EditText task1 = view.findViewById(R.id.task1);
        
        return view;
    }
}
