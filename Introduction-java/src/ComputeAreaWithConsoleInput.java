import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
	System.out.print("Please enter a number : ");
	
		
		double number = input.nextDouble();
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		
		double average = (number + number1 + number2 + number3)/4;
				
		
		
		//System.out.println("The Area of radius " + radius + " is " + area);
		System.out.println(" The average of " + number + " " + number1 + " "+ number2 +" "+ number3 + " is number " + average);
		
		
		
		
		

	}

}
