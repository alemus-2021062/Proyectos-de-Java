public class Perro{
	String nombre="Duke";
	String raza="frenshpoodle";
	char sexo='M';
	String color="blanco";
	int edad=4;
	
	public Perro(String nombre, String raza, String color, int edad){
		this.nombre=nombre;
		this.raza=raza;
		this.color=color;
		this.edad=edad;
	}
	
	
	public String retornarNombre(){
		return nombre;
	}
	
	public int retornarEdad(){
		return edad;
	}
	
	public String retornarRaza(){
		return raza;
	}
	
	public char retornarSexo(){
		return sexo;
	}
	
	public String retornarColor(){
		return color;
	}
	
	public void ladrar(){
		System.out.println("Estoy ladrando!!!");
	}
	
	public void obtenerNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void obtenerEdad(int edad){
		this.edad=edad;
	}
	
}