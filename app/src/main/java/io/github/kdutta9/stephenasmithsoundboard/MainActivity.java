package io.github.kdutta9.stephenasmithsoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sound(View view) {
        double randomNum = Math.random() * 20 + 1;
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
    }
}
