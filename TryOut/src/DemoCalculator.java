import java.util.*;

public class DemoCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get user input
		System.out.println("Please enter a number:  ");
		int calc1 = input.nextInt();
		
		System.out.println("Please enter another number");
		int calc2 = input.nextInt();
		
		int total = calc1 + calc2;
		
		StringBuilder answer = new StringBuilder();
		answer.append("The result of the answer is ");
		
		
		
		System.out.println(answer.toString().toUpperCase() + total);
		

	}

}
