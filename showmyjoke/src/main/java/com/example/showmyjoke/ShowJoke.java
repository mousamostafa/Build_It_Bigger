package com.example.showmyjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowJoke extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainshow);

        TextView textView=(TextView)findViewById(R.id.shjoke);
        textView.setText(getIntent().getStringExtra("Myjoke"));
    }
}
