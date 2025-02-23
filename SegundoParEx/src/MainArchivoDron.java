import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma 
 * 25/oct/21
 * Clase que prueba la clase TiendaDrones
 */
public class MainArchivoDron {

	public static void main(String[] args) {
		TiendaDrones t1;
		boolean mar;
		int clave, numMot, numCam;
		double precio;
		String marca;
		File ent = new File ("tiendaDron.txt");

		try(Scanner lect = new Scanner(ent)){
			t1 = new TiendaDrones();
			while(lect.hasNext()) {
				clave = lect.nextInt();
				numMot = lect.nextInt();
				numCam = lect.nextInt();
				precio = lect.nextDouble();
				marca = lect.nextLine(); //se lee enter
				marca = lect.nextLine();
				System.out.println(t1.altaDron(clave, numMot, numCam, precio, marca));
				
			}
			lect.close();
			
			System.out.println(t1.toString());
			mar = t1.dronMarca("DJIAir");
			if (mar) {
				System.out.println("Existe un dron de la marca DJI Air");
			}
			else {
				System.out.println("No existe un dron de la marca DJI Air");
			}
			System.out.println("Informacion del dron mas caro: " + t1.dronCaro());
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}

}