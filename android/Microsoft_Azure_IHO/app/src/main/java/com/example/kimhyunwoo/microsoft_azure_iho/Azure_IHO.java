package com.example.kimhyunwoo.microsoft_azure_iho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Azure_IHO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azure__iho);

        EditText idText = findViewById(R.id.Email);
        EditText passwordText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.Login);
        TextView registerButton = findViewById(R.id.Register);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Azure_IHO.this, Register.class);
                Azure_IHO.this.startActivity(registerIntent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(Azure_IHO.this, MainActivity.class);
                Azure_IHO.this.startActivity(loginIntent);
            }
        });


    }

}