
public class Tow_array_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//Rainbow table      
		           //  r              r
		String Rainbow []=new String [7];
		  
		  Rainbow[0]= "Red1"; 
		  Rainbow[1]= "Orange2"; 
		  Rainbow[2]= "Yellow3"; 
		  Rainbow[3]= "Green4"; 
		  Rainbow[4]= "Blue5"; 
		  Rainbow[5]= "Indigo6"; 
		  Rainbow[6]= "Violet7";
		  
		  
		  
//Colors table
                  // r //c            //r //c
		String colors[] [] = new String[3] [4];

		colors[0][0] = "Green2";
		colors[0][1] = "Black2";
		colors[0][2] = "Pink2";
		colors[0][3] = "Orange2";

		// Second row
		colors[1][0] = "Yellow3";
		colors[1][1] = "Purple3";
		colors[1][2] = "Blue3";
		colors[1][3] = "White3";

		// Third row
		colors[2][0] = "Violoet4";
		colors[2][1] = "grey4";
		colors[2][2] = "Red4";
		colors[2][3] = "Royal blue4";

		//for (int i = 0; i<3; i++) 
		//for (int j = 0; j<4; j++) 
		{
       // System.out.println(colors[i][j]);
        }
		
//for printing Rainbow table
		 //int t= Rainbow.length;
		  //System.out.println(t);
		  
		  for (int y=0; y<Rainbow.length; y++) 
		  {
		  System.out.println(Rainbow[y]);
		  }
		
		  
		  
	  System.out.println("****************************");
	  
		   
		  
//for printing colors table
			// Good for large tables
			       
			     int rows=colors.length;
			     int cols=colors[0].length;
			 //  System.out.println(rows);
			 //  System.out.println(cols);
			   
			      // argument for rows
		for (int rownum=0; rownum<rows; rownum++) 
		
			    //argument for columns
		for (int column=0; column<cols; column++)
		{
	    //argument for printing rows and columns
	    System.out.println(colors[rownum][column]);
        }
		
		
	}
		
	
}
