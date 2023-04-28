public class Tablas{

		int tabla;
		int limite;
		int contador=1;
		int total=0;
		public int Multi(int a,int b){
		tabla=a;
		limite=b;
		while(contador<=b){
			total=a*contador;
			System.out.println(a+" * "+contador+"="+total);
			contador++;
		
		
		}
		return total;
		}	
}

	
	