import java.util.Scanner;
public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Please enter an integer value:  ");		
int seconds = input.nextInt();

int minutes = seconds/60;

int remainingSeconds = seconds % 60;



System.out.println(seconds + " seconds is " + minutes + " minutes " + remainingSeconds + " seconds ");
	
	}

}
