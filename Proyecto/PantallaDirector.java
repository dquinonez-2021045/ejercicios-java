package com.david.vista;
import com.david.manejador.*;
import com.david.controlador.*;
import com.david.modelo.*;
import com.david.vista.*;
public class PantallaDirector{

	Buffer bf=new Buffer();
	ControladorMateria contMateria=new ControladorMateria();	
	int opcion;
	int idCurso=0;
	String nombreCurso;
	String descripcionCurso;
	
	public void menuDirector(){
		System.out.println("1...Materia");
		System.out.println("2...Instructor");
		System.out.println("3...Salones");
		System.out.println("4...Asignar");
		System.out.println("5...Cerrar Sesion");
		opcion=bf.leerNumero();
		switch(opcion){
			case 1:
			this.menuMateria();
			break;
			
			case 2:
			this.menuInstructor();
			break;
			
			case 3:
			this.menuSalones();
			break;
			
			case 4:
			this.menuAsignar();
			break;
			
			
		}
		
	}
	
	public void menuMateria(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opcion=bf.leerNumero();
		switch(opcion){
			case 1:
			idCurso++;
			System.out.println("Ingrese el nombre de la materia");
			nombreCurso=bf.leerTexto();
			System.out.println("Ingrese una descripcion");
			descripcionCurso=bf.leerTexto();
			
			
			
			break;
			
			case 4:
			
			this.menuDirector();
			break;
			
		}
		
	}
	
	public void menuInstructor(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opcion=bf.leerNumero();
		switch(opcion){
			case 4:
			
			this.menuDirector();
			break;
			
		}
		
	}
	
	public void menuSalones(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opcion=bf.leerNumero();
		switch(opcion){
			case 1:
			
			
			case 4:
			
			this.menuDirector();
			break;
			
		}
		
	}
	
	public void menuAsignar(){
		
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		
		opcion=bf.leerNumero();
		switch(opcion){
			case 4:
			
			this.menuDirector();
			break;
		}
	}
	}