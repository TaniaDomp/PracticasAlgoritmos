/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que describe prueba la clase CampamentoVerano
 */
public class PruebaCampVerano {

	public static void main(String[] args) {
		CampamentoVerano cam;
		
		cam = new CampamentoVerano();
		cam.altaAsistente("200", "Jul", "Cul", "Dom", "hombre", 12, "mexicano");
		cam.altaAsistente("100", "Jul", "Cul", "Dom", "mujer", 15, "mexicano");
		cam.altaAsistente("203", "Jul", "Cul", "Dom", "mujer", 21, "mexicano");
		System.out.println(cam.toString());
		//cam.bajaAsistente("200");
		//System.out.println(cam.toString());
		System.out.println(cam.asisHombres());
		System.out.println(cam.asisMujeres());
		System.out.println(cam.asisNacio());
		System.out.println(cam.edadAsist());
	}

}
