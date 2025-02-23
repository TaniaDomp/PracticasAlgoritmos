import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Realiza una interfaz para leer informacion y mostrar resultados
 */
public class VistaTransacciones extends JFrame{
	private JLabel nomBanLb, numTranLb, bas1Lb;
	protected JTextField nomBanTxt;
	protected JTextArea numTranTxtA;
	protected JButton busBt;
	
	public VistaTransacciones(String titulo) {
		super(titulo);
		nomBanLb = new JLabel("Nombre del banco: ");
		numTranLb = new JLabel("Cantidad de movimientos del MISMO DIA: ");
		bas1Lb = new JLabel("");
		nomBanTxt = new JTextField(15);
		numTranTxtA = new JTextArea(15, 10);
		busBt = new JButton("Aceptar");
		
		JLabel p = new JLabel();
		p.setLayout(new GridLayout(3, 2));
		Border gap = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		p.setBorder(gap);
		p.add(nomBanLb);
		p.add(nomBanTxt);
		p.add(numTranLb);
		p.add(numTranTxtA);
		p.add(busBt);
		p.add(bas1Lb);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(100, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaTransacciones yo = new VistaTransacciones("P R U E B A");
	}*/

}
