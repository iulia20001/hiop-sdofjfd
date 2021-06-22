package com.example.database.nac;

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

public class Nac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nac);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Nac.this, About_Nac.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Nac.this, History_Nac.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Nac.this, Rules_Nac.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Nac.this, Heroes_Nac.class);
        startActivity(i);
    }
}
