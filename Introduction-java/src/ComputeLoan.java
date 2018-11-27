import java.util.*;

public class ComputeLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Enter Annual Interest rate  in percentage ie 7%
		System.out.print("Please enter annual interest rate :  ");
		double annualInterestRate = input.nextDouble();
		
		//Obtain Monthly interest rate
		double monthlyInterestRate = annualInterestRate/1200;
		
     // Enter number of years 
		System.out.print("Please enter the number of years as an integer, eg 6,7 etc :  ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.print("Please enter a loan amount e.g 12000.08 : ");
		double loanAmount = input.nextDouble();
		
		//Calculate loan amount
		double monthlyPayment  = loanAmount * monthlyInterestRate/
				(1 - 1/Math.pow(1 +monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears;
	
		
		//Display result
		
		System.out.println("The Monthly repayment is $" +  (int)(monthlyPayment * 100)/ 100.0);
		System.out.println("The total payment is $" +(int)(totalPayment * 100/100.0));
		

	}

}
