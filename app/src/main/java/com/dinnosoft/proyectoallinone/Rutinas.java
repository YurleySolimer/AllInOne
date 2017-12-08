package com.dinnosoft.proyectoallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rutinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutinas);

        final Button boton1 = (Button) findViewById(R.id.Rutina1);
        final Button boton2 = (Button) findViewById(R.id.Rutina2);
        final Button boton3 = (Button) findViewById(R.id.Rutina3);



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rutinas.this, Rutina1.class);
                startActivity(intent);


            }
        });


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rutinas.this, Rutina2.class);
                startActivity(intent);


            }
        });


        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rutinas.this, Rutinas3.class);
                startActivity(intent);


            }
        });
    }
}
