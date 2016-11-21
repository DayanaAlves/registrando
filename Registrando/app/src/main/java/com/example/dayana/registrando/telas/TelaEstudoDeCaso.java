package com.example.dayana.registrando.telas;

import com.example.dayana.registrando.R;
import com.example.dayana.registrando.telas.estudos_de_caso.*;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class TelaEstudoDeCaso extends AppCompatActivity {

    private Context _context = this;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudo_de_caso);
    }

    //Abrir telas de cada Estudo de Caso

    public void estudoDeCasoUm(View view) {

        Intent intent = new Intent(_context, CasoUm.class);
        startActivity(intent);
    }

    public void estudoDeCasoDois(View view) {

        Intent intent = new Intent(_context, CasoDois.class);
        startActivity(intent);
    }

    public void estudoDeCasoTres(View view) {

        Intent intent = new Intent(_context, CasoTres.class);
        startActivity(intent);
    }

    public void estudoDeCasoQuatro(View view) {

        Intent intent = new Intent(_context, CasoQuatro.class);
        startActivity(intent);
    }

    public void estudoDeCasoCinco(View view) {

        Intent intent = new Intent(_context, CasoCinco.class);
        startActivity(intent);
    }

    public void estudoDeCasoSeis(View view) {

        Intent intent = new Intent(_context, CasoSeis.class);
        startActivity(intent);
    }

    public void estudoDeCasoSete(View view) {

        Intent intent = new Intent(_context, CasoSete.class);
        startActivity(intent);
    }

    public void estudoDeCasoOito(View view) {

        Intent intent = new Intent(_context, CasoOito.class);
        startActivity(intent);
    }

    public void estudoDeCasoNove(View view) {

        Intent intent = new Intent(_context, CasoNove.class);
        startActivity(intent);
    }

}
