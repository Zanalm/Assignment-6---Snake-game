
import java.awt.event.*;


public class KeyAction implements KeyListener, Runnable {
	private boolean running;
	private final GameGrid grid;
	private final UserInterface gameView;

	public KeyAction(GameGrid grid, UserInterface gameView) {
		this.running = true;
		this.grid = grid;
		this.gameView = gameView;
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

	public void run() {
		while (running) {
			try {
				Thread.sleep(Math.max(50, 200 - grid.getScore() / 5 * 30)); // DEFAULT_MOVE_INTERVAL
			} catch (InterruptedException e) {
				break;
			}
			grid.isDirectionChanged = false;
			if (grid.nextRound() == true) {
				gameView.draw();
			} else {
				System.out.print("Congraduations! Your scores: " + grid.getScore());
				gameView.showGameOverMessage();
				running = false;
			}
		}
	}

}