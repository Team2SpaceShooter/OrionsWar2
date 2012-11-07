package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ShipShopWeaponsMenu extends JPanel
{


	private static Dimension windowSize = new Dimension(1000,800);
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 12;
	private static int selectionOvalHeight = 12;
	private static int selectionOvalX = 150;
	private static int selectionOvalY = 3;
	private Image img;
	private Player_Ship ship = new Player_Ship(453.0,365.0,10.0,10.0) ;
	
	
	public ShipShopWeaponsMenu()
	{
		System.out.println("Ship Shop Engines menu created");
		
		
        ImageIcon icon = new ImageIcon("images/Ship_Shop/Ship_ShopMenu_Weapons.png");
		
		img = icon.getImage();
		/*this.setSize(windowSize);
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		*/
		this.addKeyListener(new ShipShopWeaponsKeyAdapter(this));
		
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
		if(selectionOvalY == 3)
		{
			selectionOvalY = 171;
			repaint();
			return;
		}
		else 
     	selectionOvalY -= 24;
	    repaint();
     		
     	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 171)
		{
			selectionOvalY = 3;
			repaint();
			return;
		}
		else
			selectionOvalY +=24;
		repaint();
			
	}
	public int getSelection()
	{
		if(selectionOvalY == 3) 
			return 1;
		else if(selectionOvalY == 27)
            return 2;
		else if(selectionOvalY == 51) 
			return 3;
		else if(selectionOvalY == 75) 
			return 4;
		else if(selectionOvalY == 99) 
			return 5;
		else if(selectionOvalY == 123) 
			return 6;
		else if(selectionOvalY == 147) 
			return 7;
		else if(selectionOvalY == 171) 
			return 8;
		else
		return 0;
	}
}