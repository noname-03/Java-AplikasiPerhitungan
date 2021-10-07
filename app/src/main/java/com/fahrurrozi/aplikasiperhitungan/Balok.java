package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {
    //deklarasi
    private EditText editpanjang;
    private EditText editlebar;
    private EditText edittinggi;
    private Button bhitung;
    private TextView hluas;
    private TextView hkeliling;
    private TextView hvolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        //inisialisasi
        editpanjang = findViewById(R.id.panjang);
        editlebar = findViewById(R.id.lebar);
        edittinggi = findViewById(R.id.tinggi);
        bhitung = findViewById(R.id.hitung);
        hluas = findViewById(R.id.h_luas);
        hkeliling = findViewById(R.id.h_keliling);
        hvolume = findViewById(R.id.h_volume);
        
        //aksi button listener
        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluas();
                hitungkeliling();
                hitungvolume();
            }
        });
    }

    // method

    private void hitungkeliling() {
        String panjang = editpanjang.getText().toString();
        String lebar = editlebar.getText().toString();
        String tinggi = edittinggi.getText().toString();

        int keliling = 4 * (Integer.parseInt(panjang) + Integer.parseInt(lebar) + Integer.parseInt(tinggi));
        hkeliling.setText("nilai keliling adalah : " + keliling);
    }

    private void hitungluas() {
        String panjang = editpanjang.getText().toString();
        String lebar = editlebar.getText().toString();
        String tinggi = edittinggi.getText().toString();

        // aritmatika
        int luas = 2 * (Integer.parseInt(panjang) * Integer.parseInt(lebar) + Integer.parseInt(panjang) * Integer.parseInt(tinggi) + Integer.parseInt(lebar) * Integer.parseInt(tinggi));
        hluas.setText("nilai luas adalah : " + luas);
    }


    private void hitungvolume() {
        String panjang = editpanjang.getText().toString();
        String lebar = editlebar.getText().toString();
        String tinggi = edittinggi.getText().toString();

        // aritmatika
        int volume = Integer.parseInt(panjang) * Integer.parseInt(lebar) * Integer.parseInt(tinggi);
        hvolume.setText("nilai volume adalah : " + volume);
    }
}