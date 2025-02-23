import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Realiza una vista que convierte 
 */
public class VistaConvertidor extends JFrame {
	protected JLabel kmlb, millaslb;
	protected JTextField kmTxt, millasTxt;
	
	public VistaConvertidor(String titulo) {
		super(titulo);
		kmlb = new JLabel("Kilometros: ");
		millaslb = new JLabel("Millas: ");
		kmTxt = new JTextField(12);
		millasTxt = new JTextField(12);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,2));
		Border gap=BorderFactory.createEmptyBorder(2,2,2,2);
		p.setBorder(gap);
		p.add(kmlb);
		p.add(kmTxt);
		p.add(millaslb);
		p.add(millasTxt);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(300, 300, 420, 320);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	/*
	public static void main(String[] args) {
		VistaConvertidor yo = new VistaConvertidor("P R U E B A");

	}*/

}
