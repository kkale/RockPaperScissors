package com.rps.controller;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;

import org.junit.Test;

import com.rps.model.GameState;

/**
 * Test class for RPC controller.
 * @author Kinshuk Kale
 *
 */
public class GameControllerTest {

	/** controller to be tested. */
	private GameController controller 
							= new GameController();

	/**
	 * test random input.
	 */
	@Test
	public void testValidInput() {
		try {
			GameState result = controller.findResult("ROCK");
			assertNotNull(result);
			result = controller.findResult("PAPER");
			assertNotNull(result);
			result = controller.findResult("SCISSORS");
			assertNotNull(result);
		} catch (RockPaperScissorsException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * test lowercase input.
	 */
	@Test
	public void testValidLowerCaseInput() {
		try {
			GameState result = controller.findResult("rock");
			assertNotNull(result);
			result = controller.findResult("paper");
			assertNotNull(result);
			result = controller.findResult("scissors");
			assertNotNull(result);
		} catch (RockPaperScissorsException e) {
			fail(e.getMessage());
		}
	}

	
	/**
	 * test invalid input.
	 */
	@Test
	public void testInvalidInput() {
		try {
			controller.findResult("INVALID");
			fail();
		} catch (RockPaperScissorsException e) {
			System.out.println("Success");
		}
	}
}
