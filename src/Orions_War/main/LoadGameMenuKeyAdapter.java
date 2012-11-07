package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoadGameMenuKeyAdapter extends KeyAdapter
{
	private LoadGameMenu loadGameMenu;
	
	public LoadGameMenuKeyAdapter(LoadGameMenu loadGameMenu)
	{
		this.loadGameMenu = loadGameMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			loadGameMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			loadGameMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(loadGameMenu.getSelection());
			LoadGameMenuEventHandler.handleEvent(loadGameMenu.getSelection());
			break;
		}
	}
	
	
}