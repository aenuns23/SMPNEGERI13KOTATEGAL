package com.example.smpnegeri13kotategal;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.smpnegeri13kotategal.EkskulActivity;
import com.example.smpnegeri13kotategal.FasilitasActivity;
import com.example.smpnegeri13kotategal.GaleriActivity;
import com.example.smpnegeri13kotategal.GuruActivity;
import com.example.smpnegeri13kotategal.PerpusActivity;
import com.example.smpnegeri13kotategal.ProfilActivity;


public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.headersekolah,
            R.drawable.smp13,
            R.drawable.profilsekolahsmp,
            R.drawable.headerschool
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }
}