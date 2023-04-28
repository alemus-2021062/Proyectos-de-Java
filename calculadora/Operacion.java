public class Operacion{
	int total;
	
	public int  suma(int primerNumero, int segundoNumero){
		
		total=primerNumero+segundoNumero;
		return total;
	}	
		public int  resta(int primerNumero, int segundoNumero){
	
		total=primerNumero-segundoNumero;
		return total;
	}	
		public int  multiplicacion(int primerNumero, int segundoNumero){
	
		total=primerNumero*segundoNumero;
		return total;
	}	
		public int division(int primerNumero, int segundoNumero){
			if (segundoNumero==0){
				System.out.println("el 0 no es un numero valido");
		}	 else {total=primerNumero/segundoNumero;
				System.out.println("el resultado es: "+ total);
				}
				return total;
		}
}

	
