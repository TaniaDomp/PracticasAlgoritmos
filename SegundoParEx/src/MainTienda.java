import java.util.Scanner;

/*Tania Ariadna Dominguez Palma 
 * 20/oct/21
 * Clase que prueba la clase TiendaDrones
 */
public class MainTienda {

	public static void main(String[] args) {
		TiendaDrones t1 = new TiendaDrones("Tienda1");
		boolean mar;
		int n, clave, numMot, numCam;
		double precio;
		String marca;
		Scanner lect = new Scanner(System.in);
		
		//System.out.println(t1.altaDron(100, 25, 3, 20, "Toyota"));
		//System.out.println(t1.altaDron(101, 25, 3, 150, "DJI Air"));
		//System.out.println(t1.altaDron(102, 25, 3, 350, "DJI Air"));
		//System.out.println(t1.altaDron(100, 25, 3, 300, "Toyota"));
		n = lect.nextInt();
		for (int i = 0; i < n; i++) {
			clave = lect.nextInt();
			numMot = lect.nextInt();
			numCam = lect.nextInt();
			precio = lect.nextDouble();
			marca = lect.next();
			t1.altaDron(clave, numMot, numCam, precio, marca);
			
		}
		System.out.println(t1.toString());
		mar = t1.dronMarca("DJIAir");
		if (mar) {
			System.out.println("Existe un dron de la marca DJI Air");
		}
		else {
			System.out.println("No existe un dron de la marca DJI Air");
		}
		System.out.println("Informacion del dron mas caro: " + t1.dronCaro());
		
		mar = t1.dronMarca("DJI Air");
		if (mar) {
			System.out.println("Existe un dron de la marca DJI Air");
		}
		else {
			System.out.println("No existe un dron de la marca DJI Air");
		}
		System.out.println("Informacion del dron mas caro: " + t1.dronCaro());
	}
}
