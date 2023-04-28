public class MenuPrincipal{
	public static void main(String args[]){
	Datos dato=new Datos();
	ControladorPersona cPersona=new ControladorPersona();

	int numero=0;
	
		
		
	System.out.println("1...Ingresar Persona");
	System.out.println("2...Modificar Persona");
	System.out.println("3...Reporte Persona");
	System.out.println("Opcion a elegir");
	numero=dato.ingresarNumero();
		
		switch(numero){
			
			case 1:
			System.out.println("Personas");
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			break;
				
			case 2:
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			System.out.println("Persona que desea modificar");
			
			break;
				
				
			case 3:
			cPersona.reportePersona();
			break;
				
					
		}
	}
}