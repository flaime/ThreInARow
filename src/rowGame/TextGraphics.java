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
		//if (sp.equals(spTillf�lig) == false) {
		String print = "";

		for (int i = 0; i < gp.getHeight(); i++) {
			for (int j = 0; j < gp.getWhite(); j++) {
				
				print = print + "[";
				
				if (gp.getPosition(i, j) != null)
					print = print + gp.getPosition(i, j).toString();//.toString();//x:y
				else{
					if(helpCoordinates == false)
						print = print + " ";
					else
						print = print + (++j) + ":"+ (++i);
					--i;
					--j;
				}
				//System.out.println(spTillf�lig.getPlatts(i, j));
				print = print + "]";
			}
			print = print + "\n";
		}
		System.out.println(print);
	//}
	

	//spTillf�lig = sp;
		
	}

}
