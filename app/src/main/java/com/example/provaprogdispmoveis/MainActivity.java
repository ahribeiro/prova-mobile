package com.example.provaprogdispmoveis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTads, btnCC, btnBolsas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTads = findViewById(R.id.btnTads);
        btnCC = findViewById(R.id.btnCC);
        btnBolsas = findViewById(R.id.btnBolsas);
    }

    public void ChamaTelaTads(View v) {
        Intent telaPrincipalTads = new Intent(getApplicationContext(), TelaPrincipalTads.class);
        startActivity(telaPrincipalTads);
    }

    public void ChamaTelaCC(View v) {
        Intent telaPrincipalCC = new Intent(getApplicationContext(), TelaPrincipalCC.class);
        startActivity(telaPrincipalCC);
    }

    public void ChamaTelaBolsa(View v) {
        Intent telaBolsas = new Intent(getApplicationContext(), TelaBolsaEstudo.class);
        startActivity(telaBolsas);
    }

}