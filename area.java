import java.util.Scanner;
import java.lang.Math;
public class area{
	
	public static void main (String argumentos[]) {
		//Declare a input from Scanner
		Scanner input = new Scanner(System.in);	
		
		final double PI = 3.1416; // constant number PI
		
		double Radius, Area;
		
		System.out.println("Welcome to the Area Calculator Program \n");
		System.out.print("Please enter the Radius of the circle: ");
		
		Radius= input.nextFloat();
		
		Area = PI * Math.sqrt(Radius);
		
		System.out.printf("The Area of the circle is: %.2f", Area);
		System.out.println("\n\nEnd of Program.");
		
	}
}
