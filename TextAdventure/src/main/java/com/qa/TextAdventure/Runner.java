package com.qa.TextAdventure;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
	
		System.out.println("You have been placed in a "
				+ "large and dreary Swamp.");
		System.out.println("Which direction would you like to go (north, south, "
				+ "east or west) to find the hidden treasure? ");


		Scanner player = new Scanner(System.in);

        String input = player.next(); {
        	
        if (input.equals("North"))
        	
        //If input = North, y value of position -> +1
        	//If input = East, x value of position -> +1
        	//If input = West, x value of position -> -1 etc (just dont know how to put it in code)
        
        System.out.println("You have moved: " + input);
  
        
        
        }
        Treasure.treasureLocation(2, 6);
		Player.playerLocation(5, 6);
        }
	

		private static void aTreasure() {
		Treasure.treasureLocation(4, 4);
		}
		

		private static void aPlayer() {
		Player.playerLocation(4, 4);
		}
		
		
		
		private static void compareLocation() {
		
			Player player2 = new Player(2, 2);
			Treasure treasure2 = new Treasure(2, 2); 
			
			if (player2.getX() == treasure2.getX()) {
			if (player2.getY() == treasure2.getY()) {
				
				System.out.println("The treasure has been found!"); 
					
				
			}

			}

		}
		
		private static void movingPosition() {
			
		
	}
	}

         	 


