/*Tania Ariadna Dominguez Palma
 * 06/nov/2021
 * Prueba la clase Hospital
 */
public class PruebaHospital {

	public static void main(String[] args) {
		Hospital hos = new Hospital("Rosa", "San Juan");
		
		System.out.println(hos.altaMedico("Med1"));
		System.out.println(hos.altaMedico("Med2"));
		System.out.println(hos.altaEspMed("Med1", "Ortopedia"));
		System.out.println(hos.altaEspMed("Med1", "Dentis"));
		System.out.println(hos.altaEspMed("Med2", "General"));
		System.out.println(hos.altaEspMed("Med2", "Ortopedia"));
		System.out.println(hos.toString());
		System.out.println(hos.espMed("Med2"));
		System.out.println(hos.cuantosEspecialidad("Ortopedia"));
		System.out.println(hos.bajaMedico("Med1"));
		System.out.println(hos.toString());
	}

}
