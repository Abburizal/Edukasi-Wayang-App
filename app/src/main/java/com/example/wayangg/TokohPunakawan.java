package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TokohPunakawan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh_punakawan);

        final Button btsemar = findViewById(R.id.bt_semar);
        btsemar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WK3_Bottom_Sheet wk3bs = new WK3_Bottom_Sheet();
                wk3bs.show(getSupportFragmentManager(), wk3bs.getTag());
            }
        });

        final Button btgareng = findViewById(R.id.bt_gareng);
        btgareng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WK2_Bottom_Sheet wk2bs = new WK2_Bottom_Sheet();
                wk2bs.show(getSupportFragmentManager(), wk2bs.getTag());
            }
        });

        final Button btpetruk = findViewById(R.id.bt_petruk);
        btpetruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WK1_Bottom_Sheet wk1bs = new WK1_Bottom_Sheet();
                wk1bs.show(getSupportFragmentManager(), wk1bs.getTag());
            }
        });

        final Button btbagong = findViewById(R.id.bt_bagong);
        btbagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WK4_Bottom_Sheet wk4bs = new WK4_Bottom_Sheet();
                wk4bs.show(getSupportFragmentManager(), wk4bs.getTag());
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
