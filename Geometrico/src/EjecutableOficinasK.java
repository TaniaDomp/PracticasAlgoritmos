import java.util.Scanner;

public class EjecutableOficinasK {

	public static void main(String[] args) {
		Rectangulo r1;
		Circulo c;
		double areaC, areaR, ba, altu, rad, areaT; 
		int nR, kT;
		areaC = 0;
		areaR = 0;
		
		Scanner lect;
		lect = new Scanner (System.in);
		
		System.out.println ("Inserte el número de oficinas: ");
		nR = lect.nextInt();
		for (int i = 1; i <= nR; i++) {
			System.out.println ("Inserte la base de la oficina "  + i + ":");
			ba = lect.nextDouble();
			System.out.println ("Inserte la altura de la oficina "  + i + ":");
			altu = lect.nextDouble();
			
			r1 = new Rectangulo(ba, altu);
			areaR = areaR + r1.area();
			
			System.out.println ("Inserte el número de tapetes de la oficina "+ i + ":");
			kT = lect.nextInt();
			for (int a = 1; a <= kT; a++) {
				System.out.println ("Inserte el radio del tapete "  + a + ":");
				rad = lect.nextDouble();
				c = new Circulo(rad);
				areaC = areaC + c.calculaArea();
			}
		}
		
		areaT = areaR - areaC;
		System.out.println ("El área total descubierta es: "  + areaT);
	}

}
