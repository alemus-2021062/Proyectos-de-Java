package com.moises.controlador;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
import java.util.ArrayList;
public class ControladorInstructor{
	public ArrayList<Instructor> aInstructor=new ArrayList<Instructor>();
	Leer dato=new Leer();
	int idInstructor;
	int falso;
	String nombreInstructor;	
	int idInstructorCon;
	int telefonoInstructor;
	String direccion;
	String apellidoInstructor;
	
	public void agregarInstructor(int idInstructor,String nombreInstructor,String apellidoInstructor,int telefonoInstructor,String direccion){
		aInstructor.add(new Instructor(idInstructor,nombreInstructor,apellidoInstructor,telefonoInstructor,direccion));
		
	}
	public void reporteInstructor(){
		System.out.println("------------Mostrando arreglo Instructor----------");
		for(Instructor i: aInstructor){
			System.out.println(i.getIdInstructor()+" "+i.getNombreInstructor()+"  "+i.getApellidoInstructor()+"  "+i.getTelefonoInstructor()+"  "+i.getDireccion());
  		}
	}
	
	public void buscarInstructor(){
	System.out.println("--------Ingrese el ID del Instructor---------");
		this.reporteInstructor();
		idInstructorCon=dato.ingresarNumero();
		for(Instructor i:aInstructor){
			
			if(idInstructorCon==i.getIdInstructor()){
				System.out.println("--------Si existe el Instructor--------");
				System.out.println(i.getNombreInstructor()+" "+i.getApellidoInstructor());
				
			}else {
					falso++;
				}
				idInstructor++;
		}
		if(falso==aInstructor.size()){
		System.out.println("-----El Instructor no existe-----");
		}
	}
	
	
	public void eliminarInstructor(){
		int eliminado;
		System.out.println("------Ingrese el INDICE del Instructor a eliminar------");
		this.reporteInstructor();
		idInstructorCon=dato.ingresarNumero();
		for(Instructor i:aInstructor){
		
				if(idInstructorCon==i.getIdInstructor()){
				eliminado=i.getIdInstructor();
				aInstructor.remove(idInstructor);
				System.out.println("-------Instructor Eliminado--------");
				this.reporteInstructor();
				break;
				}else {
					falso++;
				}
				idInstructor++;
			}
				if(falso==aInstructor.size()){
				System.out.println("-----Ese instructor no existe-----");
			}
		
	}
	
	
	public void modificarInstructor(){
		int op;
		System.out.println("--------Ingrese el ID del Instructor---------");
		this.reporteInstructor();
		idInstructorCon=dato.ingresarNumero();
		for(Instructor i:aInstructor){
			
			if(idInstructorCon==i.getIdInstructor()){
				System.out.println("--------Si existe el Instructor--------");
				System.out.println(i.getNombreInstructor()+" "+i.getApellidoInstructor());
				System.out.println("-----------Que quieres modificar-----------");
				System.out.println("   1___Nombre  ");
				System.out.println("   2___Apellido ");
				System.out.println("   3___Telefono  ");
				System.out.println("   4___Direccion ");
				System.out.println(" ");
				op=dato.ingresarNumero();	
				switch(op){
					case 1:
					System.out.println("------- Ingrese el nuevo nombre --------");
					nombreInstructor=dato.ingresarTexto();
					i.setNombreInstructor(nombreInstructor);
					this.reporteInstructor();
					
					break;
					case 2:
					System.out.println("------- Ingrese el nuevo apellido --------");
					apellidoInstructor=dato.ingresarTexto();
					i.setApellidoInstructor(apellidoInstructor);
					this.reporteInstructor();
					break;
					case 3:
					System.out.println("------- Ingrese el nuevo telefono --------");
					telefonoInstructor=dato.ingresarNumero();
					i.setTelefonoInstructor(telefonoInstructor);
					this.reporteInstructor();
					break;
					case 4:
					System.out.println("------- Ingrese la nueva direccion --------");
					direccion=dato.ingresarTexto();
					i.setDireccion(direccion);
					this.reporteInstructor();
					break;
					default:
					break;
					
				}
			}else {
					falso++;
				}
				idInstructor++;
		}
		if(falso==aInstructor.size()){
		System.out.println("-----El Instructor no existe-----");
		}
	}
	
	


}