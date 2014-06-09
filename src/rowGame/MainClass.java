package rowGame;

import java.util.ArrayList;

public class MainClass {
	
	ArrayList<Player> player = new ArrayList<>();
	
	GamePlan gp;

	public MainClass() {
		
		StartGame();
		
		StartLope();
		
		EndGame();
	}


	private void StartGame() {
		gp = new GamePlan(3, 3);
		player.add(new TextPlayer("palyer 1", gp));
		player.add(new TextPlayer("palyer 2", gp));
		
	}
	
	private void StartLope() {
		
		
	}
	
	private void EndGame() {
		
		
	}
}
