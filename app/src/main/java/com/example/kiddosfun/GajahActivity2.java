package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class GajahActivity2 extends AppCompatActivity {
    MediaPlayer player ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gajah2);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(GajahActivity2.this,TampilanHewanActivity2.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(GajahActivity2.this,AyamActivity2.class);
        startActivity(intent);
    }
    public void btn_back (View view){
        Intent intent = new Intent(GajahActivity2.this,SingaActivity2.class);
        startActivity(intent);
    }
    public void btn_sound(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_gajah);
        }
        player.start();
    }
}