package com.dinnosoft.proyectoallinone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Rutina1 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutina1);

        pressdebanca();


    }

    public  void pressdebanca(){
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("PressDeBanca");
        dialogo1.setMessage("");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                pressdebancaimage();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }

    public void pressdebancaimage() {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pressdebanca);

        AlertDialog.Builder pressdebanca1 = new AlertDialog.Builder(this);
                       pressdebanca1.setMessage("Press De Banca");
                        pressdebanca1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface pressdebanca, int id) {
                                press_sentado();
                            }
                        }).
                        setView(image);
        pressdebanca1.create().show();

    }

    public void press_sentado() {
        AlertDialog.Builder press_sentado = new AlertDialog.Builder(this);
        press_sentado.setTitle("RUTINA Hombros");
        press_sentado.setMessage("Press sentado posterior");
        press_sentado.setCancelable(false);
        press_sentado.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface press_sentado, int id) {
                press_sentadoimage();
            }
        });
        press_sentado.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface press_sentado, int id) {
                cancelar();
            }
        });
        press_sentado.create().show();
    }


    public void press_sentadoimage() {
        ImageView image2 = new ImageView(this);
        image2.setImageResource(R.drawable.press_sentado);

        AlertDialog.Builder press_sentado1 = new AlertDialog.Builder(this);
        press_sentado1.setMessage("Press De Banca");
        press_sentado1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface press_sentado1, int id) {
                jalonespolea();
            }
        }).
                setView(image2);
        press_sentado1.create().show();

    }

    public void jalonespolea() {
        AlertDialog.Builder jalones_polea = new AlertDialog.Builder(this);
        jalones_polea.setTitle("Jalones en Polea");
        jalones_polea.setMessage("");
        jalones_polea.setCancelable(false);
        jalones_polea.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface jalones_polea, int id) {
                jalonespolea1();
            }
        });
        jalones_polea.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface jalones_polea, int id) {
                cancelar();
            }
        });
        jalones_polea.create().show();
    }


    public void jalonespolea1() {
        ImageView image3 = new ImageView(this);
        image3.setImageResource(R.drawable.jalonesenpolea);

        AlertDialog.Builder jalones_polea1 = new AlertDialog.Builder(this);
        jalones_polea1.setMessage("Jalones en Polea");
        jalones_polea1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface jalones_polea1, int id) {
                fin();
            }
        }).
                setView(image3);
        jalones_polea1.create().show();

    }

    public void fin() {
        AlertDialog.Builder fin = new AlertDialog.Builder(this);
        fin.setMessage("Ha completado su rutina");
        fin.setCancelable(false);
        fin.setPositiveButton("Volver a Menu", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface fin, int id) {
                Intent intent = new Intent(Rutina1.this, Rutinas.class);
                startActivity(intent);
            }
        });
        fin.create().show();

    }


    public void cancelar() {

                Intent intent = new Intent(Rutina1.this, Rutinas.class);
                startActivity(intent);


    }
}

