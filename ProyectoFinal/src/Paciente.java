import java.util.Calendar;
import java.util.GregorianCalendar;
/*Tania Ariadna Dominguez Palma
 * 22/nov/2021
 * Describe un paciente que se registra en el area de urgencias de un hospital 
 */
public class Paciente implements Comparable<Paciente>{
	private String claveUr;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String diaIngreso;
	private String tipoDePaciente;
	private String diagnostico;
	private int edad;
	private Medicamento[] medicamentos;
	private final int MAX_MED = 4;
	private int numMed;
	
	Paciente(String claveUr){   //Sirve para ocupar el objeto Paciente en las busquedas
		this.claveUr = claveUr;
	}
	
	Paciente(String nombre, String apellidoP, String apellidoM, String tipoDePaciente, String diagnostico, int edad){
		String clav;
		char  nom, apP, apM;			//Genera un objeto medicamento y su clave unica contiene datos del paciente
		int dia, mes, anio;				//el primer dato indica urgencias, las 3 letras que siguen su nombre, dia
		String prioridad;				//de ingreso y la prioridad del paciente
		Calendar fecha = new GregorianCalendar();
		
		medicamentos = new Medicamento[MAX_MED];
		numMed = 0;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.tipoDePaciente = tipoDePaciente;
		this.diagnostico = diagnostico;
		this.edad = edad;
		anio = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH) + 1;
		dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.diaIngreso = dia + "/" + mes + "/" + anio;
		prioridad = calculaPrioridad();
		nom = this.nombre.charAt(0);
		apP = this.apellidoP.charAt(0);
		apM = this.apellidoM.charAt(0);
		if(dia < 10) { //Veridica que la cadena tenga el mismo numero de caracteres (por eso se agrega 0)
			clav = "U" + nom + apP + apM + "0" + dia + mes + anio + "-" + prioridad;
		}
		else {
			clav = "U" + nom + apP + apM + dia + mes + anio + "-" + prioridad;
		}
		this.claveUr = clav.toUpperCase();
	}
	
	public String getClaveUr() {
		return claveUr;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public String getDiaIngreso() {
		return diaIngreso;
	}

	public String getTipoDePaciente() {
		return tipoDePaciente;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public int getEdad() {
		return edad;
	}
	
	public int getNumMed() {
		return numMed;
	}
	
	public String getUnMedicamento(String nombre) {		//Regresa los datos de un medicamento registrado en el paciente
		Medicamento med = new Medicamento(nombre);
		int pos;
		String infoMed = "Medicamento no encontrado";
		
		pos = ManejadorArreglosGenerico.busSecOrdenada(medicamentos, numMed, med);
		if (pos > -1) {
			infoMed = medicamentos[pos].toString();
		}
		return infoMed;
	}

	private String calculaPrioridad() { //calcula la prioridad de un paciente de acuerdo con su tipo
		String prio = "BAJA";
		
		if (tipoDePaciente.equals("Con-confusion-mental")) {
			prio = "ALTA";
		}
		else {
			if (tipoDePaciente.equals("anciano/infante")) {
				prio = "MEDIA";
			}
		}
		return prio;
	}
	
	public boolean altaMedicamento(String nombre, int unidadesDeSuministro, int tiempoDeSuministroHrs, String tipoMed) {
		boolean alt = false;
		Medicamento inMed = new Medicamento(nombre, unidadesDeSuministro, tiempoDeSuministroHrs, tipoMed);
		int num;
		
		num = ManejadorArreglosGenerico.insertaEnOrden(medicamentos, numMed, inMed);
		if (num > numMed) {
			numMed++;		//registra un nuevo medicamento del paciente
			alt = true;
		}
		return alt;
	}
	
	public String bajaMedicamento(String clav) {
		String infoMed = "Medicamento no encontrado";
		Medicamento med = new Medicamento(clav);
		int pos;
		
		pos = ManejadorArreglosGenerico.busSecOrdenada(medicamentos, numMed, med);
		if (pos > -1) {
			infoMed = medicamentos[pos].toString();
			numMed = ManejadorArreglosGenerico.eliminaPos(medicamentos, numMed, pos);
		}				//elimina un medicamento del paciente
		return infoMed;
	}
	
	public boolean existeMedicamento(String clav) {
		Medicamento med = new Medicamento(clav);
		int pos;
		boolean ex = false;
		
		pos = ManejadorArreglosGenerico.busSecOrdenada(medicamentos, numMed, med);
		if (pos > -1) {
			ex = true;  //indica si un medicamento se encuentra o no registrado en la lista del paciente
		}
		return ex;
	}
	
	public int unidadesMedicamento(String clav) {
		Medicamento med = new Medicamento(clav);
		int pos;
		int uni = 0;
		
		pos = ManejadorArreglosGenerico.busSecOrdenada(medicamentos, numMed, med);
		if (pos > -1) {
			uni = medicamentos[pos].getUnidadesDeSuministro();  //indica si un medicamento se encuentra o no registrado en la lista del paciente
		}
		return uni;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nPaciente Clave: ");
		cad.append(claveUr);
		cad.append("\n         Nombre: ");
		cad.append(nombre);
		cad.append("\n         Apellido paterno: ");
		cad.append(apellidoP);
		cad.append("\n         Apellido materno: ");
		cad.append(apellidoM);
		cad.append("\n         Tipo de paciente: ");
		cad.append(tipoDePaciente);
		cad.append("\n         Dia de ingreso: ");
		cad.append(diaIngreso);
		cad.append("\n         Diagnostico: ");
		cad.append(diagnostico);
		cad.append("\n         Edad: ");
		cad.append(edad);
		cad.append("\n         Total de medicamentos suministrados: ");
		cad.append(numMed);
		for(int i = 0; i < numMed; i++) {
			cad.append("\n" + medicamentos[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Paciente otro) {
		return this.claveUr.compareTo(otro.claveUr);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claveUr == null) ? 0 : claveUr.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (claveUr == null) {
			if (other.claveUr != null)
				return false;
		} else if (!claveUr.equals(other.claveUr))
			return false;
		return true;
	}
}