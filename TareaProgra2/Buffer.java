import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffer{
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public String ingresarNombre(){
		String nombre=null;
	try{
		nombre=bf.readLine();
	} catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
	}
	return nombre;
	}
	
	public int ingresarEdad(){
		int edad=0;
	try{
	edad=Integer.parseInt(bf.readLine());
	} catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
	}
	return edad;
	}
	public char ingresarSigno(){
		char signo=0;
		
		try{
		signo=bf.readLine().charAt(0);
		}catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
		}
		return signo;
	}
	
	
}