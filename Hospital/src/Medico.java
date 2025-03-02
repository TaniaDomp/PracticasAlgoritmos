/*Tania Ariadna Dominguez Palma
 * 06/nov/2021
 * Describe a un medico 
 */
public class Medico implements Comparable<Medico> {
	private String claveM;
	private String[] especialidades;
	private final int MAX_ESP = 5;
	private int numEspecialidad;
	
	Medico(String claveM){
		this.claveM = claveM;
		especialidades = new String[MAX_ESP];
		numEspecialidad = 0;
	}

	public String getClaveM() {
		return claveM;
	}

	public int getNumEspecialidad() {
		return numEspecialidad;
	}
	
	public String getUnaEspecialidad(int pos) { 
		String nomEsp = "Especialidad no registrada";
		
		if (pos >= 0 && pos < numEspecialidad) {
			nomEsp = especialidades[pos];
		}
		return nomEsp;
	}
	
	public boolean buscaEspecialidad(String especialidad) {
		int pos;
		boolean bus = false;
		
		pos = ManejadorArreglosGenerico.busquedaBinaria(especialidades, numEspecialidad, especialidad);
		if (pos >=0) {
			bus = true;
		}
		return bus;
	}
	
	public boolean altaEspecialidad(String especialidad) {
		boolean alt = false;
		int n;
		
		n = ManejadorArreglosGenerico.insertaEnOrden(especialidades, numEspecialidad, especialidad);
		if (n > numEspecialidad) {
			alt = true;
			numEspecialidad++;
		}
		return alt;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Medico Clave: ");
		cad.append(claveM);
		cad.append("\n        	Numero de especialidades: ");
		cad.append(numEspecialidad);
		for (int i = 0; i < numEspecialidad; i++) {
			cad.append("\n        	Especialidad " + i + ": ");
			cad.append(especialidades[i]);
		}
		return cad.toString();
	}
	
	public int compareTo(Medico otro) {
		return this.claveM.compareTo(otro.claveM);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claveM == null) ? 0 : claveM.hashCode());
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
		Medico other = (Medico) obj;
		if (claveM == null) {
			if (other.claveM != null)
				return false;
		} else if (!claveM.equals(other.claveM))
			return false;
		return true;
	}
}
