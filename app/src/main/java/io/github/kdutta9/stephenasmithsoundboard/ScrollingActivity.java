package io.github.kdutta9.stephenasmithsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {

    MediaPlayer sound1;
    MediaPlayer sound2;
    MediaPlayer sound3;
    MediaPlayer sound4;
    MediaPlayer sound5;
    MediaPlayer sound6;
    MediaPlayer sound7;
    MediaPlayer sound8;
    MediaPlayer sound9;
    MediaPlayer sound10;
    MediaPlayer sound11;
    MediaPlayer sound12;
    MediaPlayer sound13;
    MediaPlayer sound14;
    MediaPlayer sound15;
    MediaPlayer sound16;
    MediaPlayer sound17;
    MediaPlayer sound18;
    MediaPlayer sound19;
    MediaPlayer sound20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button randomPage = findViewById(R.id.random_button);
        randomPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingActivity.this, MainActivity.class);
                startActivity(intent);
            }});

        sound1 = MediaPlayer.create(this, R.raw.sound1);
        sound2 = MediaPlayer.create(this, R.raw.sound2);
        sound3 = MediaPlayer.create(this, R.raw.sound3);
        sound4 = MediaPlayer.create(this, R.raw.sound4);
        sound5 = MediaPlayer.create(this, R.raw.sound5);
        sound6 = MediaPlayer.create(this, R.raw.sound6);
        sound7 = MediaPlayer.create(this, R.raw.sound7);
        sound8 = MediaPlayer.create(this, R.raw.sound8);
        sound9 = MediaPlayer.create(this, R.raw.sound9);
        sound10 = MediaPlayer.create(this, R.raw.sound10);
        sound11 = MediaPlayer.create(this, R.raw.sound11);
        sound12 = MediaPlayer.create(this, R.raw.sound12);
        sound13 = MediaPlayer.create(this, R.raw.sound13);
        sound14 = MediaPlayer.create(this, R.raw.sound14);
        sound15 = MediaPlayer.create(this, R.raw.sound15);
        sound16 = MediaPlayer.create(this, R.raw.sound16);
        sound17 = MediaPlayer.create(this, R.raw.sound17);
        sound18 = MediaPlayer.create(this, R.raw.sound18);
        sound19 = MediaPlayer.create(this, R.raw.sound19);
        sound20 = MediaPlayer.create(this, R.raw.sound20);
    }

    public void sound1(View view) { sound1.start(); }
    public void sound2(View view) { sound2.start(); }
    public void sound3(View view) { sound3.start(); }
    public void sound4(View view) { sound4.start(); }
    public void sound5(View view) { sound5.start(); }
    public void sound6(View view) { sound6.start(); }
    public void sound7(View view) { sound7.start(); }
    public void sound8(View view) { sound8.start(); }
    public void sound9(View view) { sound9.start(); }
    public void sound10(View view) { sound10.start(); }
    public void sound11(View view) { sound11.start(); }
    public void sound12(View view) { sound12.start(); }
    public void sound13(View view) { sound13.start(); }
    public void sound14(View view) { sound14.start(); }
    public void sound15(View view) { sound15.start(); }
    public void sound16(View view) { sound16.start(); }
    public void sound17(View view) { sound17.start(); }
    public void sound18(View view) { sound18.start(); }
    public void sound19(View view) { sound19.start(); }
    public void sound20(View view) { sound20.start(); }
}
