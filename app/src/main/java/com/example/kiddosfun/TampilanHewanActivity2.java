package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanHewanActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_hewan2);
    }
    public void btn_kucing (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,KucingActivity2.class);
        startActivity(intent);
    }
    public void btn_bebek (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,BebekActivity2.class);
        startActivity(intent);
    }
    public void btn_singa (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,SingaActivity2.class);
        startActivity(intent);
    }
    public void btn_gajah (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,GajahActivity2.class);
        startActivity(intent);
    }
    public void btn_ayam (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,AyamActivity2.class);
        startActivity(intent);
    }
    public void btn_monyet (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,MonyetActivity2.class);
        startActivity(intent);
    }
    public void btn_katak (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,KatakActivity2.class);
        startActivity(intent);
    }
    public void btn_harimau (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,HarimauActivity2.class);
        startActivity(intent);
    }
    public void btn_ular (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,UlarActivity2.class);
        startActivity(intent);
    }
    public void btn_sapi (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,SapiActivity2.class);
        startActivity(intent);
    }
    public void btn_jangkrik (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,JangkrikActivity2.class);
        startActivity(intent);
    }
    public void btn_burunghantu (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,BurungHantuActivity2.class);
        startActivity(intent);
    }
    public void home1 (View view){
        Intent intent = new Intent(TampilanHewanActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
}