import java.util.ArrayList;
public class ArregloCarro{
	public static void main(String args[]){
	Leer dato=new Leer();
	ArrayList<String> arregloCarro=new ArrayList<String>();
	
	String variable;
	int longitud;
	String carro;
	String carroE;
	String pregunta;
	String respuesta;
	String elemento;
	int contador=0;
	int falso=0;
	
	do{
		System.out.println("----ingresa el carro----");
		carro=dato.ingresarTexto();
		arregloCarro.add(carro);
		
		System.out.println("-----desea ingresar otro carro-----");
		pregunta=dato.ingresarTexto();
		
	}while(pregunta.equals("si"));
	
	System.out.println("-------ingrese el vehiculo a buscar------");
	carro=dato.ingresarTexto();
	for(String p:arregloCarro){
		
		if(carro.equals(p)){
			System.out.println("-----si existe el vehiculo-----");
			System.out.println(p);
			System.out.println("------ingrese el nuevo dato-----");
			carro=dato.ingresarTexto();
			arregloCarro.set(contador,carro);
			System.out.println("------el valor modificado es: -----");
			for(int i=0;i<arregloCarro.size();i++){
		System.out.println(arregloCarro.get(i));
		}
		}else {
			falso++;
		}
		contador++;
	}
	if(falso==arregloCarro.size()){
		System.out.println("-----Vehiculo no existe-----");
	}
	
	

	System.out.println("------------Eliminando--------------");
	System.out.println("---Ingrese el vehiculo a eliminar---");
	carroE=dato.ingresarTexto();
	for(String p:arregloCarro){
		
		if(carroE.equals(p)){
			System.out.println("-----Si existe el vehiculo-----");
			System.out.println(p);
			arregloCarro.remove(carroE);
			System.out.println("------el valor modificado es: -----");
			for(int i=0;i<arregloCarro.size();i++){
		System.out.println(arregloCarro.get(i));
			}
		}else{
			falso++;
		}
		contador++;
	}
	if(falso==arregloCarro.size()){
		System.out.println("-----Vehiculo no existe-----");
	}
	/*System.out.println("-----Arreglo modificado------");
		for(String p: arregloCarro){
			System.out.println(p);
	}*/
	}
}


	
	
	/*arregloCarro.add("BMW");
	arregloCarro.add("volvo");
	arregloCarro.add("Mazda");
	arregloCarro.add("Honda");
	arregloCarro.add("Porche");
	
	variable=arregloCarro.get(2);
	
	System.out.println(variable);
	
	//arregloCarro.set(2,"Kia");
	
	variable=arregloCarro.get(2);
	
	System.out.println(variable);
	
	longitud=arregloCarro.size();
	
	System.out.println("la longitud del arreglo es "+longitud);
	
	//arregloCarro.remove(2);
	
	longitud=arregloCarro.size();
	
	System.out.println("la longitud del arreglo nuevo es: "+longitud);
	for(int i=0;i<arregloCarro.size();i++){
		System.out.println(arregloCarro.get(i));
	}
	}
}
	este es lo mismo que el de arriba pero en for ich
	for (String p:arregloCarro){
		System.out.println(p);
	}*/
	
	


