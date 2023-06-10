package WAR;

public class Card {
	
	public static int Two = 2;
	public static int Three = 3;
	public static int Four = 4;
	public static int Five = 5;
	public static int Six = 6;
	public static int Seven = 7;
	public static int Eight = 8;
	public static int Nine = 9;
	public static int Ten = 10;
	public static int Jack = 11;
	public static int King = 12;
	public static int Queen = 13;
	public static int Ace = 14;
	private int setnameOfCard;
	private int setvalueOfCard;
	
	
	public Card(int nameOfCard, int valueOfCard) {
		this.setnameOfCard(nameOfCard);
		this.setvalueOfCard(valueOfCard);
		
	}

	private void setnameOfCard(int nameOfCard2) {
		if(nameOfCard2 >= 0 && nameOfCard2 <=2) {
			this.setnameOfCard = nameOfCard2;
		}
	}

	private void setvalueOfCard(int valueOfCard2) {
		if(valueOfCard2 < 2 || valueOfCard2 > 14) {
			this.setvalueOfCard = valueOfCard2;
		}
	}
	
	public int getnameOfCard() {
		return setnameOfCard;
	}
	
	public int getvalueOfCard() {
		return setvalueOfCard;
	}

	public void describe() {
		
	}

	public Card flip() {
		return null;
	}
	
	
	

}
