package com.david.vista;
import com.david.manejador.*;
import com.david.controlador.*;
import com.david.modelo.*;
public class PantallaCordinador{
	
		Usuario usuarioos=new Usuario();
		Buffer bf=new Buffer();
		ControladorUsuario cUsuario=new ControladorUsuario();
	
	int opt;
	String opcion;
	int idUsuario=-1;
	int datom;
	String nombre;
	String codigo;
	String rol;
	String buscador;
	String descripcion;
	String datomodificar;
	String nuevamaterial;
	String nuevocodigo;
	String nuevadescripcion;
	int a=0;
	
	
	public void menuCordinador(){
		System.out.println("---------------------------");
		System.out.println("[1].... Materia");
		System.out.println("[2].... Instructor");
		System.out.println("[3].... Asignar");
		System.out.println("[4].... Salir");
		System.out.println("---------------------------");
		opt=bf.leerNumero();
		switch(opt){
			case 1:
			this.menuMateria();
			break;
			case 2:
			this.menuInstructor();
			break;
			case 3:
			this.menuAsignar();
			break;
		}
		
	}
	
	public void menuMateria(){
		System.out.println("---------------------------");
		System.out.println("[1].... Agregar");
		System.out.println("[2].... Modificar");
		System.out.println("[3].... Eliminar");
		System.out.println("[4].... Regresar");
		System.out.println("---------------------------");
		opt=bf.leerNumero();
		switch(opt){
			case 1:
				do{
				System.out.println("----------------------------------------");
				System.out.println("Agrege los datos solicitados");
				System.out.println("----------------------------------------");
				idUsuario++;
				System.out.println("----------------------------------------");
				System.out.println("Ingrese el nombre de la materia");
				nombre=bf.leerTexto();
				System.out.println("Ingrese el codigo de la materia");
				codigo=bf.leerTexto();
				System.out.println("Ingrese una pequeña descripcion de la materia");
				descripcion=bf.leerTexto();
				System.out.println("----------------------------------------");
				
				System.out.println("Desea continuar ingresando usuarios?");
				opcion=bf.leerTexto();	
				}while(opcion.toLowerCase().equals("si"));
			case 2:
				do{
					System.out.println("Que desea modificar:");
					System.out.println("[1].. Nombre de la materia");
					System.out.println("[2].. codigo de la materia");
					System.out.println("[3].. descripcion de la materia");
					opt=bf.leernumero();
					switch(datomodificar){
						case 1:
						System.out.println("Ingrese el nuevo nombre de la materia");
						nuevamaterial=bf.leerTexto();
						break;
						case 2:
						System.out.println("Ingrese el nuevo codigo de la materia");
						nuevocodigo=bf.leerTexto();
						break;
						case 3:
						System.out.println("Ingrese la nueva descripcion de la materia");
						nuevadescripcion=bf.leerTexto();
						break;
					}
				}
			case 3:
				
				
			case 4:
			
			this.menuCordinador();
			break;
		
		}
		
	}
	
	public void menuInstructor(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opt=bf.leerNumero();
		switch(opt){
			case 4:
			
			this.menuCordinador();
			break;
			
		}
		
	}
	

	
	public void menuAsignar(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opt=bf.leerNumero();
		switch(opt){
			case 4:
			
			this.menuCordinador();
			break;
			
		}
		
	}
}