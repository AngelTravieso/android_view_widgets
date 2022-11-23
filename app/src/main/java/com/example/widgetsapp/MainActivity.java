package com.example.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*TextView textView;*/
    /*EditText et;*/
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Los widgets siempre se instancian en el metodo onCreate
        /*textView = findViewById(R.id.textView2023);*/

        // editText (input)
        /*et = findViewById(R.id.editTextDemo);*/

        // Obtener el texto del input
        /*String input_text = et.getText().toString();*/

        // boton
        button = findViewById(R.id.button101);

        // escuchar evento de los botones

        // pasa una clase anonima ( new View.OnClickListener() )
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Especificar las acciones cuando el boton es tocado
                Toast.makeText(MainActivity.this, "The button is clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }
}