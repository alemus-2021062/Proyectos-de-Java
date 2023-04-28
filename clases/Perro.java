public class Perro{
	String nombre;
	int edad;
	char sexo;
	
	public Perro(String n, int e,char s){
		nombre=n;
		edad=e;
		sexo=s;
	}
	
	public int retornarEdad(){
		return edad;
	}
	public String retornarNombre(){
		return nombre;
	}
	public char retornarSexo(){
		return sexo;
	}
	public void ladrar(){
		System.out.println("Estoy ladrando");
	}
	public void dormir(){
		System.out.println("Estoy durmiendo");
	}
	public void comer(){
		System.out.println("Estoy comiendo");
	}
}