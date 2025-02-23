/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Prueba la clase persona 
 */
public class MainPersona {

	public static void main(String[] args) {
		Persona p1, p2;
		
		p1 = new Persona ("DOOL661212MDFMRR09", "Lourdes", "Casada");
		p2 = new Persona ("MANU020803HMCxxx", "Manuel", "Soltero");
		System.out.println(p1.altaVacuna("J&J"));
		System.out.println(p1.altaVacuna("Tetanos"));
		System.out.println(p1.altaVacuna("Influenza"));
		System.out.println(p2.altaVacuna("Sputnik1"));
		System.out.println(p2.altaVacuna("Sputnik2"));
		System.out.println(p2.altaVacuna("Sputnik2"));
		System.out.println(p1.buscaVacuna("Sputnik"));
		System.out.println(p2.buscaVacuna("Sputnik1"));
		System.out.println(p1.getUnaVacunas(0));
		System.out.println(p2.getUnaVacunas(1));
		System.out.println(p1.calculaEdad());
		System.out.println(p2.calculaEdad());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
