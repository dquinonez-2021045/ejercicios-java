package com.angel.modelo;
public class Usuario{
    int idUsuario;
    String nombre;
    String clave;
    String rol; 
     public void Usuario(int idUsuario, String nombre, String clave, String rol){
        idUsuario=0;
        nombre="admin";
        clave="1234";
        rol= "Director";
    }
    public void Usuario2(int idUsuario, String nombre, String clave, String rol){
        idUsuario=1;
        nombre="usuario";
        clave="1234";
        rol= "Coordinador";
    }
    public Usuario (int idUsuario, String nombre, String clave, String rol){
    this.idUsuario= idUsuario;
    this.nombre= nombre;
    this.clave= clave;
    this.rol= rol;
    }
    public int setIdUsuario(){
        return idUsuario;
    } 
    public void getIdUsuario(int idUsuario){
        this.idUsuario= idUsuario;
    }
    public String setNombre(){
        return nombre;
    }
    public void getNombre(String nombre){
        this.nombre=nombre;
    }
    public String setClave(){
        return clave;
    } 
    public void getClave(String clave){
        this.clave= clave;
    }
    public String setRol(){
        return rol;
    }
    public void getRol(String rol){
        this.rol=rol;
    }
}