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
		
		// Do nothing because same screen selected
		else if(eventId == 2)
		{
			System.out.println("Exit Ship Shop Main menu to Engines Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopEnginesMenu);
		   
			Main.ShipShopEnginesMenu.setVisible(true);
			Main.ShipShopEnginesMenu.setEnabled(true);
			Main.ShipShopEnginesMenu.setFocusable(true);
			Main.ShipShopEnginesMenu.requestFocusInWindow();
		}
		
		else if(eventId == 3)
		{
			System.out.println("Exit Ship Shop Main menu to Hulls Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
			Main.mainFrame.add(Main.ShipShopHullsMenu);
		   
			Main.ShipShopHullsMenu.setVisible(true);
			Main.ShipShopHullsMenu.setEnabled(true);
			Main.ShipShopHullsMenu.setFocusable(true);
			Main.ShipShopHullsMenu.requestFocusInWindow();
		}
		
		else if(eventId == 4)
		{
		System.out.println("Exit Ship Shop Main menu to Thrusters Ship Shop Menu selected");
		Main.ShipShopMenu.setVisible(false);
		Main.ShipShopMenu.setEnabled(false);
		Main.ShipShopMenu.setFocusable(false);
		
		Main.mainFrame.remove(Main.ShipShopMenu);
		
		Main.mainFrame.add(Main.ShipShopThrustersMenu);
	   
		Main.ShipShopThrustersMenu.setVisible(true);
		Main.ShipShopThrustersMenu.setEnabled(true);
		Main.ShipShopThrustersMenu.setFocusable(true);
		Main.ShipShopThrustersMenu.requestFocusInWindow();
			
		}
		else if(eventId == 5)
		{
			System.out.println("Exit Ship Shop Main menu to Weapons Ship Shop Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopMenu);
			
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
			System.out.println("Exit Ship Shop Main menu to Main Menu selected");
			Main.ShipShopMenu.setVisible(false);
			Main.ShipShopMenu.setEnabled(false);
			Main.ShipShopMenu.setFocusable(false);
			
			Main.mainFrame.remove(Main.ShipShopThrustersMenu);
			
			Main.mainFrame.add(Main.mainMenu);
		   
			Main.mainMenu.setVisible(true);
			Main.mainMenu.setEnabled(true);
			Main.mainMenu.setFocusable(true);
			Main.mainMenu.requestFocusInWindow();
			
		}
		
	}
	
	
}
	