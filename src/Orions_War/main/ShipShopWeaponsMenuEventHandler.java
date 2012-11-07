package Orions_War.main;


import Orions_War.game.GameLoop;

public class ShipShopWeaponsMenuEventHandler
{

	public static void handleEvent(int eventId)
	{
		// Changes focus to Main Ship Shop Menu
		if(eventId == 1)
		{
			System.out.println("Exit Ship Shop Weapons menu to Main Ship Shop Menu selected");
			Main.ShipShopWeaponsMenu.setVisible(false);
			Main.ShipShopWeaponsMenu.setEnabled(false);
			Main.ShipShopWeaponsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopWeaponsMenu);
			
			Main.mainFrame.add(Main.ShipShopMenu);
		   
			Main.ShipShopMenu.setVisible(true);
			Main.ShipShopMenu.setEnabled(true);
			Main.ShipShopMenu.setFocusable(true);
			Main.ShipShopMenu.requestFocusInWindow();
		}
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
			System.out.println("Exit Ship Shop Weapons menu to Engines Ship Shop Menu selected");
			Main.ShipShopWeaponsMenu.setVisible(false);
			Main.ShipShopWeaponsMenu.setEnabled(false);
			Main.ShipShopWeaponsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopWeaponsMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Weapons menu to Hulls Ship Shop Menu selected");
			Main.ShipShopWeaponsMenu.setVisible(false);
			Main.ShipShopWeaponsMenu.setEnabled(false);
			Main.ShipShopWeaponsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopWeaponsMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
			System.out.println("Exit Ship Shop Weapons menu to Thrusters Ship Shop Menu selected");
			Main.ShipShopWeaponsMenu.setVisible(false);
			Main.ShipShopWeaponsMenu.setEnabled(false);
			Main.ShipShopWeaponsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopWeaponsMenu);
			
			Main.mainFrame.add(Main.ShipShopThrustersMenu);
		   
			Main.ShipShopThrustersMenu.setVisible(true);
			Main.ShipShopThrustersMenu.setEnabled(true);
			Main.ShipShopThrustersMenu.setFocusable(true);
			Main.ShipShopThrustersMenu.requestFocusInWindow();
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
			System.out.println("Exit Ship Shop Weapons menu to Main Menu selected");
			Main.ShipShopWeaponsMenu.setVisible(false);
			Main.ShipShopWeaponsMenu.setEnabled(false);
			Main.ShipShopWeaponsMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopWeaponsMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
		
		
	}
}
