import java.util.Scanner;
import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 20/sep/2021
 * Saca la serie de Ullman y Fibonacci
 */
public class pruebaUllYFib {
	
	public static void imprimeArreglo(double []a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\t" + a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner lect = new Scanner (System.in);
		int n, nOc;
		double num, numO, numOc;
		ArrayList<Double> list;
		double [] listF;
		
		System.out.println("Ingresa el numero para la serie de Ullman");
		num = lect.nextDouble();
		list =  arrList.ullman(num);
		System.out.println(list);
		System.out.println("Ingresa la posicion que deseas saber");
		nOc = lect.nextInt();
		numO = list.get(nOc);
		System.out.println(numO);
		
		System.out.println("Ingresa el numero para la serie de Fibonacci");
		n = lect.nextInt();
		listF = arrList.fibonacci(n);
		imprimeArreglo(listF, listF.length);
		System.out.println("Ingresa la posicion que deseas saber");
		nOc = lect.nextInt();
		numOc = listF[nOc];
		System.out.println(numOc);
	}

}
