

/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Prueba la clase Persona 
 */
public class PruebaPersonaMain {

	public static void main(String[] args) {
		Persona p1, p2, p3;
		
		p1 = new Persona ("dool661212mdfxxxxx", "Lourdes", "Casada");
		p2 = new Persona ("dopt030113mmcmlna3", "Tania", "Soltera");
		System.out.println(p1.altaVacuna("Bae"));
		System.out.println(p1.altaVacuna("Alb"));
		System.out.println(p2.altaVacuna("ALB"));
		System.out.println(p2.altaVacuna("ALB"));
		System.out.println(p2.buscaVacuna("ALB"));
		System.out.println(p1.getUnaVacunas(3));
		System.out.println(p1.calculaEdad());
		System.out.println(p2.calculaEdad());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
