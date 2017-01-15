import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame
{
	static String version = "v1.0.1";
	static int cptQuistis = 0;
	static int cptZell = 0;
	JLabel labelQuistis;
	JLabel labelZell;
	
	public Fenetre()
	{		
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
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new ClavierListener(this));
		this.setJMenuBar(this.createMenu());
		this.setTitle("Card Counter " + version);
		this.setSize(300, 220);
		this.setLocationRelativeTo(null);         
		this.setVisible(true);
	}
	
	private JMenuBar createMenu() 
	{
		JMenuBar menuBar = new JMenuBar();
		menuBar.setVisible(true);

		JMenu fichier = new JMenu("Fichier");
		JMenu aPropos = new JMenu("?");
		
		JMenuItem help = new JMenuItem("A propos");
		help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Card Counter " + Fenetre.version + " créé par Isabelle J\nGNU GENERAL PUBLIC LICENSE Version 3, 29 June 2007");				
			}
		});
			
		JMenuItem configurer = new JMenuItem("Configurer");
		configurer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "coming soon...");				
			}
		});
		
		fichier.add(configurer);
		aPropos.add(help);
		menuBar.add(fichier);
		menuBar.add(aPropos);
		
		return menuBar;
	}
}
