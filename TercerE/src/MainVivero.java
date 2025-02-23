/*Tania Ariadna Dominguez Palma
 * 12/nov/2021
 * Clase que prueba la clase Vivero
 */
public class MainVivero {

	public static void main(String[] args) {
		Vivero vi = new Vivero("Vivero1");
		boolean alt;
		
		alt = vi.altaPlanta("lechuga", "mucha", 10, 15, 'b');
		if (alt) {
			System.out.println("Alta exitosa");
		}
		alt = vi.altaPlanta("jitomate", "mucha", 15, 20, 'b');
		if (alt) {
			System.out.println("Alta exitosa");
		}
		alt = vi.altaPlanta("tomate", "poca", 25, 30, 'a');
		if (alt) {
			System.out.println("Alta exitosa");
		}
		alt = vi.altaPlanta("cilantro", "media", 10, 40, 'a');
		if (alt) {
			System.out.println("Alta exitosa");
		}
		alt = vi.altaPlanta("perejil", "media", 10, 30, 'a');
		if (alt) {
			System.out.println("Alta exitosa");
		}
		System.out.println("La planta buscada: ");
		System.out.println(vi.buscaPlanta("tomate", 'a'));
		System.out.println("La planta buscada: ");
		System.out.println(vi.buscaPlanta("cilantro", 'a'));
		System.out.println("Las plantas que reciben agua en el rango: " + vi.recibenRangoMl(15, 19));
		System.out.println("Las plantas que reciben agua en el rango: " + vi.recibenRangoMl(15, 30));
		//System.out.println(vi.toString());
	}

}
