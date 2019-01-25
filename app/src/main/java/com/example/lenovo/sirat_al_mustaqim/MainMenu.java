package com.example.lenovo.sirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainMenu extends AppCompatActivity {
    Button btnnames, btnmosques, btnzakat, btntasbih, btnadhan, btnsurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnnames = findViewById(R.id.btnnames);
        btnmosques = findViewById(R.id.btnmosques);
        btnzakat = findViewById(R.id.btnzakat);
        btntasbih = findViewById(R.id.btntasbih);
        btnadhan = findViewById(R.id.btnadhan);
        btnsurah = findViewById(R.id.btnsurah);

        btnsurah.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),btnsurah);
                popupMenu.getMenuInflater().inflate(R.menu.surahpopupmenu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
                {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem)
                    {
                        int id = menuItem.getItemId();

                        if (id == R.id.mrsurah)
                        {
                            Intent intent = new Intent(MainMenu.this,Read_Surahs.class);
                            startActivity(intent);
                        }

                        if (id == R.id.mlsurah)
                        {
                            Intent intent = new Intent(MainMenu.this,Listen_Surahs.class);
                            startActivity(intent);
                        }
                        return true;
                    }
                });

                popupMenu.show();

            }});

        btnnames.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainMenu.this,Names_of_Allah.class);
                startActivity(intent);
            }
        });

    }

}