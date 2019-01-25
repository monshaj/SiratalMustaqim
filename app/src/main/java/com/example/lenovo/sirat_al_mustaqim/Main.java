package com.example.lenovo.sirat_al_mustaqim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button btnnames, btnmosques, btnzakat, btntasbih, btnadhan, btnsurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnames = findViewById(R.id.btnnames);
        btnmosques = findViewById(R.id.btnmosques);
        btnzakat = findViewById(R.id.btnzakat);
        btntasbih = findViewById(R.id.btntasbih);
        btnadhan = findViewById(R.id.btnadhan);
        btnsurah = findViewById(R.id.btnsurah);
    }
}
