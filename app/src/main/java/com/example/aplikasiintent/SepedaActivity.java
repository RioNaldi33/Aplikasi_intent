package com.example.aplikasiintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SepedaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepeda);

        Button btnsepeda1 = findViewById(R.id.btnsepeda1);
        Button btnsepeda2 = findViewById(R.id.btnsepeda2);
        Button btnsepeda3 = findViewById(R.id.btnsepeda3);
        Button btnsepeda4 = findViewById(R.id.btnsepeda4);
        Button btnsepeda5 = findViewById(R.id.btnsepeda5);

        btnsepeda1.setOnClickListener(this);
        btnsepeda2.setOnClickListener(this);
        btnsepeda3.setOnClickListener(this);
        btnsepeda4.setOnClickListener(this);
        btnsepeda5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnsepeda1) {
            Detail sepeda1 = new Detail();
            sepeda1.setGambar("sepeda1");
            sepeda1.setName("POLYGON Xtrada 5 Frame Small Wheel 27.5");
            sepeda1.setPrice("RP. 8.450.000,00");
            sepeda1.setType("Type: BMX");
            sepeda1.setCc("Frame: ALX XC 27.5 inch");

            Intent intent = new Intent(SepedaActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,sepeda1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnsepeda2) {
            Detail sepeda2 = new Detail();
            sepeda2.setGambar("sepeda2");
            sepeda2.setName("POLYGON Sepeda Gunung Xtrada 5 2020 27.5 inch");
            sepeda2.setPrice("RP. 7.710.000,00");
            sepeda2.setType("Type: Sepeda Gunung");
            sepeda2.setCc("Frame: ALX XC 27.5 & 29");

            Intent intent = new Intent(SepedaActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,sepeda2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnsepeda3) {
            Detail sepeda3 = new Detail();
            sepeda3.setGambar("sepeda3");
            sepeda3.setName("POLYGON Premier 4 27.5 Inch");
            sepeda3.setPrice("RP. 5.500.000,00");
            sepeda3.setType("Type: BMX");
            sepeda3.setCc("Frame: ALUTECH XC SPORT FRAME");

            Intent intent = new Intent(SepedaActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,sepeda3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnsepeda4) {
            Detail sepeda4 = new Detail();
            sepeda4.setGambar("sepeda4");
            sepeda4.setName("POLYGON Sepeda Premier 5 Size M");
            sepeda4.setPrice("RP. 5.494.500,00");
            sepeda4.setType("Type: BMX");
            sepeda4.setCc("Frame: Alloy Internal Cable Routing");

            Intent intent = new Intent(SepedaActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,sepeda4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnsepeda5) {
            Detail sepeda5 = new Detail();
            sepeda5.setGambar("sepeda5");
            sepeda5.setName("POLYGON Urbano 5 Sepeda Lipat 20 Inch");
            sepeda5.setPrice("RP. 7.038.500,00");
            sepeda5.setType("Type: Sepeda Lipat");
            sepeda5.setCc("Frame: Alloy");

            Intent intent = new Intent(SepedaActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,sepeda5);
            startActivity(intent);
        }
    }
}