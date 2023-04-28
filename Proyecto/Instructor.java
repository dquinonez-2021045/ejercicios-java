package com.david.modelo;
public class Instructor{
	
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	int codigoInstructor;
	
	public Instructor(String nombre, String apellido, int telefono, String direccion, int codigoInstructor){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
		this.codigoInstructor=codigoInstructor;
	//SETS
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	//GETS
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public int getTelefono(){
		return telefono;
	}
	public String getDireccion(){
		return direccion;
	}
	public int getCodigoInstructor(){
		return codigoInstructor; 
	}
	
}