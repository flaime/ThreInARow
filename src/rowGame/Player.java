package rowGame;

public class Player {
	
	GamePlan gp;
	String name = "";
	
	public Player(String name, GamePlan referens) {
		this.name = name;
		this.gp = referens;
	}

}
