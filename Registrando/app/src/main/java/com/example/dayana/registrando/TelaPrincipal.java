package com.example.dayana.registrando;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class TelaPrincipal extends AppCompatActivity{

    private static final String PREF_NAME = "UserPreferences";

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    // Apaga as SharedPreferences do Usuário
    public void sair(View view){
        SharedPreferences sp = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear().commit();

        finish();
    }

}