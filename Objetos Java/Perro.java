public class Perro{	
	String nombre="Pancito";
	int edad=9;
	char sexo='M';
	
	public Perro(String n,int e,char s){
		nombre=n;
		edad=e;
		sexo=s;
	}
	
		
		
	

	public int retornarEdad(){
		return edad;
	
	}
	public String retornarNombre(){
		return nombre;
	}
	public char retornarSexo(){
		return sexo;
	}	
	public void ladrar(){
		System.out.println("Estoy ladrado");
	}
	public void comer(){
		System.out.println("Estoy comiendo");
	}
	public void dormir(){
			System.out.println("Estoy durmiendo");
	}
	
	
}