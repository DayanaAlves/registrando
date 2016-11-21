package com.example.dayana.registrando.telas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dayana.registrando.R;


public class TelaPrincipal extends AppCompatActivity{

    private static final String PREF_NAME = "UserPreferences";
    private Context _context = this;

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


    //Abrir tela de Criação de Registro
    public void criarRegistro(View view) {
        Intent intent = new Intent(_context, TelaRegistroDeEnfermagem.class);
        startActivity(intent);
    }

    //Abrir tela de Validação de Registro
    public void validarRegistro(View view) {
        Intent intent = new Intent(_context, TelaValidarRegistro.class);
        startActivity(intent);
    }

    //Abrir tela de Estudos de Caso
    public void abrirEstudosDeCaso(View view) {
        Intent intent = new Intent(_context, TelaEstudoDeCaso.class);
        startActivity(intent);
    }

    //Abrir tela de Informações Técnicas
    public void abrirInformacaoTecnica(View view) {
        Intent intent = new Intent(_context, TelaInfoTecnica.class);
        startActivity(intent);
    }

}