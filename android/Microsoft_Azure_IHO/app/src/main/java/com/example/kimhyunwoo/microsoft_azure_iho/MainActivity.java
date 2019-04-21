package com.example.kimhyunwoo.microsoft_azure_iho;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton startButton = findViewById(R.id.start);
        ImageButton logoutButton = findViewById(R.id.logout);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
                startActivity(startIntent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutIntent = new Intent(MainActivity.this, Azure_IHO.class);
                MainActivity.this.startActivity(logoutIntent);
            }
        });

    }
}
