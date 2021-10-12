package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitita extends AppCompatActivity {

    // Deklarasi variabel
    private EditText E_Alas;
    private EditText E_Tinggi;
    private Button B_Luas;
    private TextView H_Luas;
    private EditText E_Sisi1;
    private EditText E_Sisi2;
    private EditText E_Sisi3;
    private Button B_Keliling;
    private TextView H_Keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitita);

        // inisialisasi
        E_Alas = findViewById(R.id.alas);
        E_Tinggi = findViewById(R.id.tinggi);
        B_Luas = findViewById(R.id.hitungluas);
        H_Luas = findViewById(R.id.hluas);
        E_Sisi1 = findViewById(R.id.sisi1);
        E_Sisi2 = findViewById(R.id.sisi2);
        E_Sisi3 = findViewById(R.id.sisi3);
        B_Keliling = findViewById(R.id.hitungkeliling);
        H_Keliling = findViewById(R.id.hkeliling);

        //listener luas
        B_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hitungluas();
            }
        });
        B_Keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungkeliling();
            }
        });
    }

    private void hitungkeliling() {
        String Sisi1 = E_Sisi1.getText().toString();
        String Sisi2 = E_Sisi2.getText().toString();
        String Sisi3 = E_Sisi3.getText().toString();
        double keliling = Integer.parseInt(Sisi1) + Integer.parseInt(Sisi2) + Integer.parseInt(Sisi3);
        H_Keliling.setText("Nilai Kelilingnya Adalah " + keliling);
    }

    private void hitungluas() {
        String Alas = E_Alas.getText().toString();
        String Tinggi = E_Tinggi.getText().toString();
        // aritmatik
        double luas = 0.5 * Integer.parseInt(Alas) * Integer.parseInt(Tinggi);
        H_Luas.setText("Nilai Luasnya Adalah : " + luas);
    }
}