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

public class MotorActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);

        Button btnmotor1 = findViewById(R.id.btnmotor1);
        Button btnmotor2 = findViewById(R.id.btnmotor2);
        Button btnmotor3 = findViewById(R.id.btnmotor3);
        Button btnmotor4 = findViewById(R.id.btnmotor4);
        Button btnmotor5 = findViewById(R.id.btnmotor5);

        btnmotor1.setOnClickListener(this);
        btnmotor2.setOnClickListener(this);
        btnmotor3.setOnClickListener(this);
        btnmotor4.setOnClickListener(this);
        btnmotor5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnmotor1) {
            Detail motor1 = new Detail();
            motor1.setGambar("motor1");
            motor1.setName("KAWASAKI NINJA H2R");
            motor1.setPrice("Harga: RP. 873.000.000,00");
            motor1.setType("Type: Sport");
            motor1.setCc("Mesin: 998cc");

            Intent intent = new Intent(MotorActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,motor1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmotor2) {
            Detail motor2 = new Detail();
            motor2.setGambar("motor2");
            motor2.setName("APRILIA RSV4");
            motor2.setPrice("Harga: RP. 823.000.000,00");
            motor2.setType("Type: Sport");
            motor2.setCc("Mesin: 955cc");

            Intent intent = new Intent(MotorActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,motor2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmotor3) {
            Detail motor3 = new Detail();
            motor3.setGambar("motor3");
            motor3.setName("BMW HP4");
            motor3.setPrice("Harga: RP. 1.300.000.000,00");
            motor3.setType("Type: Sport");
            motor3.setCc("Mesin: 999cc");

            Intent intent = new Intent(MotorActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,motor3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmotor4) {
            Detail motor4 = new Detail();
            motor4.setGambar("motor4");
            motor4.setName("YAMAHA R1M");
            motor4.setPrice("Harga: RP. 812.000.000,00");
            motor4.setType("Type: Sport");
            motor4.setCc("Mesin: 998cc");

            Intent intent = new Intent(MotorActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,motor4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btnmotor5) {
            Detail motor5 = new Detail();
            motor5.setGambar("motor5");
            motor5.setName("DUCATI PANIGALE");
            motor5.setPrice("Harga: RP. 799.000.000,00");
            motor5.setType("Type: Sport");
            motor5.setCc("Mesin: 955cc");

            Intent intent = new Intent(MotorActivity.this,DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA,motor5);
            startActivity(intent);
        }
    }
}
