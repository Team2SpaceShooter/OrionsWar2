package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ShipShopEnginesMenu extends JPanel
{


	private static Dimension windowSize = new Dimension(1000,800);
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 15;
	private static int selectionOvalHeight = 15;
	private static int selectionOvalX = 150;
	private static int selectionOvalY = 10;
	private Image img;
	private Player_Ship ship = new Player_Ship(453.0,365.0,10.0,10.0) ;
	
	
	public ShipShopEnginesMenu()
	{
		System.out.println("Ship Shop Engines menu created");
		
		
        ImageIcon icon = new ImageIcon("images/Ship_Shop/Ship_ShopMenu_Engines.png");
		
		img = icon.getImage();
		/*this.setSize(windowSize);
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		*/
		this.addKeyListener(new ShipShopEnginesKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		//this.setLayout(null);

	}
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
		g.drawRect(0, 0, 1000, 800);
		
		g.drawImage(img, 0, 0,1000,800, this);
		g.setColor(Color.white);
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		drawShip(g, ship);
        
    }
	
	private void drawShip(Graphics g, Player_Ship s)
	{	
		// Figure out where the ship should be drawn
		int radius = (int)s.getRadius();
		int xCenter = (int)s.getXPosition();
		int yCenter = (int)s.getYPosition();
	
		// Draw the ship body
		g.drawOval(xCenter - radius, yCenter - radius, radius*2, radius*2);
		
	}

	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 10)
		{
			selectionOvalY = 220;
			repaint();
			return;
		}
		else 
     	selectionOvalY -= 30;
	    repaint();
     		
     	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 220)
		{
			selectionOvalY = 10;
			repaint();
			return;
		}
		else
			selectionOvalY += 30;
		repaint();
			
	}
	public int getSelection()
	{
		if(selectionOvalY == 10) 
			return 1;
		else if(selectionOvalY == 40)
            return 2;
		else if(selectionOvalY == 70) 
			return 3;
		else if(selectionOvalY == 100) 
			return 4;
		else if(selectionOvalY == 130) 
			return 5;
		else if(selectionOvalY == 160) 
			return 6;
		else if(selectionOvalY == 190) 
			return 7;
		else if(selectionOvalY == 220) 
			return 8;
		else
		return 0;
	}
}
