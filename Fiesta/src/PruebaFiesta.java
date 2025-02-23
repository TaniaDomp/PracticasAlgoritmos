import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Tania Ariadna Dominguez Palma
 * 04/nov/2021
 * Prueba la clase Fiesta 
 */
public class PruebaFiesta {

	public static void main(String[] args) {
		Fiesta f1 = new Fiesta("Calle", "12/12/21");
		File ent = new File ("personas2.txt");
		String curp, nombre, edoCivil, vac;
		int numVac;
		
		//System.out.println(f1.altaInvitado("DOOL661212MDFMRR09", "Lourdes", "Casada"));
		//System.out.println(f1.altaInvitado("MEOM610331HDFHRR09", "Mauricio", "Casada"));
		//System.out.println(f1.altaInvitado("MANU020803HMCxxx", "Manuel", "Soltero"));
		//System.out.println(f1.altaVacunaInvitado("MANU020803HMCxxx", "Sputnik"));
		//System.out.println(f1.altaVacunaInvitado("MEOM610331HDFHRR09", "Sputnik"));
		//System.out.println(f1.toString());
		//System.out.println(f1.bajaInvitado("DOOL661212MDFMRR09"));
		//System.out.println(f1.toString());
		//System.out.println(f1.cuantosEdoCivil("Casada"));
		//System.out.println(f1.cuantosEdoCivil("Soltero"));
		//System.out.println(f1.cuantosGenero('M'));
		//System.out.println(f1.cuantosGenero('H'));
		//System.out.println(f1.estaInvitado("MEOM610331HDFHRR08"));
		//System.out.println(f1.elMasJoven());
		//System.out.println(f1.elMasViejo());
		//System.out.println(f1.promedioEdad());
		//System.out.println(f1.cuantosVacunaAplicada("Sputnik"));
		try (Scanner lect = new Scanner(ent)){
			while(lect.hasNext()) {
				curp = lect.next();
				nombre = lect.next();
				edoCivil = lect.next();
				System.out.println(f1.altaInvitado(curp, nombre, edoCivil));
				numVac = lect.nextInt();
				for (int i = 0; i < numVac; i++) {
					vac = lect.next();
					System.out.println(f1.altaVacunaInvitado(curp, vac));
				}
			}
			lect.close();
			System.out.println(f1.toString());
			System.out.println(f1.bajaInvitado("DOOL661212MDFMRR09"));
			System.out.println(f1.toString());
			System.out.println(f1.cuantosEdoCivil("casada"));
			System.out.println(f1.cuantosEdoCivil("soltera"));
			System.out.println(f1.cuantosGenero('M'));
			System.out.println(f1.cuantosGenero('H'));
			System.out.println(f1.estaInvitado("MEOM610331HDFHRR09"));
			System.out.println(f1.elMasJoven());
			System.out.println(f1.elMasViejo());
			System.out.println(f1.promedioEdad());
			System.out.println(f1.cuantosVacunaAplicada("covid1"));
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("E R R O R" + fnfe);
		}
	}

}
