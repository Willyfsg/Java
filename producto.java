import java.util.Scanner;

public class producto {
	public static void main (String argumento[]){

		//Crear objeto Scanner para obtener la entrada de los numeros
		Scanner entrada = new Scanner (System.in);

		int numero1,numero2,numero3; //creamos las variables donde se guardaran los enteros
		int producto; //variable donde se almacenara el resultado final


		//Indicamos el inicio del programa

		System.out.print("Este programa calcula el producto de tres enteros\n");

		System.out.print("Escriba el primer numero: ");
		numero1 = entrada.nextInt(); // lee el primer numero

		System.out.print("Escriba el segundo numero: ");
		numero2 = entrada.nextInt(); // lee el segundo numero

		System.out.print("Escriba el tercer numero: ");
		numero3 = entrada.nextInt(); // lee el tercer numero
		
		producto = numero1 * numero2 * numero3;

		System.out.printf("\nEl valor del producto de los tres numeros es: %d \n", producto);
		System.out.print("\n\nFin del programa");
	}
	
}
