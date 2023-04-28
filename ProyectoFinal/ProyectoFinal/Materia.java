package com.david.modelo;
public class Materia{
	
	int codigoMateria;
	String nombre;
	String descripcion;
	
	public Materia(int  codigoMateria,String nombre,String descripcion){
		this. codigoMateria= codigoMateria;
		this.nombre=nombre;
		this.descripcion=descripcion;
		
	}
	public int getCodigoMateria(){
		return  codigoMateria;
		
	}
	public String getNombreCurso(){
		return nombre;
		
	}
	public String getDescripcion(){
		return descripcion;
		
	}
	public void setCodigoMateria(int codigoMateria){
		this.codigoMateria= codigoMateria;
	}
	public void setNombreCurso(String nombre){
		this.nombre=nombre;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
}