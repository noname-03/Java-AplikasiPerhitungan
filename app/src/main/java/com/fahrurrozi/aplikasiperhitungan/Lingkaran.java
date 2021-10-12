package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
//Dekalarasi
    private EditText e_jarijari;
    private Button b_luas;
    private Button b_keliling;
    private Button b_diameter;
    private TextView h_luas;
    private TextView h_keliling;
    private TextView h_diameter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        //inisialisasi
        e_jarijari = findViewById(R.id.eJariJari);
        b_luas = findViewById(R.id.bLuas);
        b_keliling = findViewById(R.id.bKeliling);
        b_diameter = findViewById(R.id.bDiameter);
        h_luas = findViewById(R.id.hLuas);
        h_keliling = findViewById(R.id.hKeliling);
        h_diameter = findViewById(R.id.hDiameter);

        //aksi keliling
        b_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungkeliling();
            }
        });
        //aksi luas
        b_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluas();
            }
        });
        //aksi diameter
        b_diameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungdiameter();
            }
        });
    }

    private void  hitungdiameter(){
        String JariJari = e_jarijari.getText().toString();
        double diameter = 2 * Integer.parseInt(JariJari);
        h_diameter.setText("Nilai Diameter adalah : " + diameter);
    }
    private void hitungluas() {
        String JariJari = e_jarijari.getText().toString();
        double luas = 3.14 * Integer.parseInt(JariJari) * Integer.parseInt(JariJari);
        h_luas.setText("Nilai Luas Adalah : " + luas);
    }

    private void hitungkeliling() {
        String JariJari = e_jarijari.getText().toString();
        double keliling = 2 * 3.14 * Integer.parseInt(JariJari) ;
        h_keliling.setText("Nilai Keliling Adalah : " + keliling);
    }
}