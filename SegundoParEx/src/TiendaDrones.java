/*Tania Ariadna Dominguez Palma 
 * 20/oct/21
 * Clase que describe una tienda que vende drones
 */
public class TiendaDrones {
	private String nombre;
	private final int MAX_DRON = 250;
	private Dron[] drones;
	private int totDrones;
	
	public TiendaDrones() {
		drones = new Dron[MAX_DRON];
		totDrones = 0;
	}
	
	public TiendaDrones(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public boolean altaDron(int clave, int numMotores, int numCamaras, double precio, String marca) {
		Dron dr = new Dron(clave, numMotores, numCamaras, precio, marca);
		boolean alt = false;
		int i = 0;
		
		if (totDrones < MAX_DRON) {
			while(i < totDrones && !drones[i].equals(dr)) {
				i++;
			}
			if (i == totDrones) {
				drones[totDrones] = dr;
				totDrones++;
				alt = true;
			}
		}
		return alt;
	}
	
	public boolean dronMarca(String marca) {
		boolean exi = false;
		int i;
		
		i = 0; 
		while (i < totDrones && !drones[i].getMarca().equals(marca)) {
			i++;
		}
		if (i < totDrones) {
			exi = true;
		}
		return exi;
	}
	
	public String dronCaro() {
		double preC = drones[0].getPrecio();
		String infoD = drones[0].toString();
		
		for (int i = 1; i < totDrones; i++) {
			if (drones[i].getPrecio() > preC) {
				preC = drones[i].getPrecio();
				infoD = drones[i].toString();
			}
		}
		return infoD;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nEquipo Nombre: ");
		cad.append(nombre);
		cad.append("\n       Total de drones: ");
		cad.append(totDrones);
		for(int i = 0; i < totDrones; i++) {
			cad.append("\n       Dron " + i + ": ");
			cad.append(drones[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(TiendaDrones otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = 0;
		}
		else {
			if (this.nombre.compareTo(otro.nombre)>0) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals(TiendaDrones otro) {
		boolean res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}