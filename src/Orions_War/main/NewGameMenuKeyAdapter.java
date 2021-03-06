package Orions_War.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NewGameMenuKeyAdapter extends KeyAdapter
{
	private NewGameMenu newGameMenu;
	
	public NewGameMenuKeyAdapter(NewGameMenu newGameMenu)
	{
		this.newGameMenu = newGameMenu;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int keycode = e.getKeyCode();
		
		System.out.println("key pressed: ");
		
		switch(keycode)
		{
		case KeyEvent.VK_UP:
			System.out.println("up");
			newGameMenu.moveSelectionOvalUp();
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("down");
			newGameMenu.moveSelectionOvalDown();
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("enter");
			System.out.println(newGameMenu.getSelection());
			NewGameMenuEventHandler.handleEvent(newGameMenu.getSelection());
			break;
		}
	}
	
	
}