import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Prueba la clase CuentaBancaria
 */
public class PruebaCuentaBan {

	public static void main(String[] args) {
		CuentaBancaria cu1, cu2;
		String resuCu, tit, titIn;
		double retI, resRet, dep, resDe, depI;
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		System.out.println("Datos para abrir su cuenta");
		System.out.println("Ingresa el nombre del titular:");
		titIn = lect.next();
		System.out.println("Ingresa el monto a depositar:");
		depI = lect.nextDouble();
		
		cu1 = new CuentaBancaria (titIn, depI);
		resuCu = cu1.toString();
		System.out.println(resuCu);
		
		System.out.println("Ingresa el monto que deseas retirar");
		retI = lect.nextDouble();
		resRet = cu1.realizarRetiro(retI);
		
		if (resRet < 0) {
			System.out.println("No tiene suficiente saldo para el retiro");
		}
		else {
			System.out.println("Su nuevo saldo es: " + resRet);
		}
		
		cu2 = new CuentaBancaria();
		
		System.out.println("Datos para abrir su cuenta");
		System.out.println("Inserte el titular de la cuenta: ");
		tit = lect.next();
		cu2.setTitular(tit);
		
		resuCu = cu2.toString();
		System.out.println(resuCu);
		
		System.out.println("Escriba el monto del deposito: ");
		dep = lect.nextDouble();
		resDe = cu2.realizarDeposito(dep);
		System.out.println("Su nuevo saldo: " + resDe);
		
		System.out.println("\nINFORMACION DE LA CUENTA 1");
		resuCu = cu1.toString();
		System.out.println(resuCu);
		System.out.println("\nINFORMACION DE LA CUENTA 2");
		resuCu = cu2.toString();
		System.out.println(resuCu);
	}

}
