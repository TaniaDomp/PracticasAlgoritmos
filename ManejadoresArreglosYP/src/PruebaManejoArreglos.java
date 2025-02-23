import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 27/sep/2021
 * Prueba la clase ManejadorArreglos
 */
public class PruebaManejoArreglos {
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
		System.out.println("El arreglo");
		imprimeArreglo(a, n);
		System.out.println("La suma de los elementos: " + ManejadorArreglos.suma(a, n));
		System.out.println("El promedio de los elementos: " +ManejadorArreglos.promedio(a, n));
		System.out.println("Posicion del elemento mayor: " +ManejadorArreglos.posMayor(a, n));
		System.out.println("Posicion del elemento menor: " + ManejadorArreglos.posMenor(a, n));
		System.out.println("Ingrese el elemento a evaluar para los mayores y menores");
		x = lect.nextDouble();
		System.out.println("Numero de elementos mayores a " + x + ": " + ManejadorArreglos.cuantosMayX(a, n, x));
		System.out.println("Numero de elementos menores a " + x + ": " + ManejadorArreglos.cuantosMenX(a, n, x));
		System.out.println("Posicion de los elementos mayores a " + x + ": " + ManejadorArreglos.cualesMayX(a, n, x));
		System.out.println("Posicion de los elementos menores a " + x + ": " +ManejadorArreglos.cualesMenX(a, n, x));
		System.out.println("Ingrese la posicion de los elementos que quiere cambiar de lugar: ");
		System.out.println("Posicion del primer elemento: ");
		ps1 = lect.nextInt();
		System.out.println("Posicion del segundo elemento: ");
		ps2 = lect.nextInt();
		ManejadorArreglos.swap(a, ps1, ps2);
		System.out.println("Arreglo cambiado: ");
		imprimeArreglo(a, n);
		ManejadorArreglos.invierte(a, n);
		System.out.println("Arreglo invertido (se invirtieron todos los elementos desde la ultima modificacion): ");
		imprimeArreglo(a, n);
	}

}
