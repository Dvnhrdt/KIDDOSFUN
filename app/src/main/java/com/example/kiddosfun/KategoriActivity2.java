package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KategoriActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori2);
    }
    public void angka (View view){
        Intent intent = new Intent(KategoriActivity2.this , TampilanangkaActivity2.class);
        startActivity(intent);
    }
    public void hewan (View view){
        Intent intent = new Intent(KategoriActivity2.this , TampilanHewanActivity2.class);
        startActivity(intent);
    }
    public void tubuh (View view){
        Intent intent = new Intent(KategoriActivity2.this , TampilanAnggotaTubuhActivity2.class);
        startActivity(intent);
    }
    public void huruf(View view){
        Intent intent = new Intent(KategoriActivity2.this , TampilanHurufActivity2.class);
        startActivity(intent);
    }
    public void game(View view){
        Intent intent = new Intent(KategoriActivity2.this , GamesActivity2.class);
        startActivity(intent);
    }
}