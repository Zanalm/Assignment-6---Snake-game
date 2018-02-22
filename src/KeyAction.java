
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
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (grid.isDirectionChanged == false) { // Maps for what will happen when the different keys gets pressed
			switch (keyCode) {
			case KeyEvent.VK_UP:
				grid.changeDirection(Direction.UP);
				break;
			case KeyEvent.VK_RIGHT:
				grid.changeDirection(Direction.RIGHT);
				break;
			case KeyEvent.VK_DOWN:
				grid.changeDirection(Direction.DOWN);
				break;
			case KeyEvent.VK_LEFT:
				grid.changeDirection(Direction.LEFT);
				break;
			case KeyEvent.VK_SPACE:
				break;
			}
		}
	}

}