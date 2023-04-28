package com.david.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.david.modelo.*;
import com.david.vista.*;
public class ManejadorUsuario{
	Usuario usuario=new Usuario();
	Usuario2 usuario2=new Usuario2();
	PantallaDirector p=new PantallaDirector();
	PantallaCoordinador c=new PantallaCoordinador();
	
	public void agregarUsuario(){
	}
	
	public void logInicial(String user, String clave){
		
		if(user.equals(usuario.getNombre())&& clave.equals(usuario.getClave())){
			
			if(usuario.getRol().equals("d")){
				System.out.println("Datos correctos");
				System.out.println("BIENVENIDO DIRECTOR");
				p.menuDirector();
				
			}else if(usuario2.getRol().equals("c")){
				System.out.println("Datos correctos");
				System.out.println("BIENVENIDO COORDINADOR");
				c.menuCoordinador();
			}
		}else{
				System.out.println("Dato erroeneo");
		}
		
	
	
		
		if(user.equals(usuario2.getNombre())&& clave.equals(usuario2.getClave())){
			
			if(usuario2.getRol().equals("c")){
				System.out.println("Datos correctos");
				System.out.println("BIENVENIDO COORDINADOR");
				c.menuCoordinador();
				
			}else if(usuario2.getRol().equals("c")){
				System.out.println("Datos correctos");
				System.out.println("BIENVENIDO COORDINADOR");
				c.menuCoordinador();
			}
		}else{
				System.out.println("Dato erroeneo");
		}
		
	}
}