package com.david.manejador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import com.david.modelo.*;
import com.david.manejador.*;
public class ManejadorMateria{
	ArrayList<Materia> aMateria=new ArrayList<Materia>();
	Datos dato=new Datos();
	public void agregarMateria(int idMateria,String nombreMateria,String descripcion){
		aMateria.add(new Materia(idMateria,nombreMateria,descripcion));
	}
	public void reporteMateria(){
		System.out.println("------------------------------------");
		System.out.println("Mostrando Datos");
		System.out.println("------------------------------------");
		
		for(Materia a: aMateria){
			System.out.println(a.getCodigoMateria()+"  "+a.getNombreCurso()+"  "+a.getDescripcion());
			
		}
		
	}
	public void modificarMateria(){
		int idMateria;
		int buscar;
		String curso;
		String nuevoCurso;
		String nuevaDescripcion;
		System.out.println("-----------------------------------------------------");
		System.out.println("Ingrese el ID de la materia que desea Modificar");
		System.out.println("-----------------------------------------------------");
		idMateria=dato.leerNumero();
		for(Materia b: aMateria){
			if(idMateria==b.getCodigoMateria()){
				System.out.println("Si existe");
				System.out.println("------------------------------------");
				System.out.println("Ingrese la Nueva Materia");
				System.out.println("------------------------------------");
				nuevoCurso=dato.leerTexto();
				b.setNombreCurso(nuevoCurso);
				System.out.println("------------------------------------");
				System.out.println("Ingrese la Nueva Descripcion");
				System.out.println("------------------------------------");
				nuevoCurso=dato.leerTexto();
				b.setDescripcion(nuevoCurso);
				
				
				
				idMateria++;
				break;
				
				
			}
			
		}
		
	}
	
	public void eliminarMateria(){
		int x=0;
		System.out.println("---------------------------------------------");
		System.out.println("Ingrese indice de la materia a eliminar ");
		System.out.println("------------------------------------");
		
		x=dato.leerNumero();
		aMateria.remove(x);
		
			
		
		
	}

}
