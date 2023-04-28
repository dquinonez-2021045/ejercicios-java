public class ControladorPersona{
	Buffer buff=new Buffer();  
	Personas[] persona=new Personas[5];
	public void ingresarPersona(){
	
		persona[0]=new Personas("Juan","Avila",16,"m");
		persona[1]=new Personas("Carla","Archila",14,"f");
		persona[2]=new Personas("Rodrigo","Lopez",18,"m");
		persona[3]=new Personas("Pedro","Martinez",29,"m");
		persona[4]=new Personas("Maria","Rodriguez",25,"f");
	}
	public void reportPersona(){
		
		for(Personas p:persona){
			System.out.println(p.retornarNombre()+"  "+p.retornarApellido()+" "+p.retornarEdad()+" "+p.retornarSexo());
		}
	}
	public void modificarPersona(){
		int contador=0;
		int recorte;
		String newNombre;
		String newSexo;
		String newApellido;
		int newEdad;
		String encontrar;
		
		
			System.out.println("ingrese el nombre que desee modificar");
			encontrar=buff.ingresarNombre();
			for(Personas p:persona){
			if(encontrar.equals(p.retornarNombre())){
				System.out.println("si esta");
				System.out.println("Que quiere que modifique");
				System.out.println("1 nombre");
				System.out.println("2 apellido");
				System.out.println("3 edad");
				System.out.println("4 sexo");
				recorte=buff.ingresarEdad();
			switch(recorte){	
				case 1:

					System.out.println("Ha elegido editar el nombre de la persona");
					System.out.println("ponga el nuevo nombre");
					newNombre=buff.ingresarNombre();
					p.obtenerNombre(newNombre);
					break;

				case 2:

					System.out.println("Ha elegido editar apellido de la persona");
					System.out.println("ponga el nuevo apellido");
					newApellido=buff.ingresarNombre();
					p.obtenerApellido(newApellido);
					break;

				case 3:

					System.out.println("Ha elegido editar la edad de la persona");
					System.out.println("ponga la nueva edad");
					newEdad=buff.ingresarEdad();
					p.obtenerEdad(newEdad);
					break;

				case 4:

					System.out.println("Ha elegido editar el sexo de la persona");
					System.out.println("ponga el nuevo sexo");
					newSexo=buff.ingresarNombre();
					p.obtenerSexo(newSexo);
					break;
					default:
					System.out.println("Error");
					break;

			}

				break;

			}else{

				contador++;
			}	
	
		}

		if(contador==5){
			System.out.println("No existe el nombre");
	}
}
}