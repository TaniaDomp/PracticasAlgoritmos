import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Prueba la clase Cientifico
 */
public class PruebaCientifico {

	public static void main(String[] args) {
		Cientifico cien1;
		int numero1, numero2, num1, num2, numero, x2, num, v;
		boolean rescom, resImp;
		double x, resuX, resX2, res3;
		String resO;
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		cien1 = new Cientifico ("Veronica", "Matematicas", 1978);
		
		
		System.out.println ("Escriba el numero 1:");
		numero1 = lect.nextInt();
		System.out.println ("Escriba el numero 2:");
		numero2 = lect.nextInt();
		rescom=cien1.estaOrdenCreciente(numero1, numero2);
		if (rescom == true) {
			System.out.println ("Los numeros " + numero1 + " y " + numero2 + " estan en orden creciente");
		}
		else {
			System.out.println ("Los numeros " + numero1 + " y " + numero2 + " no estan en orden creciente");
		}
		
		
		System.out.println ("Escriba el numero 1:");
		num1 = lect.nextInt();
		System.out.println ("Escriba el numero 2:");
		num2 = lect.nextInt();
		resO = cien1.ordenaCreciente(num1, num2);
		System.out.println ("El orden creciente es: " + resO);
		
		
		System.out.println ("Escriba el numero:");
		numero = lect.nextInt();
		resImp = cien1.esImpar(numero);
		if (resImp == true) {
			System.out.println ("El numero es impar");
		}
		else {
			System.out.println ("El numero no es impar");
		}
		
		
		System.out.println ("Escriba el numero x:");
		x = lect.nextDouble();
		resuX = cien1.calculaFuncion1(x);
		System.out.println ("El resultado es: " + resuX);
	
		
		System.out.println ("Escriba el numero x2:");
		x2 = lect.nextInt();
		resX2 = cien1.calculaFuncion2(x2);
		System.out.println ("El resultado es: " + resX2);
		
		
		System.out.println ("Escriba num:");
		num = lect.nextInt();
		System.out.println ("Escriba v:");
		v = lect.nextInt();
		res3 = cien1.calculaFuncion3(num, v);
		System.out.println ("El resultado es: " + res3);
	}
}
