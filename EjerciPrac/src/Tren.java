/*Tania Ariadna Dominguez Palma
 * 25/09/2021
 * Clase que describe a un tren
 */
public class Tren {
	private int claveU;
	private static int consecutivoClaveU = 200;
	private String marca;
	private int diasUlMant;
	private int kilRer;
	private char tipMan;
	
	public Tren() {
		claveU = consecutivoClaveU;
		consecutivoClaveU +=1;
	}
	
	public Tren (String marca, int diasUlMant, int kilRer, char tipMan) {
		this();
		this.marca = marca;
		this.diasUlMant = diasUlMant;
		this.kilRer = kilRer;
		this.tipMan = tipMan;
	}
	
	public int getClaveU() {
		return claveU;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getDiasUlMant() {
		return diasUlMant;
	}
	
	public int getKilRer() {
		return kilRer;
	}
	
	public char getTipMan() {
		return tipMan;
	}
	
	public int diasMan(String marcaDes) {
		int diasF = 120;
		
		switch(tipMan) {
		case 'u':
			diasF -= 15;
			break;
		case 'm':
			diasF -= 20;
			break;
		case 'g':
			diasF += 5;
		}
		
		if(kilRer > 200000) {
			diasF = 5;
		}
		
		if (this.marca == marcaDes) {
			diasF = 1;
		}
		
		return diasF;
	}
	
	public void Mantenimeinto(char tipMan) {
		this.diasUlMant = 0;
		this.kilRer = 0;
		this.tipMan = tipMan;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Tren Clave unica: ");
		cad.append(claveU);
		cad.append("\n     Marca: ");
		cad.append(marca);
		cad.append("\n     Dias desde el ultimo mantenimiento: ");
		cad.append(diasUlMant);
		cad.append("\n     Kilometros desde el ultimo mantenimiento: ");
		cad.append(kilRer);
		cad.append("\n     Tipo de mantenimiento: ");
		cad.append(tipMan);
		return cad.toString();
	}
	
	public int compareTo(Tren otro) {
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
	
	public boolean equals (Tren otro) {
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
