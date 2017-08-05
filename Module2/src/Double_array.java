
public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		          // r //c            //r //c
		String colors[] [] = new String[3] [4];

		colors[0][0] = "Green";
		colors[0][1] = "Black";
		colors[0][2] = "Pink";
		colors[0][3] = "Orange";

		// Second row
		colors[1][0] = "Yellow";
		colors[1][1] = "Purple";
		colors[1][2] = "Blue";
		colors[1][3] = "White";

		// Third row
		colors[2][0] = "Violoet";
		colors[2][1] = "grey";
		colors[2][2] = "Red";
		colors[2][3] = "Royal blue";

		//for (int i = 0; i<3; i++) 
		//for (int j = 0; j<4; j++) 
		{
       // System.out.println(colors[i][j]);
        }
		
		
		
			
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
		
				
		
		
		
/*		String Rainbow []=new String [7];
		  
		  Rainbow[0]= "Red1"; 
		  Rainbow[1]= "Orange2"; 
		  Rainbow[2]= "Yellow3"; 
		  Rainbow[3]= "Green4"; 
		  Rainbow[4]= "Blue5"; 
		  Rainbow[5]= "Indigo6"; 
		  Rainbow[6]= "Violet7";
		  
		  int t= Rainbow.length;
		  System.out.println(t);
		  
		  for (int y=0; y<Rainbow.length;y++) 
		  {
		  System.out.println(Rainbow[y]);
		  }
	*/	
		
		}
		}

	



 
  
 
