public class Example{
	public static void main(String args[]){
		
		int edadPerro;
		String nombrePerro;
		char sexoPerro;
		//primer objeto
		Perro objetoPerro=new Perro("Pancito",9,'M');
		
		edadPerro=objetoPerro.retornarEdad();
		nombrePerro=objetoPerro.retornarNombre();
		sexoPerro=objetoPerro.retornarSexo();
		
		System.out.println("La edad del perro es :"+ edadPerro);
		System.out.println("EL nombre del perro es: "+ nombrePerro);
		System.out.println("el sexo del perro es: "+ sexoPerro);
		
		objetoPerro.ladrar();
		System.out.println("***********Segundo perro***********");
		
		//segundo objeto perro
		Perro objetoPerro2=new Perro("Manchas",2,'H');
		nombrePerro=objetoPerro2.retornarNombre();
		sexoPerro=objetoPerro.retornarSexo();
		edadPerro=objetoPerro.retornarEdad();
		
		System.out.println("El nombre del segundo perro es: "+ nombrePerro);
		System.out.println("La edad del segundo perro es :"+ edadPerro);
		System.out.println("el sexo del segundo perro es: "+ sexoPerro);
		
		System.out.println("***********Tercer perro***********");
		//Tercer perro
		Perro objetoPerro3=new Perro("Manias",5,'M');
		nombrePerro=objetoPerro3.retornarNombre();
		sexoPerro=objetoPerro3.retornarSexo();
		edadPerro=objetoPerro3.retornarEdad();
		
		System.out.println("El nombre del tercer perro es: "+ nombrePerro);
		System.out.println("La edad del tercer perro es :"+ edadPerro);
		System.out.println("el sexo del tercer perro es: "+ sexoPerro);
		
		objetoPerro3.comer();
		
		System.out.println("***********cuarto perro***********");
		//cuarto perro
		Perro objetoPerro4=new Perro("Manitad",8,'h');
		nombrePerro=objetoPerro4.retornarNombre();
		sexoPerro=objetoPerro4.retornarSexo();
		edadPerro=objetoPerro4.retornarEdad();
		
		System.out.println("El nombre del cuarto perro es: "+ nombrePerro);
		System.out.println("La edad del cuarto perro es :"+ edadPerro);
		System.out.println("el sexo del cuarto perro es: "+ sexoPerro);
	
		objetoPerro4.dormir();
	}
	
	
}