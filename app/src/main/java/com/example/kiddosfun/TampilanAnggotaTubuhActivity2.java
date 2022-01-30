package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanAnggotaTubuhActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_anggota_tubuh2);
    }
    public void home(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
    public void btn_mataktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this,MataActivity2.class);
        startActivity(intent);
    }
    public void btn_telingaktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, TelingaActivity2.class);
        startActivity(intent);
    }
    public void btn_hidungktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, HidungActivity2.class);
        startActivity(intent);

    }
    public void btn_mulutktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, MulutActivity2.class);
        startActivity(intent);
    }
    public void btn_gigiktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, GigiActivity2.class);
    }
    public void btn_lidahktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, LidahActivity2.class);
        startActivity(intent);
    }
    public void btn_tgnktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, TanganActivity2.class);
        startActivity(intent);
    }
    public void btn_kakiktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, KakiActivity2.class);
        startActivity(intent);
    }
    public void btn_otakktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, OtakActivity2.class);
        startActivity(intent);
    }
    public void btn_hatiktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, HatiActivity2.class);
        startActivity(intent);
    }
    public void btn_paruktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, ParuActivity2.class);
        startActivity(intent);
    }
    public void btn_lambungktg(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, LambungActivity2.class);
        startActivity(intent);
    }
    public void gigi(View view) {
        Intent intent = new Intent(TampilanAnggotaTubuhActivity2.this, LambungActivity2.class);
        startActivity(intent);
    }

}