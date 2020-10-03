import java.util.*;
import java.lang.*;

public class ejercicio8 {
	
	public static void main (String arg[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num, comprobar;
		
		System.out.println("Bienvenido al Progrma");
		System.out.print("Intrduce un entero para saber si es posible calcular su cuadrado: ");
		
		num = entrada.nextInt();
		comprobar = Math.sqrt(num) ; 
		
		if (num % comprobar == 0) {
			System.out.println("Si se puede expresar como el cuadrado de un numero entero.");
		}else {
			System.out.println("NO se puede expresar como el cuadrado de un numero entero.");

		}
		
		
	}


}
