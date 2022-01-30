package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilannamaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilannama2);
    }
    public void next (View view){
        Intent intent = new Intent(TampilannamaActivity2.this , GenderActivity2.class);
        startActivity(intent);
    }

}