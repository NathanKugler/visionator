// Mrs. Bulk, Computer Math
// Unit 2, Lab00--Hello World
// 
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class VisionPanel extends JPanel
{
	public void paintComponent (Graphics g)
	{

		//background
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 500);

		g.setColor(Color.BLACK);
		g.drawString("Hello World", 200, 200);


		
	}
}