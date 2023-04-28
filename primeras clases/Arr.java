public class Arr{
	public static void main(String args[]){
		int buscado=3;
		int veces=0;
		int arr[]={3,276,3,134,3,85,31};
		
		for(int i:arr){
			if (buscado!=i){
				continue;
		}
		System.out.println("si funciona");
		veces++;
	
	
	}
	System.out.println("el numero "+buscado+" se repite "
	+veces+" veces");


}
}