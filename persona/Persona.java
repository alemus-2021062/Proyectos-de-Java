public class Persona{
	String nombre;
	int edad;
	String apellido;
	
	public Persona(String n, int e,String s){
		nombre=n;
		edad=e;
		apellido=s;
	}
	
	public int retornarEdad(){
		if (edad>=18){
			System.out.println("Su edad es: "+ edad +" es mayor de edad");
		}else{
			System.out.println("Su edad es: "+ edad +" es menor de edad");
		}
	return edad;
	}
	public String retornarNombre(){
		return nombre;
	}
	public String retornarApellido(){
		return apellido;
	}
	
}