/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Clase que describe a una bicicleta
 */
public class Bicicleta {
	private int claveU;
	private static int consClaveU = 200;
	private char tipo;
	private int numeroAcE;
	private char material;
	
	public Bicicleta () {
		claveU = consClaveU;
		consClaveU ++;
	}
	
	public Bicicleta(char tipo, int numeroAcE, char material) {
		this();
		this.tipo = tipo;
		this.numeroAcE = numeroAcE;
		this.material = material;
	}
	
	public int getClaveU () {
		return claveU;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public int getNumeroAcE() {
		return numeroAcE;
	}
	
	public char material() {
		return material;
	}
	
	public double calculaPrecioVenta(){
		double prec = 0, auM = 0, auA;
		
		switch (tipo) {
		case 'U':
			prec = 7000;
			break;
		case 'P':
			prec = 15000;
			break;
		case 'M':
			prec = 27000;
		}
		
		if (material == 'A') {
			auM = 2000;
		}
		else {
			 if (material == 'C') {
				 auM = 5000;
			 }
		}
		prec += auM;
		
		if (numeroAcE < 3) {
			auA = 0;
		}
		else {
			if (numeroAcE >= 3 && numeroAcE < 4) {
				auA = 600;
			}
			else {
				auA = 1000;
			}
		}
		prec += auA;
		return prec;
	}
	
	public String toString () {
		StringBuilder cad = new StringBuilder ();
		
		cad.append("Bicicleta Clave unica:");
		cad.append(claveU);
		cad.append("\n          tipo:");
		cad.append(tipo);
		cad.append("\n          Numero de accesorios:");
		cad.append(numeroAcE);
		cad.append("\n          Material:");
		cad.append(material);
		return cad.toString();
	}
	
	public int compareTo(Bicicleta otro) {
		int res;
		
		if (this.claveU == otro.claveU) {
			res = 0;
		}
		else {
			if (this.claveU > otro.claveU) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (Bicicleta otro) {
		boolean res;
		
		if (this.claveU == otro.claveU) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
