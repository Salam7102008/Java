import java.util.Scanner;

public class Input_divide_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      // This is scanner object	with  argument
		Scanner in = new Scanner     (System.in);
		
		System.out.println(" What is your number:  ");
		int num = in.nextInt();	
		
		System.out.println(" What is your second number?");
		int num1 = in.nextInt();	
		
		System.out.println(" Answer of the division");
		int divide = (num/num1);
		
		System.out.println(divide);
		
	}

}
