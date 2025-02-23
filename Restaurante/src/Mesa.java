/*Tania Ariadna Dominguez Palma
 * 03/dic/2021
 * Clase que describe una mesa de un restaurante que contiene alimentos
 */
public class Mesa {
	private int clavNumA;
	private Alimento[] alimentos;
	private final int MAX_ALIMEN = 20;
	
	Mesa(){
		clavNumA = 0;
		alimentos = new Alimento[MAX_ALIMEN];
	}

	public int getClavNumA() {
		return clavNumA;
	}
	
	public String getUnAlimento(String clave) {
		Alimento al = new Alimento(clave);
		String infoAl = "Alimento no encontrado";
		int i = 0;
		
		while (i < clavNumA && !alimentos[i].equals(al)) {
			i++;
		}
		if(i < clavNumA) {
			infoAl = alimentos[i].toString();
		}
		return infoAl;
	}
	
	public boolean altaAlimento(String clave, String nombre, String descripcion, double precio) {
		boolean alt = false;
		Alimento al = new Alimento(clave, nombre, descripcion, precio);
		
		if (clavNumA < MAX_ALIMEN) {
			alimentos[clavNumA] = al;
			clavNumA++;
			 alt = true;
		}
		return alt;
	}
	
	public String bajaAlimento(String clave) {
		String infoAl = "Alimento no encontrado";
		Alimento al = new Alimento(clave);
		int i = 0;
		
		while (i < clavNumA && !alimentos[i].equals(al)) {
			i++;
		}
		if (i < clavNumA) {
			infoAl = alimentos[i].toString();
			for (int a = clavNumA; a < a-1; a++) {
				alimentos[a] = alimentos[a+1];
			}
			clavNumA--;
			alimentos[clavNumA] = null;
		}
		return infoAl;
	}
	
	public double pagoTotal() {
		double sumDin = 0;
		
		for (int i = 0; i < clavNumA; i++) {
			sumDin += alimentos[i].getPrecio();
		}
		return sumDin;
	}
	
	public boolean existeAlimento(String clave) {
		Alimento al = new Alimento(clave);
		int i = 0;
		boolean ex = false;
		
		while(i < clavNumA && !alimentos[i].equals(al)) {
			i++;
		}
		if (i < clavNumA) {
			ex = true;
		}
		return ex;
	}
	
	public String alimentoMasCaro() {
		int con = 0;
		String al = alimentos[con].toString();
		
		for (int i = 1; i < clavNumA; i++) {
			if (alimentos[i].getPrecio() > alimentos[con].getPrecio()) {
				con = i;
				al = alimentos[con].toString();
			}
		}
		return al;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Mesa Total de alimentos:");
		cad.append(clavNumA);
		for (int i = 0; i < clavNumA; i++) {
			cad.append("\n     Almento " + i + ": ");
			cad.append(alimentos[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Mesa otra) {
		return this.clavNumA - otra.clavNumA;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clavNumA;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		if (clavNumA != other.clavNumA)
			return false;
		return true;
	}
}