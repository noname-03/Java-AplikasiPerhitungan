package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjanggg extends AppCompatActivity {

    // Deklarasi Variabel
    private EditText sisi_alas;
    private EditText sisi_miring;
    private EditText tinggiJ;
    private Button Bt_Hitung;
    private TextView TV_Luas;
    private TextView TV_Keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjanggg);
        
        // inisialisasi
        sisi_alas = findViewById(R.id.sisiAlas);
        sisi_miring = findViewById(R.id.sisiMiring);
        tinggiJ = findViewById(R.id.TinggiJ);
        Bt_Hitung = findViewById(R.id.btn_hitung);
        TV_Luas = findViewById(R.id.Hasil_Luas);
        TV_Keliling = findViewById(R.id.Hasil_Keliling);
        
        //Listener Button
        Bt_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung_Luas();
                hitung_Keliling();
            }
        });
    }

    private void hitung_Luas() {
    }

    private void hitung_Keliling() {
    }
}