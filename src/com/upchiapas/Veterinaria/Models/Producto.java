package com.upchiapas.Veterinaria.Models;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected int total;
    public Producto(String nombre, int cantidad, int total){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
