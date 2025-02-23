import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 *Prueba la clase Fruta
 */
public class MundoFruteria {

	public static void main(String[] args) {
		Fruta f1, f2;
		double por1, por2, pre1, pre2;
		int ig;
		
		f1 = new Fruta ("Manzana", "roja", "Campeche", 14.50);
		f2 = new Fruta ("Platano", "amarillo", "Veracruz", 6.85);
		
		por1 = f1.calculaPorDes(8500.00);
		por2 = f2.calculaPorDes(8500.00);
		System.out.println("El porcentaje de descuento de la fruta 1 es:" + por1 + "%");
		System.out.println("El porcentaje de descuento de la fruta 2 es:" + por2 + "%");
		
		pre1 = f1.calculaCosto(122);
		pre2 = f2.calculaCosto(122);
		System.out.println("El costo de 122 kilos de la fruta 1 es:" + pre1);
		System.out.println("El costo de 122 kilos de la fruta 2 es:" + pre2);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		ig = f1.compareTo(f2);
		if (ig == 1) {
			System.out.println("La fruta 1 es mayor a la fruta 2");
		}
		else {
			if (ig == -1) {
				System.out.println("La fruta 1 es menor a la fruta 2");
			}
		}
		
	}

}
