package playingCards;

import java.util.ArrayList;

public class DeckOfCards {
	private ArrayList<PlayingCard> cards = new ArrayList<>();
	
	public DeckOfCards(){
		cards.add(new PlayingCard(new Suit("heart"), "ace"));
		cards.add(new PlayingCard(new Suit("heart"), "1"));
		cards.add(new PlayingCard(new Suit("heart"), "2"));
		cards.add(new PlayingCard(new Suit("heart"), "3"));
		cards.add(new PlayingCard(new Suit("heart"), "4"));
		cards.add(new PlayingCard(new Suit("heart"), "5"));
		cards.add(new PlayingCard(new Suit("heart"), "6"));
		cards.add(new PlayingCard(new Suit("heart"), "7"));
		cards.add(new PlayingCard(new Suit("heart"), "8"));
		cards.add(new PlayingCard(new Suit("heart"), "9"));
		cards.add(new PlayingCard(new Suit("heart"), "10"));
		cards.add(new PlayingCard(new Suit("heart"), "jack"));
		cards.add(new PlayingCard(new Suit("heart"), "queen"));
		cards.add(new PlayingCard(new Suit("heart"), "king"));
		
		cards.add(new PlayingCard(new Suit("diamond"), "ace"));
		cards.add(new PlayingCard(new Suit("diamond"), "1"));
		cards.add(new PlayingCard(new Suit("diamond"), "2"));
		cards.add(new PlayingCard(new Suit("diamond"), "3"));
		cards.add(new PlayingCard(new Suit("diamond"), "4"));
		cards.add(new PlayingCard(new Suit("diamond"), "5"));
		cards.add(new PlayingCard(new Suit("diamond"), "6"));
		cards.add(new PlayingCard(new Suit("diamond"), "7"));
		cards.add(new PlayingCard(new Suit("diamond"), "8"));
		cards.add(new PlayingCard(new Suit("diamond"), "9"));
		cards.add(new PlayingCard(new Suit("diamond"), "10"));
		cards.add(new PlayingCard(new Suit("diamond"), "jack"));
		cards.add(new PlayingCard(new Suit("diamond"), "queen"));
		cards.add(new PlayingCard(new Suit("diamond"), "king"));
		
		cards.add(new PlayingCard(new Suit("club"), "ace"));
		cards.add(new PlayingCard(new Suit("club"), "1"));
		cards.add(new PlayingCard(new Suit("club"), "2"));
		cards.add(new PlayingCard(new Suit("club"), "3"));
		cards.add(new PlayingCard(new Suit("club"), "4"));
		cards.add(new PlayingCard(new Suit("club"), "5"));
		cards.add(new PlayingCard(new Suit("club"), "6"));
		cards.add(new PlayingCard(new Suit("club"), "7"));
		cards.add(new PlayingCard(new Suit("club"), "8"));
		cards.add(new PlayingCard(new Suit("club"), "9"));
		cards.add(new PlayingCard(new Suit("club"), "10"));
		cards.add(new PlayingCard(new Suit("club"), "jack"));
		cards.add(new PlayingCard(new Suit("club"), "queen"));
		cards.add(new PlayingCard(new Suit("club"), "king"));
		
		cards.add(new PlayingCard(new Suit("spade"), "ace"));
		cards.add(new PlayingCard(new Suit("spade"), "1"));
		cards.add(new PlayingCard(new Suit("spade"), "2"));
		cards.add(new PlayingCard(new Suit("spade"), "3"));
		cards.add(new PlayingCard(new Suit("spade"), "4"));
		cards.add(new PlayingCard(new Suit("spade"), "5"));
		cards.add(new PlayingCard(new Suit("spade"), "6"));
		cards.add(new PlayingCard(new Suit("spade"), "7"));
		cards.add(new PlayingCard(new Suit("spade"), "8"));
		cards.add(new PlayingCard(new Suit("spade"), "9"));
		cards.add(new PlayingCard(new Suit("spade"), "10"));
		cards.add(new PlayingCard(new Suit("spade"), "jack"));
		cards.add(new PlayingCard(new Suit("spade"), "queen"));
		cards.add(new PlayingCard(new Suit("spade"), "king"));	
	}
}
