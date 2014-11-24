package com.rps.controller;
/**
 * Exception used by the Rock Paper Scissors game.
 * @author Kinshuk Kale
 *
 */
public class RockPaperScissorsException extends Exception {

	/**
	 * version uid.
	 */
	private static final long serialVersionUID = 8712229349752100589L;

	/**
	 * constructor. 
	 */
	public RockPaperScissorsException() {
		super();
	}

	/**
	 * @param message error message.
	 * @param cause cause of error.
	 */
	public RockPaperScissorsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message error message.
	 */
	public RockPaperScissorsException(String message) {
		super(message);
	}

	/**
	 * @param cause cause of error.
	 */
	public RockPaperScissorsException(Throwable cause) {
		super(cause);
	}

}
