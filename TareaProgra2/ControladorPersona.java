public class ControladorPersona{
	 
	Persona[] persona=new Persona[5];
	Buffer bf=new Buffer(); 
	public void ingresarPersona(){
	
		persona[0]=new Persona("David","Quinonez",16,"masculino");
		persona[1]=new Persona("Lia","Davila",14,"femenino");
		persona[2]=new Persona("Carlos","Pedraza",25,"masculino");
		persona[3]=new Persona("Juan","Rodriguez",19,"masculino");
		persona[4]=new Persona("Rebecca","Menendez",17,"femenino");
	}
	public void reportePersona(){
		
		for(Persona p:persona){
			System.out.println(p.retornarNombre()+"  "+p.retornarApellido()+" "+p.retornarEdad()+" "+p.retornarSexo());
		}
	}
	public void modificarPersona(){
		int contador=0;
		int opcion;
		String nNombre;
		String nSexo;
		String nApellido;
		int nEdad;
		String buscar;
		
		for(Persona p:persona){
			System.out.println("ingrese el nombre que desee modificar");
			buscar=bf.ingresarNombre();
			if(buscar.equals(p.retornarNombre())){
				System.out.println("si existe");
				System.out.println("Que quiere modificar");
				System.out.println("-------------------------");
				System.out.println("1-nombre");
				System.out.println("2-apellido");
				System.out.println("3-edad");
				System.out.println("4-sexo");
				opcion=bf.ingresarEdad();
			switch(opcion){	
				case 1:
					System.out.println("Ha escogido editar nombre");
					System.out.println("-----");
					System.out.println("Ingrese el nuevo nombre");
					nNombre=bf.ingresarNombre();
					p.obtenerNombre(nNombre);
					
					break;
				case 2:
					System.out.println("Ha escogido editar apellido");
					System.out.println("-----");
					System.out.println("Ingrese el nuevo apellido");
					nApellido=bf.ingresarNombre();
					p.obtenerApellido(nApellido);
					break;
				case 3:
					System.out.println("Ha escogido editar la edad");
					System.out.println("-----");
					System.out.println("Ingrese la nueva edad");
					nEdad=bf.ingresarEdad();
					p.obtenerEdad(nEdad);
					break;
				case 4:
					System.out.println("Ha elegido editar el sexo");
					System.out.println("-----");
					System.out.println("Ingrese el nuevo sexo");
					nSexo=bf.ingresarNombre();
					p.obtenerSexo(nSexo);
					break;
					default:
					System.out.println("ERROR");
					break;
			}
				break;
			}else{
				contador++;
			}		
		}
		if(contador==5){
			System.out.println("No existe el usuario");
	}
}
}