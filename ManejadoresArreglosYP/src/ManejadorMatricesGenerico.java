/*Tania Ariadna Dominguez Palma
 * 21/nov/2021
 * Maneja informacion de una matriz generica por medio de metodos estaticos 
 */
public class ManejadorMatricesGenerico {
	
	public static <T extends Comparable <T>> int posMinCol(T[][]mat, int col, int m) {
		int pos = 0;
		
		for (int i = 1; i < m; i++) {
			if (mat[i][col].compareTo(mat[pos][col]) < 0) {
				pos = i;
			}
		}
		return pos;
	}
	
	public static <T extends Comparable <T>> int posMinRen(T[][]mat, int ren, int n) {
		return ManejadorArreglosGenerico.posMenor(mat[ren], n);
	}
	
	public static <T extends Comparable <T>> int posMaxCol(T[][]mat, int col, int m) {
		int pos = 0;
		
		for (int j = 1; j < m; j++) {
			if (mat[j][col].compareTo(mat[pos][col]) > 0) {
				pos = j;
			}
		}
		return pos;
	}
	
	public static <T extends Comparable <T>> int posMaxRen(T[][]mat, int ren, int n) {
		return ManejadorArreglosGenerico.posMayor(mat[ren], n);
	}
	
	public static <T extends Comparable <T>> int[] posMaxMat(T[][]mat, int m, int n) {
		int posM = 0, posR;
		int posN = ManejadorArreglosGenerico.posMayor(mat[posM], n);
		int[] posMay = new int[2];
		
		for (int j = 1; j < m; j++) {
			posR = ManejadorArreglosGenerico.posMayor(mat[j], n);
			if (mat[j][posR].compareTo(mat[posM][posN]) > 0) {
				posN = posR;
				posM = j;
			}
		}
		posMay[0] = posM;
		posMay[1] = posN;
		return posMay;
	}
	
	public static <T extends Comparable <T>> int[] posMenMat(T[][]mat, int m, int n) {
		int posM = 0, posR;
		int posN = ManejadorArreglosGenerico.posMenor(mat[posM], n);
		int[] posMen = new int[2];
		
		for (int j = 1; j < m; j++) {
			posR = ManejadorArreglosGenerico.posMenor(mat[j], n);
			if (mat[j][posR].compareTo(mat[posM][posN]) < 0) {
				posN = posR;
				posM = j;
			}
		}
		posMen[0] = posM;
		posMen[1] = posN;
		return posMen;
	}
	
	public static <T> boolean matrizSim(T[][]mat, int mn) {
		int j = 0, i;
		boolean sim = true;
		
		while (j < mn && sim) {
			i = 0;
			while(i < mn && sim) {
				if (!mat[j][i].equals(mat[i][j])) {
					sim = false;
				}
				i++;
			}
			j++;
		}
		return sim;
	}
	
	public static <T> int[] buscaElem(T[][]mat, int m, int n, T x) {
		int j = 0, i;
		int [] pos = {-1, -1};
		
		while(j < m && pos[0] == -1) {
			i = ManejadorArreglosGenerico.busSecDesordenada(mat[j], n, x);
			if (i != -1) {
				pos[0] = j;
				pos[1] = i;
			}
			j++;
		}
		return pos;
	}
	
	public static <T> int buscaElemRen(T[][]mat, int ren, int n, T x) {
		return ManejadorArreglosGenerico.busSecDesordenada(mat[ren], n, x);
	}
	
	public static <T> int buscaElemColum(T[][]mat, int col, int m, T x) {
		int pos, j = 0;
		
		while (j < m && !mat[j][col].equals(x)) {
			j++;
		}
		if (j == m) {
			pos = -1;
		}
		else {
			pos = j;
		}
		return pos;
	}
	
	public static <T> boolean sonIguales(T [][]mat1, int m1, int n1, T [][]mat2, int m2, int n2) {
		int j = 0, i;
		boolean ig = false;
		
		if (m1 == m2 && n1 == n2) {
			while(j < m1) {
				i = 0;
				while(i < n1 && mat1[j][i].equals(mat2[j][i])) {
					i++;
				}
				j++;
			}
		}
		if (j == m1) {
			ig = true;
		}
		return ig;
	}
}