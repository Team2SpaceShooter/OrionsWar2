package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;


@SuppressWarnings("serial")
public class HighScoreMenu extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "High Scores";
	private static String score1 = "Empty";
	private static String score2 = "Empty";
	private static String score3 = "Empty";
	private static String score4 = "Empty";
	private static String score5 = "Empty";

	private String retMain = "Return to Main Menu";
	
	private static Dimension windowSize = new Dimension(1000,800);
	
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 194;
	
	private static File highscores = null;
	
	public HighScoreMenu()
	{
		System.out.println("level selector menu created");
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);

		this.addKeyListener(new HighScoreMenuKeyAdapter(this));
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

	}
	
	public void fuck()
	{
		System.out.println("fuck you");
	}
	
	public void loadScores()
	{
		try 
		{
			highscores = new File(this.getClass().getResource("/spacegame/resources/highscores/SGHSDB.txt").toURI());
		} 
		catch (URISyntaxException e) 
		{
			System.out.println("printing stack trace");
			e.printStackTrace();
		}
		if(highscores == null) System.out.println("file null");
		
		Scanner scoreReader = null;
		try
		{
			scoreReader = new Scanner(highscores);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		// this isn't currently needed since we are fixed at 5 scores currently
		int numScores = scoreReader.nextInt();
		System.out.println("first int read from highscores file:"+numScores);
		
		scoreReader.nextLine();
		
		score1 = scoreReader.nextLine();
		System.out.println("score1: "+score1);
		
		score2 = scoreReader.nextLine();
		System.out.println("score2: "+score2);
		
		score3 = scoreReader.nextLine();
		System.out.println("score3: "+score3);
		
		score4 = scoreReader.nextLine();
		System.out.println("score4: "+score4);
		
		score5 = scoreReader.nextLine();
		System.out.println("score5: "+score5);
		
		scoreReader.close();
		
	}
	
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
		
		g.setColor(backgroundColor);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(textColor);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		
		g.drawString(score1, 50, 80);
		g.drawString(score2, 50, 100);
		g.drawString(score3, 50, 120);
		g.drawString(score4, 50, 140);
		g.drawString(score5, 50, 160);
		
		//IMPORTANT: PLACEHOLDERS!!
		g.drawString(retMain, 50, 200);

    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 194)
		{
			selectionOvalY = 194;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 194)
		{
			selectionOvalY = 194;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	public int getSelection()
	{
		if(selectionOvalY == 194) return 1;
		//else if(selectionOvalY == 114) return 2;
		//else if(selectionOvalY == 134) return 3;
		//else if(selectionOvalY == 154) return 4;
		//else if(selectionOvalY == 174) return 5;
		return 0;
	}
}
