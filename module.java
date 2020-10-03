import java.util.*;

public class module {
	public static void main(String arg[]) {
		
		Scanner input = new Scanner(System.in);
		int num, extra, b;
		
		System.out.println("Welcome to the Program\n");
		System.out.print("Input a number: ");
		num = input.nextInt();
		
		num = num * 20;
		extra = num/10;
		System.out.println("The number multiply by twenty and divided by ten is: " + extra);
		
		extra = extra + num;
		
		System.out.println("The number add to the multiply: " + extra);
		
		b = extra/10 % 2;
		
		if (b==0) {
			System.out.println("The result from the division has residual zero: " + extra/10);
		}else {
			System.out.println("The result from the division has NOT residual zero: " + extra/10);
		}

		System.out.println("\n\nEnd of Program.");		
	}
}
