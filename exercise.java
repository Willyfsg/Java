public class exercise {
	
	public static void main (String arg[]) {
		
		int add, aux1, aux2=0;
		int mult, aux3, aux4=1;
		
		//Loop for prints numbers from 1 to 5.
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.printf("%d ", i);
			
			//add all numbers from 1 to 5.
			add = aux2 + i;
			aux1 = suma;
			aux2 = aux1;
		}
		
		for(int j = 1 ; j <= 5 ; j++) {
			//Same but multiply.
			mult = aux4 * j;
			aux3 = mult;
			aux4 = aux3;
		}
		
		System.out.printf("\nThe add value is: %d", aux2);
		System.out.printf("\nThe multiply value is: %d", aux4);
		System.out.print("\nThe multiply divided by three is : " + aux4/3);
		
		System.out.print("\n\nEnd of Program.");
	}
}
