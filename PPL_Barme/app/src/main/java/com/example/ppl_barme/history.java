package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }


    public void clickHpeng(View view) {
        Intent intent = new Intent(history.this, pengaturan.class);
        startActivity(intent);
    }

    public void download(View view) {
        Toast.makeText(history.this, "Download Sukses", Toast.LENGTH_LONG).show();
    }

    public void clickHLogout(View view) {
        Intent intent = new Intent(history.this, MainActivity.class);
        startActivity(intent);
    }
}