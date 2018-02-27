import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class DrawSnake {

	JFrame frame = new JFrame("Snakity Snake");
	DrawPanel drawPanel = new DrawPanel();

	int x = 0;
	int y = 0;

	public DrawSnake() {
		AbstractAction rightAction = new AbstractAction() {
			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				x += 2;
				if (x < 0) {
					x = 0;
				}
				drawPanel.repaint();
			}
		};
		Action leftAction = new AbstractAction() {
			private static final long serialVersionUID = 2L;

			@Override
			public void actionPerformed(ActionEvent e) {
				x -= 2;
				if (x > 0) {
					x -= 2;
				}
				drawPanel.repaint();
			}
		};
		Action downAction = new AbstractAction() {
			private static final long serialVersionUID = 3L;

			@Override
			public void actionPerformed(ActionEvent e) {
				y -= 2;
				if (y < 0) {
					y = 0;
				}
				drawPanel.repaint();
			}
		};
		Action upAction = new AbstractAction() {
			private static final long serialVersionUID = 4L;

			@Override
			public void actionPerformed(ActionEvent e) {
				y += 2;
				if (y < 0) {
					y = 0;
				}
				drawPanel.repaint();
			}
		};

		InputMap inputMap = drawPanel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = drawPanel.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		actionMap.put("rightAction", rightAction);

		inputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		actionMap.put("leftAction", leftAction);

		inputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
		actionMap.put("upAction", downAction);

		inputMap.put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		actionMap.put("downAction", upAction);

		frame.add(drawPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private class DrawPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.GREEN);
			g.fillRect(x, y, 50, 50);
		}

		public Dimension getPreferredSize() {
			return new Dimension(500, 400);
		}

	}

}
