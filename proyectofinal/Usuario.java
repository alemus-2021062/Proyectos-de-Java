package com.moises.modelo;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
public class Usuario{
	int idUsuario;
	String usuNombre;
	String clave;
	String rol;
	
	public Usuario(){
		idUsuario=0;
		usuNombre="admin";
		clave="155";
		rol="d";
		
	}
	
	public String getUsuNombre(){
		return usuNombre;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}
	
	public void setUsuNombre(int idUsuario){
		this.usuNombre=usuNombre;
	}
	public void setIdUsuario(String usuNombre){
		this.idUsuario=idUsuario;
	}
	public void setClave(String clave){
		this.clave=clave;
	}
	public void setRol (String rol){
		this.rol=rol;
	}
	
	
}