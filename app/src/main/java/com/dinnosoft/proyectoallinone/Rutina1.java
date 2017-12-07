package com.dinnosoft.proyectoallinone;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class Rutina1 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutinas);

        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("RUTINA PECHO");
        dialogo1.setMessage("Rutinas de gimnasio para pecho:\n" +
                "\n" +
                "Press de banca.\n" +
                "\n" +
                "Press en banca inclinada.\n" +
                "\n" +
                "Press en banca declinada.\n" +
                "\n" +
                "Pectoral contractor ó Aperturas planas.");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();


    }

    public void aceptar() {
        /*ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.PressDeBanca);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this).
                        setMessage("Message above the image").
                        setPositiveButton("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setView(image);
        builder.create().show();*/

    }

    public void aceptar2() {
        AlertDialog.Builder dialogo2 = new AlertDialog.Builder(this);
        dialogo2.setTitle("RUTINA Hombros");
        dialogo2.setMessage("Press sentado posterior.\n" +
                "\n" +
                "Press sentado anterior.\n" +
                "\n" +
                "Elevación frontal de pie ó Elevación frontal con inclinación.\n" +
                "\n" +
                "Ascenso lateral.");
        dialogo2.setCancelable(false);
        dialogo2.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo2, int id) {
                aceptar2();
            }
        });
        dialogo2.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo2, int id) {
                cancelar();
            }
        });
    }

    public void cancelar() {
        //ir a clase Rutinas
    }
}

