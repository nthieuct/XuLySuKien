package com.example.xulysukien;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_hinh;
    Button btn_vang, btn_cam, btn_lam;

    @Override
    public void onClick(View v) {
        if (v == btn_cam) {
            img_hinh.setBackgroundColor(Color.parseColor("#F4511E"));  // cam
        }
        if (v == btn_lam) {
            img_hinh.setBackgroundColor(Color.parseColor("#1E88E5")); // lam
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_xanhla = findViewById(R.id.btn_xanhla);
        btn_vang = findViewById(R.id.btn_vang);
        btn_cam = findViewById(R.id.btn_cam);
        Button btn_tim = findViewById(R.id.btn_tim);
        btn_lam = findViewById(R.id.btn_lam);
        img_hinh = findViewById(R.id.img_hinh);

        btn_xanhla.setOnClickListener(v -> {
            img_hinh.setBackgroundColor(Color.parseColor("#43A047")); // xanh la
        });

        btn_cam.setOnClickListener(this);
        btn_lam.setOnClickListener(this);

        btn_vang.setOnClickListener(listener);

        btn_tim.setOnClickListener(new MauTim());
    }

    public void click_do(View view) {
        img_hinh.setBackgroundColor(Color.parseColor("#FF0000")); // do
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == btn_vang) {
                img_hinh.setBackgroundColor(Color.parseColor("#FFB300")); // vang
            }
        }
    };

    class MauTim implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            img_hinh.setBackgroundColor(Color.parseColor("#6A07F8")); // tim
        }
    }

}