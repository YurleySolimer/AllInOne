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
        dialogo1.setMessage("Ejecución del ejercicio:\n" +
                "\n" +
                "• Acostado en una banca plana, sostenga una barra con pesas con los brazos extendidos.\n" +
                "\n" +
                "• Inicie el descenso de la carga por medio de la flexión de ambos miembros superiores.\n" +
                "\n" +
                "• Cuando la barra haya tocado su pecho, pero sin dejarla apoyado en el mismo, inicie el ascenso de la barra hasta su posición inicial.\n" +
                "\n" +
                "Rutina:3 series de 10 repeticiones.");
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
        press_sentado.setMessage("Ejecución del ejercicio:\n" +
                "\n" +
                "• Sentado en un banco. Sostenga una barra y apoyela sobre la parte posterior de sus hombros.\n" +
                "\n" +
                "• Eleve la barra hasta la completa extensión de sus brazos.\n" +
                "\n" +
                "• Descienda la barra hasta la posición inicial.\n" +
                "\n" +
                "Entrenamiento de Hombros:3 series de 10 repeticiones.");
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
        image2.setImageResource(R.drawable.press_sentadoposetior);

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
        jalones_polea.setMessage("Ejecución del ejercicio:\n" +
                "\n" +
                "• Utilice una barra corta conectada a un sistema de poleas. Agarre la barra con las palmas de las manos hacia abajo.\n" +
                "\n" +
                "• Sin mover los brazos (solo los antebrazos), jale la barra corta hacia abajo, hasta la completa extensión de ambos brazos.\n" +
                "\n" +
                "• Luego regrese a la posición inicial con movimiento controlado.\n" +
                "\n" +
                "Este es uno de los mejores ejercicios para definir la parte posterior de los brazos.\n" +
                "\n" +
                "Rutina de brazo:3 series de 15 repeticiones.");
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

