package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanangkaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanangka2);
    }
    public void home (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
    public void one (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberOneActivity2.class);
        startActivity(intent);
    }
    public void two (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberTwoActivity2.class);
        startActivity(intent);
    }
    public void three (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberThreeActivity2.class);
        startActivity(intent);
    }
    public void four (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberFourActivity2.class);
        startActivity(intent);
    }
    public void five (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberFiveActivity2.class);
        startActivity(intent);
    }
    public void six (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberSixActivity2.class);
        startActivity(intent);

    }
    public void seven (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberSevenActivity2.class);
        startActivity(intent);
    }
    public void eight (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberEightActivity2.class);
        startActivity(intent);
    }
    public void nine (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberNineActivity2.class);
        startActivity(intent);
    }
    public void zero (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,NumberZeroActivity2.class);
        startActivity(intent);
    }
    public void home1 (View view){
        Intent intent = new Intent(TampilanangkaActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
}