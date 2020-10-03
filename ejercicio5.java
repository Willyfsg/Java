public class ejercicio5 {
	
	public static void main (String arg[]) {
		
		int suma, aux1, aux2=0;
		int mult, aux3, aux4=1;
		
		//Bucle for para imprimir los 5 primeros numeros positivos
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.printf("%d ", i);
			
			//Suma de los numeros.
			suma = aux2 + i;
			aux1 = suma;
			aux2 = aux1;
		}
		
		for(int j = 1 ; j <= 5 ; j++) {
			//Lo mismo pero multiplicando.
			mult = aux4 * j;
			aux3 = mult;
			aux4 = aux3;
		}
		
		System.out.printf("\nEl valor de la suma de los cinco primeros enteros positivos es: %d", aux2);
		System.out.printf("\nEl valor de la multiplicacion de los cinco primeros enteros es: %d", aux4);
		System.out.print("\nLa multiplicacion dividida por tres es: " + aux4/3);
		
		System.out.print("\n\nFin del Programa.");
	}
}
