/*Tania Ariadna Dominguez Palma
 * 27/sep/2021
 * Clase que nos permite trabajar datos de arreglos con metodos estaticos
 */
public class PruebaEstaticoDos {

	public static void main(String[] args) {
		double [] ab = {20, 3, 23, 11, 44, 6, 32, 10, 2};
		double [] ba = {2, 21, 15, 22, 31, 11, 5, 70, 25};
		
		System.out.println(EstaticoDos.generaLista(ab, ba, 9));
	}
}
