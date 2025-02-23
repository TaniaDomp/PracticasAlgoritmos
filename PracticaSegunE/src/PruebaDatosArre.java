import java.util.ArrayList;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Prueba la clase DatosArreglo
 */
public class PruebaDatosArre {
	private static final int CELDAS = 100;
	
	public static int leeArreglo(int[]a) {
		int n;
		Scanner lect = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de celdas del arreglo, maximo " + CELDAS + ":");
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingresa el elemento " + i);
			a[i] = lect.nextInt();
			 
		}
		return n;
	}
	
	public static void imprimeArreglo(int []a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list, lis2, lis4;
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Double> lisInd = new ArrayList<Double>();
		double[] arre = {3.0, 5.0, 9.0, 10.0, 12.0, 23.0, 15.0};
		int [] arrePares = {10, 7, 3, 12, 9, 8, 1, 22};
		int [] arreImpares = {11, 13, 10, 15, 8, 4, 2, 1, 44};
		int []a = new int[CELDAS];
		int []ar = {2, 8, 15, 18, 26, 41, 50, 66, 73, 82, 90, 95};
		int n, numC;
		double [] ab = {20, 3, 23, 11, 44, 6, 32, 10, 2};
		double [] ba = {2, 21, 15, 22, 31, 11, 5, 70, 25};
		int in;
		Scanner lect = new Scanner(System.in);
		
		//list = DatosArreglo.datosPosiciones(arre, 3);
		//System.out.println(list);
		//lis2 = DatosArreglo.encuentraParesImpares(arrePares, arreImpares);
		//System.out.println(lis2);
		
		//n = leeArreglo(a);
		/*numC = DatosArreglo.encuentraYEliminaMultiplos(ar, 12, 3, result);
		System.out.println(numC);
		imprimeArreglo(ar, 12);
		System.out.println(result);*/
		
		lis4 = DatosArreglo.generaLista(ab, ba, 9);
		for(int i = 0; i < lis4.size(); i++) {
			in = lis4.get(i);
			if (ab[in]<ba[in]) {
				lisInd.add(ab[in]);
			}
			else {
				lisInd.add(ba[in]);
			}
		}
		System.out.println(lisInd);
		
		
	}

}
