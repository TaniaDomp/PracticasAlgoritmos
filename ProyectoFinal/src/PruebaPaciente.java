import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Prueba la clase Paciente 
 */
public class PruebaPaciente {

	public static void main(String[] args) {
		Paciente p1;
		String nombre, apellidoM, apellidoP, tipoPaciente, diagnostico, nombreM, tipoMed;
		int unidades, tiempo, edad;
		File ent = new File ("DatPac.txt");
		
		/*p1 = new Paciente("Jimena", "Hernandez", "Juarez", "infante", "Sangrado", 45);
		System.out.println(p1.getClaveUr());
		System.out.println(p1.altaMedicamento("Paracetamol", 4, 5, "Generico"));
		System.out.println(p1.altaMedicamento("Insulina", 3, 2, "Patente"));
		System.out.println(p1.altaMedicamento("Ansulina", 4, 5, "Generico"));
		//System.out.println(p1.toString());
		System.out.println(p1.getUnMedicamento("ParaG"));
		System.out.println(p1.existeMedicamento("AnsuG"));
		System.out.println(p1.unidadesMedicamento("AnsuG"));
		System.out.println(p1.getUnMedicamento("ParaP"));
		System.out.println(p1.bajaMedicamento("AnsuG"));
		//System.out.println(p1.toString());*/
		try (Scanner lect = new Scanner(ent)){
			nombre = lect.next();
			apellidoP = lect.next();
			apellidoM = lect.next();
			tipoPaciente = lect.nextLine();
			tipoPaciente = lect.nextLine();
			diagnostico = lect.next();
			edad = lect.nextInt();
			p1 = new Paciente(nombre, apellidoP, apellidoM, tipoPaciente, diagnostico, edad);
			while(lect.hasNext()) {
				nombreM = lect.next();
				unidades = lect.nextInt();
				tiempo = lect.nextInt();
				tipoMed = lect.next();
				System.out.println(p1.altaMedicamento(nombreM, unidades, tiempo, tipoMed));
			}
			lect.close();
			System.out.println(p1.toString());
			System.out.println(p1.getUnMedicamento("ParaG"));
			System.out.println(p1.existeMedicamento("InsuP"));
			System.out.println(p1.bajaMedicamento("AnsuG"));
			System.out.println(p1.toString());
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}

}
