public class Fibonacci{
	
		int numero=0;
		int contador=2;
		int numero2=1;
		int total=0;
		int total2=0;
		int interaciones;
		public int Serie(int a){
		interaciones=a;
		System.out.println(total2);
		while(contador<=a){
			total2=numero+numero2;
			contador=contador+1;
			numero=numero2;
			numero2=total;
			total=numero2+numero;
			System.out.println(total);
		
		}
		return a;
		}
}
