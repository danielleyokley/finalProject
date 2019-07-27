package ClassExample;

public class Player {

	private String teamName;
	private String position;
	
	private int value;
	
	public Player(String teamName, String position, int value) {
		this.teamName = teamName;
		this.position = position;
		this.value = value;
	}
	
	public void describe() {
		System.out.println(position + " : " + teamName + " - " + value);
	}
	
	public int getValue() {
		return value;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
