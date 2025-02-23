import java.util.ArrayList;

/*Tania Ariadna Dominguez Palma
 * 09/dic/2021
 * Clase que genera una matriz de un ArrayList y prueba el metodo
 */
public class generaMatriz {
	
	public static double[][] matrizDouble(ArrayList<Double> lista){
		int tamL;
		double mat[][];
		
		tamL = lista.size();
		mat = new double[tamL][tamL];
		for (int j =0; j < tamL; j++) {
			for (int i = 0; i < tamL; i++) {
				if (j == 0) {
					mat[j][i] = lista.get(i);
				}
				else {
					if (mat[j][i]%2 == 0) {
						
					}
				}
			}
		}
		return mat;
	}
	
	public static void main(String[] args) {
		

	}

}
