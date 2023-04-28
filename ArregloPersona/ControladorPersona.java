public class ControladorPersona{
	Leer dato=new Leer();
	String buscarNombre;
	String nombreNuevo;
	String apellidoNuevo;
	int edadNuevo;
	String sexoNuevo;
	int contador=0;
	String modificar;
	Persona[] persona=new Persona[5];
	public void ingresarPersona(){
		persona[0]=new Persona("steve","Rogers",112,"M");
		persona[1]=new Persona("josue","De Leon",17,"M");
		persona[2]=new Persona("mauricio","Hernandez",16,"M");
		persona[3]=new Persona("elizabeth","Olsen",32,"F");
		persona[4]=new Persona("tony","Stark",56,"M");
			
	}
	public void reportePersona(){
		for(Persona p:persona){
			System.out.println("   "+p.retornarNombre()+"  "+p.retornarApellido()+"  "+p.retornarEdad()+"  "+p.retornarSexo());
			
		}
		
	}
	public void modificarPersona(String buscarNombre){
		for(Persona p:persona){
			if (buscarNombre.equals(p.retornarNombre())){
				System.out.println("  si existe");
				System.out.println(" ");
				System.out.println("  ¿Que dato quiere modificar?");
				System.out.println(" ");
				System.out.println(" ------nombre------");
				System.out.println(" -----apellido-----");
				System.out.println(" -------edad-------");
				System.out.println(" -------sexo-------");
				System.out.println(" ");
				modificar=dato.ingresarTexto();
				
				switch(modificar){
					case "nombre":
					System.out.println("  ");
					System.out.println("Ingrese el nuevo dato");
					nombreNuevo=dato.ingresarTexto();
					p.obtenerNombre(nombreNuevo);
					break;
					
					case "apellido":
					System.out.println("  ");
					System.out.println("Ingrese el nuevo dato");
					apellidoNuevo=dato.ingresarTexto();
					p.obtenerApellido(apellidoNuevo);
					break;
					
					case "edad":
					System.out.println("  ");
					System.out.println("Ingrese el nuevo dato");
					edadNuevo=dato.ingresarNumero();
					p.obtenerEdad(edadNuevo);
					break;
					
					case "sexo":
					System.out.println(" ");
					System.out.println("Ingrese el nuevo dato");
					sexoNuevo=dato.ingresarTexto();
					p.obtenerSexo(sexoNuevo);
					break;
					
					default:
					System.out.println("Error: Esa no es una opcion");
					break;
				
				}
				
			}else {
				contador++;
			}
			
		}
		if (contador==5){
			System.out.println("no existe");
		}
	}		
}
