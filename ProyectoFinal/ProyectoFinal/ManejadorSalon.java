package com.david.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ManejadorSalon{
	ArrayList<Salon> sal=new ArrayList<Salon>();
	Datos dato=new Datos();
	
	String buscar;
	String nNombre;
	String opcion;
	int cantidad;
	int salon;
	int op;
	int nCantidad;
	int bus;
	
	public void agregarSalon(int salon,String nombreS,int cantidadS){
		sal.add(new Salon(salon,nombreS,cantidadS));
		
	}
	public void reporteSalon(){
		
		System.out.println("Mostrando Datos");
		
		for(Salon c: sal){
			System.out.println(c.getSalon()+"  "+c.getNombreS()+"  "+c.getCantidadS());
			
		}
		
	}
	public void modificarSalon(){	

		System.out.println("1...Modificar Nombre");
		System.out.println("2...Modificar la cantidad maxima");
		op=dato.leerNumero();
		
		switch(op){
			case 1:
			do{
				System.out.println("Ingrese el ID");
				salon=dato.leerNumero();
				
				for(Salon b: sal){
					if(salon==b.getSalon()){
						System.out.println("Si existe");
				
						System.out.println("Ingrese nuevo Nombre");
						nNombre=dato.leerTexto();
						b.setNombreS(nNombre);
						salon++;
					
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
				cantidad=dato.leerNumero();
				
				for(Salon b: sal){
					if(cantidad==b.getSalon()){
						System.out.println("Si existe");
				
						System.out.println("Ingrese nueva Cantidad");
						nCantidad=dato.leerNumero();
						b.setCantidadS(nCantidad);
						cantidad++;
					
						break;
					}
					
				}
				System.out.println("Desea Modificar Otro");
				opcion=dato.leerTexto();
			}while(opcion.equals("si"));
				
			break;
		}	
	}
	public void eliminarSalon(){
		int x=0;
		String op;
		
		do{
		System.out.println("Ingrese indice del Salon a eliminar");
		
		x=dato.leerNumero();
		sal.remove(x);
		System.out.println("Desea Eliminar Otro");
		op=dato.leerTexto();
			
		}while(op.equals("si"));
		
	}


}