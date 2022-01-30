package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games2);
    }
    public void game (View view){
        Intent intent = new Intent(GamesActivity2.this ,GameKucingActivity2.class);
        startActivity(intent);
    }
    public void games (View view){
        Intent intent = new Intent(GamesActivity2.this ,GametekiActivity2.class);
        startActivity(intent);
    }
    public void back (View view){
        Intent intent = new Intent(GamesActivity2.this ,KategoriActivity2.class);
        startActivity(intent);
    }
}