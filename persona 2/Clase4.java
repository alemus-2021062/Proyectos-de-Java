public class Clase4{
public static void main(String args[]){
	PersonaDos persona1=new PersonaDos("Juan","Rodriguez",32);
	PersonaDos persona2=new PersonaDos("Luiz","Lopez",23);
	PersonaDos persona3=new PersonaDos("Alberta","Martinez",40);
	
	String nombre;
	String apellido;
	int edad;
	nombre=persona2.retornarNombre();
	apellido=persona2.retornarApellido();
	edad=persona2.retornarEdad();
	System.out.println("el nombre de la persona es: "+ persona2.retornarNombre());
	System.out.println("el apellido de la persona es: "+ persona2.retornarApellido());
	System.out.println("la edad de la persona es: "+ persona2.retornarEdad());
	
}



}