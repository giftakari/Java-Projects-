import java.util.Scanner;

public class SentinalValue {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Read an Initial data
		System.out.println("Enter an integer(the input ends if it is 0): ");
		int data = input.nextInt();
		
		//Keep reading data until the input is 0
		int sum = 0;
		while (data != 0) {
			sum += data;
			
			//Read the next data
			System.out.println("Enter an integer (the input ends if its o): ");
			data = input.nextInt();
		}
		
		
		System.out.println("The sum is " + sum);

	}

}
