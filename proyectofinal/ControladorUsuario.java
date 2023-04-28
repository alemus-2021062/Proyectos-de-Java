package com.moises.controlador;
import com.moises.modelo.*;
import com.moises.vista.*;
import com.moises.controlador.*;
public class ControladorUsuario{
	Usuario usuario=new Usuario();
	PantallaDir pantallaD=new PantallaDir();
	PantallaCoor pantallaC=new PantallaCoor();
	

	public void primerLogin(String usser,String clave){
		if (usser.equals(usuario.getUsuNombre())&& clave.equals(usuario.getClave())){
			if(usuario.getRol().equals("d")){
				pantallaD.menuPrincipal();
			}else if(usuario.getRol().equals("c")){
				pantallaC.menuPrincipal();
			}
			
		}else{
			System.out.println("datos incorrectos");
		}
		
	}
}