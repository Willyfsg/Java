import java.util.Scanner;
import java.lang.Math;
public class ejercicio4{
	
	public static void main (String argumentos[]) {
		
		Scanner entrada = new Scanner(System.in);	//Declaramos la variable de entrada que usaremos para Scannear los prox valores.
		
		final double PI = 3.1416; // Constante PI
		
		double Radio, Area;
		
		System.out.println("Bienvenido al programa que calcula el Area del un circulo\n");
		System.out.print("Introduzca el Radio del circulo: ");
		
		Radio = entrada.nextFloat();
		
		Area = PI * Math.sqrt(Radio);
		
		System.out.printf("El Area del circulo es: %.2f", Area);
		System.out.println("\n\nFin del Programa.");
		
	}
}
