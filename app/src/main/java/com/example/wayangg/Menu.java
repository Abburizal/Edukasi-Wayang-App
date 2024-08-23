package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Menu extends AppCompatActivity {
    Dialog dialog;
    public static boolean mAudio = false;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dialog = new Dialog(this);
        audio = new MediaPlayer();

        audio.setLooping(true);
        audio.setVolume(1,1);
        audio.start();

    }

    public void pindah(View view) {
        Intent intent = new Intent(Menu.this, MainActivity.class);
        startActivity(intent);
    }

    public void popupcredit(View view) {
        ImageView closecredit;
        dialog.setContentView(R.layout.credit_popup);
        closecredit=(ImageView) dialog.findViewById(R.id.closepopupcredit);
        closecredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}