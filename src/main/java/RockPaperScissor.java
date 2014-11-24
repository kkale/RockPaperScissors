
import com.rps.controller.GameController;
import com.rps.controller.RockPaperScissorsException;
import com.rps.model.GameState;
import com.rps.view.InputValidator;

/**
 * This class provides the view for the Rock Paper Scissors game.
 * 
 * @author Kinshuk Kale
 * 
 */
public final class RockPaperScissor {

	/**
	 * Do nothing private default constructor to prevent initialization.
	 */
	private RockPaperScissor() {
		
	}

	/**
	 * Entrypoint to the game.
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		GameController controller = new GameController();
		GameState gameState = null;
		InputValidator input = new InputValidator(System.in);
		System.out.print("How many turns do you want to take?: ");
		int turns = input.readInt();
		int turnNo = 0;
		while (turnNo < turns) {
			System.out.print("Turn " + (turnNo + 1)
					+ ". What do you choose? Rock, Paper or Scissors?: ");
			String playerSelection = input.readString();
			try {
				gameState = controller.findResult(playerSelection);
			} catch (RockPaperScissorsException e) {
				System.out
						.println("Please one of the following values: Rock, Paper, Scissors");
				continue;
			}
			System.out.println("The Computer Played: "
					+ gameState.getComputerHand().name());
			System.out.print("Result: ");
			switch (gameState.getResult()) {
			case PLAYER_TWO_WINS:
				System.out.println("The computer wins this round!");
				break;
			case PLAYER_ONE_WINS:
				System.out.println("Congratulations! You win this round!");
				break;
			case NO_RESULT:
				System.out.println("There is no result in this round");
				break;
			default:
			}
			turnNo++;
		}
		System.out.println("Game over. Good bye!");
	}

}
