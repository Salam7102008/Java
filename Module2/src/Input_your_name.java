import java.util.Scanner;

public class Input_your_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// Q - How you input your information by using JAVA?		
// Ans - We use scanner object with input argument, we also have import util.Scanner.		
    
		
    // vertical format
		// This is scanner object  with  argument
//	    Scanner reader = new Scanner    (System.in);
//	   
//	    System.out.println("Your name");
//	    String n = reader.next();   //It's reading the input.
//	    System.out.println(n);
//	    
//	    System.out.println("Your age");				
//	    String g = reader.next();   //It's reading the input.
// 
//	    System.out.println("What do you do for living ");
//	    String k = reader.next();
		
		
		
	// Horizontal format          with  argument
		Scanner reader = new Scanner   (System.in);
		   
	    System.out.print("Your name:" +" ");
	    String n = reader.next();   //It's reading the input.
//	    System.out.println(n);
	    
	    System.out.print("Your age:" +" ");				
	    String g = reader.next();   //It's reading the input.
//	    System.out.println(g);
	    
	    System.out.print("What do you do for living:" +" ");
	    String k = reader.next();
//      System.out.println(k);
	}

}
