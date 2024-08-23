package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TokohDewaDewi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh_dewa_dewi);

        final Button btbrahma = findViewById(R.id.bt_brahma);
        btbrahma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsDewBra bsbra = new BsDewBra();
                bsbra.show(getSupportFragmentManager(), bsbra.getTag());
            }
        });

        final Button btkresna = findViewById(R.id.bt_kresna);
        btkresna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsDewKre bskre = new BsDewKre();
                bskre.show(getSupportFragmentManager(), bskre.getTag());
            }
        });

        final Button bttunggal = findViewById(R.id.bt_tunggal);
        bttunggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsDewTun bstun = new BsDewTun();
                bstun.show(getSupportFragmentManager(), bstun.getTag());
            }
        });

        final Button btwisnu = findViewById(R.id.bt_wisnu);
        btwisnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsDewWis bswis = new BsDewWis();
                bswis.show(getSupportFragmentManager(), bswis.getTag());
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
