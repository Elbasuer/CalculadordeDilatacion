package com.cetis87.jorgecarlos.calculadordedilatacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Coeficiente extends AppCompatActivity {

    double lf, lo, tf, to;
    double lff, loo, tff, too;
    EditText et;
    int contador = 1, frase = 0;
    TextView premisa;
    String[] frases = new String[4];
    double temp, lit, longg, div;
    String penultimo;
    String inicio;
    List<Map> list = new ArrayList<Map>();
    Map item = new HashMap();
    private SimpleAdapter sa;

    TextView longitudF;
    TextView longitudI;
    TextView coef;
    TextView temperaturaF;
    TextView longitudI2;
    TextView temperaturaI;
    TextView multiF;
    TextView result;
    Button asignar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coeficiente_l);

        longitudF = (TextView)findViewById(R.id.textView4);
        longitudI = (TextView)findViewById(R.id.textView6);
        coef = (TextView)findViewById(R.id.textView3);
        temperaturaF = (TextView)findViewById(R.id.textView9);
        longitudI2 = (TextView)findViewById(R.id.textView7);
        temperaturaI = (TextView)findViewById(R.id.textView11);
        multiF = (TextView)findViewById(R.id.textView19);
        premisa = (TextView)findViewById(R.id.textView14);
        et = (EditText)findViewById(R.id.editText2);
        result = (TextView)findViewById(R.id.textView17);

        Intent coeficiente = getIntent();
        Bundle bundle = coeficiente.getExtras();
        String tipo = bundle.getString("tipo");

        if(tipo.equalsIgnoreCase("lineal")){

            coef.setText("α 1/°C =");
            longitudF.setText("Lf(mts)");
            longitudI.setText("Li(mts)");
            longitudI2.setText("Li(mts)");
            temperaturaF.setText("Tf(°C)");
            temperaturaI.setText("Ti(°C)");
            multiF.setText("");

            frases[0] = "Asigna un valor a la longitud inicial";
            frases[1] = "Asigna un valor a la longitud final";
            frases[2] = "Asigna un valor a la temperatura final";
            frases[3] = "Asigna un valor a la tempratura inicial";


            premisa.setText(frases[frase]);


            asignar = (Button)findViewById(R.id.button);
            asignar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(contador == 1){
                        lo = Double.valueOf(et.getText().toString());
                        loo = lo;
                        longitudI.setText(lo+" mts");
                        longitudI2.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 2){
                        lo = Double.valueOf(et.getText().toString());
                        lff = lo;
                        longitudF.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 3){
                        lo = Double.valueOf(et.getText().toString());
                        tff = lo;
                        temperaturaF.setText(lo+" °C");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);

                        et.setText("");
                    }

                    else if(contador == 4){
                        lo = Double.valueOf(et.getText().toString());
                        too = lo;
                        temperaturaI.setText(lo+" °C");
                        et.setText("");
                        et.setEnabled(false);
                        asignar.setEnabled(false);


                        temp = tff-too;
                        lit = temp*loo;
                        longg = lff-loo;
                        div = longg/lit;
                        result.setText(""+div);
                        String newr = String.valueOf(div);

                        penultimo = (result.getText().toString()).substring((result.getText().toString().length())-2);

                        inicio = (result.getText().toString()).substring(0,4);

                        char ultimo = penultimo.charAt((penultimo.length())-1);
                        String ultimo2 = String.valueOf(ultimo);
                        char pultimo = penultimo.charAt((penultimo.length())-2);
                        String pultimo2 = String.valueOf(pultimo);

                        if(pultimo2.equals("-")){

                        }else{
                            penultimo = (result.getText().toString()).substring((result.getText().toString().length())-3);
                        }

                        result.setText("Resultado: "+inicio+" x 10"+penultimo);

                        sa = new SimpleAdapter(this, list, R.layout.twolines, new String[] { "line1","line2" }, new int[] {R.id.line_a, R.id.line_b});
                        ((ListView)findViewById(R.id.list)).setAdapter(sa);

                    }

                    else {

                    }
                }
            });



        }
        else if(tipo.equalsIgnoreCase("superficial")){

            coef.setText("λ 1/°C =");
            longitudF.setText("Lf(mts)");
            longitudI.setText("Li(mts)");
            longitudI2.setText("Li(mts)");
            temperaturaF.setText("Tf(°C)");
            temperaturaI.setText("Ti(°C)");
            multiF.setText("");

            frases[0] = "Asigna un valor a la longitud inicial";
            frases[1] = "Asigna un valor a la longitud final";
            frases[2] = "Asigna un valor a la temperatura final";
            frases[3] = "Asigna un valor a la tempratura inicial";


            premisa.setText(frases[0]);


            asignar = (Button)findViewById(R.id.button);
            asignar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(contador == 1){
                        lo = Double.valueOf(et.getText().toString());
                        loo = lo;
                        longitudI.setText(lo+" mts");
                        longitudI2.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 2){
                        lo = Double.valueOf(et.getText().toString());
                        lff = lo;
                        longitudF.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 3){
                        lo = Double.valueOf(et.getText().toString());
                        tff = lo;
                        temperaturaF.setText(lo+" °C");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 4){
                        lo = Double.valueOf(et.getText().toString());
                        too = lo;
                        temperaturaI.setText(lo+" °C");
                        et.setText("");
                        et.setEnabled(false);
                        asignar.setEnabled(false);
                    }

                    else {

                    }
                }
            });

        }
        else if(tipo.equalsIgnoreCase("volumetrica")){

            coef.setText("α 1/°C =");
            longitudF.setText("Lf(mts)");
            longitudI.setText("Li(mts)");
            longitudI2.setText("Li(mts)");
            temperaturaF.setText("Tf(°C)");
            temperaturaI.setText("Ti(°C)");
            multiF.setText("");

            frases[0] = "Asigna un valor a la longitud inicial";
            frases[1] = "Asigna un valor a la longitud final";
            frases[2] = "Asigna un valor a la temperatura final";
            frases[3] = "Asigna un valor a la tempratura inicial";


            premisa.setText(frases[0]);


            asignar = (Button)findViewById(R.id.button);
            asignar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(contador == 1){
                        lo = Double.valueOf(et.getText().toString());
                        loo = lo;
                        longitudI.setText(lo+" mts");
                        longitudI2.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 2){
                        lo = Double.valueOf(et.getText().toString());
                        lff = lo;
                        longitudF.setText(lo+" mts");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 3){
                        lo = Double.valueOf(et.getText().toString());
                        tff = lo;
                        temperaturaF.setText(lo+" °C");
                        contador = contador+1;
                        frase = frase+1;
                        premisa.setText(frases[frase]);
                        et.setText("");
                    }

                    else if(contador == 4){
                        lo = Double.valueOf(et.getText().toString());
                        too = lo;
                        temperaturaI.setText(lo+" °C");
                        et.setText("");
                        et.setEnabled(false);
                        asignar.setEnabled(false);
                    }

                    else {

                    }
                }
            });


        }

    }

}
