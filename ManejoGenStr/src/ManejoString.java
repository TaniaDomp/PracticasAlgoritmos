/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Clase que permite obtener y manipular informacion de un String recibido
 */
public class ManejoString {
	
	public static int cuentaPalabras(String frase) {
		int numPal = 1, totPal;
		
		totPal = frase.length();
		for(int i = 0; i < totPal; i++) {
			if (frase.charAt(i) == ' ') {
				numPal++;
			}
		}
		return numPal;
	}
	
	public static String corrigeTeclado(String error, String frase) {
		int pos, lengError;
		String fraseCo;
		
		lengError = error.length();
		while (frase.indexOf(error) > -1) {
			pos = frase.indexOf(error);
			fraseCo = frase.substring(0, pos);
			frase = fraseCo + frase.substring(pos + lengError);
		}
		return frase;
	}
	
	public static String eliminaStr(String str, String frase) {
		int pos, lengError;
		String fraseCo;
		
		lengError = str.length();
		while (frase.indexOf(str) > -1) {
			pos = frase.indexOf(str);
			fraseCo = frase.substring(0, pos);
			frase = fraseCo + frase.substring(pos + lengError);
		}
		return frase;
	}
	
	public static boolean palindromo(String frase) {	
		int i, totL, dec;
		boolean res;
		
		if (frase.contains(" ")) {
			frase = frase.replace(" ", "");
		}
		frase = frase.toLowerCase();
		i = 0;
		dec = frase.length()-1;
		totL = frase.length();
		while(i < totL && frase.charAt(i) == frase.charAt(dec)){
			i++;
			dec--;
		}
		if (i != totL) {
			res = false;
		}
		else {
			res = true;
		}
		return res;
	}
	
	public static String fraseMayus(String frase) {
		int indic, n;
		String lM, fraseRes, fraseCo = "";
		
		n = ManejoString.cuentaPalabras(frase);
		for(int i = 0; i < n; i++) {
			if (i == n-1) {
				fraseRes = frase;
			}
			else {
				indic = frase.indexOf(" ");
				fraseRes = frase.substring(0, indic);
				frase = frase.substring(indic+1);
			}
			lM = fraseRes.substring(0, 1).toUpperCase();
			fraseRes = fraseRes.replace(fraseRes.substring(0, 1), lM);
			fraseCo = fraseCo + fraseRes + " "; 
		}
		return fraseCo;
	}
}