package com.david.vista;
import com.david.modelo.*;
import com.david.manejador.*;
import com.david.controlador.*;
public class Login{
	Buffer bf=new Buffer();
	
	String usuario;
	String clave;
	
	ControladorUsuario controlador=new ControladorUsuario();
	
	
	public void loginInicial(){
		
		System.out.println("Ingrese usuario");
		usuario=bf.leerTexto();
		
		System.out.println("Ingrese clave");
		clave=bf.leerTexto();
		controlador.logInicial(usuario, clave);
		
		
	}
	
	public void loginSecundario(){
		
		System.out.println("Ingrese usuario");
		usuario=bf.leerTexto();
		
		System.out.println("Ingrese clave");
		clave=bf.leerTexto();
		controlador.logInicial(usuario, clave);
		
	}
	
	
}
