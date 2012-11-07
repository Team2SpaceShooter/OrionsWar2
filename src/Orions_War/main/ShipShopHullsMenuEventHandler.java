package Orions_War.main;


import Orions_War.game.GameLoop;

public class ShipShopHullsMenuEventHandler
{

	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			System.out.println("Exit Ship Shop Hulls menu to Main Ship Shop Menu selected");
			Main.ShipShopHullsMenu.setVisible(false);
			Main.ShipShopHullsMenu.setEnabled(false);
			Main.ShipShopHullsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopHullsMenu);
			
			Main.mainFrame.add(Main.ShipShopMenu);
		   
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.requestFocusInWindow();
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{System.out.println("Exit Ship Shop Hulls menu to Engines Ship Shop Menu selected");
			Main.ShipShopHullsMenu.setVisible(false);
			Main.ShipShopHullsMenu.setEnabled(false);
			Main.ShipShopHullsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopHullsMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			
		}
		
		else if(eventId == 4)
		{
			System.out.println("Exit Ship Shop Hulls menu to Thrusters Ship Shop Menu selected");
			Main.ShipShopHullsMenu.setVisible(false);
			Main.ShipShopHullsMenu.setEnabled(false);
			Main.ShipShopHullsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopHullsMenu);
			
			Main.mainFrame.add(Main.ShipShopThrustersMenu);
		   
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Hulls menu to Weapons Ship Shop Menu selected");
			Main.ShipShopHullsMenu.setVisible(false);
			Main.ShipShopHullsMenu.setEnabled(false);
			Main.ShipShopHullsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopHullsMenu);
			
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
			System.out.println("Exit Ship Shop Hulls menu to Main Menu selected");
			Main.ShipShopHullsMenu.setVisible(false);
			Main.ShipShopHullsMenu.setEnabled(false);
			Main.ShipShopHullsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopHullsMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
		
		
	}
}
