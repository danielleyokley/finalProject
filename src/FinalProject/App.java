package FinalProject;

import FinalProject.Player;
import FinalProject.Deck;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
//		card.describePlayers();
//		teams.draft().describe();
		Player player1 = new Player();
		Player player2 = new Player();
			
		
		    for (int i = 0; i <= 52; i++) {
			
		    }
			
			deck.draw();
			
			for (int i = 0; i <= 26; i++) {

			}
			
			Player.flip();
			
			incrementScore();
			
		if (player1.getValue() == player2.getValue()) {
			System.out.println("Draw");
		} else if (player1.getValue() > player2.getValue()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}

	private static void incrementScore() {
		// TODO Auto-generated method stub
		
	}

}
