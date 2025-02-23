/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Prueba la clase TiendaFonArt
 */
public class MainTiendaFonArt {

	public static void main(String[] args) {
		TiendaFonArt tien = new TiendaFonArt();
		
		System.out.println(tien.altaArtesania("barro", "CDMX", 5, 8, true));
		System.out.println(tien.altaArtesania("ceramica", "Jalisco", 7, 10, false));
		System.out.println(tien.altaArtesania("ceramica", "NuevoL", 6, 15, false));
		System.out.println(tien.artesaniaBarata());
		System.out.println(tien.artDeAu());
		System.out.println(tien.promArtesanos());
	}

}
