import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 27/nov/2021
 * Crea la interfaz de una calculadora
 */
public class VistaCalculadora extends JFrame{
	protected JButton unoBt, dosBt, tresBt, cuatroBt, cincoBt, seisBt, sieteBt, ochoBt, nueveBt, ceroBt, multiBt, resBt, sumBt, divBt, igBt;
	protected JTextArea infoOpTxtA;
	
	public VistaCalculadora(String titulo) {
		super(titulo);
		
		unoBt = new JButton("1");
		dosBt = new JButton("2");
		tresBt = new JButton("3");
		cuatroBt = new JButton("4");
		cincoBt = new JButton("5");
		seisBt = new JButton("6");
		sieteBt = new JButton("7");
		ochoBt = new JButton("8");
		nueveBt = new JButton("9");
		ceroBt = new JButton("0");
		multiBt = new JButton("*");
		resBt = new JButton("-");
		sumBt = new JButton("+");
		divBt = new JButton("/");
		igBt = new JButton("=");
		infoOpTxtA = new JTextArea();
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4));
		Border gap=BorderFactory.createEmptyBorder(2,2,2,2);
		p.setBorder(gap);
		p.add(unoBt);
		p.add(dosBt);
		p.add(tresBt);
		p.add(infoOpTxtA);
		p.add(cuatroBt);
		p.add(cincoBt);
		p.add(seisBt);
		p.add(sumBt);
		p.add(sieteBt);
		p.add(ochoBt);
		p.add(nueveBt);
		p.add(resBt);
		p.add(multiBt);
		p.add(ceroBt);
		p.add(divBt);
		p.add(igBt);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(220, 220, 700, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaCalculadora yo = new VistaCalculadora("P R U E B A");
	}*/

}
