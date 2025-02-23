/*Tania Ariadna Dominguez Palma
 * 09/dic/2021
 * Permite manipular la informacion de una matriz generica
 */
public class ManejadorArregloBidimensionalGenerico {
	
	public static <T extends Comparable <T>> boolean elemIg(T[][] mat1, T[][]mat2, int tam) {
		boolean diagP1 = true;
		int j = 0;
		
		while(j < tam && diagP1) {
			if (mat1[j][tam-1-j].compareTo(mat2[j][tam-1-j]) > 0 && mat1[j][tam-2-j].compareTo(mat2[j][tam-2-j]) > 0 && mat1[j+1][tam-1-j].compareTo(mat2[j+1][tam-1-j]) > 0) {
				diagP1 = false;
			}
			j++;
		}
		return diagP1;
	}
	
	public static void main(String[] args) {
		String[][] mat1 = {{"null", "uno", "sos", "mal", "luz"}, {"mar", "null", "tos", "dos", "sol"}, {"mi", "mil", "mil", "mil", "tul"}, {"dos", "no", "pan", "pez", "por"}, {"las", "pez", "si", "ama", "nos"}};
		String[][] mat2 = {{"cero", "tres", "tos", "sal", "nos"}, {"cal", "luz", "zas", "tos", "sun"}, {"uno", "que", "pos", "zoo", "la"}, {"tos", "paz", "roz", "null", "voz"}, {"los", "tres", "dos", "ala", "null"}};
		
		System.out.println(elemIg(mat1, mat2, mat1[0].length));
	}

}
