package Orions_War.main;


import Orions_War.game.GameLoop;

public class ShipShopThrustersMenuEventHandler
{

	public static void handleEvent(int eventId)
	{
		// Do nothing because same screen is being selected
		if(eventId == 1)
		{
			System.out.println("Exit Ship Shop Thrusters to Main Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopMenu);
		   
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.requestFocusInWindow();
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
			System.out.println("Exit Ship Shop Thrusters to Engines Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Thrusters to Hulls Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
			
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Thrusters to Weapons Ship Shop Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.ShipShopWeaponsMenu);
		   
			Main.ShipShopWeaponsMenu.setVisible(true);
			Main.ShipShopWeaponsMenu.setEnabled(true);
			Main.ShipShopWeaponsMenu.setFocusable(true);
			Main.ShipShopWeaponsMenu.requestFocusInWindow();
		}
		else if(eventId == 6)
		{
			
		}
		else if(eventId == 7)
		{
			
		}
		else if(eventId == 8)
		{
			System.out.println("Exit Ship Shop Thrusters to Main Menu selected");
			Main.ShipShopThrustersMenu.setVisible(false);
			Main.ShipShopThrustersMenu.setEnabled(false);
			Main.ShipShopThrustersMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
	}
}
