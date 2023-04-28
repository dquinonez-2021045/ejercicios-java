package com.david.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ManejadorInstructor{
	ArrayList<Instructor> instru=new ArrayList<Instructor>();
	Datos dato=new Datos();
	
	String buscar;
	int op;
	int bus;
	String opcion;
	int idInstructor;
	String nNombre;
	String nApellido;
	int nTelefono;
	String nDireccion;
	String nombreI;
	String apellidoI;
	int telefonoI;
	String direccion;
	
	public void agregarInstructor(int idInstructor,String nombreI,String apellidoI,int telefonoI,String direccion){
		instru.add(new Instructor(idInstructor,nombreI,apellidoI,telefonoI,direccion));
		
	}
	public void reporteInstructor(){
		
		System.out.println("Mostrando Datos");
		
		for(Instructor a: instru){
			System.out.println(a.getIdInstructor()+"  "+a.getNombreInstructor()+"  "+a.getApellidoInstructor()+"  "+a.getTelefonoInstructor()+"  "+a.getDireccion());
			
		}
		
	}
	public void modificarInstructor(){
		
		System.out.println("[1]...Modificar el Nombre");
		System.out.println("[2]...Modificar el Apellido");
		System.out.println("[3]...Modificar el numero de Telefono");
		System.out.println("[4]...Modificar la Direccion");
		op=dato.leerNumero();
		
		switch(op){
				case 1:
				do{
					System.out.println("Ingrese el ID de la persona que desea modificar");
					idInstructor=dato.leerNumero();
				
					for(Instructor b: instru){
						if(idInstructor==b.getIdInstructor()){
							System.out.println("Si existe");
					
							System.out.println("Ingrese nuevo Nombre");
							nNombre=dato.leerTexto();
							b.setNombreInstructor(nNombre);
							idInstructor++;
						
							break;
						}
					
					}
					System.out.println("Desea Modificar Otro");
					opcion=dato.leerTexto();
				}while(opcion.equals("si"));
				break;
				case 2:
				do{
					System.out.println("Ingrese el ID");
					idInstructor=dato.leerNumero();
				
					for(Instructor b: instru){
						if(idInstructor==b.getIdInstructor()){
							System.out.println("Si existe");
					
							System.out.println("Ingrese el nuevo apellido");
							nApellido=dato.leerTexto();
							b.setApellidoInstructor(nApellido);
							idInstructor++;
						
							break;
						}
					}
					System.out.println("Desea Modificar Otro");
					opcion=dato.leerTexto();
				}while(opcion.equals("si"));
				break;
				case 3:
				do{
					System.out.println("Ingrese el ID");
					idInstructor=dato.leerNumero();
				
					for(Instructor b: instru){
						if(idInstructor==b.getIdInstructor()){
							System.out.println("Si existe");
					
							System.out.println("Ingrese nuevo Telefono");
							nTelefono=dato.leerNumero();
							b.setTelefonoInstructor(nTelefono);
							idInstructor++;
						
							break;
						}
					}
					System.out.println("Desea Modificar Otro");
					opcion=dato.leerTexto();
				}while(opcion.equals("si"));
				
				break;
				case 4:
				do{
					System.out.println("Ingrese el id");
					idInstructor=dato.leerNumero();
				
					for(Instructor b: instru){
						if(idInstructor==b.getIdInstructor()){
							System.out.println("Si existe");
					
							System.out.println("Ingrese nueva Direccion");
							nDireccion=dato.leerTexto();
							b.setDireccion(nDireccion);
							idInstructor++;
						
							break;
						}
					
					}
					System.out.println("Desea Modificar Otro");
					opcion=dato.leerTexto();
				}while(opcion.equals("si"));
				
				break;	
		}
	}
	public void eliminarInstructor(){
		int x=0;
		String op;
		do{
		System.out.println("Ingrese el id del Instructor a eliminar");
		x=dato.leerNumero();
		instru.remove(x);
		System.out.println("Desea Eliminar Otro");
		op=dato.leerTexto();
			
		}while(op.equals("si"));
	}

}