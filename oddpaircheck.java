import java.util.*;

public class oddpaircheck {
	
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		int num,b;
		
		System.out.println("The Program Starts");
		System.out.print("Input a number to check if is ODD or PAIR: ");

		num = input.nextInt();
		
		b = num % 2;
		if (b!=0) {
			System.out.println("\nIts a ODD number.");
		}else {
			System.out.println("\nIts a PAIR number.");
		}
		
		System.out.println("\n\nEnd of Program.");
	}

}
