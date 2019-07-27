package FinalProject;

public class Card {

	private String name;
	
	private int value;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public void describe() {
		System.out.println("Card :" + name + " - " + value);
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
