import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Genera una interfaz para leer un archivo y mostrar resultados
 */
public class VistaTienda extends JFrame{
	private JLabel nomArchLb, letraLb, bas1Txt;
	protected JTextField nomArxhTxt, letraTxt;
	protected JTextArea infoResTxtA;
	protected JButton busBt, borBt;
	
	public VistaTienda(String titulo) {
		super(titulo);
		nomArchLb = new JLabel("Nombre del archivo: ");
		letraLb = new JLabel("Letra");
		bas1Txt = new JLabel("");
		nomArxhTxt = new JTextField(20);
		letraTxt = new JTextField(1);
		infoResTxtA = new JTextArea(20,15);
		busBt = new JButton("Buscar");
		borBt = new JButton("Borrar");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,2));
		Border gap = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		p.setBorder(gap);
		p.add(nomArchLb);
		p.add(nomArxhTxt);
		p.add(letraLb);
		p.add(letraTxt);
		p.add(busBt);
		p.add(borBt);
		p.add(infoResTxtA);
		p.add(bas1Txt);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(100, 100, 500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaTienda yo = new VistaTienda("P R U E B A");
	}*/

}
