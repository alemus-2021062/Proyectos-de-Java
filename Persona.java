public class Persona{
	String nombre;
	int edad;
	String apellido;
	String sexo;
	
	public Persona(String n,String a, int e, String s){
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
	public String retornarSexo(){
		return sexo;
	}
		
	public void obtenerNombre(String n){
		nombre=n;
	}
	public void obtenerApellido(String a){
		apellido=a;	
	}	
	public void obtenerEdad(int e){
		edad=e;	
	}	
	public void obtenerSexo(String s){
		sexo=s;	
	}		
	}		