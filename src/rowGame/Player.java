package rowGame;

public class Player {

	GamePlan gp;
	String name = "";

	static int numberOfPlayers = 0;
	String teken = "No tecken has ben given";

	public Player(String name, GamePlan referens) {
		this.name = name;
		this.gp = referens;

		// to sett the "tecken"
		if (numberOfPlayers == 0) {
			teken = "X";
		} else if (numberOfPlayers == 1)
			teken = "O";
		else
			teken = "P" + numberOfPlayers;
		numberOfPlayers++;
	}

}
