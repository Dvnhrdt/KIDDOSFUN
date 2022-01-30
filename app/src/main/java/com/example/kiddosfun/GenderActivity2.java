package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GenderActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender2);
    }
    public void boy (View view){
        Intent intent = new Intent(GenderActivity2.this , KategoriActivity2.class);
        startActivity(intent);

    }
    public void girl (View view){
        Intent intent = new Intent(GenderActivity2.this , KategoriActivity2.class);
        startActivity(intent);
    }
}