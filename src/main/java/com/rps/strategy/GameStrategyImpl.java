package com.rps.strategy;

import com.rps.model.GameResult;
import com.rps.model.GameHand;

/**
 * This is the controller for the rock-paper-scissors game.
 * 
 * @author Kinshuk Kale
 *
 */
public class GameStrategyImpl 
						implements GameStrategy {
	/**
	 * Resolves the rock-paper-scissors game based on the traditional strategy. 
	 * @param player player's hand symbol
	 * @param player2 computer's hand symbol
	 * @return true if computer wins, false if player wins
	 */
	public GameResult resolve(GameHand player, 
				final GameHand player2) {
		GameResult result = GameResult.NO_RESULT;
		switch (player) {
		case ROCK:
			if (player2 == GameHand.PAPER) {
				result = GameResult.PLAYER_TWO_WINS;
			} else if (player2 == GameHand.SCISSORS) {
				result = GameResult.PLAYER_ONE_WINS;
			}
			break;
		case PAPER:
			if (player2 == GameHand.SCISSORS) {
				result = GameResult.PLAYER_TWO_WINS;
			} else if (player2 == GameHand.ROCK) {
				result = GameResult.PLAYER_ONE_WINS;
			}
			break;
		case SCISSORS: 
			if (player2 == GameHand.ROCK) {
				result = GameResult.PLAYER_TWO_WINS;
			} else if (player2 == GameHand.PAPER) {
				result = GameResult.PLAYER_ONE_WINS;
			}
			break;
		default: 
		}
		
		return result;
	}
}
