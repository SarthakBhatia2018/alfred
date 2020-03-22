package com.example.alfreddemo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

      public class Learn_words extends AppCompatActivity {
       @Override
       protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_words);
        TextView tap = findViewById(R.id.tap);
        tap.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
          startActivity(new Intent(getApplicationContext(), Learn_words_meaning.class));

         }
        });
       }
      }