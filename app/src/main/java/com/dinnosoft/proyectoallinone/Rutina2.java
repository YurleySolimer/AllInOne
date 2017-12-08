package com.dinnosoft.proyectoallinone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Rutina2 extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina2);

        sentadillascompletas();

    }


    public  void sentadillascompletas(){
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Sentadillas Completas");
        dialogo1.setMessage("");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                sentadillascompletasimage();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }

    public void sentadillascompletasimage() {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.sentadillascompletas);

        AlertDialog.Builder sentadillascompletas1 = new AlertDialog.Builder(this);
        sentadillascompletas1.setMessage("Sentadillas Completas");
        sentadillascompletas1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface sentadillascompletas1, int id) {
                elevaciontalonbarrahombros();
            }
        }).
                setView(image);
        sentadillascompletas1.create().show();

    }

    public void elevaciontalonbarrahombros() {
        AlertDialog.Builder elevaciontalon_hombros = new AlertDialog.Builder(this);
        elevaciontalon_hombros.setTitle("Elevacion de Talon con Barra en los Hombros");
        elevaciontalon_hombros.setMessage(" ");
        elevaciontalon_hombros.setCancelable(false);
        elevaciontalon_hombros.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface elevaciontalon_hombros, int id) {
                elevaciontalon_hombros_image();
            }
        });
        elevaciontalon_hombros.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface elevaciontalon_hombros, int id) {
                cancelar();
            }
        });
        elevaciontalon_hombros.create().show();
    }


    public void elevaciontalon_hombros_image() {
        ImageView image2 = new ImageView(this);
        image2.setImageResource(R.drawable.elevaciontalonesbarrahombros);

        AlertDialog.Builder elevaciontalon_hombros1 = new AlertDialog.Builder(this);
        elevaciontalon_hombros1.setMessage("Press De Banca");
        elevaciontalon_hombros1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface elevaciontalon_hombros1, int id) {
                curl_abd_declinado();
            }
        }).
                setView(image2);
        elevaciontalon_hombros1.create().show();

    }

    public void curl_abd_declinado() {
        AlertDialog.Builder curl_abd = new AlertDialog.Builder(this);
        curl_abd.setTitle("Curl Abdominal Declinado");
        curl_abd.setMessage("");
        curl_abd.setCancelable(false);
        curl_abd.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface curl_abd, int id) {
                curl_abdimage();
            }
        });
        curl_abd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface curl_abd, int id) {
                cancelar();
            }
        });
        curl_abd.create().show();
    }


    public void curl_abdimage() {
        ImageView image3 = new ImageView(this);
        image3.setImageResource(R.drawable.curlabddeclinado);

        AlertDialog.Builder curl_abd1 = new AlertDialog.Builder(this);
        curl_abd1.setMessage("Curl Abdominal Declinado");
        curl_abd1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface curl_abd1, int id) {
                fin();
            }
        }).
                setView(image3);
        curl_abd1.create().show();

    }

    public void fin() {
        AlertDialog.Builder fin = new AlertDialog.Builder(this);
        fin.setMessage("Ha completado su rutina");
        fin.setCancelable(false);
        fin.setPositiveButton("Volver a Menu", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface fin, int id) {
                Intent intent = new Intent(Rutina2.this, Rutinas.class);
                startActivity(intent);
            }
        });
        fin.create().show();

    }


    public void cancelar() {

        Intent intent = new Intent(Rutina2.this, Rutinas.class);
        startActivity(intent);


    }
}


