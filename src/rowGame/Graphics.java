package rowGame;

public abstract class Graphics {

	GamePlan gp;
	public Graphics(GamePlan gp) {
		this.gp = gp;
	}
	
	public abstract void updateGraphics();

	public abstract void profit(Player lookForProfit);
	
}
