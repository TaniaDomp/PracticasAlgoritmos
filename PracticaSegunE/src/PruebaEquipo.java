/*Tania Ariadna Dominguez Palma
 * 17/oct/2021
 * Prueba la clase Equipo 
 */
public class PruebaEquipo {

	public static void main(String[] args) {
		Equipo eq = new Equipo();
		int elim;
		
		System.out.println(eq.altaParticipante("Jose", 3, 18));
		System.out.println(eq.altaParticipante("Alberto", 2, 14));
		System.out.println(eq.altaParticipante("Carlos", 2, 15));
		System.out.println(eq.toString());
		elim = eq.eliminaParLeng();
		if (elim == 0) {
			System.out.println("Todos los participantes dominan mas de un lenguaje de programacion");
		}
		else {
			System.out.println("Participantes que solo dominan un lenguaje de programacion: " + elim);
		}
		System.out.println(eq.toString());
		System.out.println(eq.participanteJov());
	}
}
