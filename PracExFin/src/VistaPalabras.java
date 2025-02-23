import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Construye una interfaz para leer un archivo y mostrar un resultado 
 */
public class VistaPalabras extends JFrame{
	private JLabel archLb, texLb;
	protected JTextField nomArchTxt;
	protected JTextArea infoPalTxtA;
	protected JButton acepBt;
	
	public VistaPalabras(String titulo) {
		super(titulo);
		archLb = new JLabel("Ingrese el nombre de archivo");
		texLb = new JLabel("Palabras con mas de 6 caracteres y con la letra a: ");
		nomArchTxt = new JTextField(18);
		infoPalTxtA = new JTextArea(18, 20);
		acepBt = new JButton("Aceptar");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 1));
		Border gap = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		p.setBorder(gap);
		p.add(archLb);
		p.add(nomArchTxt);
		p.add(texLb);
		p.add(infoPalTxtA);
		p.add(acepBt);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(300, 300, 620, 320);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaPalabras yo = new VistaPalabras("P R U E B A");
	}*/

}
