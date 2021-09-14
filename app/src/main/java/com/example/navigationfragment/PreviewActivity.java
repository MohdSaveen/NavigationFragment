package com.example.navigationfragment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {

    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvGrade;
    private TextView mTvPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initViews();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model=(Model) getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvAge.setText(model.getAge()+"");
        mTvGrade.setText(model.getGrade());
        mTvPercentage.setText(model.getPercentage());
    }

    private void initViews() {
        mTvAge=findViewById(R.id.tvStudentAge);
        mTvName=findViewById(R.id.tvStudentName);
        mTvGrade=findViewById(R.id.tvStudentGrade);
        mTvPercentage=findViewById(R.id.tvStudentPercentage);

    }
}