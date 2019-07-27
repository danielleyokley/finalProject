package ClassExample;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teams teams = new Teams();
		teams.randomize();
		//teams.describePlayers();
		//teams.draft().describe();
		Player player1 = teams.draft();
		Player player2 = teams.draft();
		
		if (player1.getValue() == player2.getValue()) {
			System.out.println("Draw");
		} else if (player1.getValue() > player2.getValue()) {
			System.out.println("Player 1 wins!");
		} else {
			System.out.println("Player 2 wins!");
		}
	}

}
