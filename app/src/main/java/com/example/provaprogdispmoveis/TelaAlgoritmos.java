package com.example.provaprogdispmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaAlgoritmos extends AppCompatActivity {

    Button btnInicio, btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_algoritmos);

        btnInicio = findViewById(R.id.btnInicio);
        btnProximo = findViewById(R.id.btnProximo);
    }

    public  void ChamaTelaPrincipal(View v) {
        Intent telaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(telaPrincipal);
    }

    public  void ChamaTelaWeb(View v) {
        Intent telaWeb = new Intent(getApplicationContext(), TelaWebTads.class);
        startActivity(telaWeb);
    }
}