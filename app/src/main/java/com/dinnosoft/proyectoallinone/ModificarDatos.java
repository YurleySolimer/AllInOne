package com.dinnosoft.proyectoallinone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class ModificarDatos extends AppCompatActivity {

    EditText edad, peso, altura ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modificar_datos);

       // edad = (Button)findViewById(R.id.ModificaEdad);
        //peso = (Button)findViewById(R.id.ModificaPeso;
        //altura = (Button)findViewById(R.id.ModificaAltura);


    }

   /* public void modificar(View v) {

        DBHelper admin = new DBHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        String e = edad.getText().toString();
        String p = peso.getText().toString();
        String a = altura.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("edad", e);
        registro.put("peso", p);
        registro.put("altura", a);
       // bd.update("usuarios", registro, "" +  null);
         bd.close();

    }*/
}
