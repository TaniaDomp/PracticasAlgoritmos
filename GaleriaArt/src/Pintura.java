/*Tania Ariadna Dominguez Palma
 * 9/oct/2021
 * Clase que describe una pintura de algun autor moderno
 */
public class Pintura {
	private String nombre;
	private String pintor;
	private double precio;
	private String tecnica;
	private int anioTer;
	
	public Pintura(String nombre) {
		this.nombre = nombre;
	}
	
	public Pintura (String nombre, String pintor, double precio, String tecnica, int anioTer) {
		this.nombre = nombre;
		this.pintor = pintor;
		this.precio = precio;
		this.tecnica = tecnica;
		this.anioTer = anioTer;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPintor() {
		return pintor;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getTecnica() {
		return tecnica;
	}
	
	public int getAnioTer() {
		return anioTer;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nPintura Nombre:");
		cad.append(nombre);
		cad.append("\n        Nombre del pintor:");
		cad.append(pintor);
		cad.append("\n        Precio:");
		cad.append(precio);
		cad.append("\n        Tecnica:");
		cad.append(tecnica);
		cad.append("\n        Año de finalizacion:");
		cad.append(anioTer);
		return cad.toString();
	}
	
	public int compareTo(Pintura otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = 0;
		}
		else {
			if (this.nombre.compareTo(otro.nombre)>0){
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals(Pintura otro) {
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