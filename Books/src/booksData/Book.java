package booksData;

public class Book {
	static int maxAmountOfPages = 500;
String title = "unknown";
String [] authors = new String[] {"Anonymous"};
int yearReleased = 2004, copiedSold = 0 , numberOfPages = 1400;


public static void main (String[] args ) {
	
	Book book1 = new Book();
	
	book1.title = "Learning Java";
	book1.authors = new String[] {
			"Godsgift Akari",
			"John Akari",
			"George Akari"
	                             };
	
	
      Book book2 = new Book();
      book2.title = "Queen Akari";
      book2.authors = new String[] {"Kelvin Mopho", "Inmo Mopho"};
      
      Book superLargeBook = new Book();
      superLargeBook.title = "Super Large Boring book";
      
      System.out.println("I have a book with me " + superLargeBook.title );
      System.out.println("Written by : " + superLargeBook.authors);
      System.out.println("With number of pages :" + superLargeBook.numberOfPages);


}
      
}

