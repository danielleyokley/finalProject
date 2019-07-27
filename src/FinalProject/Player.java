package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	Player(int score) {
		score = 0;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	private static List<Card> hand = new ArrayList<Card>();
	private String playerName; 
	
	
	public void describe() {
		System.out.println("Player :" + playerName + " - " + hand);
	}
	
	public static Card flip() {
		return hand.remove(0);
	}
	
	public Card draw() {
		return hand.remove(0);
	}
	
	public void incrementScore(int score) {
		System.out.println(score + 1);
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
