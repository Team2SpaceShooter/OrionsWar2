package Orions_War.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Player 
{
	
	public static String playerName = "Default";
	
	public static int progress = 1;
	
	public static byte shipsOwned = 00000001;
	/*Integration of the credits and experience variable. 
	 * Yielding result is now current_credits and max_credits.
	 * This is for simplifying the high score tracker, we will just follow
	 * tracking the credits.
	 */
	public static int credits = 1000;
	
	private static File saveManifest = null;
	private static File saveCurrent = null;
	
	
	
	
	public void SaveGame()
	{
		try 
		{
			saveManifest = new File(this.getClass().getResource("/Orions_War/saves/spacegame manifest.txt").toURI());
		} 
		catch (URISyntaxException e) 
		{
			System.out.println("printing stack trace");
			e.printStackTrace();
		}
		if(saveManifest == null) System.out.println("file null");
		
		try 
		{
			saveCurrent = new File(this.getClass().getResource("/Orions_War/saves/"+playerName+".txt").toURI());
		} 
		catch (URISyntaxException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner manifestIO = null;
		Scanner saveWriter = null;
		
		try 
		{
			manifestIO = new Scanner(saveManifest);
			saveWriter = new Scanner(saveCurrent);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numSaves = manifestIO.nextInt();
		
		for(int i = 0; i < numSaves; i++)
		{
			manifestIO.next();
		}
		
		
	}
	
}
