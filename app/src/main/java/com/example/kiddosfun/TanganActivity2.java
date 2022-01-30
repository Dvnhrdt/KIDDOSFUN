package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class TanganActivity2 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangan2);
    }
    public void btn_back (View view){
        Intent intent = new Intent(TanganActivity2.this,LidahActivity2.class);
        startActivity(intent);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(TanganActivity2.this,TampilanAnggotaTubuhActivity2.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(TanganActivity2.this,KakiActivity2.class);
        startActivity(intent);
    }
    public void btn_audio (View view){
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_tangan);
        }
        player.start();
    }
}