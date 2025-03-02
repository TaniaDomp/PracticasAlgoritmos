/*Tania Ariadna Dominguez Palma
 * 20/sep/2021
 * Clase donde se depositan metodos estaticos
 */
public class FuncionesSimples {
	
	public static int calculaFactorial (int n) {
		int con = 1, fac = 1;
		
		if (n == 0) {
			fac = 1;
		}
		
		for (int i =1; i <= n; i++) {
			fac *= con;
			con +=1;
		}
		return fac;
	}
	
	public static String generaSerieFibonacci(int n) {
		StringBuilder serf = new StringBuilder();
		int a = 0, b = 1, c;
		
		serf.append("0 1");
		for (int i =1; i < (n-1); i++) {
			c = a + b; 
			serf.append(" " + c);
			a = b;
			b = c;
		}
		return serf.toString();
	}
	
	public static String  calculaUllman (int num) {
		StringBuilder ser = new StringBuilder();
		
		ser.append(num + " ");
		while (num != 1) {
			if (num%2==0) {
				num = num/2;
			}
			else {
				num = num * 3 +1;
			}
			ser.append(num + " ");
		}
		return ser.toString();
	}
}
