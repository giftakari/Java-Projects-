package bankAccount;



import java.util.*;
//package bankAccount;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
         
		Account myAccount = new Account();
		System.out.printf("Initial name is : %s%n%n%n ", myAccount.getName());
		
		//Prompt for and read name 
		System.out.println("Pleade enter a valid number : ");
		String theName = input.nextLine();
		System.out.println();
		
		//display the name in object account 
		System.out.printf("Name in Object  Account is : %n%s%n", myAccount.getName());
	}

}
