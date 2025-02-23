import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 24/sep/2021
 * Clase donde se ocupan arreglos y listas para la resolucion de problemas
 */
public class arrList {

	public static ArrayList<Double> ullman (double num){
		ArrayList<Double> ull = new ArrayList<Double>();
		
		ull.add(num);
		while (num != 1) {
			if (num%2==0) {
				num = num/2;
			}
			else {
				num = num * 3 +1;
			}
			ull.add(num);
		}
		return ull;
	}
	
	public static double[] fibonacci (int n) {
		double [] fib = new double [n];
		
		fib [0] = 0;
		fib [1] = 1;
		for (int i =2; i < n; i++) {
			fib [i] = fib [i-2] + fib [i-1];
		}
		return fib;
	}
}
