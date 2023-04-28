package com.david.modelo;
public class Salon{

	int salon;
	String nombreS;
	int cantidadS;

	public Salon(int salon,String nombreS,int cantidadS){

	this.salon=salon;
	this.nombreS=nombreS;
	this.cantidadS=cantidadS;

		
	}
	public int getSalon(){
		return salon;
	}
	
	public String getNombreS(){
		return nombreS;
	}
	
	public int getCantidadS(){
		return cantidadS;
	}
	public void setSalon(int salon){
		this.salon=salon;
	}
	
	public void setNombreS(String nombreS){
		this.nombreS=nombreS;
	}

	public void setCantidadS(int cantidadS){
		this.cantidadS=cantidadS;
	}








}