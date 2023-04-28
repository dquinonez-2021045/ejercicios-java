public class Controladorpersona{
    Datos bf=new Datos();
    Persona pe=new Persona();
    Persona persona;
    String nombre;
    String apellido;
    int edad;
    char sexo;
    int i;
    int y;
    //Declarando arreglo
    Persona p[]=new Persona[5];
        //Ingreso de personas
        public void ingresarPersonas(){
        System.out.println("Ingresa tus datos como se muestra en pantalla");
        System.out.println("Ejemplo: Riquelme");
        System.out.println("Ejemplo: Gonzalez");
        System.out.println("Ejemplo: 17");
        System.out.println("Ejemplo: M");
        System.out.println("***************************************");
        System.out.println("Ingresa tus datos");
        System.out.println("***************************************");
        for (int i=0; i<p.length; i++){  
        System.out.println("p["+(i)+"]=");
        System.out.print("Nombre: ");nombre=bf.ingresarTexto();
        System.out.print("Apellido: ");apellido=bf.ingresarTexto();
        System.out.print("Edad: ");edad=bf.ingresarNumero();
        System.out.print("Sexo: ");sexo=bf.ingresarSigno();
        System.out.println("***************************************");
        p[i]=new Persona(nombre,apellido,edad,sexo);
        }
        }

       //Reporte de personas
        public void reportePersonas(){  
            int a=0;
            System.out.println("El numero de elementos que se encuentran en el arreglo son: " +p.length);
            for(Persona i:p){
            System.out.print("p["+(a)+"]= "); System.out.println(i.retornarNombre()+" "+i.retornarApellido()+" "+i.retornarEdad()+" "+i.retornarSexo());
            a++;
        }
    }
               
        //Buscar personas
        public void modificarPersonas(){
            String buscar=null;
            int datomodificar; 
            int falso=0;
            String nuevoNombre;
            String nuevoApellido;
            int nuevaEdad;
            char nuevoSexo;
            System.out.println("Ingrese el nombre de la persona que desea buscar");
            buscar=bf.ingresarTexto();
            for (Persona i: p){
            if(buscar.equals(i.retornarNombre())){
                System.out.println("Dato encontrado");
                System.out.println("***************************************");
                System.out.println("Elija el dato el cual desea modificar");
                System.out.println("1.... Nombre");
                System.out.println("2.... Apellido");
                System.out.println("3.... Edad");
                System.out.println("4.... Sexo");
                System.out.println("***************************************");
                datomodificar=bf.ingresarNumero();
                switch (datomodificar) {
                    case 1:
                    System.out.println("El dato a modificar es el Nombre");
                    System.out.println("Ingrese el nuevo dato para el Nombre");
                    nuevoNombre=bf.ingresarTexto();
                    i.obtenerNombre(nuevoNombre);
                    break;
                    case 2:
                    System.out.println("El dato a modificar es el Apellido");
                    System.out.println("Ingrese el nuevo dato para el Apellido");
                    nuevoApellido=bf.ingresarTexto();
                    i.obtenerApellido(nuevoApellido);
                    break;
                    case 3:
                    System.out.println("El dato a modificar es la Edad");
                    System.out.println("Ingrese el nuevo dato para la Edad");
                    nuevaEdad=bf.ingresarNumero();
                    i.obtenerEdad(nuevaEdad);
                    break;
                    case 4:
                    System.out.println("El dato a modificar es el Sexo");
                    System.out.println("Ingrese el nuevo dato para el Sexo");
                    nuevoSexo=bf.ingresarSigno();
                    i.obtenerSexo(nuevoSexo);
                    break;
                
                    default:
                    System.out.println("El dato elegido es erroneo");
                        break;
                }
                break;
            }else{
                falso++;
            }
        }
        System.out.println("***************************************");
        if(falso==p.length){
            System.out.println("Dato no encontrado");
        }
    }
}
