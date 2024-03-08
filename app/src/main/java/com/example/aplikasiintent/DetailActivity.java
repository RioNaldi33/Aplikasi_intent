package com.example.aplikasiintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity{
    public static final String KEY_DATA ="key_object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView Gambar = findViewById(R.id.ivproduk);
        TextView Name = findViewById(R.id.tvnamaproduk);
        TextView Price = findViewById(R.id.tvhargaproduk);
        TextView Type = findViewById(R.id.tvtipeproduk);
        TextView Cc = findViewById(R.id.tvcc);





        Detail detail;
        if (Build.VERSION.SDK_INT >= 33) {
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        }else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        Gambar.setImageResource(sourceGambarID);

        Name.setText(detail.getName());
        Price.setText(detail.getPrice());
        Type.setText(detail.getType());
        Cc.setText(detail.getCc());
    }
}