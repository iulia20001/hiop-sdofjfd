package com.example.database.gir;

import android.content.Intent;
import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.database.R;
import com.example.database.cev.About_Cev;
import com.example.database.cev.Cev;
import com.example.database.cev.Heroes_Cev;
import com.example.database.cev.History_Cev;
import com.example.database.cev.Rules_Cev;

public class Gir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gir);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Gir.this, About_Gir.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Gir.this, History_Gir.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Gir.this, Rules_Gir.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Gir.this, Heroes_Gir.class);
        startActivity(i);
    }
}
