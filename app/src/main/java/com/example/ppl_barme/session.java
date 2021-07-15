package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }

    public void session(View view) {
        Intent intent = new Intent(session.this, publik.class);
        startActivity(intent);
        Toast.makeText(session.this, "Jadwal Terpilih", Toast.LENGTH_LONG).show();
    }
}