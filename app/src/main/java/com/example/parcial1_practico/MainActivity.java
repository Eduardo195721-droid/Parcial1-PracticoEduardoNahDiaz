package com.example.parcial1_practico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText dato1, dato2;
    TextView resultado;
    Button suma, resta, multiplicacion, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = findViewById(R.id.sumar);
        suma.setOnClickListener(clik1);
        resta = findViewById(R.id.restar);
        resta.setOnClickListener(clik2);
        multiplicacion = findViewById(R.id.multiplicar);
        multiplicacion.setOnClickListener(clik3);
        division = findViewById(R.id.dividir);
        division.setOnClickListener(clik4);


    }

    View.OnClickListener clik1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            dato1 = findViewById(R.id.dato1);
            String pp = dato1.getText().toString();
            dato2 = findViewById(R.id.dato2);
            String sp = dato2.getText().toString();
            if (!pp.equals("")) {
                if (!sp.equals("")) {
                    double d1s = Double.parseDouble(pp);
                    double d2s = Double.parseDouble(sp);
                    double ppresultado = d1s + d2s;
                    resultado = findViewById(R.id.m_resultado);
                    resultado.setText(String.valueOf(ppresultado));

                }
                else {

                    Toast.makeText(getBaseContext(), "falta dato 2 ", Toast.LENGTH_SHORT).show();
                }


            }
            else
            {
                Toast.makeText(getBaseContext(), "falta dato 1 ", Toast.LENGTH_SHORT).show();
            }
        }
    };
    View.OnClickListener clik2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            dato1 = findViewById(R.id.dato1);
            String pp = dato1.getText().toString();
            dato2 = findViewById(R.id.dato2);
            String sp = dato2.getText().toString();
            if (!pp.equals("")) {
                if (!sp.equals("")) {
                    double d1s = Double.parseDouble(pp);
                    double d2s = Double.parseDouble(sp);
                    double ppresultado = d1s - d2s;
                    resultado = findViewById(R.id.m_resultado);
                    resultado.setText(String.valueOf(ppresultado));

                }
                else {

                    Toast.makeText(getBaseContext(), "falta dato 2 ", Toast.LENGTH_SHORT).show();
                }


            }
            else
            {
                Toast.makeText(getBaseContext(), "falta dato 1 ", Toast.LENGTH_SHORT).show();
            }
        }
    };
    View.OnClickListener clik3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            dato1 = findViewById(R.id.dato1);
            String pp = dato1.getText().toString();
            dato2 = findViewById(R.id.dato2);
            String sp = dato2.getText().toString();
            if (!pp.equals("")) {
                if (!sp.equals("")) {
                    double d1s = Double.parseDouble(pp);
                    double d2s = Double.parseDouble(sp);
                    double ppresultado = d1s * d2s;
                    resultado = findViewById(R.id.m_resultado);
                    resultado.setText(String.valueOf(ppresultado));

                }
                else {

                    Toast.makeText(getBaseContext(), "falta dato 2 ", Toast.LENGTH_SHORT).show();
                }


            }
            else
            {
                Toast.makeText(getBaseContext(), "falta dato 1 ", Toast.LENGTH_SHORT).show();
            }
        }
    };
    View.OnClickListener clik4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            dato1 = findViewById(R.id.dato1);
            String pp = dato1.getText().toString();
            dato2 = findViewById(R.id.dato2);
            String sp = dato2.getText().toString();
            if (!pp.equals("")) {
                if (!sp.equals("")) {
                    double d1s = Double.parseDouble(pp);
                    double d2s = Double.parseDouble(sp);
                    double ppresultado = d1s / d2s;
                    resultado = findViewById(R.id.m_resultado);
                    resultado.setText(String.valueOf(ppresultado));

                }
                else {

                    Toast.makeText(getBaseContext(), "falta dato 2 ", Toast.LENGTH_SHORT).show();
                }


            }
            else
            {
                Toast.makeText(getBaseContext(), "falta dato 1 ", Toast.LENGTH_SHORT).show();
            }
        }
    };
}