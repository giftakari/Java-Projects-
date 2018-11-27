
public class MethodPractice {
  public static int calculateAge(int birthYear) 
  {
	  return 2018 - birthYear;
  }
  public static void yearsUntilRetirement(int year, String firstName) {
	  int age = calculateAge(year);
	  int retirement = 65 - age;
	  
	  if (retirement > 0) 
	  {
	  System.out.println(firstName + " Retires in " + retirement + "years");
	  }
	  else 
		  System.out.println(firstName + "Already retired");
	  
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ageJohn = calculateAge(1990);
		int ageMike = calculateAge(1948);
		int ageJane = calculateAge(1969);
		
		
		// Calls the yearsUtilRetirement method
		
         yearsUntilRetirement(1990,"John");
         yearsUntilRetirement(1948,"Mike");
         yearsUntilRetirement(1969,"Sam");
         
	}

}
