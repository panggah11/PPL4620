package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penganturan);
    }

    public void clickhisto(View view) {
        Intent intent = new Intent(pengaturan.this, history.class);
        startActivity(intent);
    }

    public void clickakun(View view) {
        Intent intent = new Intent(pengaturan.this, akunn.class);
        startActivity(intent);
    }
}