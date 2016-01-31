package com.example.david.colores_radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton amarillo, azul, rojo;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amarillo = (RadioButton) findViewById(R.id.amarillo);
        azul = (RadioButton) findViewById(R.id.azul);
        rojo = (RadioButton) findViewById(R.id.rojo);
        imagen = (ImageView) findViewById(R.id.imagen);

        amarillo.setOnClickListener(this);
        azul.setOnClickListener(this);
        rojo.setOnClickListener(this);
        imagen.setBackgroundColor(Color.YELLOW);

    }

    @Override
    public void onClick(View v) {

        if (amarillo.isChecked() == true) {

            Toast.makeText(this, "amarillo ", Toast.LENGTH_SHORT).show();

            //imagen.setBackgroundColor(R.color.amarillo);

            imagen.setBackgroundColor(Color.YELLOW);
        }


        if (azul.isChecked() == true) {

            Toast.makeText(this, "azul", Toast.LENGTH_SHORT).show();
            imagen.setBackgroundColor(Color.BLUE);

        }
        if (rojo.isChecked() == true) {

            Toast.makeText(this, "rojo ", Toast.LENGTH_SHORT).show();
            imagen.setBackgroundColor(Color.RED);
        }

    }
}


