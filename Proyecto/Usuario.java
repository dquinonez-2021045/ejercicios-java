package com.david.modelo;
public class Usuario{
	
	int idUsuario;
	String nombre;
	String clave; 	
	String rol;
	
	public void Usuario(int idUsuario, String nombre, String clave, String rol){
		idUsuario=0;
		nombre="admin";
		clave="123";
		rol="d";
	
	}

	
	//GETS
	
	public String getNombre(){
		return nombre;
	}									
	public String getRol(){
		return rol;
	}
	public String getClave(){
		return clave;
	}
	public int getIdUsuario(){			
		return idUsuario;
	}
	//SETS
	public void setNombre(String nombre){ 												
		this.nombre=nombre;
	}
	public void setRol(String rol){		
		this.rol=rol;
	}
	public void setClave(String clave){			
		this.clave=clave;
	}
	public void setIdUsuario(int idUsuario){
		this.idUsuario=idUsuario;
	}
}