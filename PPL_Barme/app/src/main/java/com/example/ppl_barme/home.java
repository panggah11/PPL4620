package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void clickhost(View view) {
        Intent intent = new Intent(home.this, host.class);
        startActivity(intent);
    }

    public void clickpublic(View view) {
        Intent intent = new Intent(home.this, publik.class);
        startActivity(intent);
    }

    public void clickhistory(View view) {
        Intent intent = new Intent(home.this, history.class);
        startActivity(intent);
    }

    public void clickpengaturan(View view) {
        Intent intent = new Intent(home.this, pengaturan.class);
        startActivity(intent);
    }

    public void clicklogout(View view) {
        Intent intent = new Intent(home.this, MainActivity.class);
        startActivity(intent);
    }
}