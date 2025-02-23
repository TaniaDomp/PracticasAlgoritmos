/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Describe una tienda que vende artesanias 
 */
public class TiendaFonArt {
	private String nombre;
	private String direccion;
	private Artesania[] artesanias;
	private int totArtesanias;
	private final int MAX_AR = 100;
	
	public TiendaFonArt() {
		totArtesanias = 0;
		artesanias = new Artesania[MAX_AR];
	}
	
	public TiendaFonArt(String nombre, String direccion) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public boolean altaArtesania(String tipo, String regionO, int tiempoE, int numAr, boolean derechosA) {
		boolean alt = false;
		
		if (totArtesanias < MAX_AR) {
			artesanias[totArtesanias] = new Artesania(tipo, regionO, tiempoE, numAr, derechosA);
			totArtesanias++;
			alt = true;
		}
		return alt;
	}
	
	public int artesaniaBarata() {
		double premen = artesanias[0].precioV();
		int clavm = artesanias[0].getClaveU();
		
		for (int i = 1; i < totArtesanias; i++) {
			if (artesanias[i].precioV() < premen) {
				premen = artesanias[i].precioV();
				clavm = artesanias[i].getClaveU();
			}
		}
		return clavm;
	}
	
	public boolean artDeAu() {
		boolean po;
		int i;
		
		i = 0; 
		while (i < totArtesanias && !artesanias[i].getDerechosA()) {
			i++;
		}
		if (i==totArtesanias) {
			po = false;
		}
		else {
			po = true;
		}
		return po;
	}
	
	public double promArtesanos() {
		double prom = 0;
		
		for (int i = 0; i < totArtesanias; i++) {
			prom = prom + artesanias[i].getNumAr();
		}
		prom /= totArtesanias;
		return prom;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nTienda FonArt Nombre: ");
		cad.append(nombre);
		cad.append("\n              Direccion: ");
		cad.append(direccion);
		cad.append("\n              Total de Artesanias: ");
		cad.append(totArtesanias);
		for (int i = 0; i < totArtesanias; i++) {
			cad.append("\n              Artesania " + i + ": ");
			cad.append(artesanias[i]);
		}
		return cad.toString();
	}
	
	public int compareTo(TiendaFonArt otro) {
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
	
	public boolean equals(TiendaFonArt otro) {
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
