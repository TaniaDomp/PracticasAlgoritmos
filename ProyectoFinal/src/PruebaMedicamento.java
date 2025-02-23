import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Prueba la clase Medicamento
 */
public class PruebaMedicamento {

	public static void main(String[] args) {
		Medicamento m1, m2;
		String nombre, tipo;
		int unidades, tiempo;
		File arch = new File("Medic.txt");
		
		/*m1 = new Medicamento("Paracetamol", 5, 2, "Generico");
		m2 = new Medicamento("Paracetamol2", 5, 2, "Patente");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m1.equals(m2));
		System.out.println(m1.compareTo(m2));*/
		
		try(Scanner lect = new Scanner (arch)){
			while(lect.hasNext()) {
				nombre = lect.next();
				unidades = lect.nextInt();
				tiempo = lect.nextInt();
				tipo = lect.next();
				m1 = new Medicamento(nombre, unidades, tiempo, tipo);
				System.out.println(m1.toString());
			}
			lect.close();
		}
		catch (FileNotFoundException fnfe){
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}

}
