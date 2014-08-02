package rowGame;

import java.util.ArrayList;

public class GamePlan {
	//lista för att komma ihåg senaste dragen
	ArrayList<OneMove> moves = new ArrayList<>();
	Player [][] gamePlan;

	/*
	 * [0,0][0,1][0,2]
	 * [1,0][1,1][1,2]
	 * [2,0][2,1][2,2]
	 * 
	 */ //den är ju vänd fe!

	private int height = 0;
	private int width = 0;
	
	private int QuantityOfNumbersInARowToWin = 0;
	
	public GamePlan(int height, int width) {
		this.width = width;
		this.height = height;
		
		if(width >= height)
			QuantityOfNumbersInARowToWin  = width;
		else
			QuantityOfNumbersInARowToWin = height;
		
		gamePlan = new Player[width][height];
	}
	
	public GamePlan(int height, int width, int QuantityOfNumbersInARowToWin) {
		this.width = width;
		this.height = height;
		
		if(QuantityOfNumbersInARowToWin <= height && QuantityOfNumbersInARowToWin <= width){
			this.QuantityOfNumbersInARowToWin = QuantityOfNumbersInARowToWin;
		}else{
			if(width >= height)
				QuantityOfNumbersInARowToWin  = width;
			else
				QuantityOfNumbersInARowToWin = height;
		}
		
		gamePlan = new Player[width][height];
	}
	
	public boolean SetQuantityOfNumbersInARowToWin(int QuantityOfNumbersInARowToWin){
		if(QuantityOfNumbersInARowToWin <= height && QuantityOfNumbersInARowToWin <= width){
			this.QuantityOfNumbersInARowToWin = QuantityOfNumbersInARowToWin;
			return true;
		}
		return false;
	}
	
	public int GetQuantityOfNumbersInARowToWin(){
		return QuantityOfNumbersInARowToWin;
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
		int x = om.getX();
		int y = om.getY();
		Player p = om.getPlayer();
		
		gamePlan[x][y] = p;
	}
	

}
