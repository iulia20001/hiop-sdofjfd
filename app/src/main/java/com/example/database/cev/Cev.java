package com.example.database.cev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.database.R;

public class Cev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cev);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Cev.this, About_Cev.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Cev.this, History_Cev.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Cev.this, Rules_Cev.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Cev.this, Heroes_Cev.class);
        startActivity(i);
    }
}
