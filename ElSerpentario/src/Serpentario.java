/*Tania Ariadna Dominguez Palma
 * 8/nov/2021
 * Clase que describe un serpentario que contiene Serpientes(s)
 */
public class Serpentario implements Comparable<Serpentario>{
	private String nombre;
	private Serpiente[][] serpientes;
	private int [] cantSerpientes;
	private final int TIPOS = 3;
	private final int MAX_SERP = 10;
	private final String[] NOM_TIPOS = {"constrictor", "venenosa", "otra"};
	
	public Serpentario(String nombre) {
		this.nombre = nombre;
		serpientes = new Serpiente[TIPOS][MAX_SERP];
		cantSerpientes = new int[TIPOS];
		for (int i = 0; i < TIPOS; i++) {
			cantSerpientes[i] = 0;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUnaSerpiente(int clave) {
		int j = 0, i = 0;
		boolean bus = false;
		String infoSerp = "Serpiente no encontrada";
		Serpiente serp = new Serpiente(clave);
		
		while(j < TIPOS && !bus) {
			i = 0;
			while(i < cantSerpientes[j] && !bus) {
				if (serpientes[j][i].equals(serp)) {
					bus = true;
					infoSerp = serpientes[j][i].toString();
				}
				i++;
			}
			j++;
		}
		return infoSerp;
	}
	
	public boolean altaSerpiente(String tipo, String longitud, double peso, String alimento, char genero) {
		int i = 0, n;
		boolean alt = false;
		Serpiente serp = new Serpiente(tipo, longitud, peso, alimento, genero);
		
		while (i < TIPOS && !NOM_TIPOS[i].equals(tipo)) {
			i++;
		}
		if (i < TIPOS) {
			n = ManejadorArreglosGenerico.insertaFinal(serpientes[i], cantSerpientes[i], serp);
			if (n > cantSerpientes[i]) {
				alt = true;
				cantSerpientes[i]++;
			}
		}
		return alt;
	}
	
	public String bajaSerpiente(int clave) {
		int j = 0, i = 0, n;
		boolean bus = false;
		String serpB = "Serpiente no encontrada";
		Serpiente serp = new Serpiente(clave);
		
		while(j < TIPOS && !bus) {
			i = 0;
			while(i < cantSerpientes[j] && !bus) {
				if (serpientes[j][i].equals(serp)) {
					serpB = serpientes[j][i].toString();
					n = ManejadorArreglosGenerico.eliminaEnDesorden(serpientes[j], cantSerpientes[j], serp);
					if (n < cantSerpientes[j]) {
						bus = true;
						cantSerpientes[j]--;
					}
				}
				i++;
			}
			j++;
		}
		return serpB;
	}
	
	public int cuentaPorAlimento(String alimento) {
		int alim = 0;
		
		for (int j = 0; j < TIPOS; j++) {
			for (int i = 0; i < cantSerpientes[j]; i++) {
				if (serpientes[j][i].getAlimento().equals(alimento)) {
					alim++;
				}
			}
		}
		return alim;
	}
	
	public String tipoMaxSerp() {
		int maxT = 0;
		
		for (int i = 1; i < TIPOS; i++) {
			if (cantSerpientes[i] > cantSerpientes[maxT]) {
				maxT = i;
			}
		}
		return NOM_TIPOS[maxT];
	}
	
	public String serpienteMasPesada() {
		int posM = 0, posN = 0;
		double pes = serpientes[posM][posN].getPeso();
		
		for (int j = 0; j < TIPOS; j++) {
			for (int i = 0; i < cantSerpientes[j]; i++) {
				if (serpientes[j][i].getPeso() > pes) {
					posM = j;
					posN = i;
					pes = serpientes[posM][posN].getPeso();
				}
			}
		}
		return serpientes[posM][posN].toString();
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Serpentario Nombre: ");
		cad.append(nombre);
		for (int i = 0; i < TIPOS; i ++) {
			cad.append("\n            Total de serpientes del tipo " + NOM_TIPOS[i] + " :");
			cad.append(cantSerpientes[i]);
		}
		for (int i = 0; i < cantSerpientes[0]; i++) {
			cad.append("\n         La serpiente del tipo " + NOM_TIPOS[0] + " en la posicion " + i + ": ");
			cad.append(serpientes[0][i].toString());	
		}
		for (int i = 0; i < cantSerpientes[1]; i++) {
			cad.append("\n         La serpiente del tipo " + NOM_TIPOS[1] + " en la posicion " + i + ": ");
			cad.append(serpientes[1][i].toString());
		}
		for (int i = 0; i < cantSerpientes[2]; i++) {
			cad.append("\n         La serpiente del tipo " + NOM_TIPOS[2] + " en la posicion " + i + ": ");
			cad.append(serpientes[2][i].toString());
		}	
		return cad.toString();
	}
	
	public int compareTo(Serpentario otro) {
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
		Serpentario other = (Serpentario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
