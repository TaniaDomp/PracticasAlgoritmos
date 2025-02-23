import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Prueba la clase Hospital
 */
public class PruebaHospital {

	public static void main(String[] args) {
		Hospital h1;
		String nombreH, direcH, nombreP, apellidoM, apellidoP, tipoPaciente, diagnostico, nombreM, claveU, tipoMed;
		int unidades, tiempo, totM, edad;
		File ent = new File ("DatHos.txt");
		
		/*h1 = new Hospital("Hospital1", "San Juan");
		System.out.println(h1.altaPaciente("Jimena", "Hernandez", "Juarez", "anciano/infante", "Sangrado", 55));
		System.out.println(h1.altaPaciente("Carlos", "Rodriguez", "Vazquez", "Con-confusion-mental", "Epilepsia", 41));
		System.out.println(h1.altaPaciente("Juan", "Limon", "Limon", "Con-confusion-mental", "Tumor cerebral", 87));
		System.out.println(h1.altaPaciente("Rosa", "Jimenez", "Limon", "otro", "Fractura", 58));
		System.out.println(h1.altaPaciente("Esperanza", "Ramirez", "Perez", "anciano/infante", "Fractura", 45));
		System.out.println(h1.getUnPaciente("UCRV28112021-ALTA"));
		System.out.println(h1.getUnPaciente("UERP28112021-MEDIA"));
		System.out.println(h1.getUnPaciente("OERP28112021-MEDIA"));
		System.out.println(h1.bajaPaciente("OERP28112021-MEDIA"));
		System.out.println(h1.bajaPaciente("UERP28112021-MEDIA"));
		System.out.println(h1.altaMedicamentoPac("UCRV28112021-ALTA", "Paracetamol", 5, 4, "Generico"));
		System.out.println(h1.altaMedicamentoPac("UCRV28112021-ALTA", "Insulina", 5, 4, "Patente"));
		System.out.println(h1.altaMedicamentoPac("UCRV28112021-ALTA", "Bactrina", 5, 4, "Generico"));
		System.out.println(h1.altaMedicamentoPac("UCRV28112021-ALTA", "Mesilina", 5, 4, "Patente"));
		System.out.println(h1.bajaMedicamentoPac("UCRV28112021-ALTA", "ParaG"));
		System.out.println(h1.bajaMedicamentoPac("UCRV28112021-ALTA", "NiloP"));
		System.out.println(h1.bajaMedicamentoPac("OCRV28112021-ALTA", "ParaG"));
		System.out.println(h1.cuantosUnMedicamento("ParaG"));
		//System.out.println(h1.toString());*/
		
		try (Scanner lect = new Scanner(ent)){
			nombreH = lect.next();
			direcH = lect.next();
			h1 = new Hospital(nombreH, direcH);
			while(lect.hasNext()) {
				nombreP = lect.next();
				//System.out.println(nombreP);
				apellidoP = lect.next();
				//System.out.println(apellidoP);
				apellidoM = lect.next();
				//System.out.println(apellidoM);
				tipoPaciente = lect.next();
				//System.out.println(tipoPaciente);
				diagnostico = lect.nextLine();
				//System.out.println(diagnostico);
				diagnostico = lect.nextLine();
				edad = lect.nextInt();
				//System.out.println(edad);
				System.out.println(h1.altaPaciente(nombreP, apellidoP, apellidoM, tipoPaciente, diagnostico, edad));
				totM = lect.nextInt();
				//System.out.println(totM);
				for (int i = 0; i < totM; i++) {
					claveU = lect.next();
					nombreM = lect.next();
					unidades = lect.nextInt();
					tiempo = lect.nextInt();
					tipoMed = lect.next();
					System.out.println(h1.altaMedicamentoPac(claveU, nombreM, unidades, tiempo, tipoMed));
				}
			}
			lect.close();
			//System.out.println(h1.toString());
			//System.out.println(h1.getUnPaciente("UERP25112021-MEDIA"));
			//System.out.println(h1.getUnPaciente("OERP23112021-MEDIA"));
			//System.out.println(h1.bajaPaciente("OERP23112021-MEDIA"));
			//System.out.println(h1.bajaPaciente("UCRV25112021-ALTA"));
			//System.out.println(h1.bajaMedicamentoPac("UERP26112021-MEDIA", "NilP"));
			//System.out.println(h1.bajaMedicamentoPac("UERP26112021-MEDIA", "ParaG"));
			//System.out.println(h1.cuantosUnMedicamento("ParaG"));
			//System.out.println(h1.cuantosEnRangoEdad(6, 20));
			//System.out.println(h1.getNumPacArea("MEDIA"));
			//System.out.println(h1.getUnMedicamentoPac("UERP26112021-MEDIA", "ParaG"));
			System.out.println(h1.unidadesDeUnMedicamento("ParaG"));
			System.out.println(h1.toString());
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}
}
