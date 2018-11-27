import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        double[] myList = new double[10]; 
        //User input
        System.out.println("Enter " + myList.length + "values");
        //initilize Array with user input
	for (int i = 0; i < myList.length; i++ )
		myList[i] = input.nextDouble();
	
	// Generate inputs through math random 
	for (int i = 0; i < myList.length; i++) {
		myList[i] = Math.random() * 10;
		
		
	}
	for (int i = 0; i < myList.length; i++) {
		System.out.println(myList[i] + " ");
		
		
	}
	
	}

}
