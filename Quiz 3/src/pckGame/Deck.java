package pckGame;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	int[] number_Cards_Suit=new int[4];
	int[] number_Cards_Rank=new int[13];
	ArrayList<Card> card_Deck= new ArrayList<>();
	
/*	For testing purposes, will output card remaining after chosing cards
 	public static void main(String[] args) {
		Deck deck=new Deck();
		Card Drawn=deck.Draw();
		System.out.println(Drawn.getSuit());
		System.out.println(Drawn.getRank());
		System.out.println("There are " + deck.getRemaining(Drawn.getSuit()) + " " + Drawn.getSuit() + " remaining");
		System.out.println("There are " + deck.getRemaining(Drawn.getRank()) + " " + Drawn.getRank() +"'s" + " remaining");
	}

*/
	
	public Deck(){
		for(int i=0;i<4;i++) {
			number_Cards_Suit[i]=13;
		}
		for(int i=0;i<13;i++) {
			number_Cards_Rank[i]=4;
		}
		
		for(Suit s:Suit.values()) {
			for(Rank r:Rank.values()) {
				card_Deck.add(new Card(s, r));
			}
		}
		
	}
	
	public Card Draw() {
		Random rand=new Random();
		int number=rand.nextInt(card_Deck.size());
		Card drawn= card_Deck.remove(number);
		Suit suit=drawn.getSuit();
		Rank rank=drawn.getRank();
		number_Cards_Suit[suit.ordinal()]-=1;
		number_Cards_Rank[rank.ordinal()]-=1;
		return drawn;
	}
	
	public int getRemaining(Object eNum) {
		if(eNum instanceof Suit) {
			return number_Cards_Suit[((Suit) eNum).ordinal()];
		}
		
		else if(eNum instanceof Rank) {
			return number_Cards_Rank[((Rank) eNum).ordinal()];
		}
		
		else {
			return 0;
		}
	}
}
