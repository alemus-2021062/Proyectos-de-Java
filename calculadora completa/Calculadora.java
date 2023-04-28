public class Calculadora{
	Leer dato=new Leer();
	int total;
	
	public int suma(int num1, int num2){
		total=num1+num2;
		return total;
	}
	public int resta(int num1, int num2){
		total=num1-num2;
		return total;
	}
	public int multiplicacion(int num1, int num2){
		total=num1*num2;
		return total;
	}
	public int division(int num1, int num2){
		if (num2==0){
			System.out.println("------el 0 no es un numero valido---------");
		} else {total=num1/num2;
			}
			return total;
		}


}