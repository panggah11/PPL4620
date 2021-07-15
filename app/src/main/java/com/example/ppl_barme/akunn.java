package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class akunn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akunn);
    }

    public void save(View view) {
        Intent intent = new Intent(akunn.this, home.class);
        startActivity(intent);
        Toast.makeText(akunn.this, "Berhasil Update Akun", Toast.LENGTH_LONG).show();
    }
}