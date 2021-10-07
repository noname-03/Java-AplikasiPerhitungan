package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // deklarasi button apa saja yang ingin di pake
    private Button viewButtonBalok;
    private Button viewButtonLingkaran;
    private Button viewButtonSegitiga;
    private Button viewButtonJajarGenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // memanggil id yang sudah di deklarasikan kedalam variabel
        viewButtonBalok = (Button)findViewById(R.id.balok);
        viewButtonLingkaran = (Button) findViewById(R.id.lingkaran);
        viewButtonJajarGenjang = (Button) findViewById(R.id.jajargenjang);
        viewButtonSegitiga = (Button) findViewById(R.id.segitiga);

        // aksi listener balok ( button ketika di klik )
        viewButtonBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // untuk memanggil class balok
                startActivity(new Intent(getApplicationContext(),Balok.class));
            }
        });

    }
}