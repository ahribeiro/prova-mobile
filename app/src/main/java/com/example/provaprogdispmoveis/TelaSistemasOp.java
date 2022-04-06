package com.example.provaprogdispmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSistemasOp extends AppCompatActivity {

    Button btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sistemas_op);

        btnInicio = findViewById(R.id.btnInicio);
    }

    public  void ChamaTelaPrincipal(View v) {
        Intent telaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(telaPrincipal);
    }
}