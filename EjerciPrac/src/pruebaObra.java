/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 *Prueba la clase Obra
 */
public class pruebaObra {

	public static void main(String[] args) {
		Obra o1, o2;
		double prec1, prec2;
		int ig;
		
		o1 = new Obra ("Pedro", "Luna", 'O', 100, 15, 15);
		o2 = new Obra ("Jose", "Sol", 'X', 100, 15, 15);

		prec1 = o1.calculaPrecioVenta("Pepe", 15);
		prec2 = o2.calculaPrecioVenta("Jos", 14);
		System.out.println("El precio de la obra 1: " + prec1);
		System.out.println("El precio de la obra 2: " + prec2);
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		ig = o1.compareTo(o2);
		if (ig == 0) {
			System.out.println("La obra 1 es igual a la obra 2");
		}
		else {
			System.out.println("La obra 1 es diferente a la obra 2");
		}
		
	}

}
