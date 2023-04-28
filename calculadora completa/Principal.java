public class Principal{
	public static void main(String args[]){
	Leer dato=new Leer();
	Calculadora cal=new Calculadora();
	
	int num1;
	int num2;
	int opcion=0;
	int totalM;
	int limite;
	int total;
	int totalD;
	String signo;
	
	System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	System.out.println("|¿Bienvenido, que quieres usar?|");
	System.out.println("|1_____tablas de multiplicar____|");
	System.out.println("|2_____serie de fibonacci_______|");
	System.out.println("|3_________Calculadora__________|");
	System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
	System.out.println(" ");
	System.out.println("Elige una opcion :)");
	opcion=dato.ingresarNumero();
	
	switch (opcion){
		case 1:
		TablasMulti tablas=new TablasMulti();
		System.out.println("-------Bienvenido a tablas de multiplicar--------");
		System.out.println("---Ingresa el numero de la tabla que quieres ver--- ");
		num1=dato.ingresarNumero();
		System.out.println("---Ingresa el numero a donde quieres que llegue--- ");
		num2=dato.ingresarNumero();
		System.out.println(" ");
		totalM=tablas.retornarTotalM(num1,num2);
			
		break;
		
		case 2:
		Fibonacci fibo=new Fibonacci();
		System.out.println("-----------Bienvenido a serie de fibonacci-----------");
		System.out.println("-------------ingresa un numero de limite-------------");
		limite=dato.ingresarNumero();
		System.out.println(" ");
		total=fibo.retornarFibonacci(limite);
		break; 
		
		case 3:
		
		System.out.println("-----Bienvenido a calculadora------");
		System.out.println(" ");
		System.out.println("---------escoje un signo-----------");
		System.out.println(" ");
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println("|______ +  ....suma ____________|");
		System.out.println("|______ -  ...resta ____________|");
		System.out.println("|_______* .multiplicacion_______|");
		System.out.println("|______ / ...division __________|");
		System.out.println("| _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |");
		signo=dato.ingresarTexto();
		
		switch(signo){
			case "+" :
			System.out.println(" ");
			System.out.println("--------Bienvenido a suma---------");
			System.out.println(" ");
			System.out.println("--------Ingresa un numero---------");
			num1=dato.ingresarNumero();
			System.out.println("----Ingresa el segundo numero----");
			num2=dato.ingresarNumero();
			totalD=cal.suma(num1,num2); 
			System.out.println("---- El resultado de la suma es : "+totalD+" -----");
			break;
			
			case "-" :
			System.out.println(" ");
			System.out.println("--------Bienvenido a resta---------");
			System.out.println(" ");
			System.out.println("--------Ingresa un numero----------");
			num1=dato.ingresarNumero();
			System.out.println("-----Ingresa el segundo numero-----");
			num2=dato.ingresarNumero();
			totalD=cal.resta(num1,num2); 
			System.out.println("----- El resultado de la resta es: "+totalD+" ------");
			break;
			
			case "*" :
			System.out.println(" ");
			System.out.println("-------Bienvenido a multiplicacion------");
			System.out.println(" ");
			System.out.println("-----------Ingresa un numero------------");
			num1=dato.ingresarNumero();
			System.out.println("--------Ingresa el segundo numero-------");
			num2=dato.ingresarNumero();
			totalD=cal.multiplicacion(num1,num2); 
			System.out.println("----- El resultado de la multiplicacion es: "+totalD+" ------");
			
			break;
			
			case "/" :
			System.out.println(" ");
			System.out.println("------Bienvenido a division---------");
			System.out.println(" ");
			System.out.println("--------Ingresa un numero-----------");
			num1=dato.ingresarNumero();
			System.out.println("------Ingresa el segundo numero------");
			num2=dato.ingresarNumero();
			totalD=cal.division(num1,num2); 
			System.out.println("----- El resultado de la division es: "+totalD+" ------");
			
			break;
			
			default :
			System.out.println("Error: esa es una opcion no valida");
			
			break;
		}			
		
		break;
		
		default :
		System.out.println("Error: Eso no es una opccion valida, vuelve a intentarlo");
		break;
	}
	
	}

}