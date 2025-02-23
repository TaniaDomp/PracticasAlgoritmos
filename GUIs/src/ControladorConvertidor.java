import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Controla a VistaConveridor
 */
public class ControladorConvertidor extends VistaConvertidor{

	public ControladorConvertidor(String titulo) {
		super(titulo);
		kmTxt.addActionListener(new EscuchadorKms());
		millasTxt.addActionListener(new EscuchadorMillas());
	}
	
	private class EscuchadorKms implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String kmsStr, millasStr;
			double kmsNum, millasNum;
			
			kmsStr = kmTxt.getText();
			kmsNum = Double.parseDouble(kmsStr);
			millasNum = kmsNum * 1.6;
			millasStr = "" + millasNum;
			millasTxt.setText(millasStr);
		}
	}
	
	private class EscuchadorMillas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String kmsStr, millasStr;
			double kmsNum, millasNum;
			
			millasStr = millasTxt.getText();
			millasNum = Double.parseDouble(millasStr);
			kmsNum = millasNum * 0.6213;
			kmsStr = "" + kmsNum;
			kmTxt.setText(kmsStr);
		}
	}
	
	public static void main(String[] args) {
		ControladorConvertidor yo = new ControladorConvertidor("Covertidor km a millas");

	}

}
