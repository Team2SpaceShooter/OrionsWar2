package Orions_War.main;


import Orions_War.game.GameLoop;

public class ShipShopEnginesMenuEventHandler
{

	public static void handleEvent(int eventId)
	{
		// Do nothing because same screen is being selected
		if(eventId == 1)
		{
			
		}
		
		// Change the focus to the Engine portion of the Ship Shop
		else if(eventId == 2)
		{
		
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
			Main.ShipShopEnginesMenu.setVisible(false);
			Main.ShipShopEnginesMenu.setEnabled(false);
			Main.ShipShopEnginesMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopEnginesMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			Main.mainMenu.moveSelectionOvalDown();
		}
		
		
		
	}
}
