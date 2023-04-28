public class Principal{

	public static void main(String args[]){
	//objetos
	Buffer Ingreso=new Buffer();
	Calculadora Ope=new Calculadora();
	Fibonacci Fibo=new Fibonacci();
	Tablas Tab=new Tablas();
	//variables
	int a;
	int b;
	char simbolo;
	int total;
	char menu;
	//Menu de operaciones
	System.out.println("----Bienvenido al menu de operaciones----");
	System.out.println("1...... Tablas de Multiplicar");
	System.out.println("2...... Fibanacci");
	System.out.println("3...... Calculadora");
	System.out.println("Ingrese la opcion que desea observar");
	menu=Ingreso.ingresarSigno();
	switch(menu){
		//Submenu de tablas de multiplicacion
		case '1':
			System.out.println("****************************");
			System.out.println("Ha escogido Tablas de Multiplicar");
			System.out.println("Ingrese el primer valor para la tabla");
			a=Ingreso.ingresarValor();
			System.out.println("Ingrese el limite para la tabla");
			b=Ingreso.ingresarValor();
			System.out.println("El resultado de la tabla es:");
			System.out.println("****************************");
			Tab.Multi(a,b);
			break;
			//Submenu de Fibonacci
		case '2':
			System.out.println("****************************");
			System.out.println("Ha escogido Fibonacci");
			System.out.println("Ingrese las interaciones que desee para fibonacci");
			a=Ingreso.ingresarValor();
			System.out.println("****************************");
			System.out.println("El resultado de la serie de Fibonacci es");
			Fibo.Serie(a);
			break;
			//Submenu de Calculadora
		case '3':
			System.out.println("****************************");
			System.out.println("Ha escogido Calculadora");
			System.out.println("Menu");
			System.out.println("ingrese + para suma ");
			System.out.println("ingrese - para resta");
			System.out.println("ingrese * para multiplicacion");
			System.out.println("ingrese / para division");
			System.out.println("Ingrese el simbolo que desee operar");
			simbolo=Ingreso.ingresarSigno();
			System.out.println("ingrese el primer valor");
			a=Ingreso.ingresarValor();
			System.out.println("ingrese el segundo valor");
			b=Ingreso.ingresarValor();
		switch(simbolo){
			//switch de simbolo
			case '+':
				System.out.println("****************************");
				System.out.println("Ha escogido suma");
				Ope.suma(a,b);
				break;
			case '-':
				System.out.println("****************************");
				System.out.println("Ha escogido resta");
				Ope.resta(a,b);
				break;
				
			case '*':
				System.out.println("****************************");
				System.out.println("Ha escogido multiplicacion");
				Ope.multiplicacion(a,b);
				break;
			case '/':
				System.out.println("****************************");
				System.out.println("Ha escogido division");
				Ope.division(a,b);
				break;
			default:
			System.out.println("El simbolo o valor ingresado es erroneo");
		}
		break;
		default:
		System.out.println("El simbolo o valor ingresado es erroneo");
			
	
	}
	
	

	}
}