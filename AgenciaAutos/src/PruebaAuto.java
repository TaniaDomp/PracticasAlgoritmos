import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 16/sep/2021
 * Prueba la clase auto
 */
public class PruebaAuto {

	public static void main(String[] args) {
		Auto au1, au2, au3, au4, au5;
		double cobroR, cobroR2;
		int diaR1, diaR2, lice1, lice2, kmF;
		String nom1, nom2;
		Scanner lect = new Scanner (System.in);
		
		au1 = new Auto ("Toyota", 2006, 8500);
		au2 = new Auto ("Nissan", 2000, 1000000);
		au3 = new Auto ("Volkswagen", 2003, 45800);
		au4 = new Auto ("KIA", 2007, 5000);
		au5 = new Auto ("Mazda", 2020, 19000);
		
		System.out.println("RENTA DEL AUTO 5");
		System.out.println("Ingrese los dias de renta:");
		diaR1 = lect.nextInt();
		System.out.println("Ingrese su nombre:");
		nom1 = lect.next();
		System.out.println("Ingrese el numero de su licencia:");
		lice1 = lect.nextInt();
		cobroR = au5.realizaRenta(diaR1, nom1, lice1);
		
		System.out.println("Datos de la renta del auto");
		System.out.println(au5.toString());
		
		System.out.println("Costo total de la renta:");
		System.out.println(cobroR);
		
		
		System.out.println("RENTA DEL AUTO 2");
		System.out.println("Ingrese los dias de renta:");
		diaR2 = lect.nextInt();
		System.out.println("Ingrese su nombre:");
		nom2 = lect.next();
		System.out.println("Ingrese el numero de su licencia:");
		lice2 = lect.nextInt();
		cobroR2 = au2.realizaRenta(diaR2, nom2, lice2);
		
		System.out.println("Datos de la renta del auto");
		System.out.println(au2.toString());
		
		System.out.println("Costo total de la renta:");
		System.out.println(cobroR2);
		
		
		System.out.println("DEVOLUCION DEL AUTO 2");
		System.out.println("Ingrese los kilometros que recorrio el auto:");
		kmF = lect.nextInt();
		au2.realizaDev(kmF);
		
		System.out.println("Datos finales de la devolucion");
		System.out.println(au2.toString());
	}

}
