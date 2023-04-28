public class Calculadora{
	public static void main(String args[]){
		System.out.println("Coloque el simbolo + para sumar");
		System.out.println("Coloque el simbolo - para restar");
		System.out.println("Coloque el simbolo / para dividir");
		System.out.println("Coloque el simbolo * para multiplicar");
		int numero;
		int numero2;
		int total;
		char simbolo='*';
		numero=10;
		numero2=45;
		
		
		switch(simbolo){
			case '+':
			System.out.println("ha escogido +");
			total=numero+numero2;
			System.out.println("el resultado es: "+ total);
			break;
			case '*':
			System.out.println("ha escogido *");
			total=numero*numero2;
			System.out.println("el resultado es: "+ total);
			break;
			case '/':
			System.out.println("ha escogido /");
			total=numero/numero2;
			System.out.println("el resultado es: "+ total);
			break;
			case '-':
			System.out.println("ha escogido -");
			total=numero-numero2;
			System.out.println("el resultado es: "+ total);
			break;
			
			
		}
		
	}
}