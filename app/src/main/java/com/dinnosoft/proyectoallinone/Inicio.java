package com.dinnosoft.proyectoallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        final Button boton = (Button) findViewById(R.id.Perfil);
        final Button boton2 = (Button) findViewById(R.id.Rutinas);
        final Button boton3 = (Button) findViewById(R.id.Consejos);
        final Button boton4 = (Button) findViewById(R.id.Mapas);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Perfil.class);
                startActivity(intent);


            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Inicio.this, Rutinas.class);
                startActivity(intent2);



            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(Inicio.this, Consejos.class);
                startActivity(intent3);

            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 = new Intent(Inicio.this, MapsActivity.class);
                startActivity(intent4);

            }
        });

    }
}
