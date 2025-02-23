/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Describe un medicamento que puede ser suministrado a un paciente de un hospital 
 */
public class Medicamento implements Comparable<Medicamento>{
	private String clav;
	private String nombre;
	private int unidadesDeSuministro;
	private int tiempoDeSuministroHrs;
	private String tipoMed;
	
	Medicamento(String clav){ //Sirve para ocupar el objeto Medicamento en las busquedas
		this.clav = clav;
	}
	
	Medicamento(String nombre, int unidadesDeSuministro, int tiempoDeSuministroHrs, String tipoMed){ //Genera un medicamento con los atributos necesarios
		this.nombre = nombre;
		this.unidadesDeSuministro = unidadesDeSuministro;
		this.tiempoDeSuministroHrs = tiempoDeSuministroHrs;
		this.tipoMed = tipoMed;
		this.clav = this.nombre.substring(0, 4) + this.tipoMed.charAt(0); //construye la clave de acuerdo a las primeras
	}													//cuatro letras del nombre y la primer letro del tipo

	public String getClav() {
		return clav;
	}
	
	public String getNombre() { //los metodos get sirven para regresar el valor registrado en el objeto
		return nombre;
	}

	public int getUnidadesDeSuministro() {
		return unidadesDeSuministro;
	}

	public int getTiempoDeSuministroHrs() {
		return tiempoDeSuministroHrs;
	}
	
	public String getTipoMed() {
		return tipoMed;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nMedicamento Clave: ");
		cad.append(clav);
		cad.append("\n            Nombre: ");
		cad.append(nombre);
		cad.append("\n            Unidades de suministro: ");
		cad.append(unidadesDeSuministro);
		cad.append("\n            Tiempo de suministro (en horas): ");
		cad.append(tiempoDeSuministroHrs);
		cad.append("\n            Tipo de medicamento: ");
		cad.append(tipoMed);
		return cad.toString();
	}
	
	public int compareTo(Medicamento otro) {
		return this.clav.compareTo(otro.clav);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clav == null) ? 0 : clav.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicamento other = (Medicamento) obj;
		if (clav == null) {
			if (other.clav != null)
				return false;
		} else if (!clav.equals(other.clav))
			return false;
		return true;
	}
}