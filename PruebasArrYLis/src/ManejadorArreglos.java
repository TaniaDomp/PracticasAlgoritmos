import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 27/sep/2021
 * Clase que nos permite trabajar con elementos de arreglos con metodos estaticos
 */
public class ManejadorArreglos {
	
	public static double suma(double[]a, int n) {
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double promedio(double[]a, int n) {
		double prom;
		
		prom = suma(a, n)/n;
		return prom;
	}
	
	public static int posMayor(double[]a ,int n) {
		int may = 0;
		double mayo = a[0];
		
		for (int i = 1; i < n; i++) {
			if (a[i] > mayo) {
				mayo =a[i];
				may = i;
			}
		}
		return may;
	}
	
	public static int posMenor(double[]a ,int n) {
		int men = 0;
		double meno = a[0];
		
		for (int i = 1; i < n; i++) {
			if (a[i] < meno) {
				meno =a[i];
				men = i;
			}
		}
		return men;
	}
	
	public static int cuantosMayX(double[]a, int n, double x) {
		int mayX = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i] > x) {
				mayX ++;
			}
		}
		return mayX;
	}
	
	public static int cuantosMenX(double[]a, int n, double x) {
		int menX = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				menX ++;
			}
		}
		return menX;
	}
	
	public static ArrayList<Integer> cualesMayX(double []a, int n, double x){
		ArrayList<Integer> listMay = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i] > x) {
				listMay.add(i);
			}
		}
		return listMay;
	}
	
	public static ArrayList<Integer> cualesMenX(double []a, int n, double x){
		ArrayList<Integer> listMen = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				listMen.add(i);
			}
		}
		return listMen;
	}
	
	public static void swap(double[]a, int p1, int p2) {
		double aux;
		
		aux = a[p1];
		a[p1] = a[p2];
		a[p2] = aux;
	}
	
	public static void invierte(double[]a, int n) {
		int num = n - 1;
		
		for (int i = 0; i < n/2; i++) {	
			swap(a, i, num);
			num --;
		}
	}
	
	public static void kCorrimientoDer(double[]a, int n, int k) {
		int num;
		
		for (int c = 0; c < k; c++) {
			num = n - 1;
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num-1];
				num --;
			}
			a[0] = 0;
		}
	}
	
	public static void kCorrimientoIzq(double[]a, int n, int k) {
		int num;
		
		for (int c = 0; c < k; c++) {
			num = 0;
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num+1];
				num ++;
			}
			a[n-1] = 0;
		}
	}
	
	public static int busSecDesordenada(double[]a, int n, double x) {
		int pos, i = 0;
		
		while (i < n && a[i] != x) {
			i++;
		}
		if (i == n) {
			pos = -1;
		}
		else {
			pos = i;
		}
		return pos;
	}
	
	public static int busSecOrdenada (double[]a, int n, double x) {
		int pos, i = 0;
		
		while (i < n && a[i] < x) {
			i++;
		}
		if (i == n || a[i] != x) {
			pos = -i-1; //regla de conversion de posicion
		}
		else {
			pos = i;
		}
		return pos;
	}
	
	public static int posMin(double []a, int n, int in) {
		int pos = in;
		double meno = a[in];
		
		for (int i = in+1; i < n; i++) {
			if (a[i] < meno) {
				meno =a[i];
				pos = i;
			}
		}
		return pos;
	}
	
	public static void seleccionDirecta(double[]a, int n) {
		int num;
		
		for (int i = 0; i < n; i++) {	
			num = posMin(a, n, i);
			swap(a, i, num);
		}
	}
	
	public static int busquedaBinaria(double[]a, int n, double x) {
		int inicio = 0, fin = n-1, mitad = (inicio+fin)/2, pos;
		
		while (inicio <= fin && a[mitad] != x) {
			if (x<a[mitad]) {
				fin = mitad - 1;
			}
			else {
				inicio = mitad + 1;
			}
			mitad = (inicio+fin)/2;
		}
		if (a[mitad] == x) {
			pos = mitad;
		}
		else {
			pos = -inicio-1;
		}
		return pos;
	}
	
	public static void kCorrimientoDerCir(double[]a, int n, int k) {
		int num;
		double poF;
		
		for (int c = 0; c < k; c++) {
			num = n - 1;
			poF = a[num];
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num-1];
				num --;
			}
			a[0] = poF;
		}
	}
	
	public static void kCorrimientoIzqCir(double[]a, int n, int k) {
		int num;
		double poF;
		
		for (int c = 0; c < k; c++) {
			num = 0;
			poF = a[num];
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num+1];
				num ++;
			}
			a[n-1] = poF;
		}
	}
	
	public static void unCorrimientoIzq(double[]a, int n, int pos) {
		for (int i = pos; i < n-1; i++) {
			swap(a, i, i+1);
		}
	}
	
	public static int eliminaEnDesorden(double[]a, int n, double num) {
		int pos, nu = n;
		
		pos = busSecDesordenada(a, n, num);
		nu = eliminaPos(a, n, pos);
		return nu;
	}
	
	public static int eliminaEnOrden(double[]a, int n, double num) {
		int pos, nu = n;
		
		pos = busSecOrdenada(a, n, num);
		nu = eliminaPos(a, n, pos);
		return nu;
	}
	
	public static int eliminaPos(double[]a, int n, int pos) {
		if (pos >= 0 && pos < n) {
			unCorrimientoIzq(a, n, pos);
			a[n-1] = 0;
			n--;
		}
		return n;
	}
	
	public static void unCorrimientoDer(double[]a, int n, int pos) {
		for (int i = n; i > pos; i--) {
			a[i] = a[i-1];
		}
	}
	
	public static int insertaEnOrden(double[]a, int n, double x) {
		int pos;
		
		if (a.length > n) {
			pos = busquedaBinaria(a, n, x);
			if (pos < 0) {
				pos = -pos - 1;
				unCorrimientoDer(a, n, pos);
				a[pos] = x;
				n++;
			}
		}
		return n;
	}
	
	public static int insertaEnPos(double[]a, int n, int pos, double x) {
		int po;
		
		if (a.length > n) {
			po = busSecDesordenada(a, n, x);
			if (po < 0) {
				unCorrimientoDer(a, n, pos);
				a[pos] = x;
				n++;
			}
		}
		return n;
	}
	
	public static int insertaFinal(double[]a, int n, double x) {
		if (a.length > n) {
			a[n] = x;
			n++;
		}
		return n;
	}
}