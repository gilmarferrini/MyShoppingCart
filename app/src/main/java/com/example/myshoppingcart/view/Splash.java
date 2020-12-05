package com.example.myshoppingcart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myshoppingcart.R;
import com.example.myshoppingcart.controller.ItemController;

public class Splash extends AppCompatActivity {

    private ItemController itemController;

    Handler handler;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Foi criado a instância para o controller nesta activity
        // para quando ele aguardar alguns segundos ele já cria a database
        itemController = new ItemController(Splash.this);

        changeActivity();
    }

    public void changeActivity() {

        handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }

}