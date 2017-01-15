import java.awt.event.*;

public class ClavierListener extends KeyAdapter
{
	Fenetre fenetre;
	
	public ClavierListener(Fenetre fenetre)
	{
		this.fenetre = fenetre;
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode()) {
			case 90:
				if (e.getModifiers() == KeyEvent.CTRL_MASK) {
					if (Fenetre.cptZell > 0) {
						Fenetre.cptZell--;
					}
				} else {
					Fenetre.cptZell++;
				}
				this.fenetre.labelZell.setText("" + Fenetre.cptZell);
				break;
			case 81:
				if (e.getModifiers() == KeyEvent.CTRL_MASK) {
					if (Fenetre.cptQuistis > 0) {
						Fenetre.cptQuistis--;
					}
				} else {
					Fenetre.cptQuistis++;
				}
				this.fenetre.labelQuistis.setText("" + Fenetre.cptQuistis);
				break;
			case 82:
				Fenetre.cptZell = 0;
				Fenetre.cptQuistis = 0;
				this.fenetre.labelZell.setText("" + Fenetre.cptZell);
				this.fenetre.labelQuistis.setText("" + Fenetre.cptQuistis);
		}
	}
}
