
public class Local_globle {

static int x= 600;   // This is Global variable, you can use it multiple times any local variable function. Global variable Not a function
static int t= 500;	
static int g= 700;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	hello();	
	value();	
	name();	
	}

	
	
	public static void hello()
	{
	System.out.println("Hello how are you?");
	}
	
	
	public static void value()
	{
	int a= 100;     // local variable - you can use local variable for a specific function only.
	int c= 200;     // local variable - (you cannot use others local variable.
	                // If you want to use local variable multiple times you have to declare first every time) 

	System.out.println(a);  
	System.out.println(c);	
	System.out.println(x);  // This is printing for Global variable
	System.out.println(t);  // This is printing for Global variable
	System.out.println(g);
	}
	
	
	public static void name()
	{
		int a= 100;    // local variable
		int c= 200;    // local variable
		
		System.out.println(a);   
		System.out.println(c); 
		System.out.println(x);   // This is printing for Global variable
		System.out.println(t);   // This is printing for Global variable
		System.out.println(g);
	}
	
	
}
