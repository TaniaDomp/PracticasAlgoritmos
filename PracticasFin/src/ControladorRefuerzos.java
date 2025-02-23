import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 *09/dic/2021
 *Da funcionalidad a la clase VistaRefuerzos
 */
public class ControladorRefuerzos extends VistaRefuerzos{

	public ControladorRefuerzos (String titulo){
		super(titulo);
		procBt.addActionListener(new EscuchadorBoton());
	}
	
	private class EscuchadorBoton implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String nomAr, conEd1Str, conEd2Str, conEd3Str;
			int edad, conEd1 = 0, conEd2 = 0, conEd3 = 0;
			boolean vac1;
			File arch;
			
			nomAr = nomArTxt.getText();
			arch = new File(nomAr);
			try(Scanner lect = new Scanner(arch)){
				while(lect.hasNext()){
					edad = lect.nextInt();
					vac1 = lect.nextBoolean();
					if (edad > 39 && edad < 50 && vac1){
						conEd1++;
					}
					else{
						if (edad > 49 && edad < 60 && vac1){
							conEd2++;
						}
						else{
							if(edad > 60 && vac1){
								conEd3++;
							}
						}
					}
				}
				conEd1Str = String.valueOf(conEd1);
				conEd2Str = String.valueOf(conEd2);
				conEd3Str = String.valueOf(conEd3);
				ed1Txt.setText(conEd1Str);
				ed2Txt.setText(conEd2Str);
				ed3Txt.setText(conEd3Str);
			}
			catch(FileNotFoundException fnfe){
				erPrcTxt.setText("Error al abrir el archivo");
			}
		}
	}
	
	public static void main(String[] args) {
		ControladorRefuerzos yo = new ControladorRefuerzos("Refuerzo vacunas");
	}

}
