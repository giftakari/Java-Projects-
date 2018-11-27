import java.util.*;

public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner input = new Scanner(System.in);
  
  //Prompt the user for enter weight in pounds
     System.out.print("Enter the wight in pounds:  " );
     double weight = input.nextDouble();
     
     //Prompt the user to enter height  in inches
     System.out.print("Please enter height in inches: ");
     double height = input.nextDouble();
     
     final double KILOGRAMS_PER_POUND = 0.45359237; //Declaring Constant
     final double  METERS_PER_INCH = 0.0254;  // Declaring a Constant
     
     //Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms/(heightInMeters * heightInMeters);
     
    System.out.printf("Your BMI is %5.20f\n ", bmi);
    //Display the result
    System.out.println("BMI is " + bmi);
      if(bmi < 18.5) 
      System.out.println("Underweight");
      else if(bmi <25)
      System.out.println("Normal");
      else if(bmi < 30)
      System.out.println("Overweight");
      else
    	  System.out.println("Obese");

	}

}
