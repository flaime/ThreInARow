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
	}
	
	private void StartLope() {
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			//a lop to get the game going
			
			//add controll to not be abel to lay on a alredy layd plase
			
			gp.setPosition(PlayPlayer());
				
			//Do somting to be shor it vill go throt ewrey playewr
			//and do somting if the players mov isent is ok
			
			//Uppdatete grapichs
//			if(textGrafik == true){
//				tg.skrivUt();
//			}
			
			//Lock for vinst
			if(lookForProfit() != null){
				//do something
				//System.out.println(tittaEfterVinst() + "har vunnit");
				break;
			}
		}
		
	}
	
	int playerTurn  = -1;
	private OneMove PlayPlayer(){
		playerTurn++;
		if((playerTurn) == player.size())
			playerTurn = 0;
		return player.get(playerTurn).makeMove();
	}
	
	private Player lookForProfit(){
		return null;
		//do somthing her
	}
	
	private void EndGame() {
		
		
	}
}
