package com.example.exer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Pier extends AppCompatActivity {

    ArrayList<Rutina> listaVertical;
    RecyclerView recyclerVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pier);

        recyclerVertical = findViewById(R.id.recyclerId);
        recyclerVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        listaVertical = new ArrayList<Rutina>();

        llenarRutina();

        AdapterDatos adapter = new AdapterDatos(listaVertical);
        recyclerVertical.setAdapter(adapter);
    }

    private void llenarRutina() {
        listaVertical.add(new Rutina("Trote suave","7 minutos",R.drawable.cardio));
        listaVertical.add(new Rutina("Sentadillas con barra","7 series x 8 repeticiones", R.drawable.sentadilla_con_barra));
        listaVertical.add(new Rutina("Deadlift","6 series x 10 repeticiones",R.drawable.deadlift));
        listaVertical.add(new Rutina("Lunges","5 series x 8 repeticiones",R.drawable.lunges_con_mancuerna));
        listaVertical.add(new Rutina("Pantorrilla","6 series x 20 repeticiones",R.drawable.pantorrilla));
        listaVertical.add(new Rutina("Trote suave","10 minutos",R.drawable.cardio));
    }
}
