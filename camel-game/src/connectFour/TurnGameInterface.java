package connectFour;

public interface TurnGameInterface
{
	/**
	 * initialize a game.
	 * define essential game components.
	 */
	public void initializeGame();
		
	/**
	 * play game.
	 * if the player's action is available, return true.
	 */
	public boolean play();

	/**
	 * visualize the player's action.
	 */
	public void visualize();

	/**
	 * check the game is completed or not.
	 */
	public void checkGameCompletion();
	
	/**
	 * if the game is completed, complete the game and show the result.
	 */
	public void completeGame();
}
