/*Tania Ariadna Dominguez Palma
 * 25/09/2021
 * Prueba la clase artesania
 */
public class pruebaArt {

	public static void main(String[] args) {
		Artesania art1, art2;
		double prec;
		int ig;
		
		art1 = new Artesania ("ceramica", "Hidalgo", 9, true);
		art2 = new Artesania ("madera", "Oaxaca", 15, true);
		
		prec = art1.precioV();
		System.out.println("El precio de su artesania es:" + prec);
		
		ig = art1.compareTo(art2);
		if (ig == 0) {
			System.out.println("La artesania 1 es igual a la artesania 2");
		}
		else {
			System.out.println("La artesania 1 y artesania 2 son distintas");
		}
		
		art1.setRegionO("Xochimilco");
		System.out.println(art1.toString());
	}

}
