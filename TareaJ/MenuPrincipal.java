public class MenuPrincipal{
	Buffer buff=new Buffer();
	ControladorPersona contPersona=new ControladorPersona();

	public void menuTarea(){
	char menu;

	System.out.println("1 Ingresar persona");
	System.out.println("2 Modificar persona");
	System.out.println("3 Reporte persona");
	System.out.println("Ingrese la opcion que desee");
	menu=buff.ingresarE();


	switch(menu){
		
		case '1':

			System.out.println(" escogio ingresar persona");
			contPersona.ingresarPersona();
			break;

		case '2':

			contPersona.ingresarPersona();
			System.out.println(" escogio modificar persona");
			
			contPersona.modificarPersona();
			contPersona.reportPersona();
			break;
			
		case '3':

			System.out.println("escogio reporte de persona");
			contPersona.ingresarPersona();
			contPersona.reportPersona();
			break;
			default:
	
		}
	}
	
}