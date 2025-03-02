import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 25/oct/2021
 * Clase que nos permite trabajar con elementos de cualquier tipo de arreglo con metodos estaticos
 */
public class ManejadorArreglosGenerico {
	
	public static <T extends Comparable <T>> int posMayor(T[]a ,int n) {
		int may = 0;
		
		for (int i = 1; i < n; i++) {
			if (a[i].compareTo(a[may]) > 0) {
				may = i;
			}
		}
		return may;
	}
	
	public static <T extends Comparable <T>> int posMenor(T[]a ,int n) {
		int men = 0;
		
		for (int i = 1; i < n; i++) {
			if (a[i].compareTo(a[men]) < 0) {
				men = i;
			}
		}
		return men;
	}
	
	public static <T extends Comparable <T>> int cuantosMayX(T[]a, int n, T x) {
		int mayX = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i].compareTo(x) > 0) {
				mayX ++;
			}
		}
		return mayX;
	}
	
	public static <T extends Comparable <T>> int cuantosMenX(T[]a, int n, T x) {
		int menX = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i].compareTo(x) < 0) {
				menX ++;
			}
		}
		return menX;
	}
	
	public static <T extends Comparable <T>> ArrayList<Integer> cualesMayX(T []a, int n, T x){
		ArrayList<Integer> listMay = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i].compareTo(x) > 0) {
				listMay.add(i);
			}
		}
		return listMay;
	}
	
	public static <T extends Comparable <T>> ArrayList<Integer> cualesMenX(T []a, int n, T x){
		ArrayList<Integer> listMen = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (a[i].compareTo(x) < 0) {
				listMen.add(i);
			}
		}
		return listMen;
	}
	
	public static <T> void swap(T[]a, int p1, int p2) {
		T aux;
		
		aux = a[p1];
		a[p1] = a[p2];
		a[p2] = aux;
	}
	
	public static <T> void invierte(T[]a, int n) {
		int num = n - 1;
		
		for (int i = 0; i < n/2; i++) {	
			swap(a, i, num);
			num --;
		}
	}
	
	public static <T> void kCorrimientoDer(T[]a, int n, int k) {
		int num;
		
		for (int c = 0; c < k; c++) {
			num = n - 1;
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num-1];
				num --;
			}
			a[0] = null;
		}
	}
	
	public static <T> void kCorrimientoIzq(T[]a, int n, int k) {
		int num;
		
		for (int c = 0; c < k; c++) {
			num = 0;
			for (int i = 0; i < n-1; i++) {	
				a[num] = a[num+1];
				num ++;
			}
			a[n-1] = null;
		}
	}
	
	public static <T> int busSecDesordenada(T[]a, int n, T x) {
		int pos, i = 0;
		
		while (i < n && !a[i].equals(x)) {
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
	
	public static <T> void kCorrimientoDerCir(T[]a, int n, int k) {
		int num;
		T poF;
		
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
	
	public static <T> void kCorrimientoIzqCir(T[]a, int n, int k) {
		int num;
		T poF;
		
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
	
	public static <T extends Comparable <T>> int busSecOrdenada (T[]a, int n, T x) {
		int pos, i = 0;
		
		while (i < n && a[i].compareTo(x)<0) {
			i++;
		}
		if (i == n || !a[i].equals(x)) {
			pos = -i-1; //regla de conversion de posicion
		}
		else {
			pos = i;
		}
		return pos;
	}
	
	public static <T extends Comparable <T>> int posMin(T []a, int n, int in) {
		int pos = in;
		T meno = a[in];
		
		for (int i = in+1; i < n; i++) {
			if (a[i].compareTo(meno)<0) {
				meno =a[i];
				pos = i;
			}
		}
		return pos;
	}
	
	public static <T extends Comparable <T>> void seleccionDirecta(T[]a, int n) {
		int num;
		
		for (int i = 0; i < n; i++) {	
			num = posMin(a, n, i);
			swap(a, i, num);
		}
	}
	
	public static <T extends Comparable <T>> int busquedaBinaria(T[]a, int n, T x) {
		int inicio = 0, fin = n-1, mitad = (inicio+fin)/2, pos;
		
		while (inicio <= fin && !a[mitad].equals(x)) {
			if (x.compareTo(a[mitad])<0) {
				fin = mitad - 1;
			}
			else {
				inicio = mitad + 1;
			}
			mitad = (inicio+fin)/2;
		}
		if (inicio<=fin) {
			pos = mitad;
		}
		else {
			pos = -inicio-1; // pos = inicio + 1 * -1;
		}
		return pos;
	}
	
	public static <T> void unCorrimientoIzq(T[]a, int n, int pos) {
		for (int i = pos; i < n-1; i++) {
			a[i] = a[i+1];
		}
	}
	
	public static <T> int eliminaEnDesorden(T[]a, int n, T num) {
		int pos, nu = n;
		
		pos = busSecDesordenada(a, n, num);
		nu = eliminaPos(a, n, pos);
		return nu;
	}
	
	public static <T extends Comparable <T>> int eliminaEnOrden(T[]a, int n, T num) {
		int pos, nu = n;
		
		pos = busSecOrdenada(a, n, num);
		nu = eliminaPos(a, n, pos);
		return nu;
	}
	
	public static <T> int eliminaPos(T[]a, int n, int pos) {
		if (pos >= 0 && pos < n) {
			unCorrimientoIzq(a, n, pos);
			n--;
			a[n] = null;
		}
		return n;
	}
	
	public static <T> void unCorrimientoDer(T[]a, int n, int pos) {
		for (int i = n; i > pos; i--) {
			a[i] = a[i-1];
		}
	}
	
	public static <T extends Comparable <T>> int insertaEnOrden(T[]a, int n, T x) {
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
	
	public static <T> int insertaEnPos(T[]a, int n, int pos, T x) {
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
	
	public static <T> int insertaFinal(T[]a, int n, T x) {
		if (a.length > n) {
			a[n] = x;
			n++;
		}
		return n;
	}
	
}