package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TokohRamayana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh_ramayana);

        final Button btanila = findViewById(R.id.bt_anila);
        btanila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsRamAni bsani = new BsRamAni();
                bsani.show(getSupportFragmentManager(), bsani.getTag());
            }
        });

        final Button btbharata = findViewById(R.id.bt_bharata);
        btbharata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsRamBha bsbha = new BsRamBha();
                bsbha.show(getSupportFragmentManager(), bsbha.getTag());
            }
        });

        final Button btjatayu = findViewById(R.id.bt_jatayu);
        btjatayu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsRamJat bsjat = new BsRamJat();
                bsjat.show(getSupportFragmentManager(), bsjat.getTag());
            }
        });

        final Button btrahwana = findViewById(R.id.bt_rahwana);
        btrahwana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsRamRaw bsraw = new BsRamRaw();
                bsraw.show(getSupportFragmentManager(), bsraw.getTag());
            }
        });
    }
    public void backwg(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
