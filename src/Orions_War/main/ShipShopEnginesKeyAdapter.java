package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShipShopEnginesKeyAdapter extends KeyAdapter
{
    private ShipShopEnginesMenu ShipShopEnginesMenu;
	
	public ShipShopEnginesKeyAdapter(ShipShopEnginesMenu ShipShopEnginesMenu)
	{
		this.ShipShopEnginesMenu = ShipShopEnginesMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			ShipShopEnginesMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			ShipShopEnginesMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(ShipShopEnginesMenu.getSelection());
			ShipShopEnginesMenuEventHandler.handleEvent(ShipShopEnginesMenu.getSelection());
			break;
		}
	}
	
}
