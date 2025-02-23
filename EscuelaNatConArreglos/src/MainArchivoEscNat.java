import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 29/sep/2021
 * Clase que prueba la clase EscuelaNatacion y guarda informacion en archivos
 */
public class MainArchivoEscNat {
	private static final int PRECIO_TE = 1000;
	
	public static void main(String[] args) {
		EscuelaNatacion esc1;
		File ent = new File ("albercas.txt");
		int numA;
		double lar, anc, areaT, cos;
		boolean alb;
		
		try(Scanner lect = new Scanner(ent)){
			esc1 = new EscuelaNatacion ("UDM", "San Juan de Aragon");
			numA = lect.nextInt();
			for (int i = 0; i < numA; i++) {
				anc = lect.nextDouble();
				lar = lect.nextDouble();
				alb = esc1.altaAlberca(anc, lar);
				if(alb) {
					System.out.println("Alta exitosa");
				}
				else {
					System.out.println("Falla en el alta");
				}
			}
			areaT = esc1.areaTotal();
			cos = areaT * PRECIO_TE;
			System.out.println(esc1.toString());
			System.out.println(cos);
			lect.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
		}
		
	}
}
