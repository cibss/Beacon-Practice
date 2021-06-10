package com.example.beaconpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btnFindDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFindDevice = findViewById(R.id.btnFindDevice);

        btnFindDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent findDevice = new Intent(MainActivity.this, DeviceList.class);
                findDevice.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(findDevice);
            }
        });
    }
}