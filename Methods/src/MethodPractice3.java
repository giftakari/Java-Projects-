
public class MethodPractice3 {

	public static void method1(int i, int num) {
		
		for (int j= 1; j <= i;j++  ) {
			System.out.println(num + " **");
			num *=2 ;
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while ( i <= 6) {
			method1(i,2);
			i++;
		}

	}

}
