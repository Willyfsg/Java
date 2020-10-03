import java.util.*;
import java.lang.*;

public class squarecheck {
	
	public static void main (String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		double num, check;
		
		System.out.println("Welcome to the Program");
		System.out.print("Input a number to see if there is a square of it: ");
		
		num = input.nextInt();
		check = Math.sqrt(num) ; 
		
		if (num % check == 0) {
			System.out.println("Yeah, has a square number!");
		}else {
			System.out.println("No, doesn't have a square number!.");
		}
		
		System.out.print("\n\nEnd of Program.");
	}
}
