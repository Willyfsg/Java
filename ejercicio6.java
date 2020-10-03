import java.util.*;

public class ejercicio6 {
	public static void main(String arg[]) {
		
		Scanner entrada = new Scanner(System.in);
		int num, extra, b;
		
		System.out.println("Bienvenido al Programa\n");
		System.out.print("Introduzca un numero: ");
		num = entrada.nextInt();
		
		num = num * 20;
		extra = num/10;
		System.out.println("El numero multiplicado por veinte y divido por diez: " + extra);
		
		extra = extra + num;
		
		System.out.println("El numero sumado a la multiplicacion: " + extra);
		
		b = extra/10 % 2;
		
		if (b==0) {
			System.out.println("El numero devuelto a dividir por diez tiene residuo cero: " + extra/10);
		}else {
			System.out.println("El numero devuelto a dividir por diez NO tiene residuo cero: " + extra/10);
		}

		
		System.out.println("\n\nFin del Programa");
		
	}
}
