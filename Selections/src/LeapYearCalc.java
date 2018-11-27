import java.util.*;

public class LeapYearCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter a year");
int year = input.nextInt();

//Check if year is leap year 
boolean isLeapYear = 
(year % 4 ==0 && year % 100 != 0)||(year % 400 == 0);

//Display the result

System.out.println( "is " + year + " a leap y? " + isLeapYear);

	}

}
