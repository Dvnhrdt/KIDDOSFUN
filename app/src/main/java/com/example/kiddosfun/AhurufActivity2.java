package com.example.kiddosfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

public class AhurufActivity2 extends AppCompatActivity {
    MediaPlayer player;

    private List<HurufModel> daftarHuruf;
    HurufModel currentHuruf;
    ImageView imgHuruf;
    int totalHuruf;
    int qCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahuruf2);

        // isi nilai array
        daftarHuruf = new ArrayList<>();
        daftarHuruf.add(new HurufModel("a", R.drawable.a, R.raw.sound_a));
        daftarHuruf.add(new HurufModel("b", R.drawable.b, R.raw.sound_b));
        daftarHuruf.add(new HurufModel("c", R.drawable.c, R.raw.sound_c));
        daftarHuruf.add(new HurufModel("d", R.drawable.d, R.raw.sound_d));
        daftarHuruf.add(new HurufModel("e", R.drawable.e, R.raw.sound_e));
        daftarHuruf.add(new HurufModel("f", R.drawable.f, R.raw.sound_f));
        daftarHuruf.add(new HurufModel("g", R.drawable.g, R.raw.sound_g));
        daftarHuruf.add(new HurufModel("h", R.drawable.h, R.raw.sound_h));
        daftarHuruf.add(new HurufModel("i", R.drawable.i, R.raw.sound_i));
        daftarHuruf.add(new HurufModel("j", R.drawable.j, R.raw.sound_j));
        daftarHuruf.add(new HurufModel("k", R.drawable.k, R.raw.sound_k));
        daftarHuruf.add(new HurufModel("l", R.drawable.l, R.raw.sound_l));
        daftarHuruf.add(new HurufModel("m", R.drawable.m, R.raw.sound_m));
        daftarHuruf.add(new HurufModel("n", R.drawable.n, R.raw.sound_n));
        daftarHuruf.add(new HurufModel("o", R.drawable.o, R.raw.sound_o));
        daftarHuruf.add(new HurufModel("p", R.drawable.p, R.raw.sound_p));
        daftarHuruf.add(new HurufModel("q", R.drawable.q, R.raw.sound_q));
        daftarHuruf.add(new HurufModel("r", R.drawable.r, R.raw.sound_r));
        daftarHuruf.add(new HurufModel("s", R.drawable.s, R.raw.sound_s));
        daftarHuruf.add(new HurufModel("t", R.drawable.t, R.raw.sound_t));
        daftarHuruf.add(new HurufModel("u", R.drawable.u, R.raw.sound_u));
        daftarHuruf.add(new HurufModel("v", R.drawable.v, R.raw.sound_v));
        daftarHuruf.add(new HurufModel("w", R.drawable.w, R.raw.sound_w));
        daftarHuruf.add(new HurufModel("x", R.drawable.x, R.raw.sound_x));
        daftarHuruf.add(new HurufModel("y", R.drawable.y, R.raw.sound_y));
        daftarHuruf.add(new HurufModel("z", R.drawable.z, R.raw.sound_z));
        // silahkan tambahkan data huruf yg lain disin...

        totalHuruf = daftarHuruf.size();

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String huruf = intent.getStringExtra(TampilanHurufActivity2.DATA_HURUF);

        // tentukan huruf pertama berdasarkan yg di klik dari activitiy_tampilan_huruf2
        currentHuruf = findByHuruf(huruf, daftarHuruf);

        // tampilkan gambar huruf berdasarkan data yang di click dari activitiy_tampilan_huruf2
        imgHuruf = findViewById(R.id.imgHuruf);
        imgHuruf.setImageResource(currentHuruf.getGambar());

    }

    private HurufModel findByHuruf(String huruf, List<HurufModel> hurufLists) {
        int idx = 0;
        for (HurufModel _huruf : hurufLists) {
            if (_huruf.getHuruf().equals(huruf)) {
                qCounter = idx;
                return _huruf;
            }
            idx++;
        }
        return null;
    }

    public void home (View view){
        Intent intent =new Intent(AhurufActivity2.this,KategoriActivity2.class);
        startActivity(intent);
    }
    public void next (View view){

        if(qCounter < totalHuruf) {

            // tampilkan huruf selanjutnya
            currentHuruf = daftarHuruf.get(qCounter + 1);
            imgHuruf.setImageResource(currentHuruf.getGambar());
            player = MediaPlayer.create(this, currentHuruf.getSuara());

            qCounter++;

        } else {
            finish();
        }

    }
    public void voiceover (View view) {
        if (player == null) {
            player = MediaPlayer.create(this, currentHuruf.getSuara());
        }
        player.start();
    }
}