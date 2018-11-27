import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input = new Scanner(System.in);
 
 //	Prompt user to enter two cities 
 
 System.out.print("Please the first city of choice : ");
 String city1 = input.nextLine();
 System.out.println("Please enter the second city of choice: ");
 String city2 = input.nextLine();
 
 if (city1.compareTo(city2)< 0)
	 System.out.println("The cities in the alphatical order are\n " + city1 +" " + city2 );
 
 else 
	 System.out.println("The cities in the alphatical order are\n " + city2 +" " + city1);

		
	}

}
