package laba5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {

	private BufferedImage image;

	public ImagePanel() {

		try {
			image = ImageIO.read(getClass().getResourceAsStream("/logo.jpg"));

		} catch (IOException ex) {
			// handle exception...
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, 100, 50, this); // see javadoc for more info on the parameters
	}

}