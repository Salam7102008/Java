
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	numbers(555555555);	// This is argument.
	country(10.2565);	
	
	}
	
// This is a function.          Argument
	public static void numbers   (int i)  
	{    
		System.out.println(i);    // This is a action.   
	}
	
	public static void numbers (long u)
	{
		System.out.println(u);
	}
// Overloading is two different function with the same name but
// different arguments.
	
	
	public static void country (int y)
	{
		System.out.println(y);
	}
	
	public static void country (double z)
	{
		System.out.println(z);
	}
	
}
