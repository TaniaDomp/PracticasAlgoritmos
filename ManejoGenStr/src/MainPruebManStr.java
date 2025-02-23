import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Prueba la clase Manejo String
 */
public class MainPruebManStr {

	public static void main(String[] args) {
		String cadena = "Una frase con espacios, mayúsculas y minúsculas..., algunos acentos, etc.";
		String cadena2 = "una frase con espacios, mayúsculas y minúsculas..., algunos acentos, etc.";
		String cad3 = "Anita lava la tina";
		String cad4 = "A mi loca Colima";
		String cadEr = "Una frassse con essspaciosss, mayússsculasss y minússsculasss..., algunosss acentosss, etc.";
		String cadEr2 = "Lasss mariposssasss ssson lindasss";
		String cad2 = "Hola";
		String lecL;
		File arch = new File("libro.txt");
		
		//System.out.println(ManejoString.cuentaPalabras(cadena));
		//System.out.println(ManejoString.cuentaPalabras(cad2));
		//System.out.println(ManejoString.corrigeTeclado("ss", cadEr2));
		//System.out.println(ManejoString.eliminaStr("acentos", cadena));
		//System.out.println(ManejoString.palindromo(cad3));
		//System.out.println(ManejoString.palindromo(cad4));
		//System.out.println(ManejoString.fraseMayus(cadena2));
		
		try(Scanner lect = new Scanner(arch)) {
			while(lect.hasNext()) {
				lecL = lect.nextLine();
				System.out.println(ManejoString.corrigeTeclado("ss", lecL));
			}
			lect.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}
}