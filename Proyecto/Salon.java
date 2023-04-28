package com.david.modelo;
public class Salon{
	
	String nombre;
	int cantidad;
	int codigoSalon;
	
	public Salon(String nombre, int cantidad, int codigoSalon){
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.codigoSalon=codigoSalon;
	//SETS
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	//GETS
	public String getNombre(){
		return nombre;
	}
	public int getCantidad(){
		return cantidad;
	}
	public int getCodigoSalon(){
		return codigoSalon;
	}
	



}