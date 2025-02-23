/*Tania Ariadna Dominguez Palma
 * 06/nov/2021
 * Describe a un hospital que contiene Medico(s) 
 */
public class Hospital implements Comparable<Hospital>{
	private String nombre;
	private String direccion;
	private Medico[] medicos;
	private int numMedicos;
	private final int MAX_MED = 50;
	
	Hospital (String nombre, String direccion){
		medicos = new Medico[MAX_MED];
		numMedicos = 0;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getNumMedicos() {
		return numMedicos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public boolean altaMedico(String clave) {
		int n;
		boolean alt = false;
		Medico med = new Medico(clave);
		
		n = ManejadorArreglosGenerico.insertaEnOrden(medicos, numMedicos, med);
		if (n > numMedicos) {
			alt = true;
			numMedicos++;
		}
		return alt;
	}
	
	public boolean altaEspMed(String clave, String especialidad) {
		int posMed;
		boolean alt = false, altE;
		Medico med = new Medico(clave);
		
		posMed = ManejadorArreglosGenerico.busquedaBinaria(medicos, numMedicos, med);
		if (posMed >= 0) {
			altE = medicos[posMed].altaEspecialidad(especialidad);
			if (altE) {
				alt = true;
			}
		}
		return alt;
	}
	
	public String espMed(String clave) {
		int posMed, numEsp;
		StringBuilder esp = new StringBuilder();
		Medico med = new Medico(clave);
		
		posMed = ManejadorArreglosGenerico.busquedaBinaria(medicos, numMedicos, med);
		if (posMed >=0) {
			numEsp = medicos[posMed].getNumEspecialidad();
			for (int i = 0; i < numEsp; i++) {
				esp.append("\nEspecialidad " + i + ": ");
				esp.append(medicos[posMed].getUnaEspecialidad(i));
			}
		}
		return esp.toString();
	}
	
	public int cuantosEspecialidad(String especialidad) {
		int esC = 0;
		
		for (int i = 0; i < numMedicos; i++) {
			if (medicos[i].buscaEspecialidad(especialidad)) {
				esC++;
			}
		}
		return esC;
	}
	
	public String bajaMedico(String clave) {
		int pos;
		Medico med = new Medico(clave);
		String inv = "Medico no registrado";
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(medicos, numMedicos, med);
		if (pos > -1) {
			inv = medicos[pos].toString();
			numMedicos =  ManejadorArreglosGenerico.eliminaEnDesorden(medicos, numMedicos, med);
		}
		return inv;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Hospital Nombre: ");
		cad.append(nombre);
		cad.append("\n         Direccion: ");
		cad.append(direccion);
		cad.append("\n         Numero de medicos: ");
		cad.append(numMedicos);
		for (int i = 0; i < numMedicos; i++) {
			cad.append("\n         Medico " + i + ": ");
			cad.append(medicos[i]);
		}
		return cad.toString();
	}
	
	public int compareTo(Hospital otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Hospital other = (Hospital) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}