package com.example.navigationfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.navigationfragment.CommunicationListener;
import com.example.navigationfragment.R;
import com.example.navigationfragment.StudentPerformanceDetails;
import com.example.navigationfragment.StudentPersonalDetailsFragments;

public class StudentDetailsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}