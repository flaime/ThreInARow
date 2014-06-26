package rowGame;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	ArrayList<Player> player = new ArrayList<>();
	
	GamePlan gp;
	
	Graphics gr;

	public MainClass() {
		
		StartGame();
		System.out.println("steg 1");
		StartLope();
		System.out.println("steg 2");
		EndGame();
		System.out.println("steg 3");
	}


	private void StartGame() {
		gp = new GamePlan(3, 3);
		System.out.println("Del steg 1");
		player.add(new TextPlayer("palyer 1", gp));
		System.out.println("Del steg 2");
		player.add(new TextPlayer("palyer 2", gp));
		System.out.println("Del steg 3");
		
	}
	
	private void StartLope() {
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			//a lop to get the game going
			
			//add controll to not be abel to la on a alreday layd plase
			
			gp.setPosition(PlayPlayer());
			//Do somting to be shor it vill go throt ewrey playewr
			//and do somting if the players mov isent is ok
			
			//Uppdatete grapichs
//			if(textGrafik == true){
//				tg.skrivUt();
//			}
			
			//Lock for vinst
			if(lookForProfit() != null){
				//do somthing
				//System.out.println(tittaEfterVinst() + "har vunnit");
			}
		}
		
	}
	
	int playerTurn  = 0;
	private OneMove PlayPlayer(){
		return null;
		//do somthing her
	}
	
	private Player lookForProfit(){
		return null;
		//do somthing her
	}
	
	private void EndGame() {
		
		
	}
}
