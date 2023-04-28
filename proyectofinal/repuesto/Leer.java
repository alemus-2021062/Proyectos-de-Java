package com.moises.controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Leer{

	public String ingresarTexto(){
		String texto=null;
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			texto=bf.readLine();
		}catch (IOException ioe){
			System.out.println("Error de entrada");
			System.exit(1); 
		}
		return texto;
	}
	
	public int ingresarNumero (){
		int numero=0;
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		try{
			numero=Integer.parseInt(bf.readLine());
		}catch(IOException ioe){
			System.out.println("Error de entrada");
			System.exit(1);
		}
		return numero; 
	}
	
	
}