import java.util.ArrayList;
public class ManejadorPerro{
	ArrayList<Perro> arregloPerro=new ArrayList<Perro>();
	
	public void agregarArreglo(String nombre, String raza,String color, int edad){
		arregloPerro.add(new Perro(nombre,raza,color, edad));
	}
	
	public void mostrarDatos(){
		String nombre;
		nombre=arregloPerro.get(0).retornarNombre();
		System.out.println(nombre);
	}
	
	public void mostrarLongitud(){
		String nombre;
		for(int x=0;x<arregloPerro.size();x++){
			System.out.println(arregloPerro.get(x).retornarNombre());
		}
	}


}