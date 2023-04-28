public class Clase2{
	public static void main(String args[]){
		int totalSuma;
		int totalResta;
		int totalMultiplicacion;
		int totalDivision;
		char signo='/';
		Operacion objetoOperacion=new Operacion();
		System.out.println("1..........suma");
		System.out.println("1..........resta");
		System.out.println("1..........multiplicacion");
		System.out.println("1..........division");
		
		switch(signo){
			
			case '+' :
			totalSuma=objetoOperacion.suma(1,5);
			System.out.println("el total de la suma es: "+ totalSuma);
			break; 
			
			case '-' :
			totalResta=objetoOperacion.resta(18,8);
			System.out.println("el total de la resta es: "+ totalResta);
			break;
			
			case '*' :
			totalMultiplicacion=objetoOperacion.multiplicacion(5,5);
			System.out.println("el total de la multiplicacion es: "+ totalMultiplicacion);
			break;
			
			case '/' :
			totalDivision=objetoOperacion.division(50,0);
			System.out.println("el total de la division es: "+ totalDivision);
			break;
			default: 
				System.out.println("esa no es una opcion");
				break;
			
			
			
		}
		
	
	
	
	
	}

}