/*package com.moises.controlador;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
import java.util.ArrayList;
public class ControladorSalon{
	
	ArrayList<Salon> aSalon=new ArrayList<Salon>();
	Leer dato=new Leer();
	
	int falso=0;
	int idSalonCon=0;
	String nombreSalon;
	int personasSalon;
	int idSalon=0;
	
	
	public void agregarSalon(int idSalon,String nombreSalon,int personasSalon){
		aSalon.add(new Salon(idSalon,nombreSalon,personasSalon));
	}

	public void reporteSalon(){
		System.out.println("---------Mostrando arreglo en curso-------");
		for(Salon s: aSalon){
			System.out.println(s.getIdSalon()+" "+s.getNombreSalon()+"  "+s.getPersonasSalon());
  		}
	}
	
	public void modificarSalon(){
		int op;
		System.out.println("-----Ingrese el ID del Salon a buscar ------");
		idSalonCon=dato.ingresarNumero();
		for(Salon s:aSalon){
				
				if(idSalonCon==s.getIdSalon()){
				System.out.println("-------- si existe el Salon --------");
				System.out.println(s.getNombreSalon()+"  No."+s.getPersonasSalon());
				System.out.println("--------que quiere modificar-------");
				System.out.println("  1-Nombre");
				System.out.println("  2-Numero de Personas");
				op=dato.ingresarNumero();
				switch(op){
					case 1:
					System.out.println("------- Ingrese el nuevo nombre--------");
					nombreSalon=dato.ingresarTexto();
					s.setNombreSalon(nombreSalon);
					this.reporteSalon();
					break;
					case 2:
					System.out.println("------ Ingrese el nuevo numero de Personas ---------");
					personasSalon=dato.ingresarNumero();
					s.setPersonasSalon(personasSalon);
					this.reporteSalon();
					break;
					
				}
				
				}else {
					falso++;
				}
				idSalon++;
			}
				if(falso==aSalon.size()){
				System.out.println("-----Ese Salon no existe-----");
			}
		
	}
	
	public void eliminarSalon(){
		System.out.println("------Ingrese el INDICE del salon a eliminar------");
		this.reporteSalon();
		idSalonCon=dato.ingresarNumero();
		for(Salon s:aSalon){
		
				if(idSalonCon==s.getIdSalon()){
				aSalon.remove(idSalon);
				System.out.println("-------Salon Eliminado--------");
				this.reporteSalon();
				break;
				}else {
					falso++;
				}
				idSalon++;
			}
				if(falso==aSalon.size()){
				System.out.println("-----Ese Salon no existe-----");
			}
		
	}

}