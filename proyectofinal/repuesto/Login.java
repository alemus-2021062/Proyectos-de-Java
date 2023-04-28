/*package com.moises.vista;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
public class Login{
	Leer dato=new Leer();
	ControladorUsuario cUsuario=new ControladorUsuario();
	
	String usuario;
	String clave;
	
	public void primerLogin(){
	System.out.println("------Ingrese el nombre de usuario------");
	usuario=dato.ingresarTexto();
	System.out.println("-----------Ingrese la clave-------------");
	clave=dato.ingresarTexto();
	cUsuario.primerLogin(usuario,clave);
	}

}