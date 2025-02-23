import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 9/oct/2021
 * Clase que describe una pintura de algun autor moderno
 */
public class Galeria {
	private String nombre;
	private int telefono;
	private Pintura[] pinturas;
	private int totPinturas;
	private final int MAX_PINT = 100;
	
	public Galeria() {
		pinturas = new Pintura[MAX_PINT];
		totPinturas = 0;
	}
	
	public Galeria(String nombre, int telefono) {
		this();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Galeria(String nombre, int telefono, int tam) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.totPinturas = 0;
		pinturas = new Pintura[tam];
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public int getTotPinturas() {
		return totPinturas;
	}
	
	public String getUnaPitura(int pinIn) {
		StringBuilder pint = new StringBuilder();
		
		if (pinIn >= 0 && pinIn <= totPinturas) {
			pint.append(pinturas[pinIn].toString());
		}
		return pint.toString();
	}
	
	public String getUnaPinturaNombreX(String nombre) {
		Pintura obr = new Pintura(nombre);
		int i = 0;
		String res;
		
		while (i < totPinturas && pinturas[i].compareTo(obr)<0) {
			i++;
		}
		if (i == totPinturas || !pinturas[i].equals(obr)) {
			res = "Pintura no registrada";
		}
		else {
			res = pinturas[i].toString();
		}
		return res;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void setUnaPintura(int pos, String nombre, String pintor, double precio, String tecnica, int anioTer) {
		Pintura p;
		
		if (pos >= 0 && pos < totPinturas) {
			p = new Pintura (nombre, pintor, precio, tecnica, anioTer);
			pinturas[pos] = p;
		}
	}
	
	public boolean altaPintura(String nombre, String pintor, double precio, String tecnica, int anioTer) {
		boolean alt;
		
		if (totPinturas < pinturas.length) {
			pinturas[totPinturas] = new Pintura(nombre, pintor, precio, tecnica, anioTer);
			totPinturas++;
			alt = true;
		}
		else {
			alt = false;
		}
		return alt;
	}
	
	public boolean altaPinturaEnOrden(String nombre, String pintor, double precio, String tecnica, int anioTer) {
		boolean alt = false;
		int pos;
		Pintura pin1;
		
		if (totPinturas < pinturas.length) {
			pos = 0;
			pin1 = new Pintura(nombre, pintor, precio, tecnica, anioTer);
			while (pos < totPinturas && pinturas[pos].compareTo(pin1) < 0) {
				pos++;
			}
			if (pos == totPinturas || !pinturas[pos].equals(pin1)) {
				for (int i = totPinturas; i > pos; i--) {
					pinturas[i] = pinturas[i-1];
				}
				pinturas[pos] = pin1;
				totPinturas++;
				alt = true;
			}
		}
		return alt;
	}

	public double venderUnaPintura(String nombre) {
		double ven = -1;
		int pos;
		Pintura pin1 = new Pintura(nombre);
		
		pos = 0;
		while (pos < totPinturas && pinturas[pos].compareTo(pin1) < 0) {
			pos++;
		}
		if (pos < totPinturas || pinturas[pos].equals(pin1)) {
			ven = pinturas[pos].getPrecio();
			for (int i = pos; i < totPinturas-1; i++) {
				pinturas[i] = pinturas[i+1];
			}
			totPinturas--;
			pinturas[totPinturas] = null;
		}
		return ven;
	}

	public ArrayList<String> consultaPintorTecnica(String pintor, String tecnica){
		ArrayList<String> obras = new ArrayList<String>();
		String tex;
		
		for (int i = 0; i < totPinturas; i++) {
			if (pinturas[i].getPintor().equals(pintor) && pinturas[i].getTecnica().equals(tecnica)) {
				tex = pinturas[i].toString();
				obras.add(tex);
			}
		}
		if (obras.size() == 0) {
			obras = null;
		}
		return obras;
	}
	
	public boolean consultaPorPrecio(double precio) {
		boolean resP;
		int i = 0;
		
		while (i < totPinturas && pinturas[i].getPrecio() >= precio ) {
			i++;
		}
		if (i == totPinturas) {
			resP = false;
		}
		else {
			resP = true;
		}
		return resP;
	}
	
	public double precioPromVenta() {
		double prom = 0, promT;
		
		for (int i = 0; i < totPinturas; i++) {
			prom += pinturas[i].getPrecio();
		}
		promT = prom / totPinturas;
		return promT;
	}
	
	public String pinturaMasBarata() {
		double meno = pinturas[0].getPrecio();
		String pinMeno = pinturas[0].toString();
		
		for (int i = 1; i < totPinturas; i++) {
			if (pinturas[i].getPrecio() < meno) {
				meno =pinturas[i].getPrecio();
				pinMeno = pinturas[i].toString();;
			}
		}
		return pinMeno;
	}
	
	public int cuantosTecnica(String tecnica) {
		int totPin = 0;
		
		for(int i = 0; i < totPinturas; i++){
			if (pinturas[i].getTecnica().equals(tecnica)) {
				totPin++;
			}
		}
		return totPin;
	}
	
	public int cuantasPinturasEnRango(int ra1, int ra2) {
		int totP = 0;
		
		for (int i = 0; i < totPinturas; i++) {
			if (pinturas[i].getPrecio() >= ra1 && pinturas[i].getPrecio()<=ra2) {
				totP ++;
			}
		}
		return totP;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Galeria Nombre: ");
		cad.append(nombre);
		cad.append("\n        Telefono: ");
		cad.append(telefono);
		cad.append("\n        Total pinturas registradas: ");
		cad.append(totPinturas);
		for (int i = 0; i < totPinturas; i++) {
			cad.append("\n        Pintura " + (i) + ": ");
			cad.append(pinturas[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Galeria otro) {
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
	
	public boolean equals(Galeria otro) {
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
