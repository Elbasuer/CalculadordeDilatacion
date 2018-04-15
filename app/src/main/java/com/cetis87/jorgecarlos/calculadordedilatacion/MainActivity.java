package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button lineal, superficial, volumetrica;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lineal = (Button) findViewById(R.id.button5);
        lineal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Lineal = new Intent(getApplicationContext(), DilatacionLineal.class);
                startActivity(Lineal);
            }
        });

    }
}
