import java.util.*;
public class HeightFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numStudents;
		
		double [] heights;
		System.out.println("How many students are in the class? ");
		numStudents = input.nextInt();
		heights = new double[numStudents];
		//Get heights from through loop inputs 
		for(int i = 0; i < numStudents; i++) 
		{
			System.out.println("Enter height:  ");
			heights[i] = input.nextDouble();
		}
		
       double maxHeight = heights[0];
       
       for (int i =1; i < heights.length; i++)
       {   
    	   if(maxHeight < heights[i])
    		   maxHeight = heights[i];
       }
       double total = 0;
       for (int i = 0; i < heights.length; i++) 
       {
    	   total += heights[i];
       
       }
	
	System.out.print("The tallest student is " + maxHeight + " inches");
	System.out.println("The average height of all students is "+ (total/numStudents) + "inches ");
	
	}
	
	

}
