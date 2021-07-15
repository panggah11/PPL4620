package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class host extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
    }

    public void yes(View view) {
        Intent intent = new Intent(host.this, home.class);
        startActivity(intent);
        Toast.makeText(host.this, "Buat Jadwal", Toast.LENGTH_LONG).show();
    }

    public void no(View view) {
        Intent intent = new Intent(host.this, home.class);
        startActivity(intent);
    }

    public void pilih(View view) {
        Toast.makeText(host.this, "pilih", Toast.LENGTH_LONG).show();
    }
}