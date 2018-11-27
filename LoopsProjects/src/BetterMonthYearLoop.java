import java.util.*;

public class BetterMonthYearLoop {
	public static String[] months =
		{"January", "Febuary", "March", "April" ,"May" ,"June", "July" ,
				"August" , "September ", "October" ,"November", "December"};
	
	public static int getMonthNumber(String monthName) {
		for (int i =0 ; i < months.length ; i++) {
			if (monthName.equalsIgnoreCase(months[i]))
				return 1;
		}
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a month: ");
            String monthName = scanner.nextLine();
            if (monthName.length() == 0) {
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Month not found");
            } else {
                System.out.println(String.format(
                        "%s is month number %d", monthName, monthNumber +1));
            }
        }

    }
	
		
		

	

}
