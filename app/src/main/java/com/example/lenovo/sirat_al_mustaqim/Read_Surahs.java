package com.example.lenovo.sirat_al_mustaqim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Read_Surahs extends AppCompatActivity {

    ListView surahListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read__surahs);

        surahListView = findViewById(R.id.readSurahListViewId);
        final String[] surahNames = getResources().getStringArray(R.array.surah_names);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.sample_surah_names_list,R.id.sampleSurahNamesId,surahNames);
        surahListView.setAdapter(adapter);

        surahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = surahNames[i];

                if (i==0)
                {
                    Intent intent = new Intent(getApplicationContext(),Surah_Fateha.class);
                    startActivity(intent);
                }
                if (i==1)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Bakarah.class);
                    startActivity(intent);
                }
                if (i==2)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_emran.class);
                    startActivity(intent);
                }
                if (i==3)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Nisa.class);
                    startActivity(intent);
                }
                if (i==4)
                {
                    Intent intent = new Intent(getApplicationContext(),Al_Maidah.class);
                    startActivity(intent);
                }
            }
        });


    }
}
