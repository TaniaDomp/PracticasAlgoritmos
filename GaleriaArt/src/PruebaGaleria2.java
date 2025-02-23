import java.util.ArrayList;
import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 14/oct/2021
 * Registra una serie de pinturas y ocupa la clase Galeria para realizar diversas operaciones
 */
public class PruebaGaleria2 {

	public static void main(String[] args) {
		Galeria gal1;
		int n, anioTer;
		String nombrePintura, nombrePintor, tecnica, ventaPin;
		double precioPin, venP;
		boolean altP;
		Scanner lect = new Scanner (System.in);
	
		gal1 = new Galeria ("Galeria Rosa", 42083137);
		System.out.println("Ingrese el numero de pinturas que desea registrar: ");
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Nombre de la pintura " + (i+1) + ": ");
			nombrePintura = lect.next();
			System.out.println("Nombre del pintor:");
			nombrePintor = lect.next();
			System.out.println("Precio de la pintura:");
			precioPin = lect.nextDouble();
			System.out.println("Tecnica de la pintura:");
			tecnica = lect.next();
			System.out.println("Año de termino:");
			anioTer = lect.nextInt();
			altP = gal1.altaPinturaEnOrden(nombrePintura, nombrePintor, precioPin, tecnica, anioTer);
			if (altP) {
				System.out.println("Alta exitosa");
			}
			else {
				System.out.println("No se pudo realizar la operacion");
			}
		}
		System.out.println(gal1.toString());
		System.out.println("Ingrese el nombre de la pintura que desea: ");
		ventaPin = lect.next();
		venP = gal1.venderUnaPintura(ventaPin);
		System.out.println("El precio de la pintura: " + venP);
		System.out.println(gal1.toString());
	}
}
