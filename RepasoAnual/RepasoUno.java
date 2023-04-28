import java.util.Scanner;
public class RepasoUno{
	public static void main(String args[]){
	Scanner leer=new Scanner(System.in);
	int numeroUno;
	int numeroDos;
	int opcion;
	
	System.out.println("opcion 1: suma");
	System.out.println("opcion 2: resta");
	System.out.println("opcion 3: multiplicacion");
	System.out.println("opcion 4: division");
	
	System.out.println("ingrese la opcion que quiere usar");
	opcion=leer.nextInt();
	switch(opcion){
		case:1
			System.out.println("opcion de suma");
			System.out.println("ingrese el primer numero");
			numeroUno=leer.nextInt();
			System.out.println("ingrese el segundo numero");
			numeroDos=leer.nextInt();
			int total=numeroUno+numeroDos;
			System.out.println(el resultado de la suma es : + total);
			
		break;
		case:2
		System.out.println("opcion de resta");
		System.out.println("ingrese el primer numero");
		numeroUno=leer.nextInt();
		System.out.println("ingrese el segundo numero");
		numeroDos=leer.nextInt();
		int totalResta=numeroUno-numeroDos;
		System.out.println(el resultado de la resta es : + totalResta);
		break;
		case:3
		System.out.println("opcion de multiplicacion");
		System.out.println("ingrese el primer numero");
		numeroUno=leer.nextInt();
		System.out.println("ingrese el segundo numero");
		numeroDos=leer.nextInt();
		int totalMulti=numeroUno*numeroDos;
		System.out.println(el resultado de la multiplicacion es : + totalMulti);
		break;
		case:4
		System.out.println("opcion de division");
		System.out.println("ingrese el primer numero");
		numeroUno=leer.nextInt();
		System.out.println("ingrese el segundo numero");
		numeroDos=leer.nextInt();
		int totalDivision=numeroUno/numeroDos;
		System.out.println(el resultado de la division es : + totalDivision);
		break;
		default:
		System.out.println("Esa no es una opcion");
		break;
	}
	
	}

}