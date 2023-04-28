package com.david.controlador;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ControladorInstructor{
Buffer bf=new Buffer();
	Instructor Instructor;
	ArrayList<Instructor> arreglo2=new ArrayList<>();
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	int codigo;
	String pregunta;
	int i=0;
	public void instructor1(){
	
		do{
			System.out.println("Ingrese su nombre");
			nombre=bf.leerTexto();
		
			
			System.out.println("Ingrese su apellido");
			apellido=bf.leerTexto();
			
			
			System.out.println("Ingrese su numero de telefono");
			telefono=bf.leerNumero();
			
			
			System.out.println("Ingrese su direccion");
			direccion=bf.leerTexto();
			
			System.out.println("Ingrese su Codigo");
			codigo=bf.leerNumero();
			
		
			System.out.println("desea continuar");
			pregunta=bf.leerTexto();
			arreglo2.add(new Instructor(nombre,apellido,telefono,direccion,codigo));
		}while(pregunta.equals("si"));
		for(Instructor p: arreglo2){
            System.out.println("El resultado del usuario instructor es: ");
			System.out.println("-------------------------------------------");
			System.out.println("Nombre: "+p.getNombre());
			System.out.println("Apellido: "+p.getApellido());
			System.out.println("Telefono: "+p.getTelefono());
			System.out.println("Direccion: "+p.getDireccion());
			System.out.println("Id: "+p.getCodigoInstructor());
            i++;
        }
        
		
		

	}




}