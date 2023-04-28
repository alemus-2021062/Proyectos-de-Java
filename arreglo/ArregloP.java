public class ArregloP{
	public static void main(String args[]){
	Leer buscar=new Leer();
	int encontrar;
	int falso;
	Persona persona;
	int contador=0;
	Persona[] p=new Persona[5];
	
	p[0]=new Persona("Juan","Hernandez",12,'F');
	p[1]=new Persona("Luisa","Rodriguez",14,'F');
	p[2]=new Persona("Josue","De Leon",69,'F');
	p[3]=new Persona("Marcos","Rafael",34,'M');
	p[4]=new Persona("Mauricio","Lopez",16,'M');
	
	//System.out.println(p[1].retornarNombre()+" "+p[1].retornarApellido());
	for (int i: p){
		System.out.println(i.retornarNombre()+"  "+i.retornarApellido());
		
	}
	System.out.println("ingrese el dato a buscar");
	encontrar=buscar.ingresarNumero();
	
	for(int c: p){
		if(encontrar==c){
			contador++;
			System.out.println("dato encontrado "+contador );
		
		break;
		}else{ 
			falso++;
		}
		
	}
	if(falso==5){
		System.out.println("dato no encontrado");
	}
	}


}