package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FinalProject.Card;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();
	
	
	public Deck() {
		String[] cardNames = {"Ace of Clubs", "Ace of Spades", "Ace of Hearts", "Ace of Diamonds",
				"Two of Clubs", "Two of Spades", "Two of Hearts", "Two of Diamonds",
				"Three of Clubs", "Three of Spades", "Three of Hearts", "Three of Diamonds",
				"Four of Clubs", "Four of Spades", "Four of Hearts", "Four of Diamonds",
				"Five of Clubs", "Five of Spades", "Five of Hearts", "Five of Diamonds",
				"Six of Clubs", "Six of Spades", "Six of Hearts", "Six of Diamonds",
				"Seven of Clubs", "Seven of Spades", "Seven of Hearts", "Seven of Diamonds",
				"Eight of Clubs", "Eight of Spades", "Eight of Hearts", "Eight of Diamonds",
				"Nine of Clubs", "Nine of Spades", "Nine of Hearts", "Nine of Diamonds",
				"Ten of Clubs", "Ten of Spades", "Ten of Hearts", "Ten of Diamonds",
				"Jack of Clubs", "Jack of Spades", "Jack of Hearts", "Jack of Diamonds",
				"Queen of Clubs", "Queen of Spades", "Queen of Hearts", "Queen of Diamonds",
				"King of Clubs", "King of Spades", "King of Hearts", "King of Diamonds"};
		Integer[] cardValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (String cardName : cardNames) {		
			for (int i = 0; i < cardValues.length; i++) {
				cards.add(new Card(cardName, cardValues[i]));
				
			}
		}
    
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
		
	}
	public void describeCards() {
		for (Card card : cards) {
			card.describe();
			
		}
	}
	public Card remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
}