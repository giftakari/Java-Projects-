

package studentScore;

import java.util.Scanner;

public class StudentScores {

	  double score1;
		double score2;
		double score3 ;
		double highestScore;
	
     public double getScores() {
	    	
	    	 double averageScores = (int)(this.score1 + this.score2 + this.score3 )/ 3;
	    	 return averageScores;
	    	 
	    	
	 }
     
    
    	 public double getHighestScore() {
    		 double highestScore;
    		 
    		 if (score1 > score2 && score1 > score2)
		    		return highestScore = score1;
		    		else if (score2 > score1 && score2 > score3)
		    			return highestScore = score2;
		    	
		    		else return 
		    				highestScore = score3;
	    		
    		 
    		 
    	 }
    	 
    
	    
	    public double setAverageScores(double averageScores) {
	    	
	    	
	    	
	  return averageScores;
	  
	    	
	    }
	    
	    public double setHighestScore(double highestScore) {
	    	
	    	return highestScore;
	    }
	    
	    
	    
		public static void main(String[] args) {
			
			
			
			//Get inputs from user
			
			
			
			System.out.println("Please enter a score");
			
			StudentScores studentGrade = new StudentScores();
			
		Scanner input = new Scanner(System.in);
		studentGrade.score1 = input.nextDouble();
		studentGrade.score2 = input.nextDouble();
		 studentGrade.score3 = input.nextDouble();
		
		
		System.out.println("Your scores are " + studentGrade.score1 + " " 
		+ studentGrade.score2 + " " + studentGrade.score3);
		
		
				
		
		System.out.println("The average the grades is " + studentGrade.getScores() );

		System.out.println("The average score is " + studentGrade.getHighestScore() );
		
			
		
			
			
			

		}
	
	
}
