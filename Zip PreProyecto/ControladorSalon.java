package com.angel.controlador;
import com.angel.modelo.*;
import java.util.ArrayList;
public class ControladorSalon{
    Datos bf=new Datos();
    Salon Salon;
    ArrayList<Salon> salones=new ArrayList<>();
    int codigoSalon=0;
    String nombre;
    int cantidad;
    int a=0;
    String opcion;
    public void ingresarSalon(){
        do{
        System.out.println("Ingrese los datos del Salon");
        System.out.println("-----------------------------------");
        codigoSalon++;
        System.out.println("Nombre");
        nombre=bf.ingresarTexto();
        System.out.println("Cantidad");
        cantidad=bf.ingresarNumero();
        System.out.println("-----------------------------------");
        salones.add(new Salon(codigoSalon,nombre,cantidad));
        System.out.println("Desea seguir ingresando datos");
        opcion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        }while(opcion.equals("si"));
        System.out.println("Indice:     codigoSalon--Nombre--Cantidad");
        System.out.println("-----------------------------------");
        for(Salon i: salones){    
            System.out.print("salones["+(a)+"]= "); System.out.println(i.setCodigoSalon()+" "+i.setNombre()+" "+i.setCantidad());
            a++;
        }
    }
    public void buscarSalon(){
        String buscador= null;
        int falso=0;
        do{
            System.out.println("Ingrese el codigo del salon que desea buscar");
            buscador=bf.ingresarTexto();
            for (Salon i: salones){
                if(buscador.equals(i.setNombre())){
                    System.out.println("Dato encontrado");
                }else{
                    falso++;
                }
            }
            if(falso==salones.size()){
                System.out.println("Dato no encontrado");
            }
            System.out.println("¿Desea seguir buscando salones?");
            opcion=bf.ingresarTexto();
            }while(opcion.equals("si"));
        
        }



}