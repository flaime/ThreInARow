package rowGame;

public abstract class Player {

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
	
	public String toString(){
		return teken; //var namn förut
	}
	
	public String getTecken(){
		return teken;
	}
	
	public abstract OneMove makeMove();

	public void profit(Player p) {
		// TODO Auto-generated method stub
		
	}
}
