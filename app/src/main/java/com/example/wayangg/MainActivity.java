package com.example.wayangg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog = new Dialog(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawar_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
        }

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new MenuFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MenuFragment()).commit();
                break;
            case R.id.nav_tokoh:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new TokohFragment()).commit();
                break;
            case R.id.nav_quiz:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new QuizFragment()).commit();
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    //untuk button home
    public void btwayk(View view) {
        Intent intent = new Intent(MainActivity.this, Pop_wk.class);
        startActivity(intent);
    }
    public void btwgol(View view) {
        Intent intent = new Intent(MainActivity.this, Pop_wg.class);
        startActivity(intent);
    }
    public void btwora(View view) {
        Intent intent = new Intent(MainActivity.this, Pop_wo.class);
        startActivity(intent);
    }
    public void btwbeb(View view) {
        Intent intent = new Intent(MainActivity.this, Pop_wb.class);
        startActivity(intent);
    }
    public void btwkli(View view) {
        Intent intent = new Intent(MainActivity.this, Pop_wkli.class);
        startActivity(intent);
    }

    //untuk button tokoh
    public void btdewadewi(View view) {
        Intent intent = new Intent(MainActivity.this, TokohDewaDewi.class);
        startActivity(intent);
    }
    public void btramayana(View view) {
        Intent intent = new Intent(MainActivity.this, TokohRamayana.class);
        startActivity(intent);
    }
    public void btmahabharata(View view) {
        Intent intent = new Intent(MainActivity.this, TokohMahabharata.class);
        startActivity(intent);
    }
    public void btpunakawan(View view) {
        Intent intent = new Intent(MainActivity.this, TokohPunakawan.class);
        startActivity(intent);
    }
    public void btvid1(View view) {
        VideoView videoView;
        ImageView imageView;
        dialog.setContentView(R.layout.video_pop1);
        imageView=(ImageView) dialog.findViewById(R.id.closepopupvideo1);
        videoView=(VideoView) dialog.findViewById(R.id.vide1);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videwk);
        videoView.setVideoURI(uri);
        videoView.start();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void btvid2(View view) {
        VideoView videoView;
        ImageView imageView;
        dialog.setContentView(R.layout.video_pop2);
        imageView=(ImageView) dialog.findViewById(R.id.closepopupvideo2);
        videoView=(VideoView) dialog.findViewById(R.id.vide2);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videwg);
        videoView.setVideoURI(uri);
        videoView.start();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    public void btvid3(View view) {
        VideoView videoView;
        ImageView imageView;
        dialog.setContentView(R.layout.video_pop3);
        imageView=(ImageView) dialog.findViewById(R.id.closepopupvideo3);
        videoView=(VideoView) dialog.findViewById(R.id.vide3);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videwo);
        videoView.setVideoURI(uri);
        videoView.start();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}