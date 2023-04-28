public class Personas{
	public static void main(String args[]){
		Persona persona1=new Persona("Juan","Rodriguez",32);
		Persona persona2=new Persona("Luiz","Lopez",23);
		Persona persona3=new Persona("Alberta","Martinez",40);
		
		String nombre;
		String apellido;
		int edad;
		nombre=persona1.retornarNombre();
		apellido=persona1.retornarApellido();
		edad=persona1.retornarEdad();
		System.out.println("El nombre de la persona 1 es: "+persona2.retornarNombre());
		System.out.println("El apellido de la persona 1 es: "+persona2.retornarApellido());
		System.out.println("La edad de la persona 1 es: "+persona2.retornarEdad());
		
		nombre=persona2.retornarNombre();
		apellido=persona2.retornarApellido();
		edad=persona2.retornarEdad();
		System.out.println("El nombre de la persona 2 es: "+persona2.retornarNombre());
		System.out.println("El apellido de la persona 2 es: "+persona2.retornarApellido());
		System.out.println("La edad de la persona 2 es: "+persona2.retornarEdad());
		
		nombre=persona3.retornarNombre();
		apellido=persona3.retornarApellido();
		edad=persona3.retornarEdad();
		System.out.println("El nombre de la persona 3 es: "+persona2.retornarNombre());
		System.out.println("El apellido de la persona 3 es: "+persona2.retornarApellido());
		System.out.println("La edad de la persona 3 es: "+persona2.retornarEdad());
	}
}