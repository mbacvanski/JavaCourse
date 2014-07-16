package playingCards;

import java.util.ArrayList;

public class DeckOfCards {
	protected static final String DIAMOND = "diamond";
	protected static final String CLUB = "club";
	protected static final String SPADE = "spade";
	protected static final String KING = "king";
	protected static final String QUEEN = "queen";
	protected static final String JACK = "jack";
	protected static final String _10 = "10";
	protected static final String _9 = "9";
	protected static final String _8 = "8";
	protected static final String _7 = "7";
	protected static final String _6 = "6";
	protected static final String _5 = "5";
	protected static final String _4 = "4";
	protected static final String _3 = "3";
	protected static final String _2 = "2";
	protected static final String _1 = "1";
	protected static final String ACE = "ace";
	protected static final String HEART = "heart";
	private ArrayList<PlayingCard> cards = new ArrayList<>();
	
	public DeckOfCards(){
		cards.add(new PlayingCard(new Suit(HEART), ACE));
		cards.add(new PlayingCard(new Suit(HEART), _1));
		cards.add(new PlayingCard(new Suit(HEART), _2));
		cards.add(new PlayingCard(new Suit(HEART), _3));
		cards.add(new PlayingCard(new Suit(HEART), _4));
		cards.add(new PlayingCard(new Suit(HEART), _5));
		cards.add(new PlayingCard(new Suit(HEART), _6));
		cards.add(new PlayingCard(new Suit(HEART), _7));
		cards.add(new PlayingCard(new Suit(HEART), _8));
		cards.add(new PlayingCard(new Suit(HEART), _9));
		cards.add(new PlayingCard(new Suit(HEART), _10));
		cards.add(new PlayingCard(new Suit(HEART), JACK));
		cards.add(new PlayingCard(new Suit(HEART), QUEEN));
		cards.add(new PlayingCard(new Suit(HEART), KING));
		
		cards.add(new PlayingCard(new Suit(DIAMOND), ACE));
		cards.add(new PlayingCard(new Suit(DIAMOND), _1));
		cards.add(new PlayingCard(new Suit(DIAMOND), _2));
		cards.add(new PlayingCard(new Suit(DIAMOND), _3));
		cards.add(new PlayingCard(new Suit(DIAMOND), _4));
		cards.add(new PlayingCard(new Suit(DIAMOND), _5));
		cards.add(new PlayingCard(new Suit(DIAMOND), _6));
		cards.add(new PlayingCard(new Suit(DIAMOND), _7));
		cards.add(new PlayingCard(new Suit(DIAMOND), _8));
		cards.add(new PlayingCard(new Suit(DIAMOND), _9));
		cards.add(new PlayingCard(new Suit(DIAMOND), _10));
		cards.add(new PlayingCard(new Suit(DIAMOND), JACK));
		cards.add(new PlayingCard(new Suit(DIAMOND), QUEEN));
		cards.add(new PlayingCard(new Suit(DIAMOND), KING));
		
		cards.add(new PlayingCard(new Suit(CLUB), ACE));
		cards.add(new PlayingCard(new Suit(CLUB), _1));
		cards.add(new PlayingCard(new Suit(CLUB), _2));
		cards.add(new PlayingCard(new Suit(CLUB), _3));
		cards.add(new PlayingCard(new Suit(CLUB), _4));
		cards.add(new PlayingCard(new Suit(CLUB), _5));
		cards.add(new PlayingCard(new Suit(CLUB), _6));
		cards.add(new PlayingCard(new Suit(CLUB), _7));
		cards.add(new PlayingCard(new Suit(CLUB), _8));
		cards.add(new PlayingCard(new Suit(CLUB), _9));
		cards.add(new PlayingCard(new Suit(CLUB), _10));
		cards.add(new PlayingCard(new Suit(CLUB), JACK));
		cards.add(new PlayingCard(new Suit(CLUB), QUEEN));
		cards.add(new PlayingCard(new Suit(CLUB), KING));
		
		cards.add(new PlayingCard(new Suit(SPADE), ACE));
		cards.add(new PlayingCard(new Suit(SPADE), _1));
		cards.add(new PlayingCard(new Suit(SPADE), _2));
		cards.add(new PlayingCard(new Suit(SPADE), _3));
		cards.add(new PlayingCard(new Suit(SPADE), _4));
		cards.add(new PlayingCard(new Suit(SPADE), _5));
		cards.add(new PlayingCard(new Suit(SPADE), _6));
		cards.add(new PlayingCard(new Suit(SPADE), _7));
		cards.add(new PlayingCard(new Suit(SPADE), _8));
		cards.add(new PlayingCard(new Suit(SPADE), _9));
		cards.add(new PlayingCard(new Suit(SPADE), _10));
		cards.add(new PlayingCard(new Suit(SPADE), JACK));
		cards.add(new PlayingCard(new Suit(SPADE), QUEEN));
		cards.add(new PlayingCard(new Suit(SPADE), KING));	
	}
}
