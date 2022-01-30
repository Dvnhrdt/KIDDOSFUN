package com.example.kiddosfun;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.ImageView;

import androidx.annotation.RawRes;

public class HurufModel {

    private String huruf;
    private int gambar;
    private int suara;

    public HurufModel(String huruf, int gambar, int suara) {
        this.huruf = huruf;
        this.gambar = gambar;
        this.suara = suara;
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }
}
