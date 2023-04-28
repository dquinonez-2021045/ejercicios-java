package com.angel.controlador;
import com.angel.modelo.*;
import java.util.ArrayList;
public class ControladorInstructor{
    Datos bf=new Datos();
    Instructor Instructor;
    ArrayList<Instructor> instructores=new ArrayList<>();
    int codigoInstructor=0;
    String nombre;
    String apellido;
    int telefono;
    String direccion;
    String opcion;
    int a=0;
    public void ingresarInstructor(){
        do{
        System.out.println("Ingrese los datos del Instructor");
        System.out.println("-----------------------------------");
        codigoInstructor++;
        System.out.println("Nombre");
        nombre=bf.ingresarTexto();
        System.out.println("Apellido");
        apellido=bf.ingresarTexto();
        System.out.println("Numero de telefono");
        telefono=bf.ingresarNumero();
        System.out.println("Direccion");
        direccion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        instructores.add(new Instructor(codigoInstructor,nombre,apellido,telefono,direccion));
        System.out.println("Desea seguir ingresando datos");
        opcion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        }while(opcion.equals("si"));
        System.out.println("Indice:     CodigoInstructor--Nombre--Apellido--Telefono--Direccion");
        System.out.println("-----------------------------------");
        for(Instructor i: instructores){    
            System.out.print("instructores["+(a)+"]= "); System.out.println(i.setCodigoInstructor()+" "+i.setNombre()+" "+i.setApellido()+" "+i.setTelefono()+" "+i.setDireccion());
            a++;
        }
    }
    public void buscarInstructores(){
        String buscador=null;
        int falso=0;
        do{
            System.out.println("Ingrese el codigo del instructor que desea buscar");
            buscador=bf.ingresarTexto();
            for (Instructor i: instructores){
                if(buscador.equals(i.setNombre())){
                    System.out.println("Dato encontrado");
                }else{
                    falso++;
                }
            }
            if(falso==instructores.size()){
                System.out.println("Dato no encontrado");
            }
            System.out.println("¿Desea seguir buscando Instructores?");
            opcion=bf.ingresarTexto();
            }while(opcion.equals("si"));
        
        }




}