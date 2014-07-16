package playingCards;

public class PlayingCard {

	private String type;
	private Suit suit = null;
	
	public PlayingCard(Suit suit, String type) {
		this.suit = suit;
		this.type = type;
	}

	public String getNumber() {
		return type;
	}

	public void setNumber(String type) {
		this.type = type;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public String toString() {
		String str = "";
		str = "Number: " + type + "/n" + "Suit: " + suit.getSuit();
		return str;
	}
}
