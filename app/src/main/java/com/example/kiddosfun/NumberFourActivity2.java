package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumberFourActivity2 extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_four2);
    }


    public void back (View view){
        Intent intent = new Intent(NumberFourActivity2.this,NumberThreeActivity2.class);
        startActivity(intent);
    }

    public void home1 (View view){
        Intent intent = new Intent(NumberFourActivity2.this,TampilanangkaActivity2.class);
        startActivity(intent);
    }

    public void next (View view){
        Intent intent = new Intent(NumberFourActivity2.this,NumberFiveActivity2.class);
        startActivity(intent);
    }

    public void voiceover (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.four);
        }
        player.start();
    }

}