package com.example.smpnegeri13kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
        SliderView sliderView;
        int[] images = {R.drawable.headersmp13,
                R.drawable.header1,
                R.drawable.profilsekolahsmp,
                R.drawable.headersmp13,
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
    }

    public void guru(View view) {
    }

    public void ekskul(View view) {
    }

    public void fasilitas(View view) {
    }

    public void perpus(View view) {
    }

    public void galeri(View view) {
    }
}