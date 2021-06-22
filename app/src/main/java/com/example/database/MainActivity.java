package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.database.cev.Cev;
import com.example.database.ctp.Ctp;
import com.example.database.gir.Gir;
import com.example.database.kon.Kon;
import com.example.database.leg.Leg;
import com.example.database.mac.Mac;
import com.example.database.nac.Nac;
import com.example.database.pul.Pul;
import com.example.database.xab.Xab;
import com.example.database.xap.Xap;
import com.example.database.ykt.Ykt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickXap(View v){
        Intent i = new Intent(MainActivity.this, Xap.class);
        startActivity(i);
    }
    public void onClickMac(View v){
        Intent i = new Intent(MainActivity.this, Mac.class);
        startActivity(i);
    }
    public void onClickYkt(View v){
        Intent i = new Intent(MainActivity.this, Ykt.class);
        startActivity(i);
    }
    public void onClickGir(View v){
        Intent i = new Intent(MainActivity.this, Gir.class);
        startActivity(i);
    }
    public void onClickNac(View v){
        Intent i = new Intent(MainActivity.this, Nac.class);
        startActivity(i);
    }
    public void onClickLeg(View v){
        Intent i = new Intent(MainActivity.this, Leg.class);
        startActivity(i);
    }
    public void onClickCtp(View v){
        Intent i = new Intent(MainActivity.this, Ctp.class);
        startActivity(i);
    }
    public void onClickCev(View v){
        Intent i = new Intent(MainActivity.this, Cev.class);
        startActivity(i);
    }
    public void onClickKon(View v){
        Intent i = new Intent(MainActivity.this, Kon.class);
        startActivity(i);
    }
    public void onClickXab(View v){
        Intent i = new Intent(MainActivity.this, Xab.class);
        startActivity(i);
    }
    public void onClickPul(View v){
        Intent i = new Intent(MainActivity.this, Pul.class);
        startActivity(i);
    }
}