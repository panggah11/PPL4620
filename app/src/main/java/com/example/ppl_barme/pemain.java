package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pemain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemain);
    }

    public void pemain(View view) {
        Intent intent = new Intent(pemain.this, publik.class);
        startActivity(intent);
        Toast.makeText(pemain.this, "Pemain Terpilih", Toast.LENGTH_LONG).show();
    }
}