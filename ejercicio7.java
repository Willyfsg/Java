import java.util.*;

public class ejercicio7 {
	
	public static void main(String arg[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero,b;
		
		System.out.println("Bienvenido al Programa");
		System.out.print("Introduzca un numero para comprobar si es Par o Impar: ");

		numero = entrada.nextInt();
		
		b = numero % 2;
		if (b!=0) {
			System.out.println("\nEl numero es impar.");
		}else {
			System.out.println("\nEl numero es par.");
		}
		
		System.out.println("\n\nFin del Programa.");

		
		
	}

}
