public class Principal{
	public static void main(String args[]){
	 
		int totalSuma;
		int totalResta;
		int totalMultiplicacion;
		int totalDivision;
		char simbolo= '*';
		
		//Suma
		Operaciones op=new Operaciones();
		
		System.out.println("1....para suma");
		System.out.println("2....para resta");
		System.out.println("3....para multiplicacion");
		System.out.println("4....para division");
		switch(simbolo){
			case '+':
			totalSuma=op.suma(1,5);
			System.out.println("El total de suma es: "+totalSuma);
			break;
			case '-':
			
			totalResta=op.resta(9,10);
			System.out.println("El total de la suma es: "+totalResta);
			break;
			
			case '*':
			totalMultiplicacion=op.multiplicacion(5,5);
			System.out.println("El total de la multiplicacion es: "+totalMultiplicacion);
			break;
			case '/':
				op.division(40,5);
			
			totalDivision=op.division(4,6);
			System.out.println("El total de la division es: "+totalDivision);
			break;
		}
	}
		
		
		
	}
