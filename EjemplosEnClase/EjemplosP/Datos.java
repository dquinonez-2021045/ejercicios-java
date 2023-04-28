package com.david.manejador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Datos{
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		public String leerTexto(){
		String texto=null;
		try{
			texto=bf.readLine();
		} catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
		}
		return texto;
		}
		
		public int leerNumero(){
		int numero=0;
		
		try{
		numero=Integer.parseInt(bf.readLine());
		}catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
		}
		return numero;
	}
}