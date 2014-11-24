package com.rps.model;

import java.util.Random;


/**
 * This class simulates the computer playing the game.
 * @author Kinshuk Kale
 *
 */
public class Computer {
	/**
	 * Computer plays and generates a random value for the hand.
	 * @return a hand
	 */
	public GameHand play() { 
		Random rand = new Random();
		int randomHand = rand.nextInt(GameHand.values().length);
		return GameHand.values()[randomHand];
	}
}
