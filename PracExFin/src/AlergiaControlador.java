import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Le da funcionalidad a la clase AlergiaVista
 */
public class AlergiaControlador extends AlergiaVista{
	
	public AlergiaControlador(String titulo) {
		super(titulo);
		busBt.addActionListener(new EscuchadorBusqueda());
	}
	
	private class EscuchadorBusqueda implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nomArch, nomAl, precLim, clav, desc, alimento, listaStr;
			ArrayList<String> lista = new ArrayList<String>();
			double precD, precAr;
			File arch;
			
			nomAl = alerTxt.getText();
			precLim = precTxt.getText();
			precD = Double.parseDouble(precLim);
			nomArch = nomArchTxt.getText();
			arch = new File(nomArch);
			lista.add("Lista de los alimentos que no llevan " + nomAl);
			try (Scanner lect = new Scanner(arch)){
				while(lect.hasNext()) {
					clav = lect.next();
					precAr = lect.nextDouble();
					desc = lect.nextLine();
					desc = lect.nextLine();
					if (!desc.contains(nomAl) && precAr <= precD) {
						alimento = clav + "-" + desc;
						lista.add("\n" + alimento);
					}
				}
			}
			catch(FileNotFoundException fnfe) {
				System.err.print("E R R O R" + fnfe);
				System.exit(-1);
			}
			listaStr = String.valueOf(lista);
			infoProdTxtA.setText(listaStr);
		}
	}
	
	public static void main(String[] args) {
		AlergiaControlador yo = new AlergiaControlador("Protege alergicos");
	}

}
