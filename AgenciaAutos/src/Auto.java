/*Tania Ariadna Dominguez Palma
 * 16/sep/2021
 * Describe un auto que se renta en una agencia 
 */
public class Auto {
	private int claveU;
	private static int consecutivoClaveU = 1;
	private String marca;
	private int año;
	private int numKil;
	private String nombreClien;
	private int numLicen;
	
	public Auto () {
		claveU = consecutivoClaveU;
		consecutivoClaveU +=1;
	}
	
	public Auto (String marca, int año, int numKil) {
		this();
		this.marca = marca;
		this.año = año;
		this.numKil = numKil;
	}
	
	public int getClaveU() {
		return claveU;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAño() {
		return año;
	}
	
	public int getNumKil() {
		return numKil;
	}
	
	public String getNombreClien() {
		return nombreClien;
	}
	
	public int getNumLicen() {
		return numLicen;
	}
	
	public double realizaRenta(int numDias, String nombreClien, int numLicen) {
		
		double cobro, aumen = 0;
		
		this.nombreClien = nombreClien;
		this.numLicen = numLicen;
		
		if (año < 2005) {
			cobro = 200 * numDias;
		}
		else {
			cobro = 300 * numDias;
		}
		if (numKil < 20000) {
			aumen = 20*numDias;
		}
		cobro += aumen;
		return cobro;
	}
	
	public void realizaDev(int kmrecor) {
		this.numKil += kmrecor;
		this.numLicen = 0;
		this.nombreClien = null;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("Auto Clave unica: ");
		cad.append(claveU);
		cad.append("\n     Marca: ");
		cad.append(marca);
		cad.append("\n     Año: ");
		cad.append(año);
		cad.append("\n     Numero de kilometros: ");
		cad.append(numKil);
		cad.append("\n     Nombre del cliente: ");
		cad.append(nombreClien);
		cad.append("\n     Numero de licencia: ");
		cad.append(numLicen);
		
		return cad.toString();
	}
	
	public int compareTo(Auto otro) {
		
		int res;
		if (this.claveU ==otro.claveU) {
			res =0; 
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
	
	public boolean equals (Auto otro) {
		
		boolean res;
		
		if (this.claveU ==otro.claveU) {
			res = true; 
		}
		else {
			res = false;
		}
		
		return res;
	}
}
