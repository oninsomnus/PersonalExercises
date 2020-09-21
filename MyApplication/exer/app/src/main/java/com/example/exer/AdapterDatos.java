package com.example.exer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.exer.R.id.descripcion;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<Rutina> listaRutina;

    public AdapterDatos(ArrayList<Rutina> listaRutina) {
        this.listaRutina = listaRutina;
    }

    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null, false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {
        holder.eltitulo.setText(listaRutina.get(position).getTitulo());
        holder.ladescripcion.setText(listaRutina.get(position).getDescripcion());
        holder.eldibujo.setImageResource(listaRutina.get(position).getDibujo());
    }

    @Override
    public int getItemCount() {
        return listaRutina.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        ImageView eldibujo;
        TextView eltitulo, ladescripcion;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            eldibujo=itemView.findViewById(R.id.dibujo);
            eltitulo = itemView.findViewById(R.id.titulo);
            ladescripcion = itemView.findViewById(R.id.descripcion);
        }

    }
}
