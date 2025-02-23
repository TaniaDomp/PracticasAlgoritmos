/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Hace pruebas con la clase Rectangulo
 */
public class PruebaRectangulo {

	public static void main(String[] args) {
		Rectangulo r1, r2;
		int comp;
		
		r1 = new Rectangulo(6, 2);
		System.out.println (r1.toString());
		//r1 = new Rectangulo();
		//r1.setbase(6);
		//r1.setaltura(2);
		r2 = new Rectangulo(1, 5);
		System.out.println (r2.toString());
		
		comp = r1.compareTo(r2);
		if (comp == 0) {
			System.out.println ("Los dos objetos son iguales"); 
		}
		else {
			if (comp > 0) {
				System.out.println ("r1 es mayor a r2");
			}
			else {
				System.out.println ("r1 es menor a r2");
			}
		}
	}

}
