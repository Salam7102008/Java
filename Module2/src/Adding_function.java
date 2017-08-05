
public class Adding_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SumAll(100,90,80);	
	car(5000,6000,7000,700,500,300);
		
	}

	// This is the function SumAll      This is the argument condition int a,b,c
   public static void SumAll          (int a, int b, int c)
    {
	int sum= a+b+c;     //local variable
	System.out.println(sum);
    }


// This is the function SumAll      This is the argument condition int f,y,z
   // public static void SumAll      (int f, int y, int z)
    {
	//int sum=f+y+z;
	//System.out.println(sum);
	}



    public static void car (int f, int y, int z, int a, int b, int c)
      {
      int car = ((f+y+z)-c);
      //int car = ((f-y-z)+c);
      //int car = ((f*y)-z);
     //int car = ((f-y)*z);
      System.out.println(car);
      }
     
}


