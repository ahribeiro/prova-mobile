package com.example.provaprogdispmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipalTads extends AppCompatActivity {

    Button btnAlgoritmos, btnDesWeb, btnChamaSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal_tads);

        btnAlgoritmos = findViewById(R.id.btnAlgoritmos);
        btnDesWeb = findViewById(R.id.btnDesWeb);
        btnChamaSo = findViewById(R.id.btnSistemasOp);
    }

    public void ChamaAlgoritmos(View v) {
        Intent telaAlgoritmos = new Intent(getApplicationContext(), TelaAlgoritmos.class);
        startActivity(telaAlgoritmos);
    }

    public void ChamaWeb(View v) {
        Intent telaWeb = new Intent(getApplicationContext(), TelaWebTads.class);
        startActivity(telaWeb);
    }

    public void ChamaSistemasOp(View v) {
        Intent telaSo = new Intent(getApplicationContext(), TelaSistemasOp.class);
        startActivity(telaSo);
    }
}