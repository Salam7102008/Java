
public class Static_nonstatic {

	     int l= 450;  // Non-static global variable.
	     int u= 550;
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Rules 1) Static can only call static stuff, non-static is not allowed.
// Rules 2) Non-static main function can only take non static function.
// Rules 3) If we want to call non-static function in a 
//		    static main function we need to create an object.
		
		
	car();
	
	
// creating and object for car2 function.
	Static_nonstatic model= new Static_nonstatic();   // Instance for an object.
	                                                  // You can call any non static function and variable.
	model.car2();    // Now calling car2 function.
	System.out.println(model.l);
	System.out.println(model.u);
	
	}

	
	public static void car()    // static function
	{
		System.out.println("Mercedez");
	}
	
	
	public void car2()        // Non static function
	{
	System.out.println("Tesla");
	}
	
	
	
	
	
}
