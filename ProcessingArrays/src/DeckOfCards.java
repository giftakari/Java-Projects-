
public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Arrays of Deck 
		int[] deck = new int [52];
		String[] suits = { "Spades", "Hearts", "Diamond", " Clubs"};
		String[] ranks = {"Ace","2", "3", "4", "5", "6","7", "8","9", "10","Jack", "Queen", "King"};
		
        //Initialize the cards 
		 for (int i = 0 ; i < deck.length; i++)
		 {
			 deck[i] = i;
		 }
		  //Shuffle the Cards
			 for (int i = 0; i < deck.length; i++)
			 {
			 int index = (int)(Math.random() * 10);
			 int temp = deck[i];
			 deck[i] = deck[index];
			 deck[index] = temp ;
			 
		      }
		 
		 //Display the first four cards
		 for (int i = 0; i < 4; i++) {
			 String suit = suits [deck[i] / 13];
			 String rank = ranks[deck[i] % 13];
			 
			 System.out.println("Card number" + deck[i] + " : " + rank + " of  " + suit);
		 }
		
	}

}
