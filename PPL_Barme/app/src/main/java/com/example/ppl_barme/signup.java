package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText mEmailEdit, mUsernameEdit, mPasswordedit;
    Button mRegistrasiButton;

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    public static final String session = "session";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mUsernameEdit           = (EditText) findViewById(R.id.edregisuser);
        mEmailEdit        = (EditText) findViewById(R.id.edregisemail);
        mPasswordedit           = (EditText) findViewById(R.id.edregispass);

        mRegistrasiButton       = (Button) findViewById(R.id.btnregis);

        mRegistrasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pref        = getSharedPreferences(session, MODE_PRIVATE);
                editor      = pref.edit();
                editor.putString("namaLengkap", mEmailEdit.getText().toString());
                editor.putString("username", mUsernameEdit.getText().toString());
                editor.putString("password", mPasswordedit.getText().toString());
                editor.apply();
                Intent moveHalamanUtama = new Intent(signup.this, signin.class);
                startActivity(moveHalamanUtama);
                Toast.makeText(signup.this, "Registrasi Sukses", Toast.LENGTH_LONG).show();
            }
        });
    }
}