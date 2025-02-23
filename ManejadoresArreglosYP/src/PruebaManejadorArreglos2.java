import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 27/sep/2021
 * Prueba la clase ManejadorArreglos
 */
public class PruebaManejadorArreglos2 {
	private static final int CELDAS = 100;
	
	public static int leeArreglo(double[]a) {
		int n;
		Scanner lect = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de celdas del arreglo, maximo " + CELDAS + ":");
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Ingresa el elemento " + i);
			a[i] = lect.nextDouble();
			 
		}
		return n;
	}
	
	public static void imprimeArreglo(double []a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		double []a = new double[CELDAS];
		int n, ps1, ps2;
		double x;
		Scanner lect = new Scanner(System.in);
		
		n = leeArreglo(a);
		//System.out.println(ManejadorArreglos.busSecDesordenada(a, n, 1));
		//System.out.println(ManejadorArreglos.busSecOrdenada(a, n, 4));
		//System.out.println(ManejadorArreglos.posMin(a, n, 1));
		//ManejadorArreglos.seleccionDirecta(a, n);
		//imprimeArreglo(a, n);
		//ManejadorArreglos.kCorrimientoDer(a, n, 3);
		//imprimeArreglo(a, n);
		//ManejadorArreglos.kCorrimientoIzq(a, n, 2);
		//imprimeArreglo(a, n);
		//System.out.println(ManejadorArreglos.busquedaBinaria(a, n, 50));
		ManejadorArreglos.kCorrimientoDerCir(a, n, 2);
		imprimeArreglo(a, n);
		//ManejadorArreglos.kCorrimientoIzqCir(a, n, 2);
		//imprimeArreglo(a, n);
		//ManejadorArreglos.unCorrimientoIzq(a, n, 0);
		//imprimeArreglo(a, n);
		//System.out.println(ManejadorArreglos.eliminaEnDesorden(a, n, 3));
		//imprimeArreglo(a, n);
		//System.out.println(ManejadorArreglos.eliminaEnOrden(a, n, 10));
		//imprimeArreglo(a, n);
		//System.out.println(ManejadorArreglos.eliminaPos(a, n, 7));
		//imprimeArreglo(a, n);
		//ManejadorArreglos.unCorrimientoDer(a, n, 2);
		//imprimeArreglo(a, n);
		//n = ManejadorArreglos.insertaEnOrden(a, n, 5);
		//imprimeArreglo(a, n);
		//n = ManejadorArreglos.insertaEnPos(a, n, 3, 5);
		//imprimeArreglo(a, n);
		//n = ManejadorArreglos.insertaFinal(a, n, 5);
		//imprimeArreglo(a, n);
	}

}
