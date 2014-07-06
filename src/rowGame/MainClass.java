package rowGame;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	ArrayList<Player> player = new ArrayList<>();

	GamePlan gp;

	Graphics gr;

	public MainClass() {

		StartGame();
		StartLope();
		EndGame();
	}

	private void StartGame() {
		gp = new GamePlan(3, 3);
		player.add(new TextPlayer("palyer 1", gp));
		player.add(new TextPlayer("palyer 2", gp));
		gr = new TextGraphics(gp);
	}

	private void StartLope() {

		Scanner s = new Scanner(System.in);

		while (true) {
			// a lop to get the game going

			if (gr != null) {
				gr.updateGraphics();
			}

			// add controll to not be abel to lay on a alredy layd plase

			gp.setPosition(PlayPlayer());

			// Do somting to be shor it vill go throt ewrey playewr
			// and do somting if the players mov isent is ok

			// Uppdatete grapichs

			// Lock for vinst
			Player vinner = lookForProfit();
			if (vinner != null) {
				gr.updateGraphics();
				gr.profit(vinner);
				break;
			}
		}

	}

	int playerTurn = -1;

	private OneMove PlayPlayer() {
		playerTurn++;
		if ((playerTurn) == player.size())
			playerTurn = 0;
		return player.get(playerTurn).makeMove();
	}

	private Player lookForProfit() {
		Player p = null;

		// v�gr�ta vinster
		for (int y = 0; y < gp.getHeight(); y++) {

			ArrayList<Player> tempPlayerX = new ArrayList<>();
			for (int x = 0; x < gp.getWhite(); x++) {
				tempPlayerX.add(gp.getPosition(x, y));
			}
			if (isTheSame(tempPlayerX) == true)
				p = tempPlayerX.get(0);

		}
		// lodr�ta vinster

		for (int x = 0; x < gp.getWhite(); x++) {

			ArrayList<Player> tempPlayerY = new ArrayList<>();
			for (int y = 0; y < gp.getHeight(); y++) {
				tempPlayerY.add(gp.getPosition(x, y));
			}
			if (isTheSame(tempPlayerY) == true)
				p = tempPlayerY.get(0);

		}
		// tv�ra vinster

		return p;
		// do somthing her
	}

	private boolean isTheSame(ArrayList<Player> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) != list.get(i)) {
					return false;
				} else if (list.get(i) == null) {
					return false;
				}
			}

		}
		return true;

	}

	private void EndGame() {

	}
}
