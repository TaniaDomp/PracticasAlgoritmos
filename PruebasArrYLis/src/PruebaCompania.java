import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 29/sep/2021
 * Clase que prueba la clase Compania, pide valores para las Ventas de una en una compania
 */
public class PruebaCompania {

	public static void main(String[] args) {
		Compania co1;
		double venta;
		int n;
		boolean re;
		Scanner lect = new Scanner (System.in);
		
		co1 = new Compania ("Lala", "Av. San Juan", "CDMX", "Jose");
		
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			venta = lect.nextDouble();
			re = co1.altaVenta(venta);
		}
		System.out.println(co1.promedio());
		System.out.println(co1.mesMayVentas());
		System.out.println(co1.mesMenVentas());
		System.out.println(co1.cuantosArribaPromedio());
		System.out.println(co1.totalMontoVentas());
		System.out.println(co1.cualesMesesMayProm());
		System.out.println(co1.mesConVenta(50));
		System.out.println(co1.ventaEnElMes("Marzo"));
		System.out.println(co1.toString());
	}
}
