import java.util.*;

public class SubstractionLoopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUESTIONS =5;//Number of questions
		int correctCount =0; // Count the number of correct questions
		int count = 0 ;         // Counts the number of Questions  
		long startTime = System.currentTimeMillis();
		String output = " "; // Output the string is initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			//1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			
			//2. If number1 < number 2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			
			//3. Prompt the students to answer "Whats the number1-number2
			System.out.print("What is " + number1 + "-" + number2 + "? ");
			int answer = input.nextInt();
			
			//Grade the answer and display the result
			if (number1 - number2 == answer) {
			System.out.println("You are correct");
			correctCount++;
			}
			else 
				System.out.println("Your answer is wrong.\n" + number1 
						+ " " + number2 + " should be " + (number1 + number2));
			count++;  //Increase the question count
			
			output += "\n" + number1 + "-" + number2 + "=" + answer +
					((number1-number2 ==answer) ? " correct" : " wrong" );
			}
		
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println(" Correct count is " + correctCount +
				"\nTest time is " + testTime / 1000 + "seconds\n" + output);

	}

}
