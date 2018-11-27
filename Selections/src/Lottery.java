import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Generate a ramdom number.
		int lottery = (int)(Math.random() * 100);
		
		//Prompt user for input 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick(pick two numbers):" );
		int guess = input.nextInt();
		
		//Get lottery digits from lottery
		int lotteryDigit1 = lottery/10;
		int lotteryDigit2 = lottery %10;
		
		//Get digits from guess 
		int guessDigit1 = lottery/ 10;
		int guessDigit2 = lottery %10;
		
		System.out.println("Your lottery number is " + lottery);
		
		//Check the guess 
		
		if (guess == lottery)
			System.out.println("Enter the match: you win $10,100");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
		System.out.println("Match all digits : you won $ 3,00");
		else if (guessDigit1 == lotteryDigit1 
				|| guessDigit1 == lotteryDigit2 
				|| guessDigit2 == lotteryDigit1 
				|| guessDigit2 == lotteryDigit2)
		System.out.print( "Match one digit : you won $1,000");
		else 
			System.out.print("Sorry no match,try again");
		
		

	}

}
