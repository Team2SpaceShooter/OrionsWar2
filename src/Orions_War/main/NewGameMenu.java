package Orions_War.main;

import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Random;



@SuppressWarnings("serial")
public class NewGameMenu extends JPanel 
{
	private static Color backgroundColor = Color.black;
	private static Color textColor = Color.white;
	
	private static String title = "Create New Game";
	private static String chooseName = "Choose name:";
	private static String retMain = "Return to main menu";
	private static String start = "Start";

	private static JTextField nameField = new JTextField();
	
	private static Dimension windowSize = new Dimension(1000,800);
	private static Image img1;
	
	//TODO: make the selectionOval its own class
	private static int selectionOvalWidth = 3;
	private static int selectionOvalHeight = 3;
	private static int selectionOvalX = 40;
	private static int selectionOvalY = 124;
	
	public NewGameMenu()
	{
		System.out.println("new game menu created");
        ImageIcon icon = new ImageIcon("images/spacefieldposs.png");
		
		img1 = icon.getImage();
		
		this.setBackground(backgroundColor);
		this.setSize(windowSize);
		this.setOpaque(true);
		
		//NOTE: for focusing, these must not be set in the constructor. Undesirable focus behavior results from doing so
		//this.setVisible(true); // needed to focus
		//this.setFocusable(true); // needed to focus
		//this.setEnabled(true); // needed to focus
		this.addKeyListener(new NewGameMenuKeyAdapter(this));
		//System.out.println("requesting focus: " + this.requestFocus());
		
		//added so that manual position of JComponents would be feasible
		this.setLayout(null);

		
		this.add(nameField);
		nameField.setBounds(150, 75, 200, 20);
		nameField.repaint();

	}
	
	public void paintComponent(Graphics g)
    {

		// the following two lines are needed because calling the paint overrides the background color
	
		g.drawImage(img1, 0, 0, 1000,800, this);
		
		g.setColor(textColor);
		
		g.drawOval(selectionOvalX, selectionOvalY, selectionOvalHeight, selectionOvalWidth);
		
		g.drawString(title, 50, 50);
		
		g.drawString(chooseName, 50, 90);
		g.drawString(retMain, 50, 130);
		g.drawString(start, 50, 150);
		
		//IMPORTANT: PLACEHOLDERS!!
		
		/*
		g.drawString(levelOne, 50, 100);
		g.drawString(levelTwo, 50, 120);
		g.drawString(levelThree, 50,  140);
		g.drawString(levelFour, 50, 160);
		g.drawString(exit, 50, 180);
		*/
		
		
		// IMPORTANT: keep note of these x and y positions, they correspond to the selection areas for getSelection
		//g.drawString(playGame, 50, 100);
		//g.drawString(highScores, 50, 120);
		//g.drawString(options, 50, 140);
		//g.drawString(exit, 50, 160);
    }
	
	public void moveSelectionOvalUp()
	{
		if(selectionOvalY == 124)
		{
			selectionOvalY = 144;
			repaint();
			return;
		}
		else selectionOvalY -= 20;
		repaint();
	}
	public void moveSelectionOvalDown()
	{
		if(selectionOvalY == 144)
		{
			selectionOvalY = 124;
			repaint();
			return;
		}
		else selectionOvalY += 20;
		repaint();
	}
	public int getSelection()
	{
		if(selectionOvalY == 124) return 1;
		else if(selectionOvalY == 144) return 2;
		//else if(selectionOvalY == 134) return 3;
		//else if(selectionOvalY == 154) return 4;
		//else if(selectionOvalY == 174) return 5;
		return 0;
	}
}
