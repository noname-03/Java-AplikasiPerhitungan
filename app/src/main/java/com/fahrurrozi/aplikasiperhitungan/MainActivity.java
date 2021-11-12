package com.fahrurrozi.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // deklarasi button apa saja yang ingin di pake
    private Button viewButtonBalok;
    private Button viewButtonLingkaran;
    private Button viewButtonSegitiga;
    private Button viewButtonJajarGenjang;
    private  Button ViewWeb;
    private  Button ViewScroll;
    private  Button viewrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //security to not be use screen shoot
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

        // memanggil id yang sudah di deklarasikan kedalam variabel
        viewButtonBalok = (Button)findViewById(R.id.balok);
        viewButtonLingkaran = (Button) findViewById(R.id.lingkaran);
        viewrb = (Button)findViewById(R.id.rb);
        viewButtonSegitiga = (Button) findViewById(R.id.segitiga);
        ViewWeb = (Button) findViewById(R.id.webview);
        ViewScroll = (Button) findViewById(R.id.scroll);

        // aksi listener balok ( button ketika di klik )
        viewButtonBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // untuk memanggil class balok
                startActivity(new Intent(getApplicationContext(),Balok.class));
            }
        });
        viewButtonSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // memanggil class segitiga
                startActivity(new Intent(getApplicationContext(),Segitita.class));
            }
        });
        //aksi listener lingkaran
        viewButtonLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Lingkaran.class));
            }
        });
        //aksi listener webview
        ViewWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),webview.class));
            }
        });
        //aksi listener scroll view
        ViewScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Scroll.class));
            }
        });
        //aksi listener radio button
        viewrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RadioButton.class));
            }
        });
    }
}