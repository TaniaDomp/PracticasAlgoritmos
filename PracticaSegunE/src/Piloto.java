/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que describe a un piloto
 */
public class Piloto {
	private String nombre;
	private String genero;
	private int peso;
	private int estatura;
	private int puntosOb;
	private boolean campeonatoOb;
	
	public Piloto() {
		
	}
	
	public Piloto (String nombre, String genero, int peso, int estatura, int puntosOb, boolean campeonatoOb) {
		this.nombre = nombre;
		this.nombre = nombre;
		this.genero = genero;
		this.peso = peso;
		this.estatura = estatura;
		this.puntosOb = puntosOb;
		this.campeonatoOb = campeonatoOb;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getEstatura() {
		return estatura;
	}
	
	public int getPuntosOb() {
		return puntosOb;
	}
	
	public boolean getCampeonatoOb() {
		return campeonatoOb;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	
	public void conteoPuntos (int puntos) {
		this.puntosOb += puntos;
	}
	
	public void campeonato (int campe) {
		boolean res;
		
		if (campe >= 1) {
			res = true;
		}
		else {
			res = false;
		}
		this.campeonatoOb = res;
	}
	
	public int calculaCarbo() {
		int carbo = 0, incG = 0, incE = 0, incP = 0;
		
		if (genero.equals("masculino")) {
			incG = 150;
			if (peso < 70) {
				incP = 40;
			}
		}
		else {
			incG = 120;
			if (peso < 50) {
				incP = 20;
			}
		}
		carbo = incG + incP;
		
		if (estatura >= 160 && estatura < 170) {
			incE = 20;
		}
		else {
			if (estatura >= 170 && estatura <= 180) {
				incE = 25;
			}
			else {
				if (estatura > 180) {
					incE = 30;
				}
			}
		}
		carbo += incE;
		
		return carbo;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nPiloto Nombre: ");
		cad.append(nombre);
		cad.append("\n       Genero: ");
		cad.append(genero);
		cad.append("\n       Peso: ");
		cad.append(peso);
		cad.append("\n       Estatura: ");
		cad.append(estatura);
		cad.append("\n       Puntos obtenidos: ");
		cad.append(puntosOb);
		cad.append("\n       Cuenta con campeonatos: ");
		cad.append(campeonatoOb);
		
		return cad.toString();
	}
	
	public int compareTo(Piloto otro) {
		int res;
		
		if(this.nombre.equals(otro.nombre)) {
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
	
	public boolean equals (Piloto otro) {
		boolean res;
		
		if(this.nombre.equals(otro.nombre)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
