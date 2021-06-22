package com.example.database.ctp;

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

public class Ctp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctp);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Ctp.this, About_Ctp.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Ctp.this, History_Ctp.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Ctp.this, Rules_Ctp.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Ctp.this, Heroes_Ctp.class);
        startActivity(i);
    }
}
