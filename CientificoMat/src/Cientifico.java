/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Describe a un cientifico que realiza diversas actividades
 */
public class Cientifico {
	private String nombre, areaEspecialidad;
	private int añoN;
	
	public Cientifico() {
	}
	
	public Cientifico(String nombre, String areaEspecialidad, int añoN) {
		this.nombre = nombre;
		this.areaEspecialidad = areaEspecialidad;
		this.añoN = añoN;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAreaEspecialidad() {
		return areaEspecialidad;
	}
	
	public int getAñoN() {
		return añoN;
	}
	
	public void setAreaEspecialidad(String areaEspecialidad) {
		this.areaEspecialidad = areaEspecialidad;
	}
	
	public boolean estaOrdenCreciente(int numero1, int numero2) {
		boolean res;
		if (numero1 < numero2) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	public String ordenaCreciente(int numero1, int numero2) {
		StringBuilder ord = new StringBuilder();
		if (numero1 < numero2) {
			ord.append(numero1 + "-" + numero2);
		}
		else {
			ord.append(numero2 + "-" + numero1);
		}
		return ord.toString();
	}
	
	public boolean esImpar(int numero) {
		boolean r;
		int resd;
		resd = numero % 2;
		
		if (resd != 0) {
			r = true;
		}
		else {
			r = false;
		}
		return r;
	}
	
	public double calculaFuncion1 (double x) {
		double resu;
		if (x <= 11) {
			resu = 3*x +36;
		}
		else {
			if(x <= 33) {
				resu = Math.pow(x, 2) -10;
			}
			else {
				if (x<=64) {
					resu = x+6;
				}
				else {
					resu = 0;
				}
			}
		}
		
		return resu;
	}
	
	public double calculaFuncion2(int x) {
		double res = 0;
		int resm;
		resm = x % 4;
		switch (resm) {
		case 0:
			res = Math.pow(x, 2);
			break;
		case 1: 
			res = x/6;
			break;
		case 2:
			res = Math.sqrt(x);
			break;
		case 3:
			res = Math.pow(x, 3) + 5;
			//break;
		}
		return res;
	}
	
	public double calculaFuncion3(int num, int v) {
		double resu = 0;
		switch (num) {
		case 1:
			resu = 100*v;
			break;
		case 2:
			resu = Math.pow(100, v);
			break;
		case 3:
			
			resu = 100/v;
			break;
		case 4: 
			resu = 0;
			//break;
		}
		return resu;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("\nNombre del cientifico: ");
		cad.append(nombre);
		cad.append("\n su area de especialidad: ");
		cad.append(areaEspecialidad);
		cad.append("\n su edad: ");
		cad.append(añoN);
		return cad.toString(); 
	}
	
	public int compareTo(Cientifico otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res =0; 
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
	
	public boolean equals(Cientifico otro) {
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
