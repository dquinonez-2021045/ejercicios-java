public class PersonaObjeto{
   public static void main (String args[]){
	   String nombre;
	   String apellido;
	   int edad;
    Persona objetoPersona=new Persona ("Pedro","Santana");
    String nombrePersona;
    String apellidoPersona;
   
    nombrePersona=objetoPersona.retornarNombre();
    System.out.println("******Primera Persona*****");
    System.out.println("El nombre de la persona es: "+nombrePersona);
    apellidoPersona=objetoPersona.retornarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
   
 
    System.out.println("+++++++++++++Segunda Persona+++++++++++++");
    Persona objetoPersona2=new Persona ("David","Quiñonez");
    nombrePersona=objetoPersona2.retornarNombre();
    System.out.println("El nombre de la persona es: "+nombrePersona);
    apellidoPersona=objetoPersona2.retonarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
  
  
    System.out.println("+++++++++++++Tercera Persona+++++++++++++");
    Persona objetoPersona3=new Persona ("Jose","Herrera");
    nombrePersona=objetoPersona3.retornarNombre();
    System.out.println("El nombre de la persona es: "+nombrePersona);
    apellidoPersona=objetoPersona3.retornarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);

    System.out.println("+++++++++++++Cuarta Persona+++++++++++++");
    Persona objetoPersona4=new Persona ("Mario","Herrera");
    nombrePersona=objetoPersona4.retornarNombre();
    System.out.println("El nombre de la persona es: "+nombrePersona);
    apellidoPersona=objetoPersona4.retornarApellido();
    System.out.println("El apellido de la persona es: "+apellidoPersona);
 

   }    
    
}