import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;
/*Tania Ariadna Dominguez Palma
 *09/dic/2021
 *Genera la vista para que el usuario ingrese datos y se muestren los resutados de las operaciones 
 */
public class VistaRefuerzos extends JFrame{
	private JLabel nomArLb, ed1Lb, ed2Lb, ed3Lb;
	protected JButton procBt;
	protected JTextField nomArTxt, erPrcTxt, ed1Txt, ed2Txt, ed3Txt;
	
	public VistaRefuerzos (String titulo){
		super(titulo);
		nomArLb = new JLabel("Nombre del archivo: ");
		ed1Lb = new JLabel("40 - 49 años: ");
		ed2Lb = new JLabel("50 - 59 años: ");
		ed3Lb = new JLabel("60 o mas años: ");
		procBt = new JButton("Procesar");
		nomArTxt = new JTextField(20);
		erPrcTxt = new JTextField(20);
		ed1Txt = new JTextField(20);
		ed2Txt = new JTextField(20);
		ed3Txt = new JTextField(20);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 2));
		Border gap = BorderFactory.createEmptyBorder(2, 2, 2, 2);
		p.setBorder(gap);
		p.add(nomArLb);
		p.add(nomArTxt);
		p.add(procBt);
		p.add(erPrcTxt);
		p.add(ed1Lb);
		p.add(ed1Txt);
		p.add(ed2Lb);
		p.add(ed2Txt);
		p.add(ed3Lb);
		p.add(ed3Txt);
		
		this.add(p);
		this.setVisible(true);
		this.setBounds(100, 100, 500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaRefuerzos yo = new VistaRefuerzos("P R U E B A");
	}*/

}
