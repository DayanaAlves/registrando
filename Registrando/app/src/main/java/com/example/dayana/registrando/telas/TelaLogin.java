package com.example.dayana.registrando.telas;

import com.example.dayana.registrando.R;
import com.example.dayana.registrando.entidades.Usuario;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class TelaLogin extends AppCompatActivity {

    private static final String PREF_NAME = "UserPreferences";

    private Usuario usuario;

    private Context _context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Verifica as SharedPreferences
        //Se o tamanho das Strings armazenadas for maior que zero, acessa a TelaPrincipal

        SharedPreferences sp = getSharedPreferences(PREF_NAME, MODE_PRIVATE);

        String nome = sp.getString("nome", "");
        String email = sp.getString("email", "");

        if (nome.length() > 0 && email.length() > 0) {
            Intent intent = new Intent(_context, TelaPrincipal.class);
            startActivity(intent);
        }
    }

    //Função para acessar a Aplicação e armazenar as SharedPreferences do Usuário.

    public void entrar(View view) {

        EditText edtNome = (EditText) findViewById(R.id.edt_nome);
        EditText edtEmail = (EditText) findViewById(R.id.edt_email);

        String nome = edtNome.getText().toString();
        String email = edtEmail.getText().toString();

        usuario = new Usuario(nome, email);

        if (nome.length() > 0 && email.length() > 0) {
            SharedPreferences sp = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("nome", nome);
            editor.putString("email", email);
            editor.commit();

            Intent intent = new Intent(_context, TelaPrincipal.class);
            startActivity(intent);

        } else {

            Toast.makeText(TelaLogin.this, "Por favor, informe Nome e E-mail", Toast.LENGTH_SHORT).show();
        }
    }

}



