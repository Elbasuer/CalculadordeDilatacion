package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /************************************************************
     *En esta clase se definen los botones de la clase principal*
     *Adicionalmente esta clase es el "Lanzador" de la app      *
     *                                                          *
     * button5 -> Dilatacion Lineal                             *
     * button6 -> Dilatacion Superficial                        *
     * button7 -> Dilatacion Volumetrica                        *
     *                                                          *
     ************************************************************/

    private Button lineal, superficial, volumetrica;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineal = (Button) findViewById(R.id.button5);
        lineal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Lineal = new Intent(getApplicationContext(), DilatacionLineal.class);
                Lineal.putExtra("tipo", "lineal");
                startActivity(Lineal);
            }
        });

        superficial = (Button)findViewById(R.id.button6);
        superficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Superficial = new Intent(getApplicationContext(), DilatacionLineal.class);
                Superficial.putExtra("tipo", "superficial");
                startActivity(Superficial);
            }
        });

        volumetrica = (Button)findViewById(R.id.button7);
        volumetrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Volumetrica = new Intent(getApplicationContext(), DilatacionLineal.class);
                Volumetrica.putExtra("tipo", "volumetrica");
                startActivity(Volumetrica);
            }
        });

    }
}
