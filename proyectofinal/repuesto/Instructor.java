/*package com.moises.modelo;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
public class Instructor{
	int idInstructor=0;
	String nombreInstructor;
	String apellidoInstructor;
	int telefonoInstructor;
	String direccion;
	
	public Instructor(int idInstructor, String nombreInstructor, String apellidoInstructor, int telefonoInstructor,String direccion){
		
	this.idInstructor=idInstructor;
	this.nombreInstructor=nombreInstructor;
	this.apellidoInstructor=apellidoInstructor;
	this.telefonoInstructor=telefonoInstructor;
	this.direccion=direccion;
		
	}
	
	public int getIdInstructor(){
		return idInstructor;
	}
	public String getNombreInstructor(){
		return nombreInstructor;
	}
	public String getApellidoInstructor(){
		return apellidoInstructor;
	}
	public int getTelefonoInstructor(){
		return telefonoInstructor;
	}
	public String getDireccion(){
		return direccion;
	}
	public void setIdInstructor(int idInstructor){
		this.idInstructor=idInstructor;
	}
	public void setNombreInstructor(String nombreInstructor){
		this.nombreInstructor=nombreInstructor;
	}
	public void setApellidoInstructor(String apellidoInstructor){
		this.apellidoInstructor=apellidoInstructor;
	}
	public void setTelefonoInstructor(int telefonoInstructor){
		this.telefonoInstructor=telefonoInstructor;
	}
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	


}