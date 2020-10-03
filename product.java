import java.util.Scanner;

public class product {
	public static void main (String arg[]){

		//Declare a Scanner input
		Scanner input = new Scanner (System.in);

		int num1,num2,num3; 
		int product; 

		//The program begins

		System.out.print("This Program calculates the product of three numbers..\n");

		System.out.print("Input the 1st number: ");
		num1 = input.nextInt(); // lee el primer numero

		System.out.print("Input the 2nd number: ");
		num2 = input.nextInt(); // lee el segundo numero

		System.out.print("Input the 3rd number: ");
		num3 = input.nextInt(); // lee el tercer numero
		
		product =  num1 * num2 * num3;

		System.out.printf("\nThe result of the product is: %d \n", product);
		System.out.print("\n\nEnd of Program.");
	}
	
}
