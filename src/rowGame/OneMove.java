package rowGame;

public class OneMove {

	private int x;
	private int y;
	private Player pl;
	
	public OneMove(int y, int x, Player pl) {
		this.pl = pl;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}
