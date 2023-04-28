package com.angel.modelo;
public class Salon{
    int codigoSalon;
    String nombre;
    int cantidad;

    public Salon (int codigoSalon, String nombre, int cantidad){
    this.codigoSalon= codigoSalon;
    this.nombre= nombre;
    this.cantidad= cantidad;
    }
    public int setCodigoSalon(){
        return codigoSalon;
    }
    public void getCodigoSalon(int codigoSalon){
        this.codigoSalon= codigoSalon;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre=nombre;
    }
    public int setCantidad(){
        return cantidad;
    } 
    public void getCantidad(int cantidad){
        this.cantidad= cantidad;
    }
}