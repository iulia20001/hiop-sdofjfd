package com.example.database.pul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.database.R;
import com.example.database.cev.About_Cev;
import com.example.database.cev.Cev;
import com.example.database.cev.Heroes_Cev;
import com.example.database.cev.History_Cev;
import com.example.database.cev.Rules_Cev;

public class Pul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pul);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Pul.this, About_Pul.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Pul.this, History_Pul.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Pul.this, Rules_Pul.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Pul.this, Heroes_Pul.class);
        startActivity(i);
    }
}
