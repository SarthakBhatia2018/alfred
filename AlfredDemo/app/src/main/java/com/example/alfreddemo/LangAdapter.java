package com.example.alfreddemo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LangAdapter extends AppCompatActivity {
    private Context mContext;
    public String[] mThumbIds = {
            "Madari", "Hindi", "Santhali", "English", "Ho", "Mandari", "Kurukh", "Santhali",
            "Hindi", "ho", "English", "Kurukh", "Ho", "Mandari", "Kurukh", "Santhali",
            "Hindi", "Ho", "English", "Kurukh", "English", "Kurukh"
    };
    public LangAdapter(Context con) {
        mContext = con;
    }
        public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View gridView=new View(mContext);
            gridView = inflater.inflate(R.layout.grid_itemrow, null);
            TextView city = (TextView) gridView.findViewById(R.id.city);
            return gridView;
        }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
