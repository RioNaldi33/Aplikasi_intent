package com.example.aplikasiintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMobil = findViewById(R.id.btnMobil);
        Button btnMotor = findViewById(R.id.btnMotor);
        Button btnSepeda = findViewById(R.id.btnSepeda);

        btnMobil.setOnClickListener(this);
        btnMotor.setOnClickListener(this);
        btnSepeda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMobil) {
            Intent intent = new Intent(this, MobilActivity.class);
            startActivity(intent);
        } if (v.getId() == R.id.btnMotor) {
            Intent intent = new Intent(this,MotorActivity.class);
            startActivity(intent);
        } if (v.getId() == R.id.btnSepeda) {
            Intent intent = new Intent(this,SepedaActivity.class);
            startActivity(intent);
        }
    }
}