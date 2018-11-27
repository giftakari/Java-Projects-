import java.util.Scanner;

public class SubtractionRamdomQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generate two random single-digit integers
		
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);
		
		//If number1 < number2,swap number1 with number2
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp; 
			                   }
		
		//Prompt the student to answer "Whats number1 -number 2
		
		System.out.print("What is " + number1 + " -" + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//Grade the answer and display the result
		 if (number1 - number2 == answer) 
		 {
			 System.out.println("You are very correct");
		 }
		 else
		 {
			 System.out.println("Your answer is wrong");
			 System.out.println(number1 + "-" + number2 + " should be " + (number1 + number2));
		 }
		
		
	}

}
