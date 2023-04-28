package com.david.modelo;
public class Materia{

	String nombreMateria;
	String descripcion;
	int codigoMateria;
	
	public Materia(String nombreMateria, String descripcion, int codigoMateria){
		this.nombreMateria=nombreMateria;
		this.descripcion=descripcion;
		this.codigoMateria=codigoMateria;
	//SETS
	}
	public void setNombre(String nombreMateria){
		this.nombreMateria=nombreMateria; 
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	//GETS
	public String getNombreMateria(){
		return nombreMateria;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public int getCodigoMateria(){
		return codigoMateria;
	}
	
}