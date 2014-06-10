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
			//en lopp f�r att f� spelet att rulla p�
			
			//l�gg till kontroll f�r att det inte ska g� att l�gga p� redan lagd ruta
			
			System.out.println("hej3");
			spelplanen.setDrag(spelaNuvarandeSpelare());
			//lop f�r att lopa igeon alla osm 
			n�staSpelaresTur();
			
			//t�nk p� att uppdatera grafik om det finns n�gon
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
	
	private void EndGame() {
		
		
	}
}
