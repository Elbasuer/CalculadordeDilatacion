package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DilatacionLineal extends AppCompatActivity {


    private Button coeficiente, lo, lf, to, tf;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatacion_lineal);

        coeficiente = (Button)findViewById(R.id.button4);
        coeficiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coeficiente = new Intent(getApplicationContext(), CoeficienteL.class);
                coeficiente.putExtra("tipo", "lineal");
                startActivity(coeficiente);
            }
        });



    }
}
