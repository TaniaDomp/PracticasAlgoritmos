import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 8/nov/2021
 * Prueba la clase serpentario
 */
public class PruebaSerpentario {

	public static void main(String[] args) {
		String tipo, longitud, alimento;
		double peso; 
		char genero;
		Serpentario se1 = new Serpentario("SerpientesF");
		File ent = new File("infoSerpientes.txt");
		
		/*System.out.println(se1.altaSerpiente("constrictor", "5", 3, "carne", 'H'));
		System.out.println(se1.altaSerpiente("venenosa", "5", 3, "carne", 'H'));
		System.out.println(se1.altaSerpiente("otra", "5", 3, "carne", 'H'));
		System.out.println(se1.altaSerpiente("otra", "9", 3, "carne", 'H'));
		System.out.println(se1.toString());
		System.out.println(se1.getUnaSerpiente(101));
		System.out.println(se1.bajaSerpiente(103));
		System.out.println(se1.toString());
		System.out.println(se1.cuentaPorAlimento("carne"));
		System.out.println(se1.tipoMaxSerp()); */
		try(Scanner lect = new Scanner(ent)){
			while(lect.hasNext()) {
				tipo = lect.next();
				longitud = lect.next();
				peso = lect.nextDouble();
				alimento = lect.next();
				genero = lect.next().charAt(0);
				System.out.println(se1.altaSerpiente(tipo, longitud, peso, alimento, genero));
			}
			lect.close();
			System.out.println(se1.toString());
			System.out.println(se1.getUnaSerpiente(101));
			System.out.println(se1.cuentaPorAlimento("carne"));
			System.out.println(se1.tipoMaxSerp());
			System.out.println(se1.bajaSerpiente(104));
			System.out.println(se1.toString());
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}		
	}

}
