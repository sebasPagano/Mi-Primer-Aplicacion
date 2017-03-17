package com.example.alumno.miprimeraplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R.id.tvSaludo

        TextView tv =(TextView)findViewById(R.id.tvSaludo);
        tv.setText("Otra Cosa3"); // Set Content View Crea la instancia
    }
}
