package com.example.database.leg;

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

public class Leg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Leg.this, About_Leg.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Leg.this, History_Leg.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Leg.this, Rules_Leg.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Leg.this, Heroes_Leg.class);
        startActivity(i);
    }
}
