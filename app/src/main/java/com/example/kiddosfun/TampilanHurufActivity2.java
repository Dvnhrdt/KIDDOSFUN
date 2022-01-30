package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TampilanHurufActivity2 extends AppCompatActivity {

    public static final String DATA_HURUF = "com.example.kiddosfun.HURUF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_huruf2);
    }
    public void next (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }

    public void goToDetail (View view){
        String huruf = view.getTag().toString();
        Intent intent = new Intent(TampilanHurufActivity2.this,AhurufActivity2.class);
        intent.putExtra(DATA_HURUF, huruf);
        startActivity(intent);

    }

    /* ini gak perlu lagi, karna cukup pakai method goToDetail aja dan di tambah attribute tag
    public void g (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,GhurufActivity2.class);
        startActivity(intent);
    }
    public void h (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,HhurufActivity2.class);
        startActivity(intent);
    }
    public void i (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,IhurufActivity2.class);
        startActivity(intent);
    }
    public void j (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,JhurufActivity2.class);
        startActivity(intent);
    }
    public void k (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,KhurufActivity2.class);
        startActivity(intent);
    }
    public void l (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,LhurufActivity2.class);
        startActivity(intent);
    }
    public void m (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,MhurufActivity2.class);
        startActivity(intent);
    }
    public void n (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,NhurufActivity2.class);
        startActivity(intent);
    }
    public void o (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,OhurufActivity2.class);
        startActivity(intent);
    }
    public void p (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,PhurufActivity2.class);
        startActivity(intent);
    }
    public void q (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,QhurufActivity2.class);
        startActivity(intent);
    }
    public void r (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,RhurufActivity2.class);
        startActivity(intent);
    }
    public void s (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,ShurufActivity2.class);
        startActivity(intent);
    }
    public void t (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,ThurufActivity2.class);
        startActivity(intent);
    }
    public void u (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,UhurufActivity2.class);
        startActivity(intent);
    }
    public void v (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,VhurufActivity2.class);
        startActivity(intent);
    }
    public void w (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,WhurufActivity2.class);
        startActivity(intent);
    }
    public void x (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,XhurufActivity2.class);
        startActivity(intent);
    }
    public void y (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,YhurufActivity2.class);
        startActivity(intent);
    }
    public void z (View view){
        Intent intent =new Intent(TampilanHurufActivity2.this,ZhurufActivity2.class);
        startActivity(intent);
    }
     */

}