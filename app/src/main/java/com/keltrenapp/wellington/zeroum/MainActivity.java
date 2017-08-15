package com.keltrenapp.wellington.zeroum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText jogadorUm;
    EditText jogadorDois;
    EditText jogadorTres;
    Button verificar;
    TextView resultado;
    Button limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verificar = (Button) findViewById(R.id.idVerificar);
        jogadorUm = (EditText) findViewById(R.id.jogador1);
        jogadorDois = (EditText) findViewById(R.id.jogador2);
        jogadorTres = (EditText) findViewById(R.id.jogador3);

        limpar = (Button) findViewById(R.id.idLimpar);


        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String jogador1 = jogadorUm.getText().toString();
                String jogador2 = jogadorDois.getText().toString();
                String jogador3 = jogadorTres.getText().toString();


                if (jogadorUm == null || jogadorDois == null || jogadorTres == null) {
                    resultado.setText("Por favor insera 0 ou 1 nos campos");

                }
                if (jogador1.equals(jogador2)) {
                    Toast.makeText(MainActivity.this, "Jogador 3 ganhou", Toast.LENGTH_LONG).show();

                }
                if (jogador2.equals(jogador3)) {
                    Toast.makeText(MainActivity.this, "Jogador 1 ganhou", Toast.LENGTH_LONG).show();

                }
                if (jogador1.equals(jogador3)) {
                    Toast.makeText(MainActivity.this, "Jogador 2 ganhou", Toast.LENGTH_LONG).show();

                }
                if (jogador1.equals(jogador2) && jogador1.equals(jogador3)) {
                    Toast.makeText(MainActivity.this, "Ninguem ganhou", Toast.LENGTH_LONG).show();

                }


            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogadorUm.setText("");
                jogadorDois.setText("");
                jogadorTres.setText("");
            }
        });


    }
}
