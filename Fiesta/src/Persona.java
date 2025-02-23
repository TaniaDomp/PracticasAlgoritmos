import java.util.Calendar;
/*Tania Ariadna Dominguez Palma
 * 29/oct/2021
 * Describe una persona vacunada
 */
public class Persona implements Comparable<Persona>{
	private String nombre;
	private String curp;
	private char genero;
	private int ahoNac;
	private String origen;
	private String edoCivil;
	private String [] vacunas;
	private int numVacunas;
	private final int MAX_VAC = 10;
	
	public Persona(String curp) {
		String ahoStr; 
		
		vacunas = new String[MAX_VAC];
		numVacunas = 0;
		this.curp = curp.toUpperCase();
		origen = this.curp.substring(11, 13);
		ahoStr = this.curp.substring(4, 6);
		ahoNac = Integer.parseInt(ahoStr);
		if(ahoNac < 20) {
			ahoNac+=2000;
		}
		else {
			ahoNac+=1900;
		}
		genero = this.curp.charAt(10);
	}

	public Persona(String curp, String nombre, String edoCivil) {
		this(curp);
		this.nombre = nombre;
		this.edoCivil = edoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCurp() {
		return curp;
	}

	public char getGenero() {
		return genero;
	}

	public int getAhoNac() {
		return ahoNac;
	}

	public String getOrigen() {
		return origen;
	}
	
	public String getEdoCivil() {
		return edoCivil;
	}
	
	public String getUnaVacunas(int pos) {
		String nomVac = "Vacuna no registrada";
		
		if (pos >= 0 && pos < numVacunas) {
			nomVac = vacunas[pos];
		}
		return nomVac;
	}

	public int getNumVacunas() {
		return numVacunas;
	}
	
	public void setEdoCivil(String edoCivil) {
		this.edoCivil = edoCivil;
	}
	
	public int calculaEdad() {
		String diaStr, mesStr;
		int ed, ahoActual, mesActual, diaActual, dia, mes;
		Calendar fecha = Calendar.getInstance();
		
		ahoActual = fecha.get(Calendar.YEAR);
		mesActual = fecha.get(Calendar.MONTH);
		diaActual = fecha.get(Calendar.DAY_OF_MONTH);
		diaStr = this.curp.substring(8, 10);
		dia = Integer.parseInt(diaStr);
		mesStr = this.curp.substring(6, 8);
		mes = Integer.parseInt(mesStr);
		ed = ahoActual - ahoNac;
		if (mesActual < (mes - 1) && diaActual < dia) {
			ed --;
		}
		return ed;
	}
	
	public boolean altaVacuna(String nomVac) {
		int n;
		boolean alt;
		
		n = ManejadorArreglosGenerico.insertaEnOrden(vacunas, numVacunas, nomVac);
		if (n > numVacunas) {
			alt = true;
			numVacunas++;
		}
		else {
			alt = false;
		}
		return alt;
	}
	
	public boolean buscaVacuna(String nomVac) {
		int pos;
		boolean bus = false;
		
		pos = ManejadorArreglosGenerico.busquedaBinaria(vacunas, numVacunas, nomVac);
		if (pos >=0) {
			bus = true;
		}
		return bus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curp == null) ? 0 : curp.hashCode());
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
		Persona other = (Persona) obj;
		if (curp == null) {
			if (other.curp != null)
				return false;
		} else if (!curp.equals(other.curp))
			return false;
		return true;
	}
	
	public int compareTo (Persona otro) {
		return curp.compareTo(otro.curp);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Persona nombre: ");
		builder.append(nombre);
		builder.append("\n        curp: ");
		builder.append(curp);
		builder.append("\n        genero: ");
		builder.append(genero);
		builder.append("\n        año de nacimiento: ");
		builder.append(ahoNac);
		builder.append("\n        origen: ");
		builder.append(origen);
		builder.append("\n        total de vacunas: ");
		builder.append(numVacunas);
		for (int i = 0; i < numVacunas; i++) {
			builder.append("\n        vacuna " + i + ":");
			builder.append(vacunas[i].toString());
		}
		return builder.toString();
	}
}