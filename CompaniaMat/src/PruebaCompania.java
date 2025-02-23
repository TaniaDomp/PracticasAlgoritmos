import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 06/nov/2021
 * Prueba la clase compania
 */
public class PruebaCompania {

	public static void main(String[] args) {
		Compania com = new Compania ("Com1", "San Juan");
		File ent = new File ("ventasCom.txt");
		double vent;
		
		try (Scanner lect = new Scanner(ent)){
			while(lect.hasNext()) {
				vent = lect.nextDouble();
				System.out.println(com.altaVenta(vent));
			}
			lect.close();
			System.out.println(com.mesConMayorVenta("niños"));
			System.out.println(com.promedioVentasUnMes("enero"));
			System.out.println(com.promedioVentasDepto("damas"));
			System.out.println(com.mesSinVentas());
			System.out.println(com.toString());
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("E R R O R" + fnfe);
		}
	}

}
