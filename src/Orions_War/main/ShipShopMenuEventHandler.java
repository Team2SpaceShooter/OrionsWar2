package Orions_War.main;

import Orions_War.game.GameLoop;


public class ShipShopMenuEventHandler 
{
	// TODO: update this
	// event 1: play game
	// event 2: view highScores
	// event 3: options
	// event 4: Visit Ship Shop
	// event 5: exit application

	public static void handleEvent(int eventId)
	{
		// Do nothing because same screen is being selected
		if(eventId == 1)
		{
			
		}
		
		// Change the focus to the Engine portion of the Ship Shop
		else if(eventId == 2)
		{
			System.out.println(" Ship Shop Engines menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
			Main.ShipShopEnginesMenu.moveSelectionOvalDown();
			
		}
		
		else if(eventId == 3)
		{
		}
		
		else if(eventId == 4)
		{
		}
		else if(eventId == 5)
		{

		}
		else if(eventId == 6)
		{
			
		}
		else if(eventId == 7)
		{
			
		}
		else if(eventId == 8)
		{
			System.out.println("Exit Ship Shop menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			Main.mainMenu.moveSelectionOvalDown();
		 
		}
		
		
		
	}
	
	
}
	