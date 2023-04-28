/*package com.moises.modelo;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
public class Salon{
	int idSalon;
	String nombreSalon;
	int personasSalon;
	
	public Salon(int idSalon, String nombreSalon, int personasSalon){
		this.idSalon=idSalon;
		this.nombreSalon=nombreSalon;
		this.personasSalon=personasSalon;
	}
	
	public int getIdSalon(){
		return idSalon;
	}
	public String getNombreSalon(){
		return nombreSalon;
	}
	public int getPersonasSalon(){
		return personasSalon;
	}
	
	public void setIdSalon(int idSalon){
		this.idSalon=idSalon;
	}
	public void setNombreSalon(String nombreSalon){
		this.nombreSalon=nombreSalon;
	}
	public void setPersonasSalon(int personasSalon){
		this.personasSalon=personasSalon;
	}


}