public class PersonaDos{
	String nombre;
	String apellido;
	int edad;
	public PersonaDos(String n, String a,int e){
		nombre=n;
		apellido=a;
		edad=e;		
	}
	public void obtenerNombre(String n){
		nombre=n;
	}
	public void obtenerApellido(String a){
		apellido=a;
	}
	public int obtenerEdad(int e){
		edad=e;
	}

}