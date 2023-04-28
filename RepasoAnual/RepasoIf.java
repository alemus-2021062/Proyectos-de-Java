import java.util.Scanner;
public class RepasoIf{
	public static void main(String args[]){
	Scanner leer=new Scanner(System.in); 
	int variableA;
	int variableB;
	int opcion;
	int totaldivision;
	
	System.out.println("opcion 1: positivo o negativo");
	System.out.println("opcion 2: mayor o menor");
	System.out.println("opcion 3: division");
	
	System.out.println("ingrese la opcion");
	opcion=leer.nextInt();
	
	switch(opcion){
		case 1:
		System.out.println("positivo o negativo");
		System.out.println("ingrese el numero");
		variableA=leer.nextInt();
		if(variableA>0){
			System.out.println("Es positivo");
		}else{
			System.out.println("Es negativo");
		}
		break;
		case 2:
		System.out.println("mayor y menor");
		System.out.println("ingrese el primer numero");
		variableA=leer.nextInt();
		System.out.println("ingrese el segundo numero");
		variableB=leer.nextInt();
		if(variableA>variableB){
		System.out.println("el numero : "+ variableA +" es mayor" );
		}else {
			System.out.println("el numero : "+ variableB + " es mayor" );
		}
		break;
		case 3:
		System.out.println("division");
		System.out.println("ingrese el primer numero");
		variableA=leer.nextInt();
		System.out.println("ingrese el segundo numero");
		variableB=leer.nextInt();
		
		if (variableB==0){
			System.out.println("el 0 no es un numero valido");
		} else {totaldivision=variableA/variableB;
			System.out.println("el resultado es: "+ totaldivision);
		}
		
		break;
		default:
		System.out.println("esa no es opcion");
		break;
	}
	
	
	}

}