package com.example.exer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class Vertical extends AppCompatActivity {

    Button regress_button;

    ArrayList<Rutina> listaVertical;
    RecyclerView recyclerVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);

        recyclerVertical = findViewById(R.id.recyclerId);
        recyclerVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        listaVertical = new ArrayList<Rutina>();

        llenarRutina();

        AdapterDatos adapter = new AdapterDatos(listaVertical);
        recyclerVertical.setAdapter(adapter);



    }

    private void llenarRutina() {
        listaVertical.add(new Rutina("Trote suave","7 minutos",R.drawable.cardio));
        listaVertical.add(new Rutina("Press militar","5 series x 8 repeticiones",R.drawable.press_militar));
        listaVertical.add(new Rutina("Dominadas en barra abiertas","5 series x 8 repeticiones",R.drawable.dominadas_abiertas));
        listaVertical.add(new Rutina("Dominadas en barra cerradas","5 series x 8 repeticiones",R.drawable.dominada_cerrada));
        listaVertical.add(new Rutina("Press de banca declinado","5 series x 8 repeticiones",R.drawable.decline_bench_press));
        listaVertical.add(new Rutina("Apertura con mancuernas declinado","5 series x 8 repeticiones",R.drawable.apertura_con_mancuerdas_declinado));
        listaVertical.add(new Rutina("Curl de biceps","4 series x 8 repeticiones",R.drawable.curl_biceps));
        listaVertical.add(new Rutina("Extensiones de tricep","4 series x 8 repeticiones",R.drawable.extensiones_tricep));
        listaVertical.add(new Rutina("Trote suave","10 minutos",R.drawable.cardio));

    }
}
