package com.olmo.animales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonCaballo,buttonElefante,buttonGallo,buttonGato,buttonLeon,buttonPerro,buttonVaca;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCaballo = findViewById(R.id.buttonCaballo);
        buttonCaballo.setOnClickListener(this);

        buttonElefante = findViewById(R.id.buttonElefante);
        buttonElefante.setOnClickListener(this);

        buttonGallo = findViewById(R.id.buttonGallo);
        buttonGallo.setOnClickListener(this);

        buttonGato = findViewById(R.id.buttonGato);
        buttonGato.setOnClickListener(this);

        buttonLeon = findViewById(R.id.buttonLeon);
        buttonLeon.setOnClickListener(this);

        buttonPerro = findViewById(R.id.buttonPerro);
        buttonPerro.setOnClickListener(this);

        buttonVaca = findViewById(R.id.buttonVaca);
        buttonVaca.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.caballo);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCaballo:
               if(mp.isPlaying()){
                   mp.stop();
               }
                mp = MediaPlayer.create(this, R.raw.caballo);
                mp.start();
                break;
            case R.id.buttonElefante:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.elefante);
                mp.start();
                break;
            case R.id.buttonGallo:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.gallo);
                mp.start();
                break;
            case R.id.buttonGato:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.gato);
                mp.start();
                break;
            case R.id.buttonLeon:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.leon);
                mp.start();
                break;
            case R.id.buttonPerro:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.perro);
                mp.start();
                break;
            case R.id.buttonVaca:
                if(mp.isPlaying()){
                    mp.stop();
                }
                mp = MediaPlayer.create(this, R.raw.vaca);
                mp.start();
                break;

        }
    }
}