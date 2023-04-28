public class Calculadora{

	int primerNumero;
	int segundoNumero;
	char simbolo;
	int total;
	public void Calc(char simbolo,int a,int b){
	primerNumero=a;
	segundoNumero=b;
	}
	
	public int suma(int a,int b){
		
			total=a+b;
			System.out.println("El resultado de la suma es: "+total);
			return total;
			
	}
	public int resta(int a,int b){
			
			total=a-b;
			System.out.println("El resultado de la resta es: "+total);
			return total;
			
	}
	public int multiplicacion(int a,int b){
			
			total=a*b;
			System.out.println("El resultado de la multiplicacion es: "+total);
			return total;
			
	}
	public int division(int a,int b){
			if(b==0){
			System.out.println("Dato incorrecto");
	}else{
				total=a/b;
				System.out.println("El resultado de la division es: "+total);
	}
			return total;
	}	
	


}