package com.angel.vista;
import com.angel.controlador.*;
public class PantallaDirector{
    Datos bf=new Datos();
    ControladorUsuario usuario=new ControladorUsuario();
    ControladorInstructor instructor=new ControladorInstructor();
    ControladorMateria materia=new ControladorMateria();
    ControladorSalon salon=new ControladorSalon();
    int opcion;
    int op;
    int eleccion;
    int decision;
    int elegir;
    public void menuPrincipal(){
        do{   
            do{ 
        System.out.println("-------------------------------------");        
        System.out.println("Menu de Director");
        System.out.println("1...... Usuarios");
        System.out.println("2...... Instructores");
        System.out.println("3...... Materias");
        System.out.println("4...... Salones");;
        System.out.println("5...... Salir");
        System.out.println("-------------------------------------"); 
        opcion=bf.ingresarNumero();
        }while(opcion>5|| opcion <1 );
        switch (opcion){
            case 1:
            this.menuUsuario();
            break;
            case 2:
            this.menuInstructores();
            break;
            case 3:
            this.menuMaterias();
            break;
            case 4:
            this.menuSalones();
            break;
            case 5: 
            System.out.println("Saliendo");
            break;
            }

        }while(opcion!=5);
    }
    public void menuUsuario(){ 
        ControladorUsuario usuario=new ControladorUsuario();
    do{   
        do{ 
    System.out.println("-------------------------------------");        
    System.out.println("Menu de acciones");
    System.out.println("1...... Ingresar Usuarios");
    System.out.println("2...... Buscar Usuarios");
    System.out.println("3...... Salir al Menu Principal");
    System.out.println("-------------------------------------"); 
    op=bf.ingresarNumero();
    }while(op>3|| op <1 );
    switch (op) {
        case 1:
            System.out.println("-------------------------------------");
            System.out.println("Eligio Ingresar Personas"); 
            usuario.ingresarUsuario();
            break;
        case 2:
            System.out.println("-------------------------------------");
            System.out.println("Eligio Buscar Personas");
            usuario.buscarUsuario();
            break;
        case 3:
            System.out.println("Saliendo hacia el menu principal");
            this.menuPrincipal();
            break;
        default:
            System.out.println("Opcion ingresada erronea");
            System.exit(1);
            break;
            }
        }while(op!=3);
    }
    public void menuInstructores(){ 
        do{   
            do{ 
        System.out.println("-------------------------------------");        
        System.out.println("Menu de acciones");
        System.out.println("1...... Ingresar Instructores");
        System.out.println("2...... Buscar Instructores");
        System.out.println("3...... Salir al Menu Principal");
        System.out.println("-------------------------------------"); 
        eleccion=bf.ingresarNumero();
        }while(eleccion>3|| eleccion <1 );
        switch (eleccion) {
            case 1:
                System.out.println("-------------------------------------");
                System.out.println("Eligio Ingresar Personas"); 
                instructor.ingresarInstructor();
                break;
            case 2:
                System.out.println("-------------------------------------");
                System.out.println("Eligio Buscar Personas");
                instructor.buscarInstructores();
                break;
            case 3:
            System.out.println("Saliendo hacia el menu principal");
            this.menuPrincipal();
                break;
            default:
                System.exit(1);
                break;
            }
        }while(eleccion!=3);
        }
    public void menuMaterias(){
        do{   
            do{ 
            System.out.println("-------------------------------------");        
            System.out.println("Menu de acciones");
            System.out.println("1...... Ingresar Materias");
            System.out.println("2...... Buscar Materias");
            System.out.println("3...... Salir al Menu Principal");
            System.out.println("-------------------------------------"); 
            decision=bf.ingresarNumero();
            }while(decision>3|| decision <1 );
            switch (decision) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("Eligio Ingresar Materias"); 
                    materia.ingresarMateria();
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("Eligio Buscar Materias");
                    materia.buscarMaterias();
                    break;
                case 3:
                    System.out.println("Saliendo hacia el menu principal");
                    this.menuPrincipal();
                    break;
                    default:
                    System.exit(1);
                        break;
            }
        }while(decision!=3);
    }
    public void menuSalones(){
    do{   
        do{ 
    System.out.println("-------------------------------------");        
    System.out.println("Menu de acciones");
    System.out.println("1...... Ingresar Salones");
    System.out.println("2...... Buscar Salones");
    System.out.println("3...... Salir al Menu Principal");
    System.out.println("-------------------------------------"); 
    elegir=bf.ingresarNumero();
    }while(elegir>3|| elegir <1 );
    switch (elegir) {
        case 1:
            System.out.println("-------------------------------------");
            System.out.println("Eligio Ingresar Salones"); 
            salon.ingresarSalon();
            break;
        case 2:
            System.out.println("-------------------------------------");
            System.out.println("Eligio Buscar Salones");
            salon.buscarSalon();
            break;
        case 3:
        System.out.println("Saliendo hacia el menu principal");
        break;
        default:
            System.exit(1);
            break;
        }
    
    }while(elegir!=3);
    }
}