package com.example.exer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Horizontal extends AppCompatActivity {

    ArrayList<Rutina> listaVertical;
    RecyclerView recyclerVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);

        recyclerVertical = findViewById(R.id.recyclerId);
        recyclerVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        listaVertical = new ArrayList<Rutina>();

        llenarRutina();

        AdapterDatos adapter = new AdapterDatos(listaVertical);
        recyclerVertical.setAdapter(adapter);
    }

    private void llenarRutina() {
        listaVertical.add(new Rutina("Trote suave","7 minutos",R.drawable.cardio));
        listaVertical.add(new Rutina("Press de banca","5 series x 8 repeticiones", R.drawable.press_banca_plano));
        listaVertical.add(new Rutina("Remo en polea","5 series x 8 repeticiones",R.drawable.remo_en_polea));
        listaVertical.add(new Rutina("Apertura con mancuernas plano","5 series x 8 repeticiones",R.drawable.apertura_con_mancuernas));
        listaVertical.add(new Rutina("Serrucho con mancuernas","5 series x 8 repeticiones",R.drawable.serrucho_con_mancuernas));
        listaVertical.add(new Rutina("Elevaciones laterales","3 series x 8 repeticiones",R.drawable.elevaciones_laterales));
        listaVertical.add(new Rutina("Elevaciones frontales","3 series x 8 repeticiones",R.drawable.elevaciones_frontales));
        listaVertical.add(new Rutina("Elevaciones laterales inclinado","3 series x 8 repeticiones",R.drawable.elevacion_lateral_inclinado));
        listaVertical.add(new Rutina("Trote suave","10 minutos",R.drawable.cardio));
    }
}
