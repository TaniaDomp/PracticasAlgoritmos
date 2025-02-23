import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Calcula el area que no es ocupada por tapetes en una oficina
 */
public class EjecutableOficinas {

	public static void main(String[] args) {
		Rectangulo r1;
		Circulo c;
		double areaC, ba, altu, rad, areaT;
		areaC = 0;
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		ba = lect.nextDouble();
		altu = lect.nextDouble();
		
		r1 = new Rectangulo(ba, altu);
		
		for (int i =1; i <= 3; i++) {
			rad = lect.nextDouble();
			c = new Circulo(rad);
			areaC = areaC + c.calculaArea();
		}
		
		areaT = r1.area() - areaC;
		
		System.out.println (areaT);
	}

}
