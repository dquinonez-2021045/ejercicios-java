public class Operaciones{
	
	int primerNumero;
	int segundoNumero;
	char simbolo;
	int total;
	int valor;
	
	public int suma(int primerNumero,int segundoNumero){
		
			total=primerNumero+segundoNumero;
			return total;
	}
	public int resta(int primerNumero,int segundoNumero){
			
			total=primerNumero-segundoNumero;
			return total;
	}
	public int multiplicacion(int primerNumero,int segundoNumero){
			
			total=primerNumero*segundoNumero;
			return total;
	}
	public int division(int primerNumero,int segundoNumero){
			if(segundoNumero==0){
			System.out.println("Dato incorrecto");
			}else
				total=valor/segundoNumero;
				System.out.println("El total de la division es:"+total)
			return total;
	}	
	


}