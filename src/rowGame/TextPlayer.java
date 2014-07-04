package rowGame;

import java.util.Scanner;

public class TextPlayer extends Player {

	private static Scanner tangentbord = new Scanner(System.in);
	
	public TextPlayer(String name, GamePlan referens) {
		super(name, referens);
		// TODO Auto-generated constructor stub
	}

	@Override
	public OneMove makeMove() {
		
		System.out.println("Player " + name + " turn");
		int x = readX("enter the x coordinate:");
		
		int y = readY("enter the y coordinate:");
		
		return new OneMove(y, x, this);
	}
	
	private int readX(String toPrint){
		int x = 0;
		System.out.println(toPrint);
		boolean vriteHelptext = false;
		do{
			if(vriteHelptext == true){
				System.out.println("The X nuber is only aloved to be in betewn 0 and " + gp.getWhite());
			}
			
			x = readInt("") ;//- 1;
			vriteHelptext = true;
		}while((x <= 0 ) || (x >= (gp.getWhite() +1 ))); 
		return x;
	}
	
	private int readY(String toPrint){
		int x = 0;
		System.out.println(toPrint);
		boolean vriteHelptext = false;
		do{
			if(vriteHelptext == true){
				System.out.println("The Y nuber is only aloved to be in betewn 0 and " + gp.getHeight());
			}
			
			x = readInt("");// - 1;
			vriteHelptext = true;
		}while((x <= 0 ) || (x >= (gp.getHeight()+1))); 
		return x;
	}
	
	public static int readInt(String prompt) {
		System.out.print(prompt);
		int i = -50;
		boolean ärEnInt = false;
		while (ärEnInt == false) {
			try {
				String s = tangentbord.nextLine();

				i = Integer.parseInt(s);
				ärEnInt = true;

			} catch (NumberFormatException e) {
				System.out.print("It is not an integer, try again: ");
			}
		}
		return i;

	}

}
