/*Tania Ariadna Dominguez Palma
 * 17/oct/2021
 * Describe un equipo que concursara en las olimpiadas de programacion
 */
public class Equipo {
	private String nombre;
	private int totParticipantes;
	private Participante[] participantes;
	private final int MAX_PAR = 20;
	
	public Equipo() {
		totParticipantes = 0;
		participantes = new Participante[MAX_PAR];
	}
	
	public Equipo(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public boolean altaParticipante(String nombre, int lenguajesD, int edad) {
		boolean alt = false;
		
		if (totParticipantes < MAX_PAR) {
			participantes[totParticipantes] = new Participante(nombre, lenguajesD, edad);
			totParticipantes++;
			alt = true;
		}
		return alt;
	}
	
	public int eliminaParLeng() {
		int res = 0;
		
		for(int i = 0; i < totParticipantes; i++) {
			if (participantes[i].getLenguajesD() == 1) {
				for(int a = i; a < totParticipantes-1; a++) {
					participantes[a] = participantes[a+1];
				}
				totParticipantes--;
				participantes[totParticipantes] = null;
				res++;
			}
		}
		return res;
	}
	
	public String participanteJov() {
		String nomb;
		int menEdad = participantes[0].getEdad();
		int posMen = 0;
		
		for(int i = 1; i < totParticipantes; i++) {
			if (participantes[i].getEdad() < menEdad) {
				posMen = i;
				menEdad = participantes[i].getEdad();
			}
		}
		nomb = participantes[posMen].getNombre();
		return nomb;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nEquipo Nombre: ");
		cad.append(nombre);
		cad.append("\n       Total de participantes: ");
		cad.append(totParticipantes);
		for(int i = 0; i < totParticipantes; i++) {
			cad.append("\n       Participante " + i + ": ");
			cad.append(participantes[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Equipo otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = 0;
		}
		else {
			if (this.nombre.compareTo(otro.nombre)>0) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals(Equipo otro) {
		boolean res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
