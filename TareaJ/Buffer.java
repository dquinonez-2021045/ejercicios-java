import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Buffer{
	BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	public String ingresarNombre(){
		String nombre=null;
	try{
		nombre=buff.readLine();
	} catch(IOException ioe){
			System.out.println("ERROR");
			System.exit(1);
	}
	return nombre;
	}
	public int ingresarEdad(){
		int edad=0;
	try{
	edad=Integer.parseInt(buff.readLine());
	} catch(IOException ioe){
			System.out.println("ERROR");
			System.exit(1);
	}
	return edad;
	}
	public char ingresarE(){
		char e=0;
		try{
		e=buff.readLine().charAt(0);
		}catch(IOException ioe){
			System.out.println("ERROR");
			System.exit(1);
		}
		return e;
	}	
}