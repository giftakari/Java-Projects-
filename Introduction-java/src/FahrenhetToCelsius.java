import java.util.*;
public class FahrenhetToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

System.out.println("Enter the degree fahrenheit: ");
double fahrenheit = input.nextDouble();

double celsius = (5.0/9) * (fahrenheit -32);

// The int in before the celsius makes the output double to int value 

System.out.println("Fahrenheit " + fahrenheit + " is " + (int)(celsius) + " in Celsius");

	}

}
