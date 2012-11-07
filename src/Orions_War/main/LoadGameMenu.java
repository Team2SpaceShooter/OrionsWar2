package Orions_War.main;

import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class LoadGameMenu extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "Load a Save";
	private static String retMain = "Return to Main Menu";
	
	private static Dimension windowSize = new Dimension(1000,800);
	
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 94;
	
	private static JTextArea fileDisplay = new JTextArea();
	//private static JPanel loaderPanel = new JPanel();
	private static JScrollPane scroller = new JScrollPane();
	
	private static File saveManifest = null;
	
	private static ArrayList<File> saveArray = new ArrayList<File>();
	
	private static ArrayList<String> fileNameArray = new ArrayList<String>();
	
	
	
	public LoadGameMenu()
	{
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);
		this.setVisible(true);
		this.setFocusable(true);
		this.addKeyListener(new LoadGameMenuKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);
		
		//loaderPanel.setLayout(new BorderLayout());
		//loaderPanel.add(fileDisplay, BorderLayout.NORTH);
		fileDisplay.setVisible(true);
		scroller.add(fileDisplay);
		
		this.add(fileDisplay);
		fileDisplay.setEditable(false);
		fileDisplay.setBounds(50,110,150,150);
		fileDisplay.repaint();
		//this.add(scroller);
		//scroller.setBounds(50,110,150,150);
		//scroller.repaint();
		
		this.getSaves();

	}
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
		
		g.setColor(backgroundColor);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.white);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		g.drawString(retMain, 50, 100);

    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 94)
		{
			selectionOvalY = 94;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 94)
		{
			selectionOvalY = 94;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	public int getSelection()
	{
		if(selectionOvalY == 94) return 1;
		//else if(selectionOvalY == 114) return 2;
		//else if(selectionOvalY == 134) return 3;
		//else if(selectionOvalY == 154) return 4;
		return 0;
	}
	
	public void getSaves()
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
		
		Scanner saveReader = null;
		try
		{
			saveReader = new Scanner(saveManifest);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		int numFilesToLoad = saveReader.nextInt();
		fileDisplay.setRows(numFilesToLoad);
		for(int i = 0; i < numFilesToLoad; i++)
		{
			try 
			{
				String tempString = saveReader.next();
				//System.out.println(tempString);
				fileNameArray.add(tempString);
				fileDisplay.append(tempString+"\n");
				saveArray.add(new File(this.getClass().getResource("/Orions_War/saves/"+tempString+".txt").toURI()));
			} 
			catch (URISyntaxException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//fileNameArray.add(saveReader.next());
			
			//System.out.println(saveArray.toString());
			
		}
		
		
		
	}
}
