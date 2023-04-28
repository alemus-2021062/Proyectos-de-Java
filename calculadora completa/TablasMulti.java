public class TablasMulti{
	Leer dato=new Leer();
	int num1;
	int num2;
	int contador=0;
	int totalM;
	
	public int retornarTotalM(int num1, int num2){
		do {
			System.out.println("--->   "+num1+" * "+contador+" = "+totalM);
			contador++;
			totalM=num1*contador;
		}while(contador<=num2);
		return totalM;
	}
	


}