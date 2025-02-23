/*Tania Ariadna Dominguez Palma
 * 04/nov/2021
 * Maneja informacion de una matriz por medio de metodos estaticos 
 */
public class ManejadorMatrices {
	
	public static double sumaCol (double[][] mat, int col, int m) {
		double suma = 0;
		
		for (int j = 0; j < m; j++) {
			suma += mat[j][col];
		}
		return suma;
	}
	
	public static double sumaRen (double[][] mat, int ren, int n) {
		return ManejadorArreglos.suma(mat[ren], n);
	}
	
	public static double suma (double [][] mat, int m, int n) {
		double sum = 0;
		
		for (int j = 0; j < m; j++) {
			sum += ManejadorArreglos.suma(mat[j], n);;
		}
		return sum;
	}
	
	public static double sumaDiagP(double[][]mat, int mn) {
		int suma = 0;
		
		for (int i = 0; i < mn; i++) {
			suma += mat[i][i];
		}
		return suma;
	}
	
	public static double sumaDiagS(double[][]mat, int mn) {
		int suma = 0;
		
		for (int j = 0; j < mn; j++) {
			suma += mat[j][mn-j-1];
		}
		return suma;
	}
	
	public static int posMinCol(double[][]mat, int col, int m) {
		int pos = 0;
		
		for (int i = 1; i < m; i++) {
			if (mat[i][col] < mat[pos][col]) {
				pos = i;
			}
		}
		return pos;
	}
	
	public static int posMinRen(double[][]mat, int ren, int n) {
		return ManejadorArreglos.posMenor(mat[ren], n);
	}
	
	public static int posMaxCol(double[][]mat, int col, int m) {
		int pos = 0;
		
		for (int j = 1; j < m; j++) {
			if (mat[j][col] > mat[pos][col]) {
				pos = j;
			}
		}
		return pos;
	}
	
	public static int posMaxRen(double[][]mat, int ren, int n) {
		return ManejadorArreglos.posMayor(mat[ren], n);
	}
	
	public static double[][] sumaDosMat(double[][]mat1, double[][]mat2, int m1, int n1, int m2, int n2){
		double[][]mat = null;
		
		if (m1 == m2 && n1 == n2){
			mat = new double[m1][n1];
			for (int j = 0; j < m1; j++) {
				for (int i = 0; i < n1; i++) {
					mat[j][i] = mat1[j][i] +  mat2[j][i];
				}
			}
		}
		return mat;
	}
	
	public static double[][] multiDosMat(double[][]mat1, double[][]mat2, int m1, int n1, int m2, int n2){
		double[][]mat = null;
		
		if (n1 == m2) {
			mat = new double[m1][n2];
			for (int j = 0; j < m1; j++) {
	            for (int i = 0; i < n1; i++) {
	                for (int k = 0; k < n2; k++) {
	                    mat[j][k] += mat1[j][i] * mat2[i][k];
	                }
	            }
	        }
		}
		return mat;
	}
	
	public static int[] posMaxMat(double[][]mat, int m, int n) {
		int posM = 0, posR;
		int posN = ManejadorArreglos.posMayor(mat[posM], n);
		int[] posMay = new int[2];
		
		for (int j = 1; j < m; j++) {
			posR = ManejadorArreglos.posMayor(mat[j], n);
			if (mat[j][posR] > mat[posM][posN]) {
				posN = posR;
				posM = j;
			}
		}
		posMay[0] = posM;
		posMay[1] = posN;
		return posMay;
	}
	
	public static int[] posMenMat(double[][]mat, int m, int n) {
		int posM = 0, posR;
		int posN = ManejadorArreglos.posMenor(mat[posM], n);
		int[] posMen = new int[2];
		
		for (int j = 1; j < m; j++) {
			posR = ManejadorArreglos.posMenor(mat[j], n);
			if (mat[j][posR] < mat[posM][posN]) {
				posN = posR;
				posM = j;
			}
		}
		posMen[0] = posM;
		posMen[1] = posN;
		return posMen;
	}
	
	public static boolean matrizIden(double[][]mat, int mn) {
		int i, j = 0;
		boolean iden = false, bus = false;
		
		while (j < mn && !bus) {
			i = 0;
			while (i < mn && !bus) {
				if (j == i && mat[j][i] != 1) {
					bus = true;
				}
				else {
					if (j != i && mat[j][i] != 0) {
						bus = true;
					}
				}
				i++;	
			}
			j++;
		}
		if (j == mn) {
			iden = true;
		}
		return iden;
	}
	
	public static double[][] matrizTrasp(double[][]mat, int m, int n){
		double[][] matT = new double[n][m];
		
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				matT[i][j] = mat[j][i];
			}
		}
		return matT;
	}
	
	public static boolean matrizSim(double[][]mat, int mn) {
		int j = 0, i;
		boolean sim = true;
		
		while (j < mn && sim) {
			i = 0;
			while(i < mn && sim) {
				if (mat[j][i] != mat[i][j]) {
					sim = false;
				}
				i++;
			}
			j++;
		}
		return sim;
	}
	
	public static int[] buscaElem(double[][]mat, int m, int n, double x) {
		int j = 0, i;
		boolean bus = false;
		int [] pos = {-1, -1};
		
		while(j < m && !bus) {
			i = 0;
			while(i < n && !bus) {
				if (mat[j][i] == x) {
					bus = true;
					pos[0] = j;
					pos[1] = i;
				}
				i++;
			}
			j++;
		}
		return pos;
	}
	
	public static int buscaElemRen(double[][]mat, int ren, int n, double x) {
		return ManejadorArreglos.busSecDesordenada(mat[ren], n, x);
	}
	
	public static int buscaElemColum(double[][]mat, int col, int m, double x) {
		int pos, j = 0;
		
		while (j < m && mat[j][col] != x) {
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
	
	public static String imprimeMatriz(double [][]mat, int m, int n) {
		String matR = "";
		
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				matR = matR + "\t" + mat[j][i];
			}
			matR = matR + "\n";
		}
		return matR;
	}
	
	public static boolean sonIguales(double [][]mat1, int m1, int n1, double [][]mat2, int m2, int n2) {
		int j = 0, i;
		boolean ig = false;
		
		if (m1 == m2 && n1 == n2) {
			while(j < m1) {
				i = 0;
				while(i < n1 && mat1[j][i] == mat2 [j][i]) {
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