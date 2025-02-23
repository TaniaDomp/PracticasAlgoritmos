import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Da funcionalidad a la VistaTienda
 */
public class ControladorTienda extends VistaTienda{
	
	public ControladorTienda(String titulo) {
		super(titulo);
		busBt.addActionListener(new EscuchadorBusqueda());
		borBt.addActionListener(new EscuchadorBorrar());
	}
	
	private class EscuchadorBusqueda implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nomArch, letra, nomArticulo, priLetStr, listaStr;
			ArrayList<String> lista = new ArrayList<String>();
			File arch;
			
			nomArch = nomArxhTxt.getText();
			arch = new File(nomArch);
			letra = letraTxt.getText();
			try(Scanner lect = new Scanner(arch)){
				while(lect.hasNext()) {
					nomArticulo = lect.next();
					priLetStr = nomArticulo.substring(0,1);
					if (priLetStr.equalsIgnoreCase(letra)) {
						lista.add(nomArticulo);
					}
				}
				lect.close();
			}
			catch(FileNotFoundException fnfe) {
				System.err.print("E R R O R" + fnfe);
				System.exit(-1);
			}
			listaStr = String.valueOf(lista);
			infoResTxtA.setText(listaStr);
		}
	}
	
	private class EscuchadorBorrar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			nomArxhTxt.setText("");
			letraTxt.setText("");
		}
	}
	
	public static void main(String[] args) {
		ControladorTienda yo = new ControladorTienda("Tiendita");
	}

}
