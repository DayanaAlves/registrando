package com.example.dayana.registrando.controle;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ControlaBanco {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public ControlaBanco(Context context){
        banco = new CriaBanco(context);
    }

    public String insereDado(String nome, String email){

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOME, nome);
        valores.put(CriaBanco.EMAIL, email);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";

    }
}