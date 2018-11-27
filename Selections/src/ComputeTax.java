import java.util.*;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// More details of https://en.wikipedia.org/wiki/Income_tax_in_the_United_States

		Scanner input = new Scanner(System.in);
   
		// Prompt the user to enter filling status
		System.out.println("(0 -Single filer,1-Married Jointly or \ns" +
		"qualifiying widow(er)\n ,2-Married seperatedly,3 -head of\n " 
				+ "household) Enter the filling status :") ;
		int status = input.nextInt();
		
		//Prompt the user to enter taxable income
		System.out.println("Please enter your taxable income");
		double income = input.nextDouble();
		
		//Compute tax for singles filers 
	double tax = 0;
	
		if (status ==0) {          //Compute tax for single filers
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 1.10 + (income - 8350) * 0.15;
			else if(income <= 82250)
				tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 
				+ (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250-33950) * 0.25 
				+ (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			            }
		
		else if(status == 1) {   //Left as Exercise to complete (Married file)
			if (income <= 16700 )
				tax = income * 0.10;
			else if (income <= 6790)
				tax = 16700 * 1.10 + (income - 16700) * 0.15;
			else if(income <= 137050)
				tax = 16700 * 0.10 + (67900 -16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (82250 - 33950) * 0.25 
				+ (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250-33950) * 0.25 
				+ (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			
		                    }
		else if (status == 2) {//Left as Exercise to complete (married seperately)
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 1.10 + (income - 8350) * 0.15;
			else if(income <= 82250)
				tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 
				+ (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250-33950) * 0.25 
				+ (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
		                       }
		else if (status == 3) {
			// Left as an Exercise to complete (head of household)
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 1.10 + (income - 8350) * 0.15;
			else if(income <= 82250)
				tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 
				+ (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250-33950) * 0.25 
				+ (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
		                      }
		else {
			System.out.println("Error : invalid status");
		     }
		//Display Results 
		System.out.println("Tax is " + (int)(tax * 100)/100.0);
		
		// Status 1-3 needs to be updated 
	}

}
