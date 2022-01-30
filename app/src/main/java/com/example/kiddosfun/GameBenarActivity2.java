package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameBenarActivity2 extends AppCompatActivity {


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
        setContentView(R.layout.activity_game_benar2);

        SharedPreferences mSettings = getApplication().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        int quizIndex = mSettings.getInt("_QUIZ", 0);

        ImageButton btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new
                        Intent(getApplicationContext(), quizActivities[quizIndex + 1]);
                startActivity(a);
            }
        });


    }


}

