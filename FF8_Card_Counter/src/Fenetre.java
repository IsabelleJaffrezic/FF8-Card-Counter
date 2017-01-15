import java.awt.Color; 
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame
{
	static int cptQuistis = 0;
	static int cptZell = 0;
	JLabel labelQuistis;
	JLabel labelZell;
	
	public Fenetre()
	{
		this.setTitle("Ma première fenêtre Java");
		this.setSize(150, 190);
		this.setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,25);
		
		this.labelQuistis = new JLabel("0");
		this.labelQuistis.setFont(font);
		this.labelQuistis.setForeground(Color.GRAY);
		this.labelQuistis.setSize(new Dimension(40,50));
		this.labelQuistis.setPreferredSize(new Dimension(40,50));
		this.labelQuistis.setMinimumSize(new Dimension(40,50));
		
		this.labelZell = new JLabel("0");
		this.labelZell.setFont(font);
		this.labelZell.setForeground(Color.GRAY);
		this.labelZell.setSize(new Dimension(40,50));
		this.labelZell.setPreferredSize(new Dimension(40,50));
		this.labelZell.setMinimumSize(new Dimension(40,50));
		              
		JPanel panQuistis = new JPanel(new BorderLayout(10,10));
		panQuistis.add(new JLabel(new ImageIcon(getClass().getResource("/images/quistis.jpg"))), BorderLayout.CENTER);
		panQuistis.add(this.labelQuistis, BorderLayout.EAST);
		panQuistis.setOpaque(false);
		
		JPanel panZell = new JPanel(new BorderLayout(10,10));
		panZell.add(new JLabel(new ImageIcon(getClass().getResource("/images/zell.jpg"))), BorderLayout.CENTER);
		panZell.add(this.labelZell, BorderLayout.EAST);
		panZell.setOpaque(false);
		
		JPanel center = new JPanel(new BorderLayout());
		center.add(panQuistis, BorderLayout.NORTH);
		center.add(panZell, BorderLayout.SOUTH);
		center.setOpaque(false);
		
		JPanel north = new JPanel();
		north.setOpaque(false);		
		JPanel south = new JPanel();
		south.setOpaque(false);	
		JPanel west = new JPanel();
		west.setOpaque(false);	
		JPanel east = new JPanel();
		east.setOpaque(false);
		
		JPanel pan = new JPanel(new BorderLayout());
		pan.setBackground(Color.BLACK);
		pan.add(north, BorderLayout.NORTH);
		pan.add(south, BorderLayout.SOUTH);
		pan.add(west, BorderLayout.WEST);
		pan.add(east, BorderLayout.EAST);
		pan.add(center, BorderLayout.CENTER);
		      
		this.setContentPane(pan);         
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new ClavierListener(this));
	}
}
