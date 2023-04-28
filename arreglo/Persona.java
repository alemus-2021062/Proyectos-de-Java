public class Persona{
	String nombre;
	int edad;
	String apellido;
	char sexo;
	
	public Persona(String n,String a, int e, char s){
		nombre=n;
		edad=e;
		apellido=a;
		sexo=s;
	}
	
	public int retornarEdad(){
		
		return edad;
	}
	public String retornarNombre(){
		return nombre;
	}
	public String retornarApellido(){
		return apellido;
	}
	public char retornarSexo(){
		return sexo;
	}
		
	public void retornarNombre(String n){
		nombre=n;
	}
	public void retornarApellido(String a){
		apellido=a;	
	}	
	public void retornarEdad(int e){
		edad=e;	
	}	
	public void retornarSexo(char s){
		sexo=s;	
	}		
	}		