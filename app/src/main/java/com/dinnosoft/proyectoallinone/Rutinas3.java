package com.dinnosoft.proyectoallinone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Rutinas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rutinas3);

        poleapecho();
    }

    public  void poleapecho(){
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Polea al pecho");
        dialogo1.setMessage("");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                poleapechoimage();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }

    public void poleapechoimage() {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.poleaalpecho);

        AlertDialog.Builder poleapecho1 = new AlertDialog.Builder(this);
        poleapecho1.setMessage("Polea al Pecho");
        poleapecho1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface poleapecho1, int id) {
                predicadorbarra();
            }
        }).
                setView(image);
        poleapecho1.create().show();

    }

    public void predicadorbarra() {
        AlertDialog.Builder predicadorbarra = new AlertDialog.Builder(this);
        predicadorbarra.setTitle("Predicador en Barra");
        predicadorbarra.setMessage("");
        predicadorbarra.setCancelable(false);
        predicadorbarra.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface predicador_barra, int id) {
                predicador_barraimage();
            }
        });
        predicadorbarra.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface predicador_barra, int id) {
                cancelar();
            }
        });
        predicadorbarra.create().show();
    }


    public void predicador_barraimage() {
        ImageView image2 = new ImageView(this);
        image2.setImageResource(R.drawable.predicadorbarra);

        AlertDialog.Builder predicador_barra1 = new AlertDialog.Builder(this);
        predicador_barra1.setMessage("Predicador en Barra");
        predicador_barra1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface predicador_barra1, int id) {
                flexion();
            }
        }).
                setView(image2);
        predicador_barra1.create().show();

    }

    public void flexion() {
        AlertDialog.Builder flexion = new AlertDialog.Builder(this);
        flexion.setTitle("Flexion");
        flexion.setMessage("");
        flexion.setCancelable(false);
        flexion.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface flecion, int id) {
                flexion1();
            }
        });
        flexion.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface flexion, int id) {
                cancelar();
            }
        });
       flexion.create().show();
    }


    public void flexion1() {
        ImageView image3 = new ImageView(this);
        image3.setImageResource(R.drawable.flexion);

        AlertDialog.Builder flexion1 = new AlertDialog.Builder(this);
        flexion1.setMessage("Flexion");
        flexion1.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface flexion1, int id) {
                fin();
            }
        }).
                setView(image3);
        flexion1.create().show();

    }

    public void fin() {
        AlertDialog.Builder fin = new AlertDialog.Builder(this);
        fin.setMessage("Ha completado su rutina");
        fin.setCancelable(false);
        fin.setPositiveButton("Volver a Menu", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface fin, int id) {
                Intent intent = new Intent(Rutinas3.this, Rutinas.class);
                startActivity(intent);
            }
        });
        fin.create().show();

    }


    public void cancelar() {

        Intent intent = new Intent(Rutinas3.this, Rutinas.class);
        startActivity(intent);


    }
}
