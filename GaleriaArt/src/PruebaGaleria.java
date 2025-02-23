import java.util.Scanner;
import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 9/oct/2021
 * Registra una serie de pinturas y ocupa la clase Galeria para realizar diversas operaciones
 */
public class PruebaGaleria {

	public static void main(String[] args) {
		Galeria gal1;
		int n, anioTer, totPinTe, preI, preS, pinRan;
		String nombrePintura, nombrePintor, tecnica, conPin, conTec, tecCon;
		double precioPin, precioCon;
		boolean altP, precioIn;
		ArrayList<String> pintD;
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
			altP = gal1.altaPintura(nombrePintura, nombrePintor, precioPin, tecnica, anioTer);
			if (altP) {
				System.out.println("Alta exitosa");
			}
			else {
				System.out.println("No se pudo realizar la operacion");
			}
		}
		System.out.println("CONSULTA DE PINTURAS POR PINTOR Y TECNICA");
		System.out.println("Ingrese el nombre del pintor: ");
		conPin = lect.next();
		System.out.println("Ingrese la tecnica: ");
		conTec = lect.next();
		pintD = gal1.consultaPintorTecnica(conPin, conTec);
		if (pintD == null) {
			System.out.println("No hay pinturas disponibles de " + conPin + " con la tecnica " + conTec);
		}
		else {
			System.out.println("Pinturas con el pintor" + conPin + " y tecnica " + conTec + " disponibles: " + pintD);
		}
		System.out.println("CONSULTA DE PINTURAS MENORES A UN PRECIO");
		System.out.println("Ingrese el precio que desea consultar: ");
		precioCon = lect.nextDouble();
		precioIn = gal1.consultaPorPrecio(precioCon);
		if (precioIn) {
			System.out.println("Existen pinturas menores al precio ingresado");
		}
		else {
			System.out.println("No existen pinturas menores al precio ingresado");
		}
		System.out.println("PROMEDIO DE LAS VENTAS DE LAS PINTURAS");
		System.out.println("El promedio de los precios: " + gal1.precioPromVenta());
		System.out.println("PINTURA MAS BARATA DE LA GALERIA");
		System.out.println("La pintura a menor precio: " + gal1.pinturaMasBarata());
		System.out.println("TOTAL DE PINTURAS DE UNA TECNICA");
		System.out.println("Ingrese la tecnica a consultar: ");
		tecCon = lect.next();
		totPinTe = gal1.cuantosTecnica(tecCon);
		System.out.println("Numero de pinturas disponibles con la tecnica " + tecCon + ": " + totPinTe);
		System.out.println("TOTAL DE PINTURAS EN UN RANGO DE PRECIO");
		System.out.println("Ingrese el precio inferior: ");
		preI = lect.nextInt();
		System.out.println("Ingrese el precio superior: ");
		preS = lect.nextInt();
		pinRan = gal1.cuantasPinturasEnRango(preI, preS);
		System.out.println("Pinturas disponibles en el rango de precios " + preI + " - " + preS + ": " + pinRan);
	}
}
