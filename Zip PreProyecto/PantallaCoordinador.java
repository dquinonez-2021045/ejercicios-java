package com.angel.vista;
import com.angel.controlador.*;
public class PantallaCoordinador{
    Datos bf=new Datos();
    LoginProyecto login=new LoginProyecto();
    ControladorInstructor instructor=new ControladorInstructor();
    ControladorMateria materia=new ControladorMateria();
    ControladorSalon salon=new ControladorSalon();
    int opcion;
    int decision;
    int eleccion;
    public void menuCoordinador(){
        do{   
            do{ 
        System.out.println("-------------------------------------");        
        System.out.println("Menu de Coordinador");
        System.out.println("1...... Materia");
        System.out.println("2...... Instructores");
        System.out.println("3...... Salir");
        System.out.println("-------------------------------------"); 
        opcion=bf.ingresarNumero();
        }while(opcion>5|| opcion <1 );
        switch (opcion){
            case 1:
            this.menuMaterias();
            break;
            case 2:
            this.menuInstructor();
            break;
            case 3:
            System.out.println("Saliendo");
            break;
            default:
            System.out.println("Opcion incorrecta");
            }

        }while(opcion!=4);
    }
    public void menuMaterias(){
        do{   
            do{ 
            System.out.println("-------------------------------------");        
            System.out.println("Menu de acciones");
            System.out.println("1...... Crear Materias");
            System.out.println("3...... Salir al Menu Principal");
            System.out.println("-------------------------------------"); 
            decision=bf.ingresarNumero();
            }while(decision>2|| decision <1 );
            switch (decision) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("Eligio Ingresar Materias"); 
                    materia.ingresarMateria();
                    break;
                case 2:
                    System.out.println("Saliendo hacia el menu principal");
                    this.menuCoordinador();
                    break;
                    default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(decision!=2);
    }
    public void menuInstructor(){ 
        do{   
            do{ 
        System.out.println("-------------------------------------");        
        System.out.println("Menu de acciones");
        System.out.println("1...... Crear Instructores");
        System.out.println("2...... Salir al Menu Principal");
        System.out.println("-------------------------------------"); 
        eleccion=bf.ingresarNumero();
        }while(eleccion>2|| eleccion <1 );
        switch (eleccion) {
            case 1:
                System.out.println("-------------------------------------");
                System.out.println("Eligio Ingresar Personas"); 
                instructor.ingresarInstructor();
                break;
            case 2:
                System.out.println("Saliendo hacia el menu principal");
                this.menuCoordinador();
                break;
            default:
            System.out.println("Opcion incorrecta");
                break;
            }
        }while(eleccion!=2);
        }
}
