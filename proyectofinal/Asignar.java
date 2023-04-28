package com.moises.modelo;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
public class Asignar{
	String nombreAsignacion;
	int idAsignacion=0;
	String nombreInstructor;
	String nombreCurso;
	String nombreSalon;
	
	public Asignar(int idAsignacion, String nombreAsignacion,String nombreInstructor,String nombreCurso, String nombreSalon){
		this.nombreAsignacion=nombreAsignacion;
		this.idAsignacion=idAsignacion;
		this.nombreInstructor=nombreInstructor;
		this.nombreCurso=nombreCurso;
		this.nombreSalon=nombreSalon;
	}
	
	public String getNombreAsignacion(){
		return nombreAsignacion;
	}
	
	public int getIdAsignacion(){
		return idAsignacion;
	}
	
	public String getNombreInstructor(){
		return nombreInstructor;
	}
	
	public String getNombreCurso(){
		return nombreCurso;
	}
	
	public String getNombreSalon(){
		return nombreSalon;
	}
	
	public void setNombreAsignacion(){
		this.nombreAsignacion=nombreAsignacion;
	}
	
	public void setIdAsignacion(){
		this.idAsignacion=idAsignacion;
	}
	
	
}