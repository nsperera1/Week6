package WAR;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	public void describe() {
		System.out.println(name + " " + "has the cards.");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card flipTopCard = hand.get(0);
		hand.remove(0);
		return flipTopCard;
	}
	
	
	public void draw (Deck deck) {
		Card card = deck.drawCard();
		hand.add(card);
	}
	
	
	public void incrementScore() {
		this.score++;
	}
	
	public int getScore() {
		return score;
	}

	public int getValue() {
		return 0;
	}
	
	
	
	
	
	
	
	
}
