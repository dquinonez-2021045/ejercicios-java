package com.david.controlador;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ControladorSalon{
	ArrayList<Salon> arreglo3=new ArrayList<>();
	Salon Salon;
	Buffer bf=new Buffer();
	String nombre;
	int cantidad;
	int codigo;
	String pregunta;
	int s=0;
	public void materia1(){
		do{
			System.out.println("Ingrese el nombre del salon que desee ejecuatar");
			nombre=bf.leerTexto();
			
			
			System.out.println("Ingrese la cantidad del salon");
			cantidad=bf.leerNumero();
			
			
			System.out.println("Ingrese el codigo del salon");
			codigo=bf.leerNumero();
			
			
			System.out.println("desea continuar");
			pregunta=bf.leerTexto();
			arreglo3.add(new Salon(nombre,cantidad,codigo));
		}while(pregunta.equals("si"));
		
		System.out.println("aqui esta el resultado de la materia");
		for(Salon p: arreglo3){
            System.out.println("El resultado del usuario instructor es: ");
			System.out.println("-------------------------------------------");
			System.out.println("Nombre de la Materia: "+p.getNombre());
			System.out.println("Descripcion de la materia: "+p.getCantidad());
			System.out.println("Codigo: "+p.getCodigoSalon());
            s++;
			
		}

	}





}