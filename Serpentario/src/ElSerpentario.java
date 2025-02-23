/*Tania Ariadna Dominguez Palma
 * 8/nov/2021
 * Clase que describe un serpentario que contiene Serpientes(s)
 */
public class ElSerpentario {
	private String nombre;
	private Serpiente[][] serpientes;
	private int [] cantSerpientes;
	private final int TIPOS = 3;
	private final int MAX_SERP = 10;
	private final String[] NOM_TIPOS = {"constrictor", "venenosa", "otra"};
	
	public ElSerpentario(String nombre) {
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
	
	
	
	public int compareTo(ElSerpentario otro) {
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
		ElSerpentario other = (ElSerpentario) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
