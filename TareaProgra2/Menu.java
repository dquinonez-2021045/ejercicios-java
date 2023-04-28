public class Menu{
	public static void main(String args[]){
	
	Buffer buff=new Buffer();
	ControladorPersona cPersona=new ControladorPersona();
	//variables
	
	char menu;
	//menu
	System.out.println("1..... Ingresar persona");
	System.out.println("2..... Modificar persona");
	System.out.println("3..... Reporte persona");
	System.out.println("Ingrese la opcion que desea ver");
	menu=buff.ingresarSigno();
	//switch de menu
	switch(menu){
		
		case '1':
			System.out.println("--------------------------");
			System.out.println("Ha escogido la opcion para ingresar persona");
			cPersona.ingresarPersona();
			break;
		case '2':
			cPersona.ingresarPersona();
			System.out.println("--------------------------");
			System.out.println("Ha escogido la opcion de modificar persona");
			cPersona.modificarPersona();
			
			cPersona.reportePersona();
			break;
			
		case '3':
			System.out.println("---------------------------");
			System.out.println("Ha escogida la opcion de reporte de persona");
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			break;
			default:
	
	
	
	


	}
	}
}