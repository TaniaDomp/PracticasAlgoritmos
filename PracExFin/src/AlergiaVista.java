import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Genera la interfaz para leer datos y mostrar resultados
 */
public class AlergiaVista extends JFrame{
	private JLabel alerLb, precLb, nomArchLb;
	protected JTextField alerTxt, precTxt, nomArchTxt;
	protected JTextArea infoProdTxtA;
	protected JButton busBt;
	
	public AlergiaVista(String titulo) {
		super(titulo);
		alerLb = new JLabel("Alergia a: ");
		precLb = new JLabel("Precio limite: $");
		nomArchLb = new JLabel("Nombre de archivo: ");
		alerTxt = new JTextField(20);
		precTxt = new JTextField(20);
		nomArchTxt = new JTextField(20);
		infoProdTxtA = new JTextArea(20,15);
		busBt = new JButton("Buscar");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 2));
		Border gap = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		p.setBorder(gap);
		p.add(alerLb);
		p.add(alerTxt);
		p.add(precLb);
		p.add(precTxt);
		p.add(nomArchLb);
		p.add(nomArchTxt);
		p.add(busBt);
		p.add(infoProdTxtA);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(100, 100, 550, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		AlergiaVista yo = new AlergiaVista("P R U E B A");
	}*/

}
