package com.moises.controlador;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
import java.util.ArrayList;
public class ControladorAsignar{
	
	ArrayList<Asignar> aAsignar=new ArrayList<Asignar>();
	
	
	ControladorMateria cMateria=new ControladorMateria();
	ControladorInstructor cInstructor=new ControladorInstructor();
	ControladorSalon cSalon=new ControladorSalon();
	Leer dato=new Leer();
	
	int idInstructor;
	String nombreAsignacion;
	String nombreInstructor;
	String nombreCurso;
	
	
	public void agregarAsignacion(int idAsignacion,String nombreAsignacion,String nombreInstructor, String nombreCurso,String nombreSalon){
		aAsignar.add(new Asignar(idAsignacion,nombreAsignacion,nombreInstructor, nombreCurso,nombreSalon));
	}
	
	public void reporteAsignar(){
		System.out.println("---------Mostrando arreglo en curso-------");
		for(Asignar a: aAsignar){
			System.out.println(a.getIdAsignacion()+" | "+a.getNombreAsignacion()+" | "+a.getNombreInstructor()+" | "+a.getNombreCurso()+" | "+a.getNombreSalon());
  		}
		
	}

}