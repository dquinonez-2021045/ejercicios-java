package com.angel.controlador;
import com.angel.modelo.*;
import java.util.ArrayList;
public class ControladorMateria{
    Datos bf=new Datos();
    Materia Materia;
    ArrayList<Materia> materias=new ArrayList<>();
    int codigoMateria;
    String nombre;
    String descripcion;
    String opcion;
    int a=0;
    public void ingresarMateria(){
        do{
        System.out.println("Ingrese los datos de la Materia");
        System.out.println("-----------------------------------");
        codigoMateria++;
        System.out.println("Nombre");
        nombre=bf.ingresarTexto();
        System.out.println("Descripcion");
        descripcion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        materias.add(new Materia(codigoMateria,nombre,descripcion));
        System.out.println("Desea seguir ingresando datos");
        opcion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        }while(opcion.equals("si"));
        System.out.println("Indice:     codigoMateria--Nombre--Descripcion");
        System.out.println("-----------------------------------");
        for(Materia i: materias){    
            System.out.print("materias["+(a)+"]= "); System.out.println(i.setCodigoMateria()+" "+i.setNombre()+" "+i.setDescripcion());
            a++;
        }
    }
    public void buscarMaterias(){
        String buscador= null;
        int falso=0;
        do{
            System.out.println("Ingrese el codigo de la materia que desea buscar");
            buscador=bf.ingresarTexto();
            for (Materia i: materias){
                if(buscador.equals(i.setNombre())){
                    System.out.println("Dato encontrado");
                }else{
                    falso++;
                }
            }
            if(falso==materias.size()){
                System.out.println("Dato no encontrado");
            }
            System.out.println("¿Desea seguir buscando salones?");
            opcion=bf.ingresarTexto();
            }while(opcion.equals("si"));
        
        }



}