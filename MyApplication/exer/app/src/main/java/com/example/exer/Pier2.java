package com.example.exer;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pier2 extends AppCompatActivity {

    ArrayList<Rutina> listaVertical;
    RecyclerView recyclerVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pier2);

        recyclerVertical = findViewById(R.id.recyclerId);
        recyclerVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        listaVertical = new ArrayList<Rutina>();

        llenarRutina();

        AdapterDatos adapter = new AdapterDatos(listaVertical);
        recyclerVertical.setAdapter(adapter);
    }

    private void llenarRutina() {
        listaVertical.add(new Rutina("Trote suave","7 minutos",R.drawable.cardio));
        listaVertical.add(new Rutina("Prensa para piernas","5 series x 8 repeticiones", R.drawable.prensa_para_pierna));
        listaVertical.add(new Rutina("Extensiones de pierna","5 series x 8 repeticiones",R.drawable.extensiones_de_pierna));
        listaVertical.add(new Rutina("Bicep femoral","5 series x 8 repeticiones",R.drawable.extensiones_de_pierna));
        listaVertical.add(new Rutina("Pantorrilla","6 series x 20 repeticiones",R.drawable.pantorrilla));
        listaVertical.add(new Rutina("Trote suave","5 minutos",R.drawable.cardio));
    }
}
