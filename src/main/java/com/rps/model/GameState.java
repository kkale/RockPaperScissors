package com.rps.model;

/**
 * This class represents the game state at the end of each round. 
 * It holds the hand that the computer played and the result.
 *  
 * @author Kinshuk Kale
 *
 */
public class GameState {

	/** computer's hand. */
	private GameHand computerHand;
	/** game result. */
	private GameResult result;
	
	/**
	 * Constructor for the game state.
	 * @param compHand computer's hand
	 * @param gameResult result of the game
	 */
	public GameState(GameHand compHand, GameResult gameResult) {
		this.computerHand = compHand;
		this.result = gameResult;
	}
	
	/**
	 * @return the computerHand
	 */
	public GameHand getComputerHand() {
		return computerHand;
	}
	/**
	 * @param computerHand the computerHand to set
	 */
	public void setComputerHand(GameHand computerHand) {
		this.computerHand = computerHand;
	}
	/**
	 * @return the result
	 */
	public GameResult getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(GameResult result) {
		this.result = result;
	}
	
}
