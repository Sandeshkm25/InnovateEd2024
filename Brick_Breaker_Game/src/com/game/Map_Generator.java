package com.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Map_Generator {

	public int map[][];
	public int brickHeight;
	public int brickWidth;
	
	public Map_Generator(int row,int col)
	{
		map=new int[row][col];
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				map[i][j]=1;
			}
		}
		brickHeight=140/row;
		brickWidth=540/col;
	}
	public void drawBrick(Graphics2D g)
	{
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				if(map[i][j]>0)
				{
					g.setColor(Color.white);
					g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
				}
			}
			}
		
	}
	public void setBrick(int val,int row,int col)
	{
		map[row][col]=val;
	}
	
}