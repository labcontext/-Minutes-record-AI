package com.example.kimhyunwoo.microsoft_azure_iho;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText First_name = findViewById(R.id.First_name);
        final EditText Last_name = findViewById(R.id.Last_name);

        final EditText Email = findViewById(R.id.Email);
        final EditText password = findViewById(R.id.password);
        final EditText password_check = findViewById(R.id.password_check);
        final EditText Phone = findViewById(R.id.Phone);

        Button RegisterButton = findViewById(R.id.Register);
        Button CancelButton = findViewById(R.id.Cancel);

        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CancelIntent = new Intent(Register.this, Azure_IHO.class);
                Register.this.startActivity(CancelIntent);
            }
        });

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterIntent = new Intent(Register.this, Azure_IHO.class);
                Register.this.startActivity(RegisterIntent);
            }
        });

    }
}
