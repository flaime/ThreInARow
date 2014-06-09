package rowGame;

import java.util.ArrayList;

public class GamePlan {
	//lista f�r att komma ih�g senaste dragen
	ArrayList<OneMove> moves = new ArrayList<>();
	Player [][] gamePlan;

	/*
	 * [0,0][0,1][0,2]
	 * [1,0][1,1][1,2]
	 * [2,0][2,1][2,2]
	 * 
	 */ //den �r ju v�nd fe!

	private int height = 0;
	private int width = 0;
	
	public GamePlan(int height, int width) {
		this.width = width;
		this.height = height;
	}

	public int getWhite() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Player getPosition(int x, int y) {
		return gamePlan[x][y];
	}
	
	public void setPosition(OneMove om) {
		gamePlan[om.getX()][om.getY()] = om.getPlayer();
	}
	

}
