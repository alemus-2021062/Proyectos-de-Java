public class Clase3{
	public static void main(String args[]){
	
	Persona objetoPersona=new Persona("Francis",15,"Perez");
	int edadPersona; 
	String nombrePersona;
	String apellidoPersona;
	
	edadPersona=objetoPersona.retornarEdad();
	nombrePersona=objetoPersona.retornarNombre();
	apellidoPersona=objetoPersona.retornarApellido();
	
	
	
	System.out.println("el nombre de la persona es: "+ nombrePersona);
	System.out.println("el apellido de la persona es: "+ apellidoPersona);
	System.out.println("   ");
	System.out.println("**************Persona1*********************");
	System.out.println("   ");
	Persona objetoPersona2=new Persona("Luis",59,"Sanchez");
	
	edadPersona=objetoPersona2.retornarEdad();
	nombrePersona=objetoPersona2.retornarNombre();
	apellidoPersona=objetoPersona2.retornarApellido();
	
	
	
	System.out.println("el nombre de la persona es: "+ nombrePersona);
	System.out.println("el apellido de la persona es: "+ apellidoPersona);
	System.out.println("   ");
	System.out.println("**************Persona2*********************");
	System.out.println("   ");
	
	
	Persona objetoPersona3=new Persona("Rocky",26,"Balboa");
	
	edadPersona=objetoPersona3.retornarEdad();
	nombrePersona=objetoPersona3.retornarNombre();
	apellidoPersona=objetoPersona3.retornarApellido();
	
	
	System.out.println("el nombre de la persona es: "+ nombrePersona);
	System.out.println("el apellido de la persona es: "+ apellidoPersona);
	System.out.println("   ");
	System.out.println("**************Persona3*********************");
	System.out.println("   ");
	
	
	
	}



}