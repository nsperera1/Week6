package WAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	List<Card> deck = new ArrayList<Card>();
	
	public void shuffle() {
	Collections.shuffle(deck);
	}
	
	public Card drawCard() {
		Card cardDrew = this.deck.get(0);
		this.deck.remove(0);
		return cardDrew;
	}
	
	public List<Card> getCards() {
		return deck;
	}
	

}
