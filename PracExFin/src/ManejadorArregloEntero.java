/*Tania Ariadna Dominguez Palma
 *08/dic/2021
 *Clase que permite manejar la informacion de arreglos 
 */
public class ManejadorArregloEntero {
	
	public static int eliminaMultiplos(int[] a1, int[]a2, int el1, int el2) {
		int i = 0;
		
		if(el1 == el2) {
			while(i < el1) {
				if (a1[i]%a2[i] == 0 || a2[i]%a1[i] == 0) {
					for(int a = i; a < el2-1; a++) {
						a1[a] = a1[a+1];
						a2[a] = a2[a+1];
					}
					el2--;
				}
				else {
					i++;
				}
			}
		}
		return el2;
	}
	
	public static void main(String[] args) {
		int [] a1 = {10, 5, 9, 28, 34, 11, 17};
		int [] a2 = {13, 45, 3, 323, 17, 6, 41};
		int tamA;

		tamA = eliminaMultiplos(a1, a2, a1.length, a2.length);
		for(int i = 0; i < tamA; i++) {
			System.out.print("\t" + a1[i]);
		}
		System.out.println();
		for(int i = 0; i < tamA; i++) {
			System.out.print("\t" + a2[i]);
		}
	}
}
