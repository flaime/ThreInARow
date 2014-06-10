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
			
			//add controll to not be abel to la on a alreday layd plase
			
			gp.setPosition(om);
			spelplanen.setDrag(spelaNuvarandeSpelare());
			//lop för att lopa igeon alla osm 
			nästaSpelaresTur();
			
			//tänk på att uppdatera grafik om det finns någon
			if(textGrafik == true){
				tg.skrivUt();
			}
			
			//tita efter vinst
			if(tittaEfterVinst() != null){
				tg.vinst(tittaEfterVinst());
				System.out.println(tittaEfterVinst() + "har vunnit");
			}
		}
		
	}
	
	int playerTurn  = 0;
	private OneMove PlayPlayer(){
		
	}
	
	private void EndGame() {
		
		
	}
}
