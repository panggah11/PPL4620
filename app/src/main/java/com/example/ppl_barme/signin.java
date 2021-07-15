package com.example.ppl_barme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {
    EditText mUsernameEdit, mPasswordEdit;
    Button mLoginButton;

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    public static final String session = "session";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        mUsernameEdit       = (EditText) findViewById(R.id.edlogusername);
        mPasswordEdit       = (EditText) findViewById(R.id.edlogpass);

        mLoginButton        = (Button) findViewById(R.id.btnlogin);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mUsernameEdit.getText().toString();
                String pass = mPasswordEdit.getText().toString();

                pref       = getSharedPreferences(session, MODE_PRIVATE);

                boolean username = user.equals(pref.getString("username", "null"));
                boolean password =  pass.equals(pref.getString("password", "null"));
                if(username && password)
                {
                    Intent moveHalamanUtama = new Intent(signin.this, home.class);
                    startActivity(moveHalamanUtama);
                }else{
                    Toast.makeText(signin.this, "Username dan Password SALAH !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}