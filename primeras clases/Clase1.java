public class Clase1{
	public static void main(String args[]){
	int edadPerro; 
	String nombrePerro;
	Perro objetoPerro=new Perro();
	
	edadPerro=objetoPerro.retornarEdad();
	nombrePerro=objetoPerro.retornarNombre();
	
	System.out.println("la edad del perro es: "+ edadPerro);
	System.out.println("El nombre del perro es: "+ nombrePerro);
	
	
	
	}

}