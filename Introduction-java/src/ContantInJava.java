import java.util.Scanner;

public class ContantInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double PI = 3.14159; // Declare a constant

//Create a Scanner Object
Scanner input = new Scanner(System.in);

//Prompt users to enter radius
System.out.println("Please enter a valid number :");
double radius = input.nextDouble();

// Compute Area

double area = radius * radius * PI;

System.out.println("The Area for the circle of radius " + radius + " is " + area);


	
	}

}
