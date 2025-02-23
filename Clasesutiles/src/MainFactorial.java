import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 20/sep/2021
 * Prueba la clase FuncionesSimples
 */
public class MainFactorial {

	public static void main(String[] args) {
	
		Scanner lect = new Scanner (System.in);
		int num;
		
		num = lect.nextInt();
		
		System.out.print(FuncionesSimples.calculaFactorial(num));
	}
	
	
}
