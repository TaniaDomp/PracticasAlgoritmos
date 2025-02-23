/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Prueba la clase zoologico
 */
public class PruebaZoologico {

	public static void main(String[] args) {
		Zoologico z = new Zoologico();
		
		z.altaAnimal("An", "Delfin", 10);
		z.altaAnimal("S", "Delfin", 20);
		z.altaAnimal("B", "Perro", 30);
		z.altaAnimal("R", "Mono", 40);
		System.out.println(z.toString());
		System.out.println(z.animalesRaza("Mono"));
		System.out.println(z.promedioEdad());
	}

}
