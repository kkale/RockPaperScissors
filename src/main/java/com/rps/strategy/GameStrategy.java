package com.rps.strategy;

import com.rps.model.GameResult;
import com.rps.model.GameHand;

/**
 * This strategy interface is used by the Rock Paper Scissors 
 * controller to resolve a round of the game.
 * @author Kinshuk Kale
 *
 */
public interface GameStrategy {
	
	/** 
	 * method that resolves the rock paper scissors game based on some strategy.
	 * @param player1 player's hand
	 * @param player2 conputer's hand
	 * @return result of the round
	 */
	 GameResult resolve(GameHand player1, 
			 GameHand player2);
}
