/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Clase que prueba metodos de la clase String
 */
public class ManejoEntendiendoString {

	public static void main(String[] args) {
		String cadena = "Una frase con espacios, may�sculas y min�sculas..., algunos acentos, etc.";
		String cad;
		
		if (cadena.contains("�")) {
			System.out.println("La cadena tiene un subcadena �");
		}
		else {
			System.out.println("La cadena no tiene un subcadena �");
		}
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		cad = cadena.substring(0, 9); // cad = "Una frase"
		System.out.println(cad);
	}

}
