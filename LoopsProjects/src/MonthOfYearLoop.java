
public class MonthOfYearLoop {
	public static String[] months =
		{"January", "Febuary", "March", "April" ,"May" ,"June", "July" ,
				"August" , "September ", "October" ,"November", "December"};
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//   For loop
		
	loopMonth();
	loopMonth();

		
		// For Each Loop
		
		/*for (String month : months) {
			System.out.println(month);
		}
*/
		//While loop
		/*
		int counter = 0;
		
		while (counter != months.length) {
			
			System.out.println(months[counter]);
			counter++;
		}*/
	
	
	
	/*	int counter = 0;
		
		do {
			System.out.println(months[counter]);
			
		counter++;
		
		
		
		} 
		
		
		
		while(counter < months.length);
	*/
	}



	private static void loopMonth() {
		for(int i = 0 ; i < months.length ; i++)
		System.out.println(months[i]);
	}


//	

}
