import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panneau extends JPanel
{
	public void paintComponent(Graphics g)
	{
		g.drawString("Tiens ! Le Site du Z�ro !", 10, 20);
	}               
}
