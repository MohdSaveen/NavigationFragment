package com.example.navigationfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class StudentPersonalDetailsFragments extends Fragment {


    private Button mBtnNext;
    private EditText mEtName;
    private EditText mEtAge;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_personal_details_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        initViews(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    private void initViews(View view) {
        mBtnNext=view.findViewById(R.id.btnNext);
        mEtName=view.findViewById(R.id.etStudentName);
        mEtAge=view.findViewById(R.id.etStudentAge);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=mEtName.getText().toString();
                int age=Integer.parseInt(mEtAge.getText().toString());
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putInt("age",age);
               navController.navigate(R.id.action_studentPersonalDetailsFragments_to_studentPerformanceDetails,bundle);

            }
        });

    }
}