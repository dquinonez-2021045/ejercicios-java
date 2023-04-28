public class Menupersona{
    Persona p= new Persona();
    Datos bf=new Datos();
    Controladorpersona cPersona=new Controladorpersona();
    int opcion;
    String decision;
    public void menuPrincipal(){
    do{   
        do{ 
    System.out.println("-------------------------------------");        
    System.out.println("Menu de acciones");
    System.out.println("1...... Ingresar persona");
    System.out.println("2...... Modificar persona");
    System.out.println("3...... Reporte de persona");
    System.out.println("4...... Para salir");
    System.out.println("-------------------------------------"); 
    opcion=bf.ingresarNumero();
    }while(opcion>4 || opcion <1 );
    switch (opcion) {
        case 1:
            System.out.println("***************************************");
            System.out.println("Eligio Ingresar Personas"); 
            cPersona.ingresarPersonas();
            break;
        case 2:
            System.out.println("***************************************");
            System.out.println("Eligio Modificar Personas");
            cPersona.modificarPersonas();
            cPersona.reportePersonas();
            break;
        case 3:
            System.out.println("***************************************");
            System.out.println("Eligio Reporte de Personas");
            cPersona.reportePersonas();
            break;
        default:
            System.exit(1);
        }
    
    }while(opcion!=4);

    }

}