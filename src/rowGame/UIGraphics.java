package rowGame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UIGraphics  extends Graphics{
	
	GamePlan gp;
	JFrame window = new JFrame();
//	ArrayList<JButton> buttons = new ArrayList<>();
	JButton[][] buttons;
	
	public UIGraphics(GamePlan gp) {
		super(gp);
		this.gp = gp;
		
		//make the layout
		
		window.add(BorderLayout.NORTH, new JLabel("Hello!"));
		
		window.add(BorderLayout.CENTER, addGameplan());
		
		
		
		
		
		//set the window
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@Override
	public void updateGraphics() {
		for (int x = gp.getWhite() -1; x >= 0; x--) {
			for(int y = 0; y < gp.getHeight(); y++){
				if(gp.getPosition(x, y) != null)
					buttons[x][y].setText(gp.getPosition(x, y).getTecken());
			}
		}
		
	}
	
	private JPanel addGameplan(){
		JPanel gamePlan = new JPanel();
		gamePlan.setLayout(new GridLayout(gp.getWhite(), gp.getHeight()));
		
		buttons = new JButton[gp.getWhite()][gp.getHeight()];
		
		for (int x = gp.getWhite() -1; x >= 0; x--) {
			for(int y = 0; y < gp.getHeight(); y++){
				JButton b = new JButton("(" + (x+1) + "," + (y+ 1) + ")");
				buttons[x][y] = b;
				gamePlan.add(b);
			}
		}
		
		return gamePlan;
	}

	@Override
	public void profit(Player lookForProfit) {
		// TODO Auto-generated method stub
		
	}
	
	

}
