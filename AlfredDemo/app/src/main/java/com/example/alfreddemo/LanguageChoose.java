package com.example.alfreddemo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
      public class LanguageChoose extends AppCompatActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.language);
            GridView gv = findViewById(R.id.gridView);
            final TextView tv = findViewById(R.id.city);
            ArrayList<String> list = new ArrayList<>();
            list.add("Mundari");
            ArrayAdapter adapter = new ArrayAdapter(getBaseContext(), R.layout.grid_itemrow, list);
            gv.setAdapter(adapter);
            gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                          @Override
                                          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                              String selectedItem = parent.getItemAtPosition(position).toString();
                                              tv.setVisibility(View.VISIBLE);
                                              tv.setTextSize(15.00f);
                                              tv.setText("GridView item clicked : " + selectedItem
                                                      + "\nAt index position : " + position + "DONE");
                                          }
                                      }
            );
          tv.setOnClickListener(new View.OnClickListener()
              {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), LogIn.class));
                }
            });
        }
    }