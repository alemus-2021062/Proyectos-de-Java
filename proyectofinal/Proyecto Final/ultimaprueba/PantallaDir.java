package com.moises.vista;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
public class PantallaDir{
	Leer dato=new Leer();
	ControladorSalon cSalon=new ControladorSalon();
	ControladorMateria cMateria=new ControladorMateria();
	ControladorInstructor cInstructor=new ControladorInstructor();
	ControladorAsignar cAsignacion=new ControladorAsignar();
	Inicio reporte=new Inicio();
	
	int opcion;
	int op;
	String nombreCurso;
	String descripcionCurso;
	int idCurso=0;
	int falso=0;
	int idInstructor=0;
	int telefonoInstructor;
	String nombreInstructor;
	String apellidoInstructor;
	String direccionInstructor;
	int idSalon;
	String nombreSalon;
	int personasSalon;
	int idAsignacion=0;
	String nombreAsignacion;
	int idMateriaDos;
	int idInstructorDos;

	public void menuPrincipal(){
		System.out.println("-----Menu del Director-----");
		System.out.println("  1____Materia ");
		System.out.println("  2____Instructor  ");
		System.out.println("  3____Salones  ");
		System.out.println("  4____Asignar  ");
		System.out.println("  5____Reporte  ");
		opcion=dato.ingresarNumero();
		
		switch(opcion){
			case 1:
			this.menuMateria();
			break; 
			case 2:
			this.menuInstructor();
			break;
			case 3:
			this.menuSalon();
			break;
			case 4:
			this.menuAsignar();
			break;
			case 5:
			reporte.reportes();
			this.menuPrincipal();
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			System.out.println("  ");
			this.menuPrincipal();
			break;
		}
		
	}
	
	public void menuMateria(){
		String opcionDos;
		System.out.println("--------Menu de Materia------");
		System.out.println("  1____Crear ");
		System.out.println("  2____Modificar  ");
		System.out.println("  3____Eliminar  ");
		System.out.println("  4____Regresar  ");
		op=dato.ingresarNumero();
		
		switch(op){
			case 1:
			
			do{
			idCurso++;
			System.out.println("---------Ingrese el nombre de la materia----------");
			nombreCurso=dato.ingresarTexto();
			System.out.println("--------------Ingrese una descripcion-----------");
			descripcionCurso=dato.ingresarTexto();
			cMateria.agregarMateria(idCurso,nombreCurso,descripcionCurso);
			cMateria.reporteMateria();	
			System.out.println("-----------Desea agregar otro---------");
			opcionDos=dato.ingresarTexto();
			}while(opcionDos.equals("si"));	
			this.menuMateria();
			break; 
			
			case 2:
			cMateria.modificarMateria();
			this.menuMateria();
			break;
			
			case 3:
			cMateria.eliminarMateria();
			this.menuMateria();
			
			break;
				
			case 4:
			this.menuPrincipal();
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			System.out.println(" ");
			this.menuMateria();
		}
	}
	
	public void menuInstructor(){
		String opcionDos;
		System.out.println("--------Menu de Instructor------");
		System.out.println("  1____Crear ");
		System.out.println("  2____Modificar  ");
		System.out.println("  3____Eliminar  ");
		System.out.println("  4____Regresar  ");
		op=dato.ingresarNumero();	
		switch(op){
			case 1:
			do{
			idInstructor++;
			System.out.println("---------Ingrese el nombre del Instructor----------");
			nombreInstructor=dato.ingresarTexto();
			System.out.println("--------------Ingrese el apellido del Instructor-----------");
			apellidoInstructor=dato.ingresarTexto();
			System.out.println("--------------Ingrese el numero del Instructor----------");
			telefonoInstructor=dato.ingresarNumero();
			System.out.println("--------------Ingresa la direccion del Instructor----------");
			direccionInstructor=dato.ingresarTexto();
			cInstructor.agregarInstructor(idInstructor,nombreInstructor,apellidoInstructor,telefonoInstructor,direccionInstructor);
			cInstructor.reporteInstructor();	
			System.out.println("-----------Desea agregar otro---------");
			opcionDos=dato.ingresarTexto();
			}while(opcionDos.equals("si"));	
			this.menuInstructor();
			break;
			case 2:
			cInstructor.modificarInstructor();
			this.menuInstructor();
			break;
			case 3:
			cInstructor.eliminarInstructor();
			this.menuInstructor();
			break;
			case 4:
			this.menuPrincipal();
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			System.out.println(" ");
			this.menuInstructor();
			
		}
	}
	
	public void menuSalon(){
		String opcionDos;
		System.out.println("--------Menu de Salon------");
		System.out.println("  1____Crear ");
		System.out.println("  2____Modificar  ");
		System.out.println("  3____Eliminar  ");
		System.out.println("  4____Regresar  ");
		op=dato.ingresarNumero();	
		switch(op){
			case 1:
			do{
			idSalon++;
			System.out.println("---------Ingrese el nombre del Salon----------");
			nombreSalon=dato.ingresarTexto();
			System.out.println("--------------Ingrese el numero de personas del Salon-----------");
			personasSalon=dato.ingresarNumero();
			cSalon.agregarSalon(idSalon,nombreSalon,personasSalon);
			cSalon.reporteSalon();	
			System.out.println("-----------Deseas agregar otro Salon---------");
			opcionDos=dato.ingresarTexto();
			}while(opcionDos.equals("si"));	
			this.menuSalon();
			break;
			case 2:
			cSalon.modificarSalon();
			this.menuSalon();
			break;
			case 3:
			cSalon.eliminarSalon();
			this.menuSalon();
			break;
			case 4:
			this.menuPrincipal();
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			System.out.println(" ");
			this.menuSalon();
		}
	}
	
	public void menuAsignar(){
		int falso=0;
		String opcionDos;
		int idAsignar=0;
		System.out.println("--------Menu de Asignacion------");
		System.out.println("  1____Nueva Asignacion ");
		System.out.println("  2____Reporte de Asignaciones  ");
		System.out.println("  3____Regresar  ");
		op=dato.ingresarNumero();	
		switch(op){
			case 1:
			idAsignacion++;
			do{
			System.out.println("---------Ingrese el nombre de la Asignacion----------");
			nombreAsignacion=dato.ingresarTexto();
			System.out.println("---------Ingrese el ID del Instructor que quiere asignar--------");
			cInstructor.reporteInstructor();
			idInstructorDos=dato.ingresarNumero();
			for(Instructor a:cInstructor.aInstructor){
			
				if (idInstructorDos==a.getIdInstructor()){
					System.out.println("-------si existe el instructor-------");
					System.out.println(a.getNombreInstructor()+" "+a.getApellidoInstructor());	
					
				}else{
					falso++;
				}
					idAsignar++;
			}
			if(falso==cInstructor.aInstructor.size()){
			System.out.println("----- Ese instructor no existe -----");
			this.menuAsignar();
			}
			
			System.out.println("---------Ingrese el ID de la Materia que quiere asignar---------");
			cMateria.reporteMateria();
			idCurso=dato.ingresarNumero();
			for(Materia a:cMateria.aMateria){
			
				if(idCurso==a.getIdCurso()){
					System.out.println("-------si existe la Materia-------");
					System.out.println(a.getNombreCurso());	
					
				}else{
					falso++;
				}
					idAsignar++;
			}
			if(falso==cMateria.aMateria.size()){
			System.out.println("----- Esa Materia no existe -----");
			}
			
			System.out.println("--------Ingrese el ID del salon que quiere asignar---------");
			cSalon.reporteSalon();
			idSalon=dato.ingresarNumero();
			
			for(Salon a:cSalon.aSalon){
			
				if(idSalon==a.getIdSalon()){
					System.out.println("-------si existe la Materia-------");
					System.out.println(a.getNombreSalon());	
					
				}else{
					falso++;
				}
					idAsignar++;
			}
			if(falso==cSalon.aSalon.size()){
			System.out.println("----- Esa Materia no existe -----");
			}
			
			cAsignacion.agregarAsignacion(idAsignacion,nombreAsignacion,nombreInstructor,nombreCurso,nombreSalon);
			cAsignacion.reporteAsignar();	
			System.out.println("------------- Deseas agregar otra Asignacion -----------");
			opcionDos=dato.ingresarTexto();
			}while(opcionDos.equals("si"));	
			this.menuAsignar();
			break;
			case 2:
			cAsignacion.reporteAsignar();
			this.menuAsignar();
			break;
			case 3:
			this.menuPrincipal();
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			System.out.println(" ");
			this.menuAsignar();
			}
	}
	
	public void menuReporte(){
		System.out.println("--------Menu Reportes------");
		reporte.reportes();
		this.menuPrincipal();
	}
	
}
	

	