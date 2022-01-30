package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class KucingActivity2 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kucing2);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(KucingActivity2.this,TampilanHewanActivity2.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(KucingActivity2.this,BebekActivity2.class);
        startActivity(intent);
    }
    public void btn_sound(View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_kucing);
        }
        player.start();
    }
}