package com.example.database.xab;

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
import com.example.database.xap.Xap;

public class Xab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xab);
    }
    public void onClickAbout(View v){
        Intent i = new Intent(Xab.this, About_Xab.class);
        startActivity(i);
    }

    public void onClickHistory(View v){
        Intent i = new Intent(Xab.this, History_Xab.class);
        startActivity(i);
    }

    public void onClickRules(View v){
        Intent i = new Intent(Xab.this, Rules_Xab.class);
        startActivity(i);
    }

    public void onClickHeroes(View v){
        Intent i = new Intent(Xab.this, Heroes_Xab.class);
        startActivity(i);
    }
}
