package com.david.vista;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import com.david.manejador.*;
import com.david.modelo.*;
import java.util.ArrayList;
public class PantallaDirector{
	Datos dato=new Datos();
	ManejadorMateria aMateria=new ManejadorMateria();
	ManejadorInstructor instru=new ManejadorInstructor();
	ManejadorSalon sal=new ManejadorSalon();
	Asignar asig=new Asignar();
	ArrayList<Usuario> usuario=new ArrayList<Usuario>();
	int opcion;
	int idCurso=0;
	int idI=0;
	String nombreI;
	String apellidoI;
	int telefonoI;
	String direccion;
	int salon=0;
	String nombreS;
	int cantidadS;
	
	String nombreCurso;
	String descripcionCurso;
	String op;
	
	String mod;
	String pregunta;
	
	public void menuDirector(){
		System.out.println("------------------------------------");
		System.out.println("         BIENVENIDO DIRECTOR        ");
		System.out.println("------------------------------------");
		System.out.println("                                    ");
		System.out.println("------------------------------------");
		System.out.println("Que desea hacer?");
		System.out.println("------------------------------------");
		System.out.println("[1]...Ir a materia");
		System.out.println("[2]...Ir a instructor");
		System.out.println("[3]...Ir a salones");
		System.out.println("[4]...Ir a asignar");
		System.out.println("[5]...Reporte txt");
		System.out.println("[6]...Salir");
		System.out.println("------------------------------------");
		
		opcion=dato.leerNumero();
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
			
			case 5:
			this.menuReporte();
			break;
		}
		
	}
	public void menuMateria(){
		System.out.println("------------------------------------");
		System.out.println("     HA INGRESADO A MATERIA    ");
		System.out.println("------------------------------------");
		System.out.println("Que desea hacer?");
		System.out.println("------------------------------------");
		System.out.println("[1]...Agregar una materia");
		System.out.println("[2]...Modificar una materia");
		System.out.println("[3]...Eliminar una materia");
		System.out.println("[4]...Regresar");
		System.out.println("------------------------------------");
		opcion=dato.leerNumero();
		switch(opcion){
			case 1:
			do{
				
				idCurso++;
				System.out.println(" HA ESCOGIDO LA OPCION DE AGREGAR MATERIA");
				System.out.println("------------------------------------");
				System.out.println("Ingrese el nombre de la materia");
				System.out.println("------------------------------------");
				System.out.println("                                    ");
				nombreCurso=dato.leerTexto();
				System.out.println("                                    ");
				System.out.println("------------------------------------");
				System.out.println("                                    ");
				System.out.println("Ingrese una descripcion");
				System.out.println("                                    ");
				descripcionCurso=dato.leerTexto();
				aMateria.agregarMateria(idCurso,nombreCurso,descripcionCurso);
				
				System.out.println("Desea Agregar Otro");
				System.out.println("------------------------------------");
				System.out.println("Ingrese [si] o [no]");
				System.out.println("------------------------------------");
				
				op=dato.leerTexto();
				
			}while(op.equals("si"));
			
			aMateria.reporteMateria();
			
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			
			if(opcion==1){
				this.menuMateria();
			}
			
			break;
			
			case 2:
			aMateria.modificarMateria();
			aMateria.reporteMateria();
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			if(opcion==1){
				this.menuMateria();
			}
			break;
			case 3:
			aMateria.eliminarMateria();
			aMateria.reporteMateria();
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			if(opcion==1){
				this.menuMateria();
			}
			break;
			case 4:
			this.menuDirector();
			break;	
		}
	}
	
	public void menuInstructor(){
		System.out.println("------------------------------------");
		System.out.println("      HA INGRESADO A INSTRUCTOR     ");
		System.out.println("------------------------------------");
		System.out.println("[1]...Agregar");
		System.out.println("[2]...Modificar");
		System.out.println("[3]...Eliminar");
		System.out.println("[4]...Regresar");
		System.out.println("------------------------------------");
		
		opcion=dato.leerNumero();
		switch(opcion){
			case 1:
			do{
				idI++;
				System.out.println("------------------------------------");
				System.out.println("Ingrese el nombre del Instructor");
				System.out.println("------------------------------------");
				nombreI=dato.leerTexto();
				System.out.println("------------------------------------");
				System.out.println("Ingrese el apellido del Instructor");
				System.out.println("------------------------------------");
				apellidoI=dato.leerTexto();
				System.out.println("------------------------------------");
				System.out.println("Ingrese el numero de telefono del Instructor");
				System.out.println("------------------------------------");
				telefonoI=dato.leerNumero();
				System.out.println("------------------------------------");
				System.out.println("Ingrese la direccion del Instructor");
				System.out.println("------------------------------------");
				direccion=dato.leerTexto();
				instru.agregarInstructor(idI,nombreI,apellidoI,telefonoI,direccion);
				System.out.println("Desea Agregar Otro");
				op=dato.leerTexto();
			}while(op.equals("si"));
			instru.reporteInstructor();
			
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			if(opcion==1){
				this.menuInstructor();
			}
			
			break;
			case 2:
			instru.modificarInstructor();
			instru.reporteInstructor();
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			
			if(opcion==1){
				this.menuInstructor();
			}
			break;
			
			case 3:
			instru.eliminarInstructor();
			instru.reporteInstructor();
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			if(opcion==1){
				this.menuMateria();
			}
			
			break;
			
			case 4:
			this.menuDirector();
			break;
		}	
	}
	public void menuSalones(){
		System.out.println("------------------------------------");
		System.out.println("     HA INGRESADO A SALONES     ");
		System.out.println("------------------------------------");
		System.out.println("1...Agregar");
		System.out.println("2...Modificar");
		System.out.println("3...Eliminar");
		System.out.println("4...Regresar");
		System.out.println("------------------------------------");
		opcion=dato.leerNumero();
		switch(opcion){
			case 1:
			do{
				
				salon++;
				System.out.println("------------------------------------");
				System.out.println("Ingrese el nombre del salon");
				System.out.println("------------------------------------");
				nombreS=dato.leerTexto();
				System.out.println("------------------------------------");
				System.out.println("Ingrese la cantidad maxima de alumnos");
				System.out.println("------------------------------------");
				cantidadS=dato.leerNumero();
			
				sal.agregarSalon(salon,nombreS,cantidadS);
				
				System.out.println("Desea Agregar Otro");
				op=dato.leerTexto();
				
			}while(op.equals("si"));
			
			sal.reporteSalon();
			
			System.out.println("1...Regresar");
			opcion=dato.leerNumero();
			
			if(opcion==1){
				this.menuSalones();
			}
			
			break;
			
			case 2:
			sal.modificarSalon();
			sal.reporteSalon();
			break;
			
			case 3:
			sal.eliminarSalon();
			sal.reporteSalon();
			
			case 4:
			
			this.menuDirector();
			break;
		}
	}
	
	public void menuAsignar(){
		System.out.println("------------------------------------");
		System.out.println("       HA ESCOGIDO ASIGNAR     ");
		System.out.println("------------------------------------");
		System.out.println("[1]...Agregar");
		System.out.println("[2]...Modificar");
		System.out.println("[3]...Eliminar");
		System.out.println("[4]...Regresar");
		System.out.println("------------------------------------");
		opcion=dato.leerNumero();
		switch(opcion){
			case 1:
			asig.asignar();
			
				
			}
		
		
	}
		public void menuReporte(){
            String ruta;
            String contenido;
			System.out.println("Ingrese la ruta para crear el archivo txt");
			ruta=dato.leerTexto();
            File file = new File(ruta);
			try{
            if (!file.exists()) {
				System.out.println("El archivo fue exitosamente creado");
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
           for(Usuario u: usuario){
			   bw.write(u.getIdUsuario()+" "+u.getNombre()+" "+u.getRol()+" "+u.getClave());
		   }
            bw.close();
        }catch (Exception e) {
            e.printStackTrace();
		}
		
	}

	


}