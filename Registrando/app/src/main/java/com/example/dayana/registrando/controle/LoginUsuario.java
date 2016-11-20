package com.example.dayana.registrando.controle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dayana.registrando.Principal;
import com.example.dayana.registrando.R;
import com.example.dayana.registrando.modelo.Usuario;

public class LoginUsuario extends AppCompatActivity {


    private String nome;
    private String email;

    private Usuario usuario;

    private Context _context = this;

    private static final String PREF_NAME = "preferenciasDoUsuario";
    private android.content.SharedPreferences sp = getSharedPreferences(PREF_NAME, MODE_PRIVATE);


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Verifica se as preferências estão salvas.
    // Se o nome e email não estiverem nulos, ele acessa a Activity Principal

    public void verificaPreferences(View view) {

        nome = sp.getString("nome", "");
        email = sp.getString("email", "");

        if (nome != null && email != null) {
            Intent intent = new Intent(_context, Principal.class);
            startActivity(intent);
        }
    }

    //Login do Usuaário
    //Obtem os dados, salva nas Preferências, cria um novo usuário
    //Acessa a Tela Principal, se usuário for válido

    public void acessar(View view) {

        EditText edtNome = (EditText) findViewById(R.id.edt_nomeUsuario);
        EditText edtEmail = (EditText) findViewById(R.id.edt_emailUsuario);

        nome = edtNome.getText().toString();
        email = edtEmail.getText().toString();

        usuario = new Usuario(nome, email);

        if (nome != null && email != null) {

            android.content.SharedPreferences.Editor editor = sp.edit();

            editor.putString("nome", nome);
            editor.putString("email", email);
            editor.commit();

            Intent intent = new Intent(_context, Principal.class);
            startActivity(intent);

            Toast.makeText(LoginUsuario.this, "Seja Bem vindo (a)" + nome + "!", Toast.LENGTH_SHORT).show();

        }

        else {
            Toast.makeText(LoginUsuario.this, "Por favor, informe o Nome e E-mail.", Toast.LENGTH_SHORT).show();
        }
    }


    public void sair(View view) {

        android.content.SharedPreferences.Editor editor = sp.edit();
        editor.clear().commit();

        finish();
    }

}