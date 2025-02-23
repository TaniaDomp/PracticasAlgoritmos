/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Prueba la clase Federacion de Automovilismo 
 */
public class PruebaFedAuto {

	public static void main(String[] args) {
		FedAutom p = new FedAutom();
		
		System.out.println(p.altaPiloto("Juan", "Hombre", 50, 150, 10, true));
		System.out.println(p.altaPiloto("Alberto", "Hombre", 50, 150, 20, true));
		System.out.println(p.altaPiloto("Beatriz", "Mujer", 50, 150, 30, true));
		System.out.println(p.altaPiloto("Alberto", "Hombre", 50, 150, 40, true));
		System.out.println(p.toString());
		System.out.println(p.promedioPun());
	}

}
