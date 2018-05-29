package com.example.apple.recyclerview_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programminglist = (RecyclerView) findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] data = {"hello","arshil","khan","whats","up","are you alive","hey"};
        programminglist.setAdapter(new ProgrammingAdapter(data));
    }
}
