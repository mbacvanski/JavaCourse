package playingCards;

import java.util.ArrayList;

public class Suit {
	
	public static ArrayList<String> suits = new ArrayList<>();
	private String suit = "";
	
	static {
		suits.add("club");
		suits.add("spade");
		suits.add("diamond");
		suits.add("heart");
	}
	
	public Suit(String suit) {
		for (String s : suits) {
			if (s.equals(suit)) {
				this.suit = suit;
			}
		}
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		for (String s : suits) {
			if (s.equals(suit)) {
				this.suit = suit;
			}
		}
	}
}
