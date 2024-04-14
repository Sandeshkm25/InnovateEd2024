package com.game;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		 JFrame frame=new JFrame();
		 frame.setBounds(10, 10, 700, 600);
		 GamePlay gamePlay=new GamePlay();
		 frame.setTitle("Brick Braker");
		 frame.setVisible(true);
		 frame.setResizable(false);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(gamePlay);
	}
}
