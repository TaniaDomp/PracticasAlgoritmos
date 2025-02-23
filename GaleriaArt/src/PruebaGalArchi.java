import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaGalArchi {

	public static void main(String[] args) {
		Galeria gal1;
		int n, anioTer;
		String nombrePintura, nombrePintor, tecnica, ventaPin;
		double precioPin, venP;
		boolean altP;
		File ent = new File ("galeria.txt");
	
		try(Scanner lect = new Scanner(ent)){
			gal1 = new Galeria ("Galeria Rosa", 42083137);
			n = lect.nextInt();
			for (int i = 0; i < n; i++) {
				nombrePintura = lect.next();
				nombrePintor = lect.next();
				precioPin = lect.nextDouble();
				tecnica = lect.next();
				anioTer = lect.nextInt();
				altP = gal1.altaPinturaEnOrden(nombrePintura, nombrePintor, precioPin, tecnica, anioTer);
				if (altP) {
					System.out.println("Alta exitosa");
				}
				else {
					System.out.println("No se pudo realizar la operacion");
				}
			}
			lect.close();
			System.out.println(gal1.toString());
			venP = gal1.venderUnaPintura("VirgenYNiño");
			System.out.println("El precio de la pintura: " + venP);
			System.out.println(gal1.toString());
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
		}
	}
}
