// Mrs. Bulk
//
// Lab00.java - Hello World - Graphics

import java.awt.Dimension;

import javax.swing.JFrame;

public class VisionDriver
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("Welcome Home");

		frame.setSize(500, 500);
		frame.setResizable(false);

		frame.setLocation(400, 50);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(new VisionPanel());
	

	
	}
}