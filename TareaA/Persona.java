public class Persona{
	String nombre;
	String apellido;
	int edad;
	
	
	public Persona(String n, String a, int e){
		nombre=n;
		apellido=a;
		edad=e;
	}
	
	public String retornarNombre(){
		return nombre;
	}
	
	public String retornarApellido(){
		return apellido;
	}
	
	public int retornarEdad(){
		return edad;
	}
	
	public void obtenerNombre(String n){
		nombre=n;
	}
	
	public void obtenerApellido(String a){
		apellido=a;
	}
	
	public void obtenerEdad(int e){
		edad=e;
	}
	
}