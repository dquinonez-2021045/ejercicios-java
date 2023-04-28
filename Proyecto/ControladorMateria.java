package com.david.controlador;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ControladorMateria{
	ArrayList<Materia> arreglo=new ArrayList<>();
	Materia Materia;
	Buffer bf=new Buffer();
	String materia;
	String descripcion;
	int codigo;
	String pregunta;
	int m=0;
	public void materia1(){
		do{
			System.out.println("Ingrese el nombre de la materia que desee ejecuatar");
			materia=bf.leerTexto();
			
			
			System.out.println("Ingrese la descripcion de la materia anteriormente escogida");
			descripcion=bf.leerTexto();
			
			
			System.out.println("Ingrese el codigo de la materia");
			codigo=bf.leerNumero();
			
			
			System.out.println("desea continuar");
			pregunta=bf.leerTexto();
			arreglo.add(new Materia(materia,descripcion,codigo));
		}while(pregunta.equals("si"));
		
		System.out.println("aqui esta el resultado de la materia");
		for(Materia p: arreglo){
            System.out.println("El resultado del usuario instructor es: ");
			System.out.println("-------------------------------------------");
			System.out.println("Nombre de la Materia: "+p.getNombreMateria());
			System.out.println("Descripcion de la materia: "+p.getDescripcion());
			System.out.println("Codigo: "+p.getCodigoMateria());
            m++;
			
		}

	}


}