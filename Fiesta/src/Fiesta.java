/*Tania Ariadna Dominguez Palma
 * 04/nov/2021
 * Usa la clase Persona para registrar informacion 
 */
public class Fiesta implements Comparable<Fiesta>{
	private String lugar;
	private String fecha;
	private Persona[] invitados;
	private int numInvitados;
	private final int TOTINVITADOS = 50;
	
	Fiesta(String lugar, String fecha){
		invitados = new Persona[TOTINVITADOS];
		numInvitados = 0;
		this.lugar = lugar;
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public int getNumInvitados() {
		return numInvitados;
	}
	
	public String getUnInvitado(int ind) {
		String persona = "Persona no registrada";
		
		if(ind >= 0 && ind < numInvitados) {
			persona = invitados[ind].toString();
		}
		return persona;
	}
	
	public String getUnaPersona(String curp) {
		int posIn;
		Persona p = new Persona(curp);
		String persona;
		
		posIn = ManejadorArreglosGenerico.busSecDesordenada(invitados, numInvitados, p);
		if(posIn > -1) {
			persona = invitados[posIn].toString();
		}
		else {
			persona = "Persona no registrada";
		}
		return persona;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public boolean altaInvitado(String curp, String nombre, String edoCivil) {
		boolean alt = false;
		
		if (numInvitados < TOTINVITADOS) {
			invitados[numInvitados] = new Persona (curp, nombre, edoCivil);
			alt = true;
			numInvitados++;
		}
		return alt;
	}
	
	public boolean altaVacunaInvitado(String curp, String nomVac) {
		int posIn;
		Persona p = new Persona(curp);
		boolean alt = false, alV;
		
		posIn = ManejadorArreglosGenerico.busSecDesordenada(invitados, numInvitados, p);
		if (posIn > -1) {
			alV = invitados[posIn].altaVacuna(nomVac);
			if(alV) {
				alt = true;
			}
		}
		return alt;
	}
	
	public String bajaInvitado(String curp) {
		int pos;
		Persona p = new Persona(curp);
		String inv = "Invitado no registrado";
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(invitados, numInvitados, p);
		if (pos > -1) {
			inv = invitados[pos].toString();
			numInvitados =  ManejadorArreglosGenerico.eliminaEnDesorden(invitados, numInvitados, p);
		}
		return inv;
	}
	
	public int cuantosGenero(char gen) {
		int totG = 0;
		
		for (int i = 0; i < numInvitados; i++) {
			if (invitados[i].getGenero() == gen) {
				totG++;
			}
		}
		return totG;
	}
	
	public boolean estaInvitado(String curp) {
		int pos;
		Persona p = new Persona(curp);
		boolean bus = false;
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(invitados, numInvitados, p);
		if(pos > -1) {
			bus = true;
		}
		return bus;
	}
	
	public String elMasJoven() {
		int pos = 0;
		String invJ;
		
		for (int i = 1; i < numInvitados; i++) {
			if (invitados[i].calculaEdad() < invitados[pos].calculaEdad()) {
				pos = i;
			}
		}
		invJ = invitados[pos].toString();
		return invJ;
	}
	
	public String elMasViejo() {
		int pos = 0;
		String invV;
		
		for (int i = 1; i < numInvitados; i++) {
			if (invitados[i].calculaEdad() > invitados[pos].calculaEdad()) {
				pos = i;
			}
		}
		invV = invitados[pos].toString();
		return invV;
	}
	
	public double promedioEdad() {
		double promEd = 0;
		
		for (int i = 0; i < numInvitados; i++) {
			promEd += invitados[i].calculaEdad();
		}
		promEd /= numInvitados;
		return promEd;
	}
	
	public int cuantosEdoCivil(String edoCivil) {
		int edC = 0;
		
		for (int i = 0; i < numInvitados; i++) {
			if (invitados[i].getEdoCivil().equals(edoCivil)) {
				edC++;
			}
		}
		return edC;
	}
	
	public int cuantosVacunaAplicada(String nomVac) {
		int cuVac = 0;
		
		for (int i = 0; i < numInvitados; i++) {
			if (invitados[i].buscaVacuna(nomVac)) {
				cuVac++;
			}
		}
		return cuVac;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Fiesta Lugar: ");
		cad.append(lugar);
		cad.append("\n       Fecha: ");
		cad.append(fecha);
		cad.append("\n       Numero de invitados: ");
		cad.append(numInvitados);
		for (int i = 0; i < numInvitados; i++) {
			cad.append("\n       Invitado " + i + ":");
			cad.append(invitados[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Fiesta otro) {
		return this.fecha.compareTo(otro.fecha);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fiesta other = (Fiesta) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}
}
