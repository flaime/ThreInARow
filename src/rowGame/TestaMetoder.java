package rowGame;

import java.util.ArrayList;

public class TestaMetoder {

	public static void main(String[] args) {
		GamePlan gp = new GamePlan(3, 3);
		ArrayList<Player> spelare = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			spelare.add(new TextPlayer("player " + i, gp));
		}
		
		spelare.add(spelare.get(1));
		spelare.add(spelare.get(1));
		spelare.add(spelare.get(1));
//		spelare.add(spelare.get(1));
//		spelare.add(spelare.get(3));
		
		for (int i = 0; i < spelare.size(); i++) {
			System.out.println(spelare.get(i).name);
		}
		
//		TextPlayer tp = new TextPlayer("player " + 10, gp);
//		spelare.add(tp);
		
		System.out.println("\n" + isTheSame(spelare, 3));
	}

	private static boolean isTheSame(ArrayList<Player> list, int xInARow) {

		boolean numberTheSame = false;
		for (int k = 0; k < list.size() - xInARow; k++) {

			ArrayList<Player> tempList = new ArrayList<>();

			System.out.println("----");
			for (int i = 0; i < xInARow; i++) {
				tempList.add(list.get(i + k));
				
				System.out.println(list.get(i + k));
			}

			//läg till något för att göra längden på listan rätt om det ska vara 3 eller 4 osv
			if(isTheSame(tempList) == true){
				numberTheSame = true;
				break;
			}
			
		}
		return numberTheSame;

	}
	
	private static boolean isTheSame(ArrayList<Player> list) {
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
}
