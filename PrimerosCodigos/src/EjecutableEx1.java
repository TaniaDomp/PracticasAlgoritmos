import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 08/sep/2021
 * Código que da datos sobre una encuesta de series de comedia, policiacas y de terror
 */

public class EjecutableEx1 {

	public static void main(String[] args) {
		
		int com, pol, ter, tempT, totk, clavEn, te, po, co, temp, k, enc, proms;
		char tipo; 
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		com = 0;
		pol = 0; 
		ter = 0;
		tempT = 0;
		totk = 0;
		enc = 0;
		
		System.out.println ("Ingrese la clave del encuestado:");
		clavEn = lect.nextInt();
	
		while (clavEn != -1) {
			te = 0;
			po = 0;
			co = 0;
			
			System.out.println ("Ingrese el número de series:");
			k = lect.nextInt();
			for (int i =1; i <= k; i++) {
				System.out.println ("Tipo de serie " + i + ":");
				tipo = lect.next().charAt(0);
				System.out.println ("Número de temporadas de la serie " + i +":");
				temp = lect.nextInt();
				
				switch (tipo) {
				case 'c':
					co ++;
					break;
				case 'p':
					po ++;
					break;
				case 't':
					te ++;
				}
				
				tempT = tempT + temp;
			}
			com = com +co;
			pol = pol + po; 
			ter = ter + te;
			totk = totk + k;
			
			if (te == 0) {
				enc = clavEn;
			}
			
			if (co > po && co > te) {
				System.out.println ("El tipo de serie más visto por el encuestado es comedia");
			}
			else if (po > te) {
				System.out.println ("El tipo de serie más visto por el encuestado es policiaco");
			}
			else {
				System.out.println ("El tipo de serie más visto por el encuestado es terror");
			}
			
			System.out.println ("Ingrese la clave del encuestado: ");
			clavEn = lect.nextInt();
		}
		
		proms = tempT / totk;
		System.out.println ("El promedio de temporadas de las series: " + proms);
		System.out.println ("Clave del encuestado que no ve series de terror: " + enc);
		
		if (com > pol && com > ter) {
			System.out.println ("El tipo de serie más visto es comedia");
		}
		else if (pol > ter) {
			System.out.println ("El tipo de serie más visto es policiaco");
		}
		else {
			System.out.println ("El tipo de serie más visto es terror");
		}
	}
}
