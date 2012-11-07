package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;



@SuppressWarnings("serial")
public class MainMenu extends JPanel 
{

	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "Orion's War 2.1.2";

	private static String newGame = "Start New Game";
	private static String loadGame = "Load Game";
	private static String highScores = "Check High Scores";
	private static String ShipShop = "Visit Ship Shop";
	private static String exit = "Exit";

	private static Dimension windowSize = new Dimension(1000,800);
	
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 94;
	
	private Image img2;
	
	public MainMenu()
	{
		System.out.println("gameloop created");
		
		ImageIcon icon = new ImageIcon("images/spacebackgrouBIG.png");
		
		img2 = icon.getImage();
		
	
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		this.addKeyListener(new MainMenuKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

	}
	
	public void paintComponent(Graphics g)
    {
       // This line is needed for the use of the background. If you plan on changing the background
	   // speak to Alex before you do.
		
		g.drawImage(img2, 0, 0, 1000,800, this);
		g.setColor(textColor);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		
		g.drawString(newGame, 50, 100);
		g.drawString(loadGame, 50, 120);
		g.drawString(highScores, 50, 140);
		g.drawString(ShipShop,50,160);
		g.drawString(exit, 50, 180);
		
		

    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 94)
		{
			selectionOvalY = 174;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 174)
		{
			selectionOvalY = 94;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	/* elseif(selectionOvalY == 174) return 5; added to compensate for adding in the view ship shop option
	 * returning 5 will now exit the screen.
	 * 
	 */
	public int getSelection()
	{
		if(selectionOvalY == 94) return 1;
		else if(selectionOvalY == 114) return 2;
		else if(selectionOvalY == 134) return 3;
		else if(selectionOvalY == 154) return 4;
		else if(selectionOvalY == 174) return 5;
		return 0;
	}
}
