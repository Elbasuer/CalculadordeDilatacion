package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DilatacionLineal extends AppCompatActivity {

    /************************************************************
     * En esta pantalla se presentan las posibles incognitas de *
     * la formula de dilatacion lineal                          *
     *                                                          *
     * button4 -> Coeficiente                                   *
     * button8 -> Longitud inicial                              *
     * button9 -> Longitud final                                *
     * button13 -> Temperatura inicial                          *
     * button14 -> Temperatura final                            *
     ************************************************************/

    private Button coeficiente, lo, lf, to, tf;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatacion_lineal);

        Intent Lineal = getIntent();
        Bundle bundle = Lineal.getExtras();
        final String tipo = bundle.getString("tipo");


        coeficiente = (Button)findViewById(R.id.button4);
        coeficiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coeficiente = new Intent(getApplicationContext(), Coeficiente.class);
                coeficiente.putExtra("tipo", tipo);
                startActivity(coeficiente);
            }
        });



    }
}
