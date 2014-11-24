package com.rps.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rps.model.GameHand;
import com.rps.model.GameResult;

/**
 * This class runs unit test cases on Rock Paper Scissors strategy.
 * @author Kinshuk Kale
 *
 */
public class GameStrategyTest {

	/**
	 * Strategy to be tested.
	 */
	private GameStrategy strategy = null;
	
	/**
	 * Set up tests.
	 * @throws Exception thrown in case of error.
	 */
	@Before
	public void setUp() throws Exception {
		strategy = new GameStrategyImpl();
	}

	/**
	 * Test when player has rock, Computer has paper.
	 */
	@Test
	public void testRockVsPaper() {
		GameResult result = strategy.resolve(GameHand.ROCK, GameHand.PAPER);
		assertEquals(GameResult.PLAYER_TWO_WINS, result);
	}

	/**
	 * Test when player has rock, Computer has scissors.
	 */
	@Test
	public void testRockVsScissors() {
		GameResult result = strategy.resolve(GameHand.ROCK, GameHand.SCISSORS);
		assertEquals(GameResult.PLAYER_ONE_WINS, result);		
	}

	/**
	 * Test when player has rock, Computer has rock.
	 */
	@Test
	public void testRockVsRock() {
		GameResult result = strategy.resolve(GameHand.ROCK, GameHand.ROCK);
		assertEquals(GameResult.NO_RESULT, result);		
	}

	/**
	 * Test when player has paper, Computer has paper.
	 */
	@Test
	public void testPaperVsPaper() {
		GameResult result = strategy.resolve(GameHand.PAPER, GameHand.PAPER);
		assertEquals(GameResult.NO_RESULT, result);		
	}

	/**
	 * Test when player has paper, Computer has scissors.
	 */
	@Test
	public void testPaperVsScissors() {
		GameResult result = strategy.resolve(GameHand.PAPER, GameHand.SCISSORS);
		assertEquals(GameResult.PLAYER_TWO_WINS, result);		
	}

	/**
	 * Test when player has paper, Computer has rock.
	 */
	@Test
	public void testPaperVsRock() {
		GameResult result = strategy.resolve(GameHand.PAPER, GameHand.ROCK);
		assertEquals(GameResult.PLAYER_ONE_WINS, result);		
	}

	/**
	 * Test when player has scissors, Computer has paper.
	 */
	@Test
	public void testScissorsVsPaper() {
		GameResult result = strategy.resolve(GameHand.SCISSORS, GameHand.PAPER);
		assertEquals(GameResult.PLAYER_ONE_WINS, result);		
	}

	/**
	 * Test when player has scissors, Computer has scissors.
	 */
	@Test
	public void testScissorsVsScissors() {
		GameResult result = strategy.resolve(GameHand.SCISSORS, GameHand.SCISSORS);
		assertEquals(GameResult.NO_RESULT, result);		
	}

	/**
	 * Test when player has scissors, Computer has rock.
	 */
	@Test
	public void testScissorsVsRock() {
		GameResult result = strategy.resolve(GameHand.SCISSORS, GameHand.ROCK);
		assertEquals(GameResult.PLAYER_TWO_WINS, result);		
	}
}
