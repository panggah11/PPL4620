package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class publik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publik);
    }

    public void clkyes(View view) {
        Intent intent = new Intent(publik.this, home.class);
        startActivity(intent);
        Toast.makeText(publik.this, "Jadwal Terpilih", Toast.LENGTH_LONG).show();
    }

    public void clkno(View view) {
        Intent intent = new Intent(publik.this, home.class);
        startActivity(intent);
    }
}