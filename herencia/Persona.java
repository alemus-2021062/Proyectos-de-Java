public class Persona{
	String nombre;
	int edad;
	String apellido;
	String sexo;
	
	public Persona(String nombre,String apellido, int edad, String sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.apellido=apellido;
		this.sexo=sexo;
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
		
	public void retornarNombre(String nombre){
		this.nombre=nombre;
	}
	public void retornarApellido(String apellido){
		this.apellido=apellido;	
	}	
	public void retornarEdad(int edad){
		this.edad=edad;	
	}	
	public void retornarSexo(String sexo){
		sexo=sexo;	
	}
		public void retornarTelefono(){
			System.out.println("este es mi numero de telefono ");
		}
	}		