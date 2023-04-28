public class Fibonacci{
	Leer dato=new Leer();
	int num=0;
	int conta=0;
	int num2=1;
	int total=0;
	int total2=0;
	int limite;
	int fibonacci;
	
	public int retornarFibonacci(int limite){
		System.out.println(total2);
		while(conta<=limite){
		total2=num+num2;
		conta=conta+1;
		num=num2;
		num2=total;
		total=num2+num;
		System.out.println(total);
		
	}
	return fibonacci;
}
}