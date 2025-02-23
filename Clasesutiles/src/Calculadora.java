/*Tania Ariadna Dominguez Palma
 * 20/sep/2021
 * Clase donde se depositan muchos metodos estaticos
 */
public class Calculadora {
	
	public static double multiplicacion (double n, double m) {
		double resul = 0;
		
		for (int i =1; i <= n; i++) {
			resul += m;
		}
		return resul;
	}
	
	public static double potencia (double n1, double m1) {
		double resul = 1;
		
		for (int i =1; i <= m1; i++) {
			resul *= n1;
		}
		return resul;
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
	
	public static String generaCubosNicomano(int n) {
		StringBuilder cub = new StringBuilder();
		int imp = -1, res = 0;
		
		for (int i =1; i <= n; i++) {
			imp += 2;
			res = imp;
			for (int j = 2; j<=i; j++) {
				imp += 2;
				res += imp;
			}
			cub.append(res + " ");
		}
		return cub.toString();
	}
	
	public static int calculaFactorial (int n) {
		int con = 1, fac =1;
		for (int i =1; i <= n; i++) {
			fac *= con;
			con +=1;
		}
		return fac;
	}
	
	public static int calculaMaximoComunDivisor(int m, int n) {
		int resul = 0;
		if (m>=n) {
			resul = m%n;
		}
		else {
			if (m == 0) {
				resul = n;
			}
			else {
				if (n==0) {
					resul =m;
				}
			}
		}
		
		return resul;
	}
	
	public static String generaSerieFibonacci(int n) {
		StringBuilder serf = new StringBuilder();
		int a = 0, b = 1, c;
		
		serf.append("0, 1");
		for (int i =1; i < (n-1); i++) {
			c = a + b; 
			serf.append(", " + c);
			a = b;
			b = c;
		}
		
		return serf.toString();
	}
	
	public static int calculaSerie1(int n) {
		int sum = 0, num = 1;
		
		for (int i =1; i <= n; i++) {
			sum += num;
			num = num + 1;
		}
		return sum;
	}
	
	public static int calculaSerie2(int n, int num) {
		int sumT = 0, s1 = 0, s2 = 0, s3 = 0, res1, res2, res3, div = 0;
		
		for (int i =1; i <= n; i++) {
			res1 = 1 + 3*s1;
			res2 = 2 + 3*s2;
			res3 = 3 + 3*s3;
			
			if (i == 1 || i == res1) {
				div = num/3;
				s1 += 1;
			}
			else {
				if (i == 2 || i == res2) {
					div = num/5;
					s2 += 1;
				}
				else {
					if (i == 3 || i == res3) {
						div = num/7;
						s3 += 1;
					}
				}
			}
			
			sumT += div;
		}
		return sumT;
	}
	
	public static boolean esDivisiblePor11(int n){
		boolean res;
		int sumP=0, sumI=0, resR, cont=0;
		String numC;
		
		while (n!=0) {
			n = n%10;
			cont++;
		}
		
		for (int i = 1; i <= cont; i++) {
			if (cont%2 == 0) {
				if(i%2 == 0) {
					n/=10;
					sumP += n;
				}
				else {
					n/=10;
					sumI += n;
				}	
			}
			else {
				if(i%2 == 0) {
					n/=10;
					sumP += n;
				}
				else {
					n/=10;
					sumI += n;
				}	
			}
		}
		resR = sumP - sumI;
		
		if (resR/11 == 0) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

	
}