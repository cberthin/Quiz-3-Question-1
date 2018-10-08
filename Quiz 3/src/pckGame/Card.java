package pckGame;
enum Suit{HEARTS, CLUBS, SPADES, DIAMONDS};
enum Rank{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

public class Card {
	Suit symbol;
	Rank number;
	
	public Card(Suit symbol, Rank number) {
		this.symbol=symbol;
		this.number=number;
	}
	
	public Suit getSuit() {
		return this.symbol;
	}
	
	public Rank getRank() {
		return this.number;
	}
	
}
