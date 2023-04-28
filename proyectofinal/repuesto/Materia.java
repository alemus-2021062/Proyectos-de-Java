/*package com.moises.modelo;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
public class Materia{
	int idCurso;
	String nombreCurso;
	String descripcion;
	
	public Materia(int idCurso, String nombreCurso, String descripcion){
		this.idCurso=idCurso;
		this.nombreCurso=nombreCurso;
		this.descripcion=descripcion;
		
	}
	
	public int getIdCurso(){
		return idCurso;
	}
	public String getNombreCurso(){
		return nombreCurso;
	}
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setIdCurso(int idCurso){
		this.idCurso=idCurso;
	}
	public void setNombreCurso(String nombreCurso){
		this.nombreCurso=nombreCurso;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	
	
}