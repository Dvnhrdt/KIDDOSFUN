package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;

public class GameSalahActivity2 extends AppCompatActivity {

    Class[] quizActivities = {
            GameKucingActivity2.class,
            GameBebekActivity2.class,
            GameHarimauActivity2.class,
            GameMonyetActivity2.class,
            GameSingaActivity2.class,
            GameGajahActivity2.class,
            GameKatakActivity2.class,
            GameAyamActivity2.class,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_salah2);

        SharedPreferences mSettings = getApplication().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int quizIndex = mSettings.getInt("_QUIZ", 0);

        new android.os.Handler(Looper.getMainLooper()).postDelayed(
                new Runnable() {
                    public void run() {
                        Intent a = new Intent(getApplicationContext(), quizActivities[quizIndex]);
                        startActivity(a);
                    }
                },2000);

    }
}