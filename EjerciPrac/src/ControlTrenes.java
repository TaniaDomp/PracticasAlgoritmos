import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 25/09/2020
 * Prueba la clase Tren
 */
public class ControlTrenes {

	public static void main(String[] args) {
		Tren tr1, tr2;
		String mar;
		int dT, kT, diasF1, diasF2, ig;
		char tM;
		Scanner lect = new Scanner(System.in);
		
		tr1 = new Tren ("Mitsubishi", 30, 250000, 'p');
		
		System.out.println("Ingresa la marca del tren: ");
		mar = lect.next();
		System.out.println("Ingresa los dias transcurridos desde el ultimo mantenimiento: ");
		dT = lect.nextInt();
		System.out.println("Ingresa los kilometros recorridos desde el ultimo mantenimiento: ");
		kT = lect.nextInt();
		System.out.println("Ingresa el tipo del ultimo mantenimiento: ");
		tM = lect.next().charAt(0);
		tr2 = new Tren (mar, dT, kT, tM);
		
		diasF1 = tr1.diasMan("Mitsubishi");
		diasF2 = tr2.diasMan("yo");
		
		System.out.println("Los dias faltantes para el mantenimiento del tren 1: " + diasF1);
		System.out.println("Los dias faltantes para el mantenimiento del tren 2: " + diasF2);
		
		tr1.Mantenimeinto('u');
		//System.out.println(tr1.toString());
		
		ig = tr1.compareTo(tr2);
		if (ig == 0) {
			System.out.println("El tren 1 es igual al tren 2");
		}
		else {
			System.out.println("El tren 1 es diferente al tren 2");
		}
	}

}
