package com.angel.controlador;
import com.angel.modelo.*;
import com.angel.vista.PantallaDirector;
import com.angel.vista.PantallaCoordinador;
import java.util.ArrayList;
public class ControladorUsuario{
    Usuario usuario;
    Usuario usuario1=new Usuario(0, "admin", "1234", "Director");
    Usuario usuario2= new Usuario(1, "usuario", "1234", "Coordinador");
    Datos bf=new Datos();
    ArrayList<Usuario> usuarios=new ArrayList<>();
    int idUsuario=1;
    String nombre;
    String code;
    String rol;
    String opcion;
    String buscador;
    int a=0;
    public void ingresarUsuario(){
        do{
        System.out.println("Ingrese los datos del usuario");
        System.out.println("-----------------------------------");
        idUsuario++;
        System.out.println("Nombre");
        nombre=bf.ingresarTexto();
        System.out.println("Clave");
        code=bf.ingresarTexto();
        System.out.println("Rol");
        rol=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        usuarios.add(new Usuario(idUsuario,nombre,code,rol));
        System.out.println("Desea seguir ingresando datos");
        opcion=bf.ingresarTexto();
        System.out.println("-----------------------------------");
        }while(opcion.equals("si"));
        System.out.println("Indice:     Id--Nombre--Clave--Rol");
        System.out.println("-----------------------------------");
        for(Usuario i: usuarios){    
            System.out.print("usuarios["+(a)+"]= "); System.out.println(i.setIdUsuario()+" "+i.setNombre()+" "+i.setClave()+" "+i.setRol());
            a++;
        }
    }
    public void buscarUsuario(){
    String buscador=null;
    int falso=0;
    do{
        System.out.println("Ingrese el id de la persona que desea buscar");
        buscador=bf.ingresarTexto();
        for (Usuario i: usuarios){
            if(buscador.equals(i.setNombre())){
                System.out.println("Dato encontrado");
            }else{
                falso++;
            }
        }
        if(falso==usuarios.size()){
            System.out.println("Dato no encontrado");
        }
        System.out.println("¿Desea seguir buscando personas?");
        opcion=bf.ingresarTexto();
        }while(opcion.equals("si"));
    
    }
}