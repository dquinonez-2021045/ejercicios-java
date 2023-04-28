public class Menu{
	Buffer buff=new Buffer();
	ControladorPersona cPersona=new ControladorPersona();
	//variables
	public void menuTarea(){
	char menu;
	//menu
	System.out.println("--------------------------------------------------");
	System.out.println("1..... Ingresar persona");
	System.out.println("2..... Modificar persona");
	System.out.println("3..... Reporte persona");
	System.out.println("--------------------------------------------------");
	System.out.println("Ingrese la opcion que desea ver");
	System.out.println("--------------------------------------------------");
	menu=buff.ingresarSigno();
	//switch de menu
	switch(menu){
		
		case '1':
			System.out.println("--------------------------------------------------");
			System.out.println("Ha escogido la opcion para ingresar persona");
			System.out.println("--------------------------------------------------");
			cPersona.ingresarPersona();
			System.out.println("                                                 ");
			System.out.println("Estos son los usuarios que estan registrados:");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			System.out.println("--------------------------------------------------");
			break;
		case '2':
			cPersona.ingresarPersona();
			System.out.println("--------------------------------------------------");
			System.out.println("                                                  ");
			System.out.println("Ha escogido la opcion de modificar persona");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			System.out.println("--------------------------------------------------");
			System.out.println("Estas son las personas que puede modificar");
			System.out.println("                                                  ");
			cPersona.modificarPersona();
			cPersona.reportePersona();
			break;
			
		case '3':
			System.out.println("--------------------------------------------------");
			System.out.println("                                                  ");
			System.out.println("Ha escogida la opcion de reporte de persona");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			cPersona.ingresarPersona();
			cPersona.reportePersona();
			break;
			default:
	
	
	
	
		}
	}
	
}