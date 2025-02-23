import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Da funcionalidad a la clase VistaTransacciones
 */
public class ControladorTransacciones extends VistaTransacciones{

	public ControladorTransacciones(String titulo) {
		super(titulo);
		busBt.addActionListener(new EscuchadorInfo());
	}
	
	private class EscuchadorInfo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			File arch = new File("transaccionesBancos.txt");
			String infoTran, codBam, codDia, nomBan, codCom, conTranStr;
			int contTran = 0;
			
			nomBan = nomBanTxt.getText();
			if (nomBan.equals("Banamex")) {
				codCom = "002";
			}
			else {
				if(nomBan.equals("BBVA")) {
					codCom = "012";
				}
				else {
					codCom = "014";
				}
			}
			try (Scanner lect = new Scanner(arch)){
				while(lect.hasNext()) {
					infoTran = lect.next();
					codBam = infoTran.substring(9, 12);
					codDia = infoTran.substring(42, 45);
					if(codBam.equals(codCom) && codDia.equals("001")) {
						contTran++;
					}
				}
			}
			catch(FileNotFoundException fnfe) {
				System.err.print("E R R O R" + fnfe);
				System.exit(-1);
			}
			conTranStr = String.valueOf(contTran);
			numTranTxtA.setText(conTranStr);
		}
	}
	
	
	public static void main(String[] args) {
		ControladorTransacciones yo = new ControladorTransacciones("Estadisticas transacciones bancarias");
	}

}
