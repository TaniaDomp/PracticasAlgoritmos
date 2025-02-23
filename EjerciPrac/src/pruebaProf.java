import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 *Prueba la clase profesor
 */
public class pruebaProf {

	public static void main(String[] args) {
		Profesor p1, p2;
		boolean res1, res2;
		int num1, num2, ig;
		Scanner lect = new Scanner(System.in);
		
		p1 = new Profesor ("Juan", "Matematicas", 'A', 0);
		p2 = new Profesor ("Pedro", "Matematicas", 'A', 10);
		
		System.out.println("Ingresa el numero para el reto del profesor 1:");
		num1 = lect.nextInt();
		res1 = p1.retaAl(num1);
		if (res1 == true) {
			System.out.println("El numero es perfecto");
		}
		else {
			System.out.println("El numero no es perfecto");
		}
		System.out.println("Ingresa el numero para el reto del profesor 2:");
		num2 = lect.nextInt();
		res2 = p2.retaAl(num2);
		if (res2 == true) {
			System.out.println("El numero es perfecto");
		}
		else {
			System.out.println("El numero no es perfecto");
		}
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		ig = p1.compareTo(p2);
		if (ig == 0) {
			System.out.println("El profesor 1 es igual al profesor 2");
		}
		else {
			System.out.println("El profesor 1 es diferente al profesor 2");
		}
	}

}
