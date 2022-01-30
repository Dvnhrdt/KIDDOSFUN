package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FhurufActivity2 extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fhuruf2);
    }
    public void home (View view){
        Intent intent =new Intent(FhurufActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
    public void next (View view){
        Intent intent =new Intent(FhurufActivity2.this,GhurufActivity2.class);
        startActivity(intent);
    }
    public void back (View view){
        Intent intent = new Intent(FhurufActivity2.this , EhurufActivity2.class);
        startActivity(intent);
    }
    public void voiceover (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_f);
        }
        player.start();
    }
}