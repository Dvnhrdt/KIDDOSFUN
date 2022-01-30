package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RequiresApi(api = Build.VERSION_CODES.O)
public class GameKatakActivity2 extends AppCompatActivity {

    private int presCounter = 0;

    private int maxPresCounter = 4;

    private String[] question = {"K", "_", "_","A","_"};
    private String[] keys = {"A", "T", "K"};
    private String textAnswer = String.join("", keys);
    private String answered = "";

    Animation smallbigforth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_katak2);

        smallbigforth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);


        keys = shuffleArray(keys);

        for (String key : question) {
            addViewQuestion(((LinearLayout) findViewById(R.id.layoutParentQuestion)), key);
        }

        for (String key : keys) {
            addView(((LinearLayout) findViewById(R.id.layoutParent)), key, ((EditText) findViewById(R.id.editText)));
        }
        String questionToText = String.join("", question);
        Pattern pattern = Pattern.compile("[^_]*_");
        Matcher matcher = pattern.matcher(questionToText);
        int countEmpty = 0;
        while (matcher.find()) {
            countEmpty++;
        }
        Log.e("countEmpty", String.valueOf(countEmpty));

        maxPresCounter = countEmpty;
    }





    private String[] shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }


    private void addViewQuestion(LinearLayout viewParent, final String text) {
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        linearLayoutParams.rightMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.bar_huruf));
        textView.setTextColor(this.getResources().getColor(R.color.biru));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(32);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");




        // editText.setTypeface(typeface);
        textView.setTypeface(typeface);


        /*

        textView.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(presCounter < maxPresCounter) {
                    if (presCounter == 0)
                        editText.setText("");

                        editText.setText(editText.getText().toString() + text);
                        textView.startAnimation(smallbigforth);
                        textView.animate().alpha(0).setDuration(300);
                        presCounter++;

                        if (presCounter == maxPresCounter)
                            doValidate();
                }
            }
        });


         */


        viewParent.addView(textView);


    }


    private void addView(LinearLayout viewParent, final String text, final EditText editText) {
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        linearLayoutParams.rightMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.bgpink));
        textView.setTextColor(this.getResources().getColor(R.color.white));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(32);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");




        editText.setTypeface(typeface);
        textView.setTypeface(typeface);

        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(presCounter < maxPresCounter) {
                    if (presCounter == 0)
                        editText.setText("");

                    Boolean isMatch = false;
                    String[] newQuestion = new String[question.length];
                    for(int i = 0; i < question.length; i++) {
                        if(isMatch == false) {
                            if (question[i] == "_") {
                                question[i] = text;
                                isMatch = true;
                            }
                        }
                        newQuestion[i] = question[i];
                    }

                    question = newQuestion;
                    LinearLayout layoutParentQuestion = findViewById(R.id.layoutParentQuestion);
                    layoutParentQuestion.removeAllViews();

                    for (String key : question) {
                        addViewQuestion(((LinearLayout) findViewById(R.id.layoutParentQuestion)), key);
                    }

                    answered = answered + text;
                    // editText.setText(editText.getText().toString() + text);
                    textView.startAnimation(smallbigforth);
                    textView.animate().alpha(0).setDuration(300);
                    presCounter++;

                    if (presCounter == maxPresCounter)
                        doValidate();
                }
            }
        });


        viewParent.addView(textView);


    }


    private void doValidate() {
        presCounter = 0;
        SharedPreferences mSettings = getApplication().getSharedPreferences("Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putInt("_QUIZ", 6);

        EditText editText = findViewById(R.id.editText);
        LinearLayout linearLayout = findViewById(R.id.layoutParent);

        if(answered.equals(textAnswer)) {
//            Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

            Intent a = new Intent(GameKatakActivity2.this,GameAyamActivity2.class);
             startActivity(a);

            answered = "";
            // editText.setText("");
        } else {
            Toast.makeText(GameKatakActivity2.this, "Wrong", Toast.LENGTH_SHORT).show();
            answered = "";
            // editText.setText("");

            Intent a = new Intent(GameKatakActivity2.this,GameSalahActivity2.class);startActivity(a);
        }

        keys = shuffleArray(keys);
        linearLayout.removeAllViews();
        for (String key : keys) {
            addView(linearLayout, key, editText);
        }

    }







}
