/*Tania Ariadna Dominguez Palma
 *09/dic/2021
 *Clase que permite verificar la informacion de dos arreglos genericos
 */
public class ManejadorArregloGenerico {
	
	public static <T> boolean elemIg(T[] a1, T[]a2, int el1, int el2){
		int i = 0;
		boolean ig = true;
		
		if (el1 == el2){
			while(i < el1 && ig){
				if (!a1[i].equals(a2[el2-i-1])){
					ig = false;
				}
				i++;
			}
		}
		else{
			ig = false;
		}
		return ig;
	}
	
	public static void main(String[] args) {
		String[] a1 = {"PARIS", "ROMA", "QUITO", "BANGKOK", "BANGKOK", "OSLO", "MOSCU"};
		String[] a2 = {"MOSCU", "OSLO", "BANGKOK", "BANGKOK", "QUITO", "ROMA", "PARIS"};
		String[] a3 = {"1", "2", "3", "4", "5"};
		String[] a4 = {"5", "4", "3", "2", "1"};
		String[] a5 = {"5", "4", "7", "2", "1"};
		String[] a6 = {"5", "4", "3", "2"};
		
		System.out.println(elemIg(a1, a2, a1.length, a2.length));
		System.out.println(elemIg(a3, a4, a3.length, a4.length));
		System.out.println(elemIg(a4, a5, a4.length, a5.length));
		System.out.println(elemIg(a5, a6, a5.length, a6.length));
	}

}
