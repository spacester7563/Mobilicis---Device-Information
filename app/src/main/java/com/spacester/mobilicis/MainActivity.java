package com.spacester.mobilicis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.model).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), ModelActivity.class)));

        findViewById(R.id.battery).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), BatteryActivity.class)));

        findViewById(R.id.camera).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), CameraActivity.class)));

        findViewById(R.id.storage).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), StorageActivity.class)));

        findViewById(R.id.gpu).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), CPUGPUActivity.class)));

        findViewById(R.id.sensor).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), SensorActivity.class)));

    }
}