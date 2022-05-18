package com.example.testesa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
    EditText nome, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        nome = findViewById(R.id.nome);
        senha = findViewById(R.id.senha);
        getSupportActionBar().hide();
    }

    public void cadastra(View v){
        String l = nome.getText().toString();
        int s = Integer.parseInt(senha.getText().toString());
        Usuario usu = new Usuario(l, s);
        usu.salvar_bd();
    }
}