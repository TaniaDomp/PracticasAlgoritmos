/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Calcula el area de 3 mesas rectangulares
 */
public class CalculaEspacio {

	public static void main(String[] args) {
		Rectangulo r1, r2, r3;
		double areaT;
		
		r1 = new Rectangulo(2, 1.8);
		r2 = new Rectangulo(1, 1.5);
		r3 = new Rectangulo(3, 2);
		
		areaT = r1.area() + r2.area() +r3.area();
		
		System.out.println ("El espacio ocupado es: " + areaT);
	}

}
