package com.example.modul2_kel4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class AboutActivity extends AppCompatActivity {

    private ListView listView;

    private String[] mahasiswa = {
            "Muhammad Fahreza Isnanto - 21120120120009",
            "Didan Hasan Murtaqi - 21120120140141",
            "Muhammad Fadhil Sulthan - 21120120140144",
            "Donny Ridwan Setiawan - 21120120130083"
    };

    private ArrayList<String> data;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        listView = findViewById(R.id.list);
        data = new ArrayList<>();
        getData();
        adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,data);
        listView.setAdapter(adapter);
    }

    private void getData(){
        Collections.addAll(data,mahasiswa);
    }
}