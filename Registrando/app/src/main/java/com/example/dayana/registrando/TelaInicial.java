package com.example.dayana.registrando;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaInicial extends AppCompatActivity {

    // Temporizador de saída da Activity
    private static int TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //Quando o time acabar, a Intent executa a Tela Principal da App
                Intent i = new Intent(TelaInicial.this, Login.class);
                startActivity(i);

                //Fecha a Activity
                finish();
            }
        }, TIME_OUT);
    }
}
