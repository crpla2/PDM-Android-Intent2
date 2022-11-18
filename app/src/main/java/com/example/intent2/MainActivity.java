package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clic(View view){
        Intent i = new Intent(this,MainActivity2.class);
        //Cogemos la información del editText, lo almacenamos en el Intent
        EditText et = findViewById(R.id.editText);
        i.putExtra("datos",et.getText().toString());
        startActivity(i);
    }
}