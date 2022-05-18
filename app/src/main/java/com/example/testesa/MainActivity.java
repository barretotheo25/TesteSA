package com.example.testesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mudaTela();
    }

    public void mudaTela(){
        Intent ir = new Intent(this, Cadastro.class);
        startActivity(ir);
    }
}