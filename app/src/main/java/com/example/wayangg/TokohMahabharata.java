package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TokohMahabharata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh_mahabharata);

        final Button btabimanyu = findViewById(R.id.bt_abimanyu);
        btabimanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsMahAbi bsabi = new BsMahAbi();
                bsabi.show(getSupportFragmentManager(), bsabi.getTag());
            }
        });

        final Button btarjuna = findViewById(R.id.bt_arjuna);
        btarjuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsMahArj bsarj = new BsMahArj();
                bsarj.show(getSupportFragmentManager(), bsarj.getTag());
            }
        });

        final Button btgatot = findViewById(R.id.bt_gatot);
        btgatot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsMahGat bsgat = new BsMahGat();
                bsgat.show(getSupportFragmentManager(), bsgat.getTag());
            }
        });

        final Button btsrikandi = findViewById(R.id.bt_srikandi);
        btsrikandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BsMahSri bssri = new BsMahSri();
                bssri.show(getSupportFragmentManager(), bssri.getTag());
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
