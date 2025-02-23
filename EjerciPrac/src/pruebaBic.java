/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Prueba la clase bicicleta
 */
public class pruebaBic {

	public static void main(String[] args) {
		Bicicleta b1, b2;
		double prec1, prec2;
		int ig;
		
		b1 = new Bicicleta ('U', 5, 'C');
		b2 = new Bicicleta ('M', 2, 'A');
		
		prec1 = b1.calculaPrecioVenta();
		prec2 = b2.calculaPrecioVenta();
		System.out.println("El precio de la bicicleta 1: " + prec1);
		System.out.println("El precio de la bicicleta 2: " + prec2);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		ig = b1.compareTo(b2);
		if (ig == 0) {
			System.out.println("La bicicleta 1 es igual a la bicicleta 2");
		}
		else {
			System.out.println("La bicicleta 1 es diferente a la bicicleta 2");
		}
	}

}
