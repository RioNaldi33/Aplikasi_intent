package com.example.aplikasiintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MobilActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);

        Button btnmobil1 = findViewById(R.id.btnmobil1);
        Button btnmobil2 = findViewById(R.id.btnmobil2);
        Button btnmobil3 = findViewById(R.id.btnmobil3);
        Button btnmobil4 = findViewById(R.id.btnmobil4);
        Button btnmobil5 = findViewById(R.id.btnmobil5);

        btnmobil1.setOnClickListener(this);
        btnmobil2.setOnClickListener(this);
        btnmobil3.setOnClickListener(this);
        btnmobil4.setOnClickListener(this);
        btnmobil5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnmobil1) {
            Detail mobil1 = new Detail();
            mobil1.setGambar("mobil1");
            mobil1.setName("BUGATTI LA VOITURE NOIRE");
            mobil1.setPrice("RP. 30.000.000.000,00");
            mobil1.setType("Type: Sport");
            mobil1.setCc("Mesin: 1500cc");

            Intent intent = new Intent(MobilActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,mobil1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmobil2) {
            Detail mobil2 = new Detail();
            mobil2.setGambar("mobil2");
            mobil2.setName("LAMBORGHINI HURACAN");
            mobil2.setPrice("RP. 10.000.000.000,00");
            mobil2.setType("Type: Sport");
            mobil2.setCc("Mesin: 1000cc");
            Intent intent = new Intent(MobilActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,mobil2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmobil3) {
            Detail mobil3 = new Detail();
            mobil3.setGambar("mobil3");
            mobil3.setName("ROLLS ROYCE SPECTRE");
            mobil3.setPrice("RP. 15.000.000.000,00");
            mobil3.setType("Type: Sport");
            mobil3.setCc("Mesin: 1200cc");
            Intent intent = new Intent(MobilActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,mobil3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmobil4) {
            Detail mobil4 = new Detail();
            mobil4.setGambar("mobil4");
            mobil4.setName("BMW I8");
            mobil4.setPrice("RP. 8.000.000.000,00");
            mobil4.setType("Type: Sport");
            mobil4.setCc("Mesin: 950cc");
            Intent intent = new Intent(MobilActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,mobil4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmobil5) {
            Detail mobil5 = new Detail();
            mobil5.setGambar("mobil5");
            mobil5.setName("KOENIGSEGG REGERA");
            mobil5.setPrice("RP. 20.000.000.000,00");
            mobil5.setType("Type: Sport");
            mobil5.setCc("Mesin: 2000cc");
            Intent intent = new Intent(MobilActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,mobil5);
            startActivity(intent);
        }
    }
}