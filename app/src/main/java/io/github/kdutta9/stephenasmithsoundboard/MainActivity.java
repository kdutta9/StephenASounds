package io.github.kdutta9.stephenasmithsoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {
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
    MediaPlayer sound21;
    MediaPlayer sound22;
    MediaPlayer sound23;
    MediaPlayer sound24;
    MediaPlayer sound25;
    MediaPlayer sound26;
    MediaPlayer sound27;
    MediaPlayer sound28;
    MediaPlayer sound29;
    MediaPlayer sound30;
    MediaPlayer sound31;
    MediaPlayer sound32;
    MediaPlayer sound33;
    MediaPlayer sound34;
    MediaPlayer sound35;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button specificPage = findViewById(R.id.specific_button);
        specificPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
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
        sound21 = MediaPlayer.create(this, R.raw.sound21);
        sound22 = MediaPlayer.create(this, R.raw.sound22);
        sound23 = MediaPlayer.create(this, R.raw.sound23);
        sound24 = MediaPlayer.create(this, R.raw.sound24);
        sound25 = MediaPlayer.create(this, R.raw.sound25);
        sound26 = MediaPlayer.create(this, R.raw.sound26);
        sound27 = MediaPlayer.create(this, R.raw.sound27);
        sound28 = MediaPlayer.create(this, R.raw.sound28);
        sound29 = MediaPlayer.create(this, R.raw.sound29);
        sound30 = MediaPlayer.create(this, R.raw.sound30);
        sound31 = MediaPlayer.create(this, R.raw.sound31);
        sound32 = MediaPlayer.create(this, R.raw.sound32);
        sound33 = MediaPlayer.create(this, R.raw.sound33);
        sound34 = MediaPlayer.create(this, R.raw.sound34);
        sound35 = MediaPlayer.create(this, R.raw.sound35);
    }

    public void sound(View view) {
        double randomNum = Math.random() * 35 + 1;
        int selector = (int) randomNum;
        if (selector == 1) {
            sound1.start();
        }
        if (selector == 2) {
            sound2.start();
        }
        if (selector == 3) {
            sound3.start();
        }
        if (selector == 4) {
            sound4.start();
        }
        if (selector == 5) {
            sound5.start();
        }
        if (selector == 6) {
            sound6.start();
        }
        if (selector == 7) {
            sound7.start();
        }
        if (selector == 8) {
            sound8.start();
        }
        if (selector == 9) {
            sound9.start();
        }
        if (selector == 10) {
            sound10.start();
        }
        if (selector == 11) {
            sound11.start();
        }
        if (selector == 12) {
            sound12.start();
        }
        if (selector == 13) {
            sound13.start();
        }
        if (selector == 14) {
            sound14.start();
        }
        if (selector == 15) {
            sound15.start();
        }
        if (selector == 16) {
            sound16.start();
        }
        if (selector == 17) {
            sound17.start();
        }
        if (selector == 18) {
            sound18.start();
        }
        if (selector == 19) {
            sound19.start();
        }
        if (selector == 20) {
            sound20.start();
        }
        if (selector == 21) {
            sound21.start();
        }
        if (selector == 22) {
            sound22.start();
        }
        if (selector == 23) {
            sound23.start();
        }
        if (selector == 24) {
            sound24.start();
        }
        if (selector == 25) {
            sound25.start();
        }
        if (selector == 26) {
            sound26.start();
        }
        if (selector == 27) {
            sound27.start();
        }
        if (selector == 28) {
            sound28.start();
        }
        if (selector == 29) {
            sound29.start();
        }
        if (selector == 30) {
            sound30.start();
        }
        if (selector == 31) {
            sound31.start();
        }
        if (selector == 32) {
            sound32.start();
        }
        if (selector == 33) {
            sound33.start();
        }
        if (selector == 34) {
            sound34.start();
        }
        if (selector == 35) {
            sound35.start();
        }
    }
}
