/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Describe un Hospital que contiene pacientes con medicamentos
 */
public class Hospital implements Comparable<Hospital>{
	private String nombre;
	private String direccion;
	private Paciente[][] pacientes;
	private final int MAX_AREASPRIO = 3;
	private final int MAX_PAC = 20;
	private int[] numPac;
	private final String [] NOM_AREASPRIO = {"ALTA", "MEDIA", "BAJA"};
	
	Hospital(){
		pacientes = new Paciente[MAX_AREASPRIO][MAX_PAC];
		numPac = new int[MAX_AREASPRIO];
		for (int i = 0; i < MAX_AREASPRIO; i++) {
			numPac[i] = 0;
		}
	}
													//construye un hospital con atributos y una matriz que contiene
	Hospital(String nombre, String direccion){		//pacientes 
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	
	public String getNombre() {
		return nombre;			//los get proporcionan los datos registrados del hospital
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getNumPacArea(String area) {
		int pos, totPac = -1;
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, area);
		if(pos > -1) {
			totPac = numPac[pos];
		}
		return totPac;
	}
	
	public String getUnPaciente(String claveUr) {  
		Paciente pac = new Paciente(claveUr);
		int posA;
		String arPrio, infoPac = "Paciente no encontrado";
		int posPrio;
									//devuelve los datos de un paciente de acuerdo con su clave unica
		arPrio = claveUr.substring(13);
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			posA = ManejadorArreglosGenerico.busSecOrdenada(pacientes[posPrio], numPac[posPrio], pac);
			if (posA > -1) {
				infoPac = pacientes[posPrio][posA].toString();
			}
		}
		return infoPac;
	}
	
	public String getUnMedicamentoPac(String claveUr, String clav) {
		String datMed = "Datos no encontrados";
		int posPrio, posP;
		Paciente pac = new Paciente(claveUr);
		String arPrio;
					//elimina un medicamento al paciente de la claveUr
		arPrio = claveUr.substring(13); //busca el area de acuerdo con la clave de urgencias
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			posP = ManejadorArreglosGenerico.busSecOrdenada(pacientes[posPrio], numPac[posPrio], pac);
			if (posP > -1) {
				datMed = pacientes[posPrio][posP].getUnMedicamento(clav);
			}
		}
		return datMed;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;				//los set nos permiten modificar los datos del hospital
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public boolean altaPaciente(String nombre, String apellidoP, String apellidoM, String tipoDePaciente, String diagnostico, int edad) {
		boolean alt = false;
		String arPrio, clavP;
		int posPrio, numP; 
		Paciente pac = new Paciente (nombre, apellidoP, apellidoM, tipoDePaciente, diagnostico, edad);
									//registra un paciente de acuerdo a su prioridad
		clavP = pac.getClaveUr();
		arPrio = clavP.substring(13);
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			numP = ManejadorArreglosGenerico.insertaEnOrden(pacientes[posPrio], numPac[posPrio], pac);
			if(numP > numPac[posPrio]) {
				numPac[posPrio]++;
				alt = true;
			}
		}
		return alt;
	}
	
	public String bajaPaciente(String claveUr) {
		Paciente pac = new Paciente(claveUr);
		String arPrio;
		int posPrio, pos;
		String baj = "Paciente no encontrado";
					//elimina un paciente registrado
		arPrio = claveUr.substring(13);
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			pos = ManejadorArreglosGenerico.busSecOrdenada(pacientes[posPrio], numPac[posPrio], pac);
			if (pos > -1) {
				baj = pacientes[posPrio][pos].toString();
				numPac[posPrio] = ManejadorArreglosGenerico.eliminaPos(pacientes[posPrio], numPac[posPrio], pos);
			}
		}
		return baj;
	}
	
	public boolean altaMedicamentoPac(String claveUr, String nombre, int unidadesDeSuministro, int tiempoDeSuministroHrs, String tipoMed) {
		boolean alt = false;
		int posPrio, posP;
		Paciente pac = new Paciente(claveUr);
		String arPrio;
						//ingresa un medicamento al paciente de la clave claveUr
		arPrio = claveUr.substring(13);
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			posP = ManejadorArreglosGenerico.busSecOrdenada(pacientes[posPrio], numPac[posPrio], pac);
			if (posP > -1) {
				alt = pacientes[posPrio][posP].altaMedicamento(nombre, unidadesDeSuministro, tiempoDeSuministroHrs, tipoMed);
			}
		}
		return alt;
	}
	
	public String bajaMedicamentoPac(String claveUr, String clav) {
		String baj = "Datos no encontrados";
		int posPrio, posP;
		Paciente pac = new Paciente(claveUr);
		String arPrio;
					//elimina un medicamento al paciente de la claveUr
		arPrio = claveUr.substring(13);
		posPrio = ManejadorArreglosGenerico.busSecDesordenada(NOM_AREASPRIO, MAX_AREASPRIO, arPrio);
		if (posPrio > -1) {
			posP = ManejadorArreglosGenerico.busSecOrdenada(pacientes[posPrio], numPac[posPrio], pac);
			if (posP > -1) {
				baj = pacientes[posPrio][posP].bajaMedicamento(clav);
			}
		}
		return baj;
	}
	
	public int cuantosUnMedicamento(String clav) {
		boolean ex;
		int pacMedT = 0;
				//cuenta cuantas personas consumen un medicamento determinado
		for (int i = 0; i < MAX_AREASPRIO; i++) {
			for (int j = 0; j < numPac[i]; j++) {
				ex = pacientes[i][j].existeMedicamento(clav);
				if (ex) {
					pacMedT++;	
				}
			}
		}
		return pacMedT;
	}
	
	public int cuantosEnRangoEdad(int x, int y) {
		int totP = 0;
							//cuenta los pacientes de un rango de edad determinado
		for (int j = 0; j < MAX_AREASPRIO; j++) {
			for (int i = 0; i < numPac[j]; i++) {
				if (pacientes[j][i].getEdad() >= x && pacientes[j][i].getEdad() <= y) {
					totP++;
				}
			}
		}
		return totP;
	}
	
	public int unidadesDeUnMedicamento(String clav) {
		int totUnMed = 0;
				//cuenta cuantas unidades se requieren de un medicamento determinado
		for (int i = 0; i < MAX_AREASPRIO; i++) {
			for (int j = 0; j < numPac[i]; j++) {
				totUnMed += pacientes[i][j].unidadesMedicamento(clav);
			}
		}
		return totUnMed;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Hospital Nombre: ");
		cad.append(nombre);
		cad.append("\n         Direccion: ");
		cad.append(direccion);
		cad.append("\n         Numero de pacientes por area de prioridad: ");
		for (int a = 0; a < MAX_AREASPRIO; a++) {
			cad.append("\n         " + NOM_AREASPRIO[a] + ": ");
			cad.append(numPac[a]);
		}
		for (int i = 0; i < MAX_AREASPRIO; i++) {
			cad.append("\n         " + NOM_AREASPRIO[i] + ": \n");
			for (int j = 0; j < numPac[i]; j++) {
				cad.append(pacientes[i][j].toString());
			}
		}
		return cad.toString();
	}
	
	public int compareTo(Hospital otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

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