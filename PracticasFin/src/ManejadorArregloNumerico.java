/*Tania Ariadna Dominguez Palma
 *09/dic/2021
 *Clase que permite generar un arreglo double a partir de una matriz double
 */
public class ManejadorArregloNumerico {
	
	public static double[] generaArr(double[][]mat, int n, int m){
		double[] ar = null;
		double sum;
		int j = 0;
		
		if (n == m){
			ar = new double[n];
			for (int i = 0; i < m; i++){
				sum = 0;
				if(i%3 == 0){
					ar[i] = -1;
				}
				else{
					if(i%3 == 2){ //Tiene una falla
						for (int a = 1; a < i; a++){
							sum += mat[a][i];
						}
						ar[i] = sum;
					}
					else{
						for (int u = i; u < m; u++){
							sum += mat[i][u];
						}
						ar[i] = sum;
					}
				}
				n--;
			}
		}
		return ar;
	}
	
	public static void main(String[] args) {
		double mat[][] = {{2, 3, 7, 10, 9}, {2, 5, 5, 5, 1}, {5, 4, 6, 9, 2}, {4, 5, 1, 4, 1}, {2, 2, 0, 7, 2}};
		double[] ar;
		
		ar = generaArr(mat, 5, 5);
		for(int i = 0; i < 5; i++){
			System.out.print("\t" + ar[i]);
		}
	}

}
