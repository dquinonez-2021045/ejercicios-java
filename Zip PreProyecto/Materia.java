package com.angel.modelo;
public class Materia{
    int codigoMateria;
    String nombre;
    String descripcion;

    public Materia (int codigoMateria, String nombre, String descripcion){
    this.codigoMateria= codigoMateria;
    this.nombre= nombre;
    this.descripcion= descripcion;
    }
    public int setCodigoMateria(){
        return codigoMateria;
    }
    public void getCodigoMateria(int codigoMateria){
        this.codigoMateria= codigoMateria;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre=nombre;
    }
    public String setDescripcion(){
        return descripcion;
    }
    public void getDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}