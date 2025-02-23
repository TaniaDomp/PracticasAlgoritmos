import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 27/sep/2021
 * Clase que nos permite trabajar datos de arreglos con metodos estaticos
 */
public class EstaticoDos {
	public static ArrayList<Integer>generaLista(double[]a, double[]b, int n){
		ArrayList<Integer> lisN = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i] % b[i] == 0) {
				lisN.add(i);
			}
		}
		return lisN;
	}
}
