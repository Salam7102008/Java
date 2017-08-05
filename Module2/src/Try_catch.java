import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		     // Try catch handles exceptions and errors.
	try {	// Tries the specific code.
		
		  // This is scanner object  with  argument
			Scanner reader = new Scanner (System.in);
			System.out.println("Your number");
			
			int n = reader.nextInt();   //It's reading the input.
			System.out.println("Put one more number");
			
			int p = reader.nextInt();   //It's reading the input.
			int divide = n/p;        // It's dividing both inputs.
			System.out.println("Your number is " + divide);
		
	} catch (Exception e) {    // tries to catch every Exception "e" mentions all kind of error.
		
	System.out.println("Don't divide by 0 or input any word");	
	} 
  			

	}

}
