package com.david.modelo;
public class Usuario{
	
	int id;
	String nombre;
	String clave;
	String rol;

	public Usuario(){
		id=0;
		nombre="director";
		clave="2021";
		rol="d";
		
	}
	public String getNombre(){
		return nombre;
	}
	
	public String getClave(){
		return clave;
	}
	
	public String getRol(){
		return rol;
	}
	public int getIdUsuario(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setClave(String clave){
		this.clave=clave;
	}

	public void setRol(String rol){
		this.rol=rol;
	}


}