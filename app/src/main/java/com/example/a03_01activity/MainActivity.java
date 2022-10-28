package com.example.a03_01activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView titA1,resultadoA1;
    Button botonA1, boton2A1;
    EditText nombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoA1= findViewById(R.id.resultadoA1);
        titA1= findViewById(R.id.resultadoA1);
        botonA1 = findViewById(R.id.botonA1);
        boton2A1= findViewById(R.id.Boton2A1);
        nombre = findViewById(R.id.nombre);

        boton2A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarmensaje();

            }
        });

        public void enviarmensaje(){
            Intent intent = new Intent(this, MainActivity2.class);
            String message = nombre.getText().toString();
            intent.putExtra(nombre);
            startActivity(intent);




        }


    }
}