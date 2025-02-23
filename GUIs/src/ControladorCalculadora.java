import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Permite que la vista de la calculadora interactue con el usuario
 */
public class ControladorCalculadora extends VistaCalculadora{
	private double num1;
	private double num2;
	private char op;
	
	public ControladorCalculadora(String titulo) {
		super(titulo);
		unoBt.addActionListener(new EscuchadorNumero());
		dosBt.addActionListener(new EscuchadorNumero());
		tresBt.addActionListener(new EscuchadorNumero());
		cuatroBt.addActionListener(new EscuchadorNumero());
		cincoBt.addActionListener(new EscuchadorNumero());
		seisBt.addActionListener(new EscuchadorNumero());
		sieteBt.addActionListener(new EscuchadorNumero());
		ochoBt.addActionListener(new EscuchadorNumero());
		nueveBt.addActionListener(new EscuchadorNumero());
		ceroBt.addActionListener(new EscuchadorNumero());
		multiBt.addActionListener(new EscuchadorOpe());
		resBt.addActionListener(new EscuchadorOpe());
		sumBt.addActionListener(new EscuchadorOpe());
		divBt.addActionListener(new EscuchadorOpe());
		igBt.addActionListener(new EscuchadorIg());
	}
	
	private class EscuchadorNumero implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nomBt, infoNumCom;
			char nomBtCh;
			
			infoNumCom = infoOpTxtA.getText();
			nomBt = e.getActionCommand();
			nomBtCh = nomBt.charAt(0);
			infoNumCom += nomBtCh;
			infoOpTxtA.setText(infoNumCom);
		}	
	}
	
	private class EscuchadorOpe implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nomBt, numStr;
			
			numStr = infoOpTxtA.getText();
			num1 = Double.parseDouble(numStr);
			limpiaInfoOp();
			nomBt = e.getActionCommand();
			op = nomBt.charAt(0);
		}	
	}
	
	private class EscuchadorIg implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String num2Str, resulStr;
			double resul = 0;
			
			num2Str = infoOpTxtA.getText();
			num2 = Double.parseDouble(num2Str);
			switch(op) {
			case '*':
				resul = num1 * num2;
				break;
			case '/':
				resul = num1/num2;
				break;
			case '+':
				resul = num1 + num2;
				break;
			case '-':
				resul = num1 - num2;
				break;
			}
			resulStr = String.valueOf(resul);
			infoOpTxtA.setText(resulStr);
		}	
	}
	
	public void limpiaInfoOp() {
		infoOpTxtA.setText("");
	}
	
	public static void main(String[] args) {
		ControladorCalculadora yo = new ControladorCalculadora("C A L C U L A D O R A");
	}

}
