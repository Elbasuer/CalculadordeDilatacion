package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Coeficiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coeficiente_l);

        Intent coeficiente = getIntent();
        Bundle bundle = coeficiente.getExtras();

        String tipo = bundle.getString("tipo");

        if(tipo.equalsIgnoreCase("lineal")){

        }
        else if(tipo.equalsIgnoreCase("superficial")){

        }
        else if(tipo.equalsIgnoreCase("volumetrica")){

        }



    }
}
