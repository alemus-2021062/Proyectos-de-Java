/*package com.moises.controlador;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;*/
import java.util.ArrayList;
public class ControladorMateria{
	Leer dato=new Leer();
	String nombreCurso;
	String descripcion;
	int idCurso=0;
	int falso=0;
	int idMateria;
	
	public ArrayList<Materia> aMateria=new ArrayList<Materia>();
	
	
	public void agregarMateria(int idMateria,String nombreCurso,String descripcion){
		aMateria.add(new Materia(idMateria,nombreCurso,descripcion));
		
	}
	
	public void buscarMateria(){
		System.out.println("-----Ingrese el ID de la materia a buscar ------");
		idMateria=dato.ingresarNumero();
		for(Materia m:aMateria){
				
				if(idMateria==m.getIdCurso()){
				System.out.println("--------si existe la materia--------");
				System.out.println(m.getNombreCurso());
				}else {
					falso++;
				}
				idCurso++;
			}
				if(falso==aMateria.size()){
				System.out.println("-----Materia no existe-----");
			}
	}
	
	public void reporteMateria(){
		System.out.println("---------Mostrando arreglo en curso-------");
		for(Materia m: aMateria){
			System.out.println(m.getIdCurso()+" "+m.getNombreCurso()+"  "+m.getDescripcion());
  		}
	}
	
	
	public void modificarMateria(){
		int op;
		System.out.println("-----Ingrese el ID de la materia a buscar ------");
		idMateria=dato.ingresarNumero();
		for(Materia m:aMateria){
				
				if(idMateria==m.getIdCurso()){
				System.out.println("--------si existe la materia--------");
				System.out.println(m.getNombreCurso()+" "+m.getDescripcion());
				System.out.println("--------que quiere modificar-------");
				System.out.println("  1-Nombre");
				System.out.println("  2-Descripcion");
				op=dato.ingresarNumero();
				switch(op){
					case 1:
					System.out.println("-------ingrese el nuevo nombre--------");
					nombreCurso=dato.ingresarTexto();
					m.setNombreCurso(nombreCurso);
					this.reporteMateria();
					break;
					case 2:
					System.out.println("------ingrese la nueva descripcion---------");
					descripcion=dato.ingresarTexto();
					m.setDescripcion(descripcion);
					this.reporteMateria();
					break;
					
				}
				
				}else {
					falso++;
				}
				idCurso++;
			}
				if(falso==aMateria.size()){
				System.out.println("-----Materia no existe-----");
			}
		
	}
	
	public void eliminarMateria(){
		int eliminado;
		System.out.println("------Ingrese el INDICE de la materia a eliminar------");
		this.reporteMateria();
		idMateria=dato.ingresarNumero();
		for(Materia m:aMateria){
		
				if(idMateria==m.getIdCurso()){
				eliminado=m.getIdCurso();
				aMateria.remove(idCurso);
				System.out.println("-------Materia Eliminada--------");
				this.reporteMateria();
				break;
				}else {
					falso++;
				}
				idCurso++;
			}
				if(falso==aMateria.size()){
				System.out.println("-----Esa materia no existe-----");
			}
	}

	
	
}
	
	