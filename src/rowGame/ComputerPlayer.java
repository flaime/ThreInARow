package rowGame;

import java.util.ArrayList;
import java.util.Random;

public class ComputerPlayer extends Player{

	public ComputerPlayer(String name, GamePlan referens) {
		super(name, referens);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Knowledge> knowledge = new ArrayList<>();
	@Override
	public OneMove makeMove() {
		if(knowledge.contains(gp.identifier())){
			//do somthing (from the knowledge databas) and return that
		}else{
			Random rand = new Random();
			int y = rand.nextInt(gp.getHeight());
			int x = rand.nextInt(gp.getWhite());
			return new OneMove(y, x, this);
		}
		
		return null;
	}
	
	public void profit(Player p) {
		
		
	}

}
