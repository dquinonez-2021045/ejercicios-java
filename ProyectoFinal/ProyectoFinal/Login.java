package com.david.vista;
import com.david.manejador.*;
public class Login{
	Datos dato=new Datos();
	
	String usuario;
	String clave;
	String usuario2;
	String clave2;
	
	ManejadorUsuario m=new ManejadorUsuario();
	
	public void loginInicial(){
		System.out.println("---------------------------------");
		System.out.println("USUARIO DIRECTOR: director");
		System.out.println("CLAVE DIRECTOR: 2021");
		System.out.println("---------------------------------");
		System.out.println("                          ");
		System.out.println("---------------------------------");
		System.out.println("USUARIO COORDINADOR: coordinador");
		System.out.println("CLAVE COORDINADOR: 1018");
		System.out.println("---------------------------------");
		
		System.out.println("Ingrese usuario");
		usuario=dato.leerTexto();
		
		System.out.println("Ingrese clave");
		clave=dato.leerTexto();
		m.logInicial(usuario,clave);
		
	}
	public void loginSecundario(){
		usuario2=dato.leerTexto();
			
		clave2=dato.leerTexto();
		m.logInicial(usuario,clave);
		
		
		
	}	
}
