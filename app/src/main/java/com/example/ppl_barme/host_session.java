package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class host_session extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_session);
    }

    public void HOsession(View view) {
        Intent intent = new Intent(host_session.this, host.class);
        startActivity(intent);
        Toast.makeText(host_session.this, "Jadwal Terpilih", Toast.LENGTH_LONG).show();
    }
}