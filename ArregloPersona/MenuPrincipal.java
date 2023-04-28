public class MenuPrincipal{
	public void menuPrincipal(){
	
		Leer dato=new Leer();
		ControladorPersona controlador=new ControladorPersona();	
	
		int opcion;	
		String nombre;
		
		System.out.println("Bienvenido, ¿Que quieres hacer?");
		System.out.println(" ");
		System.out.println("   1____Ingresar persona  ");
		System.out.println("   2____Modificar persona ");
		System.out.println("   3____Reporte de Persona");
		opcion=dato.ingresarNumero();
		
		
		switch(opcion){
			case 1: 
			System.out.println("   Bienvenido a Ingresar persona ");
			System.out.println(" ");
			controlador.ingresarPersona();	
			controlador.reportePersona();
			break;
		
			case 2:
			System.out.println("   Bienvenido a Modificar persona ");
			System.out.println(" ");
			controlador.ingresarPersona();
			System.out.println("Ingrese el nombre de la persona a modificar");
			System.out.println(" ");
			nombre=dato.ingresarTexto();
			controlador.modificarPersona(nombre.toLowerCase());
			controlador.reportePersona();
			
			break;
	
			case 3:
			System.out.println("     Bienvenido a Reporte de persona");
			System.out.println(" ");
			System.out.println("   Aqui estan las personas del registro");				System.out.println(" ");
			controlador.ingresarPersona();	
			System.out.println("------------datos Modificados---------");
			controlador.reportePersona();
				
			break;
			default:
			System.out.println("Error: Esa no es una opcion");
			break;
		}
		
	}
}