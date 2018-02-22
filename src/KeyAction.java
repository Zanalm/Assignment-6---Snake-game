
public class KeyAction {
	private boolean running;
	private final GameGrid grid;
	private final UserInterface gameView;
	
	public KeyAction(GameGrid grid, UserInterface gameView) {
		this.grid = grid;
		this.gameView = gameView;
		this.running = true;
	}
	
	
	
	
	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

}