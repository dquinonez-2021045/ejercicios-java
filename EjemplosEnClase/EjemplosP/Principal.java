package com.david;
import com.david.manejador.*;
import java.util.ArrayList;
public class Principal{
	public static void main(String args[]){
		ArrayList<persona> arregloPersona=new ArrayList<persona>();
		arregloPersona.add(new Persona("Pablo","Pedrero",45));
		arregloPersona.add(new Persona("Carlos","Carlos",25));	
		arregloPersona.add(new Persona("Maria","Pedrera",1));


		for(int x=0;x<=arregloPersona.size();x++){
			System.out.println(arregloPersona.get(x).getNombre()+" "+arregloPersona.get(x).getApellido());
	}
}
}