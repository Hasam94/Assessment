package com.qa.TextAdventure;

public class Player {

	private int x;
	private int y;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	

	public static void playerLocation(int x, int y) {
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return ("x position: " + this.getX() + "y position" + this.getY());
}
	
	
	

	
}
