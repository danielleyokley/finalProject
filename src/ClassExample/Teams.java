package ClassExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teams {
	//13iterateons of 4 or 4 iteration of 13
	//in deck - encapsulated list of cards
	
	private List<Player> players = new ArrayList<Player>();
	
			
	public Teams() {
		String[] teamNames = {"Lakers", "Bulls", "Suns"};
		String[] positions = {"Small Forward", "Point Guard", "Power Forward", "Center", "Shooting Guard"};
		
		for (String teamName : teamNames) {		
			for (int i = 0; i < positions.length; i++) {
				players.add(new Player(teamName, positions[i], i));
				
			}
		}
    
	}
	public void randomize() {
		Collections.shuffle(players);
	}
	
	public Player draft() {
		return players.remove(0);
		
	}
	public void describePlayers() {
		for (Player player : players) {
			player.describe();
			
		}
	}
}
