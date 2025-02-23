/*Tania Ariadna Dominguez Palma
 * 25/09/2021
 * Clase que describe una artesania 
 */
public class Artesania {
	private int claveU;
	private static int consecutivoClaveU = 5;
	private String tipo;
	private String regionO;
	private int tiempoE;
	private int numAr;
	private boolean derechosA;
	
	public Artesania() {
		claveU = consecutivoClaveU;
		consecutivoClaveU +=5;
	}
	
	public Artesania (String tipo, String regionO, int tiempoE, int numAr, boolean derechosA) {
		this();
		this.tipo = tipo;
		this.regionO = regionO;
		this.tiempoE = tiempoE;
		this.numAr = numAr;
		this.derechosA = derechosA;
	}
	
	public int getClaveU() {
		return claveU;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getRegionO() {
		return regionO;
	}
	
	public int getTiempoE() {
		return tiempoE;
	}
	
	public int getNumAr() {
		return numAr;
	}
	
	public boolean getDerechosA() {
		return derechosA;
	}
	
	public void setRegionO(String regionO) {
		this.regionO = regionO;
	}
	
	public void setDerechosA (boolean derechosA) {
		this.derechosA = derechosA;
	}
	
	public double precioV() {
		double precioV = 100, incTiem, incDerA;
		
		if (tipo == "ceramica") {
			precioV += 10;
		}
		
		if (derechosA == true) {
			incDerA = precioV * 0.1;
			precioV += incDerA;
		}
		
		if (tiempoE < 10) {
			incTiem = 15;
		}
		else {
			if (tiempoE >= 10 && tiempoE <= 20) {
				incTiem = 30;
			}
			else {
				incTiem = 50;
			}
		}
		precioV += incTiem;
		
		return precioV;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Artesania Clave Unica: ");
		cad.append(claveU);
		cad.append("\n          Tipo: ");
		cad.append(tipo);
		cad.append("\n          Region originaria: ");
		cad.append(regionO);
		cad.append("\n          Tiempo de elaboracion: ");
		cad.append(tiempoE);
		cad.append("\n          Numero de artesanos que participaron: ");
		cad.append(numAr);
		cad.append("\n          Permiso de derechos de autor: ");
		cad.append(derechosA);
		
		return cad.toString();
	}
	
	public int compareTo(Artesania otro) {
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
	
	public boolean equals (Artesania otro) {
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
