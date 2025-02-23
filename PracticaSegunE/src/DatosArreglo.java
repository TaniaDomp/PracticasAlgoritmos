import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que nos permite trabajar datos de arreglos con metodos estaticos
 */
public class DatosArreglo {
	
	public static ArrayList<Integer>datosPosiciones(double[]a, int x){
		ArrayList<Integer> indices = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % x == 0) {
				indices.add(i);
			}
		}
		return indices;
	}
	
	public static ArrayList<Integer> encuentraParesImpares (int[]arrePares, int[] arreImpares){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < arrePares.length; i++) {
			if (arrePares[i]%2 == 0) {
				numeros.add(arrePares[i]);
			}
		}
		for (int i = 0; i < arreImpares.length; i++) {
			if (arreImpares[i]%2 != 0) {
				numeros.add(arreImpares[i]);
			}
		}
		return numeros;
	}
	
	public static int encuentraYEliminaMultiplos(int[] arreglo, int totalElem, int numero, ArrayList<Integer> result) {
		int i = 0;
		
		while (i<totalElem) {
			if (arreglo[i]%numero == 0) {
				result.add(arreglo[i]);
				for (int a = i; a < totalElem-1; a++) {
					arreglo[a] = arreglo[a+1];
				}
				totalElem--;
				arreglo[totalElem] = 0;
			}
			else {
				i++;
			}
		}
		return totalElem;
	}
	
	public static ArrayList<Integer>generaLista(double[]a, double[]b, int n){
		ArrayList<Integer> lisN = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i] % b[i] == 0 || b[i] % a[i] == 0) {
				lisN.add(i);
			}
		}
		return lisN;
	}
	
	
}
