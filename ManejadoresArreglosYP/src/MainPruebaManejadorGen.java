import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 27/oct/2021
 * Clase que nos permite probar la clase ManejadorArreglosGenerico
 */
public class MainPruebaManejadorGen {
	private static final int CELDAS = 25;
	
	public static int leeArreglo(String[]a) {
		int n;
		Scanner lect = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de celdas del arreglo, maximo " + CELDAS + ":");
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingresa el elemento " + i);
			a[i] = lect.next();
			 
		}
		return n;
	}
	
	public static <T> void imprimeArreglo(T []a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + a[i].toString());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String [] lis2 = new String[CELDAS]; 
		String [] lis = {"Calabaza", "Manzana", "Apio", "Pera", "Sandia", "Banana", "Kiwi"};
		String x;
		int n, n2, nT;
		Scanner lect = new Scanner(System.in);
		
		//imprimeArreglo(lis, lis.length);
		//System.out.println("Posicion del elemento mayor: " +ManejadorArreglosGenerico.posMayor(lis, lis.length));
		//System.out.println("Posicion del elemento menor: " + ManejadorArreglosGenerico.posMenor(lis, lis.length));
		//System.out.println("Ingrese el elemento a evaluar para los mayores y menores");
		//x = lect.next();
		//System.out.println("Numero de elementos mayores a " + x + ": " + ManejadorArreglosGenerico.cuantosMayX(lis, lis.length, x));
		//System.out.println("Numero de elementos menores a " + x + ": " + ManejadorArreglosGenerico.cuantosMenX(lis, lis.length, x));
		//System.out.println("Posicion de los elementos mayores a " + x + ": " + ManejadorArreglosGenerico.cualesMayX(lis, lis.length, x));
		//System.out.println("Posicion de los elementos menores a " + x + ": " +ManejadorArreglosGenerico.cualesMenX(lis, lis.length, x));
		//ManejadorArreglosGenerico.swap(lis, 1, 6);
		//System.out.println("Arreglo cambiado: ");
		//imprimeArreglo(lis, lis.length);
		//ManejadorArreglosGenerico.invierte(lis, lis.length);
		//System.out.println("Arreglo invertido (se invirtieron todos los elementos desde la ultima modificacion): ");
		//imprimeArreglo(lis, lis.length);
		//System.out.println(ManejadorArreglosGenerico.busSecDesordenada(lis, lis.length, "Manzana"));
		//ManejadorArreglosGenerico.seleccionDirecta(lis, lis.length);
		//imprimeArreglo(lis, lis.length);
		//System.out.println(ManejadorArreglosGenerico.busSecOrdenada(lis, lis.length, "Dado"));
		//System.out.println(ManejadorArreglosGenerico.posMin(lis, lis.length, 1));
		//ManejadorArreglosGenerico.kCorrimientoDer(lis, lis.length, 3);
		//imprimeArreglo(lis, lis.length);
		//ManejadorArreglosGenerico.kCorrimientoIzq(lis, lis.length, 2);
		//imprimeArreglo(lis, lis.length);
		//System.out.println(ManejadorArreglosGenerico.busquedaBinaria(lis, lis.length, "Coco"));
		//ManejadorArreglosGenerico.kCorrimientoDerCir(lis, lis.length, 2);
		//imprimeArreglo(lis, lis.length);
		//ManejadorArreglosGenerico.kCorrimientoIzqCir(lis, lis.length, 3);
		//imprimeArreglo(lis, lis.length);
		//ManejadorArreglosGenerico.unCorrimientoIzq(lis, lis.length, 0);
		//imprimeArreglo(lis, lis.length);
		//n = ManejadorArreglosGenerico.eliminaEnDesorden(lis, lis.length, "Calabaza");
		//imprimeArreglo(lis, n);
		//n = ManejadorArreglosGenerico.eliminaEnOrden(lis, lis.length, "Kiwi");
		//imprimeArreglo(lis, n);
		//n = ManejadorArreglosGenerico.eliminaPos(lis, lis.length, 2);
		//imprimeArreglo(lis, n);
		//nT = leeArreglo(lis2);
		//ManejadorArreglosGenerico.unCorrimientoDer(lis2, nT, 2);
		//imprimeArreglo(lis2, nT);
		//n = ManejadorArreglosGenerico.insertaEnOrden(lis2, nT, "Coco");
		//imprimeArreglo(lis2, n);
		//n = ManejadorArreglosGenerico.insertaEnPos(lis2, nT, 3, "Coco");
		//imprimeArreglo(lis2, n);
		//n = ManejadorArreglosGenerico.insertaFinal(lis2, nT, "Zarzamora");
		//imprimeArreglo(lis2, n);
	}

}
