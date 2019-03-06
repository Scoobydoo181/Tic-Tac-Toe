package com.github.Scoobydoo181.games;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class UserInterface 
{
	public UserInterface()
	{	
		JFrame frame = new JFrame("Tick-Tack-Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setResizable(true);
		frame.setVisible(true);
		
		addIntro();
		
		JPanel gameBoard = new JPanel();
		gameBoard.setBackground(Color.DARK_GRAY);
		gameBoard.setSize(600,600);
		gameBoard.setLayout(new GridLayout(3,3,25,25));
		frame.add(gameBoard);
		
		JPanel[] grid = new JPanel[9];
		
		for(int i = 0; i < grid.length; i++)
		{
			grid[i] = new JPanel();
			gameBoard.add(grid[i]);
			
			JLabel gameLabel = new JLabel();
			gameLabel.setFont(new Font("Times New Roman",Font.PLAIN,108));
			grid[i].add(gameLabel);
			
			grid[i].addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e){
					if(e.getButton() == MouseEvent.BUTTON3) 
					{
						gameLabel.setText("X");
					}
					else
					{
						gameLabel.setText("O");
					}
				}
				public void mousePressed(MouseEvent e){}
				public void mouseReleased(MouseEvent e){}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				
			} );
		}
		
		
	}
	private static void addIntro()
	{
		JFrame frame = new JFrame("Tick-Tac-Toe");
		frame.setSize(100,50);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		JLabel label = new JLabel("Left-click for an \'x\', right-click for an \'O\' ");
		label.setFont(new Font("Times New Roman", Font.PLAIN,18));
		frame.add(label);
		
		JButton button = new JButton("OK");
		button.addActionListener((ae)->{
			frame.dispose();
		}); 
		frame.add(button,BorderLayout.EAST);
	}
}
