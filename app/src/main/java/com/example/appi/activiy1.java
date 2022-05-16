package com.example.appi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class activiy1 extends AppCompatActivit
        çy {
    private EditText text_nombre;
    private EditText text_edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiy1);
        text_nombre = findViewById(R.id.text_nombre);
        text_nombre = findViewById(R.id.text_edad);

    }

    public void Enviar(View view){
        String nombre = text_nombre.getText().toString();
        String edad = text_edad.getText().toString();
        Intent intent = new Intent(activiy1.this,Activity2.class);
        intent.putExtra("nombre 1",nombre);
        intent.putExtra("edad 1",nombre);
        startActivity(intent);
}