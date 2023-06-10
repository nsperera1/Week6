package WAR;

public class App {

	public static void main(String[] args) {
		
		Player playerOne = new Player("Player1");
		Player playerTwo = new Player("Player 2");
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i = 1; i <=26; i++) {
			playerOne.hand.add(deck.drawCard());
			playerTwo.hand.add(deck.drawCard());
		}
	
		for (int i = 0; i< 26; i++) {
			playerOne.flip();
			playerTwo.flip();
		}
	
		if (playerOne.getValue() > playerTwo.getValue()) {
			playerOne.incrementScore();
		} else if (playerOne.getValue() < playerTwo.getValue()) {
			playerTwo.incrementScore();
		} else {
			System.out.println();
		}
	
		if (playerOne.score > playerTwo.score) {
	 		System.out.println("Player1 wins.");
	 	} else if (playerTwo.score > playerOne.score) {
	 		System.out.println("Player 2 wins.");
	 	}
		
		
	}
	
	 	
	
	
	
	
	
	
	
	
	
	
	
	
}
