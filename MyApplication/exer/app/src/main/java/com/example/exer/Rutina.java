package com.example.exer;

public class Rutina {

    private String titulo;
    private String descripcion;
    private int dibujo;

    public Rutina() {

    }

    public Rutina(String titulo, String descripcion, int dibujo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dibujo = dibujo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDibujo() {
        return dibujo;
    }

    public void setDibujo(int dibujo) {
        this.dibujo = dibujo;
    }
}
