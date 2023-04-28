public class Ejemplo2{
	public static void main(String args[]){
	
		int tabla=5;
		int limit=15;
		int cont=1;
		int total=0;
		
		do{
			total=tabla*cont;
			System.out.println(tabla+" * "+cont+" = "+total);
			cont++;
		}while(cont<=limit);
	}
}