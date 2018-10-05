package com.example.trapperx.selecciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {



    ImageView ivAlemania, ivArgentina, ivBrasil, ivEspana, ivFrancia, ivMexico;
    Button enviar;
    EditText textAlemania, textArgentina, textBrasil, textEspana, textFrancia, textMexico;
    RatingBar stars;
    int alemania, argentina, brasil, espana, francia, mexico;
    float calificacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alemania = 0;
        argentina = 0;
        brasil = 0;
        espana = 0;
        francia = 0;
        mexico = 0;


        ivAlemania = (ImageView)findViewById(R.id.ivAlemania);
        ivArgentina = (ImageView)findViewById(R.id.ivArgentina);
        ivBrasil = (ImageView)findViewById(R.id.ivBrasil);
        ivEspana = (ImageView) findViewById(R.id.ivEspana);
        ivFrancia = (ImageView)findViewById(R.id.ivFrancia);
        ivMexico = (ImageView)findViewById(R.id.ivMexico);
        textAlemania = (EditText)findViewById(R.id.textAlemania);
        textArgentina = (EditText)findViewById(R.id.textArgentina);
        textBrasil = (EditText)findViewById(R.id.textBrasil);
        textEspana = (EditText)findViewById(R.id.textEspana);
        textFrancia = (EditText)findViewById(R.id.textFrancia);
        textMexico = (EditText)findViewById(R.id.textMexico);
        enviar = (Button)findViewById(R.id.buttonEnviar);
        stars = (RatingBar)findViewById(R.id.ratingStars);


        ivAlemania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alemania++;
                String numberAsString = Integer.toString(alemania);
                textAlemania.setText(numberAsString);
            }
        });


        ivArgentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argentina++;
                String numberAsString = Integer.toString(argentina);
                textArgentina.setText(numberAsString);
            }
        });


        ivBrasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brasil++;
                String numberAsString = Integer.toString(brasil);
                textBrasil.setText(numberAsString);
            }
        });

        ivEspana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                espana++;
                String numberAsString = Integer.toString(espana);
                textEspana.setText(numberAsString);
            }
        });

        ivFrancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                francia++;
                String numberAsString = Integer.toString(francia);
                textFrancia.setText(numberAsString);
            }
        });

        ivMexico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mexico++;
                String numberAsString = Integer.toString(mexico);
                textMexico.setText(numberAsString);
            }
        });

        ivAlemania.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                alemania--;
                String numberAsString = Integer.toString(alemania);
                textAlemania.setText(numberAsString);
                return true;
            }
        });

        ivArgentina.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                argentina--;
                String numberAsString = Integer.toString(argentina);
                textArgentina.setText(numberAsString);
                return true;
            }
        });

        ivBrasil.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                brasil--;
                String numberAsString = Integer.toString(brasil);
                textBrasil.setText(numberAsString);
                return true;
            }
        });

        ivEspana.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                espana--;
                String numberAsString = Integer.toString(espana);
                textEspana.setText(numberAsString);
                return true;
            }
        });

        ivFrancia.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                francia--;
                String numberAsString = Integer.toString(francia);
                textFrancia.setText(numberAsString);
                return true;
            }
        });

        ivMexico.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mexico--;
                String numberAsString = Integer.toString(mexico);
                textMexico.setText(numberAsString);
                return true;
            }
        });


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phone="5513894675";
                String text="**TU RESPUESTA ES: "+ alemania +" Campeonatos Alemania, "+ argentina +" Campeonatos Argentina, "
                        + brasil +" Campeonatos Brasil,  "+ espana +" Campeonatos España, "+ francia+" Campeonatos Francia, "
                        + mexico + " Campeonatos México." + "Calificación de mi App: "+ calificacion + " estrellas";

                SmsManager sms= SmsManager.getDefault();
                sms.sendTextMessage(phone, null, text , null, null);
            }
        });


    }
}
