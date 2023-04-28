package com.angel.modelo;
public class Instructor{
    int codigoInstructor;
    String nombre;
    String apellido;
    int telefono;
    String direccion;

    public Instructor (int codigoInstructor, String nombre, String apellido, int telefono, String direccion){
    this.codigoInstructor=codigoInstructor;
    this.nombre=nombre;
    this.apellido= apellido;
    this.telefono= telefono;
    this.direccion=direccion;
    }
    public int setCodigoInstructor(){
        return codigoInstructor;
    }
    public void getCodigoInstructor(int codigoInstructor){
        this.codigoInstructor=codigoInstructor;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre=nombre;
    }
    public String setApellido(){
        return apellido;
    }
    public void getApellido(String apellido){
        this.apellido= apellido;
    }
    public int setTelefono(){
        return telefono;
    }
    public void getTelefono(int telefono){
        this.telefono= telefono;
    }
    public String setDireccion(){
        return direccion;
    }
    public void getDireccion(String direccion){
        this.direccion=direccion;
    }
}