
public class FutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tuition = 10000; // Tuition at year 0 (Start of program)
		int year = 0;
		 while (tuition < 20000) {
			 
			 tuition = tuition * 1.07;
			 year++;
		 }
          System.out.println("Tuition will be doubled in " + year + " years");
          System.out.printf("Tuition will be doubled $%.2f  in %1d years" , tuition , year);
          
          
	}

}
