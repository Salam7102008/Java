import java.util.Scanner;

public class Input_add_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  // This is scanner object  with  argument
		Scanner reader = new Scanner (System.in);
		System.out.println("Your number");
		
		int n = reader.nextInt();   //It's reading the input.
		System.out.println("Put one more number");
		
		int p = reader.nextInt();   //It's reading the input.
		int sum = n+p;        // It's add both inputs.
		System.out.println("Your number is " + sum);
		
		
		
		
		
		
	}

}
