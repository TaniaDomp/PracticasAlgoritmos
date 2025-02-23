/*Tania Ariadna Dominguez Palma
 * 29/sep/2021
 * Clase que describe una escuela de natacion que calcula el area de sus albercas
 */
public class EscuelaNatacion {
	private String nombre;
	private String domicilio;
	private Rectangulo[] albercas;
	private int numAlbercas;
	private final int MAX_ALB = 10;
	
	public EscuelaNatacion() {
		albercas = new Rectangulo [MAX_ALB];
		numAlbercas = 0;
	}
	
	public EscuelaNatacion(String nombre, String domicilio) {
		this();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public EscuelaNatacion(String nombre, String domicilio, int tamA) {
		this.numAlbercas = 0;
		albercas = new Rectangulo [tamA];
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public int getTotalAlbercas() {
		return numAlbercas;
	}
	
	public String getUnaAlberca(int alb) {
		StringBuilder cad = new StringBuilder();
		
		if (alb >= 1 && alb<= numAlbercas) {
			cad.append(albercas[alb-1].toString());
		}
		return cad.toString();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public boolean altaAlberca(double base, double alto) {
		boolean alb;
		
		if (numAlbercas < albercas.length) {
			albercas[numAlbercas] = new Rectangulo(base, alto);
			numAlbercas ++;
			alb = true;
		}
		else {
			alb = false;
		}
		return alb;
	}
	
	public double areaTotal() {
		double are, sumT=0;
		
		for (int i = 0; i < numAlbercas; i++) {
			are = albercas[i].area();
			sumT += are;
		}
		return sumT;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Escuela Natacion");
		cad.append("\n        Nombre:");
		cad.append(nombre);
		cad.append("\n        Domicilio: ");
		cad.append(domicilio);
		cad.append("\n        Numero de albercas: ");
		cad.append(numAlbercas);
		for (int i= 0; i < numAlbercas; i++) {
			cad.append("\n        Alberca " + (i+1) + ": ");
			cad.append("\n        La altura es: ");
			cad.append(albercas[i].getAltura());
			cad.append("\n        La base es:   ");
			cad.append(albercas[i].getBase());
		}
		return cad.toString();
	}
	
	public int compareTo(EscuelaNatacion otro) {
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
	
	public boolean equals (EscuelaNatacion otro) {
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
