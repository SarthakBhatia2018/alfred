package com.example.alfreddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class OTP extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);
        Button btn=findViewById(R.id.btngo);
          btn.setOnClickListener(new View.OnClickListener()
          {
            @Override
            public void onClick(View v)
            {
                Intent in=new Intent(getBaseContext(),LanguageChoose.class);
                startActivity(in);
            }
          });
    }
}
