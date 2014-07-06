package rowGame;

public class TextGraphics extends Graphics {

	boolean helpCoordinates = true;
	
	public TextGraphics(GamePlan gp) {
		super(gp);
		
	}

	public void sethelpCoordinates(boolean b){
		helpCoordinates = b;
	}
	
	@Override
	public void updateGraphics() {
		//if (sp.equals(spTillfälig) == false) {
		String print = "";

		for (int y = gp.getHeight() - 1; y >= 0; y--) {
			for (int x = 0; x < gp.getWhite(); x++) {
				
				print = print + "[";
				
				if (gp.getPosition(x, y) != null)
					print = print + gp.getPosition(x, y).toString();//.toString();//x:y
				else{
					if(helpCoordinates == false)
						print = print + " ";
					else
						print = print + (x +1) + ":"+ (y + 1); //(x,y)
				}
				//System.out.println(spTillfälig.getPlatts(i, j));
				print = print + "]";
			}
			print = print + "\n";
		}
		System.out.println(print);
	//}
	

	//spTillfälig = sp;
		
	}

	@Override
	public void profit(Player pl) {
		System.out.println("---  ---  ---  ---");
		System.out.println(pl.name + " hav won!       (" + pl.getTecken() + ")" );
		System.out.println("---  ---  ---  ---");
		
	}

}
