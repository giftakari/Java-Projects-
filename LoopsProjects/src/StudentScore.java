import java.util.*;
public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	
		
        //Declare the variables
		
		
		//Input from students
		System.out.print("Please enter your score: ");
		int score = input.nextInt();
		
		int marks = 0;
		int count = 0;

	 //boolean passMark = (score >59 && score >=100);
		
		//boolean passMark = (score > 0 && score <= 10);
		
		
		for (marks =0 ; marks <= 5; marks++)	{
			//Input from students
			//System.out.printl("Please enter your score: ");
	
			System.out.print("Please enter your score: ");
			 score = input.nextInt();
			 System.out.print("Please enter your score: ");
			 score = input.nextInt();
			 System.out.print("Please enter your score: ");
			 score = input.nextInt();



				if (score >59 && score >= 100)
					System.out.println("Congratulations you passed");
				else if (score < 0 )
					System.out.println("Invalid score,please enter an integer eg 1-100 etc");
				else
					System.out.println("Sorry you did not pass at this time");
			 count++;
		}
	
		{
			/*if (score >59 && score >= 100)
				System.out.println("Congratulations you passed");
			else if (score < 0 )
				System.out.println("Invalid score,please enter an integer eg 1-100 etc");
			else
				System.out.println("Sorry you did not pass at this time");*/
		}
		

	}
}

