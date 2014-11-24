package com.rps.controller;

import com.rps.model.Computer;
import com.rps.model.GameHand;
import com.rps.model.GameResult;
import com.rps.model.GameState;
import com.rps.strategy.GameStrategy;
import com.rps.strategy.GameStrategyImpl;

/**
 * This class is teh controller for Rock Paper Scissors game.
 * 
 * @author Kinshuk Kale
 * 
 */
public class GameController {

	/**
	 * Accepts the user input and returns a result.
	 * 
	 * @param userInput
	 *            user input
	 * @return String with result
	 * @throws RockPaperScissorsException in case of invalid input
	 */
	public GameState findResult(String userInput) throws RockPaperScissorsException {
		// santize user input
		userInput = userInput.toUpperCase();
		GameHand playerHand = null;
		// map the userinput to our model values and get player's hand
		try {
			playerHand = GameHand.valueOf(userInput);
		} catch (IllegalArgumentException iae) {
			throw new RockPaperScissorsException(iae);
		}
		Computer computer = new Computer();
		// computer plays its hand
		GameHand computerHand = computer.play();
		// apply strategy to both hands 
		GameStrategy strategy = new GameStrategyImpl();
		GameResult result = strategy.resolve(playerHand, computerHand);
		// return result
		return new GameState(computerHand, result);
	}
}
