package com.example.wayangg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SlideScreen extends AppCompatActivity {
    ImageView logosplash;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_screen);

        logosplash = (ImageView) findViewById(R.id.logo_splash);
        linearLayout = (LinearLayout) findViewById(R.id.linier_text);

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.fade);

        logosplash.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SlideScreen.this, Menu.class);
                SlideScreen.this.startActivity(intent);
                SlideScreen.this.finish();
            }
        }, 2500);
    }
}
