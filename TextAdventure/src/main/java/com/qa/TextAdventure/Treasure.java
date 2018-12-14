package com.qa.TextAdventure;

public class Treasure extends Player {
	
	
	public Treasure(int x, int y) {
		super (x, y);
	}
	
	
	
	public static void treasureLocation(int x, int y) {


	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return ("x position: " + this.getX() + "y position" + this.getY());
}
}
