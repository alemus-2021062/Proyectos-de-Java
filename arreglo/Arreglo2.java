public class Arreglo2{
	public static void main(String args[]){
	Leer buscar=new Leer();
	int [] arregloEnteros=new int[50];
	int y=0;
	int z=0;
	int encontrar;
	int falso=0;
	int contador=0;
	System.out.println("ingresando valores del arreglo");
	for(int x=0;x<=49;x++){
		arregloEnteros[x]=z;
		z=z+3;	
	}
	
	System.out.println("mostrando valores");
	for(int i:arregloEnteros){
	System.out.println("el contenido del indice "+y+" "+i);
	y++;
	
	}
	System.out.println("ingrese el dato a buscar");
	encontrar=buscar.ingresarNumero();
	
	for(int c:arregloEnteros){
		if(encontrar==c){
			contador++;
			System.out.println("dato encontrado "+ c +" esta en "+arregloEnteros[contador]);
			
		break;
		}else{ 
			falso++;
		}
		
	}
	if(falso==50){
		System.out.println("dato no encontrado");
	}
		
	
	}

}