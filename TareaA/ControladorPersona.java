public class ControladorPersona{
	
	Persona persona;
	Persona[] personas=new Persona[5];
	
	public void ingresarPersona(){
		
		personas[0]=new Persona("Anthony","Acabal",15);
		personas[1]=new Persona("Josue","Perez",17);
		personas[2]=new Persona("Maria","Morales",20);
		personas[3]=new Persona("David","Quinonez",13);
		personas[4]=new Persona("Renata","Galindo",32);
		
		
	}
	
	public void reportePersona(){
		System.out.println("Mostrando Datos");
		for(Persona i:personas){
			System.out.println(i.retornarNombre()+"  "+i.retornarApellido()+" "+i.retornarEdad());
		}
		
	}
	
	public void modificarPersona(String nombre){
		personas[4].obtenerNombre(nombre);

	}
		
	
}