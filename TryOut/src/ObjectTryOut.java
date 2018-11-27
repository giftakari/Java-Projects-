import java.util.*;

public class ObjectTryOut {
	
	public int testScore1;
	public int testScore2;
	public int testScore3;
	public int testScore4;
	
	

	
	public static void main(String[] args) {
		
		ObjectTryOut scores = new ObjectTryOut();
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		do{
			
			System.out.println("Please enter a scores :");
			scores.testScore1 = input.nextInt();
			
			System.out.println("Please enter a score :");
			scores.testScore2 = input.nextInt();
			
			System.out.println("Please enter a score : ");
			scores.testScore3 = input.nextInt();
			
			System.out.println("Please enter a score");
			scores.testScore4 = input.nextInt();
			
			
			
		}
		while(count < 4);
	
	int average =scores.testScore1 + scores.testScore2 + scores.testScore3 + scores.testScore4;
			
		System.out.println("The Average is " + average );
		
		
		
		if (scores.testScore1 > scores.testScore2 && scores.testScore1 > scores.testScore3 
				&& scores.testScore1 > scores.testScore4)
			System.out.println("Highest Score is  " + scores.testScore1);
	
		
		else if (scores.testScore2 > scores.testScore1 && scores.testScore2 > scores.testScore3 
				&& scores.testScore2 > scores.testScore4)
			System.out.println("Highest Score is  " + scores.testScore2);
		
		else if (scores.testScore3 > scores.testScore1 && scores.testScore3 > scores.testScore2 
				&& scores.testScore3 > scores.testScore4)
			System.out.println("Highest Score is  " + scores.testScore3);
		
		else if (scores.testScore4 > scores.testScore1 && scores.testScore4 > scores.testScore2 
				&& scores.testScore4 > scores.testScore3)
			System.out.println("Highest Score is  " + scores.testScore4);
		
		else 
			System.out.println(" There is no HigheestScore");
		
		
		
		
		
		
		
		
		//System.out.print("d");
		}




	public int getTestScore1() {
		return testScore1;
	}




	public void setTestScore1(int testScore1) {
		this.testScore1 = testScore1;
	}




	public int getTestScore2() {
		return testScore2;
	}




	public void setTestScore2(int testScore2) {
		this.testScore2 = testScore2;
	}




	public int getTestScore3() {
		return testScore3;
	}




	public void setTestScore3(int testScore3) {
		this.testScore3 = testScore3;
	}




	public int getTestScore4() {
		return testScore4;
	}




	public void setTestScore4(int testScore4) {
		this.testScore4 = testScore4;
	}

	}


