import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 08/sep/2021
 * Primer codigo en Java que convierte pesos a dolares
 */
public class EjecutableConversionDlls {

	public static void main(String[] args) {
		double pesos, dolares;
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		System.out.println ("Dame la cantidad a convertir:");
		pesos = lect.nextDouble();
		dolares = pesos / 20.19;
		
		System.out.println ("La cantidad en dolares "+dolares);
	}

}
