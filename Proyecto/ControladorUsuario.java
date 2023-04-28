package com.david.controlador;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
import com.david.vista.*;
public class ControladorUsuario{
	Usuario usuario=new Usuario();
	Buffer bf=new Buffer();
	PantallaDirector pantaD=new PantallaDirector();
	PantallaCordinador pantaC=new PantallaCordinador();
	
	
	public void agregarUsuario(){
	}
	
	public void logInicial(String user, String clave){
		
		if(user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
			
			if(usuario.getNombre().equals("d")){
				System.out.println("Datos correctos");
				pantaD.menuDirector();
				
			}else if(usuario.getClave().equals("c")){
				System.out.println("Sea Usted Bienvenido");
				pantaC.menuCordinador();
			}
			
			
			
		}else{
				System.out.println("Usted no esta registrado");
				pantaC.menuCordinador();
		}
		
	}
	
	
}

	
