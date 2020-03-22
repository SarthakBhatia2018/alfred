package com.example.alfreddemo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


      public class Learn_words_meaning extends AppCompatActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.learn_word_meanings);
            TextView tviknew = findViewById(R.id.iknew);
            TextView tvidont = findViewById(R.id.ididnt);

            tvidont.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Learn.class));
                }
            });
              tviknew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), Learn.class));
                }
                });
        }
    }
