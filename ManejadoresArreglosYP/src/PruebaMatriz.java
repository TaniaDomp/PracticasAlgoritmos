import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 04/nov/2021
 * Prueba la clase ManejadorMatrices
 */
public class PruebaMatriz {
	private final static int MAX_REN = 5;
	private final static int MAX_COL = 5;
	
	public static void imprimeMatriz(double [][]mat, int m, int n) {
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print("\t" + mat[j][i]);
			}
			System.out.println();
		}
	}
	
	public static int[] leeMatriz(double[][]mat) {
		int m, n;
		Scanner lect = new Scanner(System.in);
		int[] tamMat = new int[2];
		
		System.out.println("Ingresa el numero de renglones, maximo " + MAX_REN + ":");
		m = lect.nextInt();
		System.out.println("Ingresa el numero de columnas, maximo " + MAX_COL + ":");
		n = lect.nextInt();
		tamMat[0] = m;
		tamMat[1] = n;
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < n; i++) {
				System.out.println("Ingresa el elemento " + i + " del renglon "+ j);
				mat[j][i] = lect.nextDouble();	
			}
		}
		return tamMat;
	}
	
	public static double[][] leeMatrizPar(int m, int n) {
		Scanner lect = new Scanner(System.in);
		double [][]mat = new double[m][n];
		
		for (int a = 0; a < m; a++) {
			for (int i = 0; i < n; i++) {
				System.out.println("Ingresa el elemento " + i + " del renglon "+ a);
				mat[a][i] = lect.nextDouble();	
			}
		}
		return mat;
	}
	
	public static int[] leeMatrizArchivo(double[][]mat, String nomAch) {
		File ent = new File(nomAch);
		int[] tamMat = new int[2];
		int m, n;
		
		try (Scanner lect = new Scanner(ent)){
			m = lect.nextInt();
			n = lect.nextInt();
			tamMat[0] = m;
			tamMat[1] = n;
			for (int j = 0; j < m; j++) {
				for (int i = 0; i < n; i++) {
					mat[j][i] = lect.nextDouble();	
				}
			}
			lect.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" +  fnfe);
			System.exit(-1);
		}
		return tamMat;
	}
	
	public static void main(String[] args) {
		double [ ][ ] mat  = {{5,4,7,9}, {1,2,3,4}, {8,5,3,10}};
		double [ ][ ] mat2  = {{5,4,7,9}, {1,2,3,4}, {8,5,3,10}};
		double [ ][ ] matCu  = {{5,4,7,9}, {1,2,3,4}, {8,5,3,10}, {4, 7, 3, 1}};
		double [][] matId = {{1,0,0}, {0,1,0}, {0,0,1}};
		double[][] mSim = {{1,2,3},{2,3,1},{3,1,2}};
		double[][] multi1 = { { 1, 2, -3 }, { 4, 0, -2 } };
	    double[][] multi2 = { { 3, 1 }, { 2, 4 }, { -1, 5 } };
	    double[][] multi3 = { { 1, 0, 3 }, { 2, -1, -2 } };
	    double[][] multi4 = { { -2, 4, 2}, { 1, 0, 0 }, { -1, 1, -1 } };
	    double[][] sum1 = {{ 2, 0, 1}, { 3, 0, 0 }, { 5, 1, 1 }};
	    double[][] sum2 = {{ 1, 0, 1}, { 1, 2, 1 }, { 1, 1, 0 }};
		double [][]m = new double[MAX_REN][MAX_COL];
		double[][] matP, matT, matMul, matMul2, sumS;
		int[] posM, posMen, busEl;
		int mR, nC;
		int[] tamMat, tamMat2;
		
		//imprimeMatriz(mat, 3, 4);
		//System.out.println(ManejadorMatrices.sumaCol(mat, 0, 3));
		//System.out.println(ManejadorMatrices.sumaRen(mat, 0, 4));
		//System.out.println(ManejadorMatrices.suma(mat, 3, 4));
		//System.out.println(ManejadorMatrices.sumaDiagP(matCu, 4));
		//System.out.println(ManejadorMatrices.sumaDiagS(matCu, 4));
		//System.out.println(ManejadorMatrices.posMinCol(mat, 0, 3));
		//System.out.println(ManejadorMatrices.posMinRen(mat, 1, 4));
		//System.out.println(ManejadorMatrices.posMaxCol(mat, 0, 3));
		//System.out.println(ManejadorMatrices.posMaxRen(mat, 2, 4));
		//tamMat = leeMatriz(m);
		//mR = tamMat[0];
		//nC = tamMat[1];
		//imprimeMatriz(m, mR, nC);
		//System.out.println(ManejadorMatrices.sumaCol(m, 0, mR));
		//System.out.println(ManejadorMatrices.sumaRen(m, 0, nC));
		//System.out.println(ManejadorMatrices.suma(m, mR, nC));
		//System.out.println(ManejadorMatrices.sumaDiagP(m, mR));
		//System.out.println(ManejadorMatrices.sumaDiagS(m, mR));
		//System.out.println(ManejadorMatrices.posMinCol(m, 0, mR));
		//System.out.println(ManejadorMatrices.posMinRen(m, 1, nC));
		//System.out.println(ManejadorMatrices.posMaxCol(m, 0, mR));
		//System.out.println(ManejadorMatrices.posMaxRen(m, 2, nC));
		//matP = leeMatrizPar(3, 3);
		//imprimeMatriz(matP, 3, 3);
		//tamMat2 = leeMatrizArchivo(m, "lectMatriz.txt");
		//mR = tamMat2[0];
		//nC = tamMat2[1];
		//imprimeMatriz(m, mR, nC);
		//posM = ManejadorMatrices.posMaxMat(m, mR, nC);
		//for (int i = 0; i < 2; i++) {
		//	System.out.print(posM[i] +  " ");
		//}
		//System.out.println();
		//posMen = ManejadorMatrices.posMenMat(m, mR, nC);
		//for (int i = 0; i < 2; i++) {
			//System.out.print(posMen[i] +  " ");
		//}
		//System.out.println();
		//System.out.println(ManejadorMatrices.matrizIden(matId, 3));
		//System.out.println(ManejadorMatrices.matrizIden(mat, 3));
		//matT = ManejadorMatrices.matrizTrasp(m, mR, nC);
		//imprimeMatriz(matT, nC, mR);
		//System.out.println(ManejadorMatrices.matrizSim(mSim, 3));
		//busEl = ManejadorMatrices.buscaElem(m, mR, nC, 5.0);
		//for (int i = 0; i < 2; i++) {
		//	System.out.print(busEl[i] +  " ");
		//}
		/*sumS = ManejadorMatrices.sumaDosMat(sum1, sum2, 3, 3, 3, 3);
		imprimeMatriz(sumS, 3, 3);
		System.out.println();
		matMul = ManejadorMatrices.multiDosMat(multi1, multi2, 2, 3, 3, 2);
		imprimeMatriz(matMul, 2, 2);
		System.out.println();
		matMul2 = ManejadorMatrices.multiDosMat(multi3, multi4, 2, 3, 3, 3);
		imprimeMatriz(matMul2, 2, 3);
		System.out.println(ManejadorMatrices.buscaElemColum(mat, 0, 4, 8));
		System.out.println(ManejadorMatrices.buscaElemRen(mat, 1, 3, 3));
		System.out.println(ManejadorMatrices.imprimeMatriz(mat, 3, 4));
		System.out.println(ManejadorMatrices.sonIguales(mat, 3, 4, mat2, 3, 4));*/
	}

}
