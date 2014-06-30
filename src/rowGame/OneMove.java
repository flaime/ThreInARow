package rowGame;

public class OneMove {

	private int x;
	private int y;
	private Player pl;
	
	public OneMove(int y, int x, Player pl) {
		this.pl = pl;
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

	public Player getPlayer() {
		return pl;
	}
}
