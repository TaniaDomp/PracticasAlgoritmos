/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Clase que describe a una obra
 */
public class Obra {
	private int claveU;
	private static int consClaveU = 1001;
	private String nombreAutor;
	private String nombreObra;
	private char tecnica;
	private double precioBase;
	private double ancho;
	private double alto;
	
	public Obra() {
		claveU = consClaveU;
		consClaveU ++;
	}
	
	public Obra (String nombreAutor, String nombreObra, char tecnica, double precioBase, double ancho, double alto) {
		this();
		this.nombreAutor = nombreAutor;
		this.nombreObra = nombreObra;
		this.tecnica = tecnica;
		this.precioBase = precioBase;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public int getClaveU() {
		return claveU;
	}
	
	public String getNombreAutor() {
		return nombreAutor;
	}
	
	public String getNombreObra() {
		return nombreObra;
	}
	
	public char getTecnica() {
		return tecnica;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public double getAlto() {
		return alto;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double calculaPrecioVenta(String nombreP, double desc) {
		double prec, desT, desA, desAu, area;
		
		switch (tecnica) {
		case 'O':
			desT = precioBase*0.25;
			break;
		case 'A':
			desT = precioBase * 0.2;
			break;
		case 'G':
			desT = precioBase * 0.18;
			break;
		default:
			desT = precioBase * 0.1;
		}
		prec = precioBase + desT;
		
		area = alto * ancho;
		if (area > 14000) {
			desA = precioBase * 0.10;
			prec = precioBase + desA;
		}
		
		if (nombreAutor == nombreP) {
			desAu = precioBase * desc;
			prec = precioBase - desAu;
		}
		
		return prec;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Obra Clave unica:");
		cad.append(claveU);
		cad.append("\n     Nombre Autor:");
		cad.append(nombreAutor);
		cad.append("\n     Nombre Obra:");
		cad.append(nombreObra);
		cad.append("\n     Tecnica:");
		cad.append(tecnica);
		cad.append("\n     Precio base:");
		cad.append(precioBase);
		cad.append("\n     Alto:");
		cad.append(alto);
		cad.append("\n     Ancho:");
		cad.append(ancho);
		
		return cad.toString();
	}
	
	public int compareTo (Obra otro) {
		int res;
		
		if (this.claveU==otro.claveU) {
			res = 0;
		}
		else {
			if (this.claveU>otro.claveU) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (Obra otro) {
		boolean res;
		
		if (this.claveU==otro.claveU) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
