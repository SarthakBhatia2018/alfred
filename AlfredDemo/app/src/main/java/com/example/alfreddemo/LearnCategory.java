package com.example.alfreddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LearnCategory extends AppCompatActivity {

    @Override
    public void onCreate(Bundle SavedInstancesState) {
        super.onCreate(SavedInstancesState);
        setContentView(R.layout.learn_category);
        TextView tvcreate = findViewById(R.id.createacc);
        final TextView tvlogin = findViewById(R.id.login);
        TextView studynumbers = findViewById(R.id.studynumbers);
        TextView studydays = findViewById(R.id.studydays);
        TextView studymonths = findViewById(R.id.studymonths);
        TextView relationships = findViewById(R.id.studyrelationships);

        tvcreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LogIn.class));

            }
        });
        studynumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Learn_words.class));
            }
        });
        studydays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent());
            }
        });
        studymonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent());
            }
        });
        relationships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent());
            }
        });
    }
}
