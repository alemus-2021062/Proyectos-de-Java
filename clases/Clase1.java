public class Clase1{
	public static void main(String args[]){
	
	Perro objetoPerro=new Perro("Duke",5,'M');
	int edadPerro; 
	String nombrePerro;
	char sexoPerro;
	
	edadPerro=objetoPerro.retornarEdad();
	nombrePerro=objetoPerro.retornarNombre();
	sexoPerro=objetoPerro.retornarSexo();
	
	
	System.out.println("la edad del perro es: "+ edadPerro);
	System.out.println("el nombre del perro es: "+ nombrePerro);
	System.out.println("el sexo del perro es: "+ sexoPerro);
	objetoPerro.ladrar();
	System.out.println("   ");
	System.out.println("**************Perro2*********************");
	System.out.println("   ");
	Perro objetoPerro2=new Perro("Doki",2,'M');
	
	edadPerro=objetoPerro2.retornarEdad();
	nombrePerro=objetoPerro2.retornarNombre();
	sexoPerro=objetoPerro2.retornarSexo();
	
	
	System.out.println("la edad del perro es: "+ edadPerro);
	System.out.println("el nombre del perro es: "+ nombrePerro);
	System.out.println("el sexo del perro es: "+ sexoPerro);
	objetoPerro2.ladrar();
	
	System.out.println("   ");
	System.out.println("**************Perro3*********************");
	System.out.println("   ");
	
	
	Perro objetoPerro3=new Perro("Rocky",6,'M');
	
	edadPerro=objetoPerro3.retornarEdad();
	nombrePerro=objetoPerro3.retornarNombre();
	sexoPerro=objetoPerro3.retornarSexo();
	
	System.out.println("la edad del perro es: "+ edadPerro);
	System.out.println("el nombre del perro es: "+ nombrePerro);
	System.out.println("el sexo del perro es: "+ sexoPerro);
	objetoPerro3.dormir();
	
	System.out.println("   ");
	System.out.println("**************Perro4*********************");
	System.out.println("   ");
	
	
	Perro objetoPerro4=new Perro("Alfalfa",1,'M');
	
	edadPerro=objetoPerro4.retornarEdad();
	nombrePerro=objetoPerro4.retornarNombre();
	sexoPerro=objetoPerro4.retornarSexo();
	
	System.out.println("la edad del perro es: "+ edadPerro);
	System.out.println("el nombre del perro es: "+ nombrePerro);
	System.out.println("el sexo del perro es: "+ sexoPerro);
	objetoPerro4.comer();
	
	}



}