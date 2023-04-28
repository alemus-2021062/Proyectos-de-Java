public class Persona{
	String nombre;
	int edad;
	char apellido;
	
	public Persona(String n, int e,char s){
		nombre=n;
		edad=e;
		apellido=s;
	}
	
	public int retornarEdad(){
		return edad;
	}
	public String retornarNombre(){
		return nombre;
	}
	public char retornarApellido(){
		return apellido;
	}
	
}