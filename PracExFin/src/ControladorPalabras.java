import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/* Tania Ariadna Dominguez Palma
 * 08/dic/2021
 * Construye una interfaz para leer un archivo y mostrar un resultado 
 */
public class ControladorPalabras extends VistaPalabras{

	public ControladorPalabras(String titulo) {
		super(titulo);
		acepBt.addActionListener(new EscuchadorArchivo());
	}
	
	private class EscuchadorArchivo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String nomArch, palabra, listaStr;
			int medPal;
			ArrayList<String> lista = new ArrayList<String>();
			File arch;
			
			nomArch = nomArchTxt.getText();
			arch = new File(nomArch);
			try (Scanner lect = new Scanner(arch)){
				while(lect.hasNext()) {
					palabra = lect.next();
					medPal = palabra.length();
					if (medPal > 5 && palabra.contains("a")) {
						lista.add(palabra);
					}
				}
				lect.close();
			}
			catch(FileNotFoundException fnfe) {
				System.err.println("E R R O R" + fnfe);
				System.exit(-1);
			}
			listaStr = String.valueOf(lista);
			infoPalTxtA.setText(listaStr);
		}
		
	}
	
	public static void main(String[] args) {
		ControladorPalabras yo = new ControladorPalabras("Editor de texto");
	}

}
