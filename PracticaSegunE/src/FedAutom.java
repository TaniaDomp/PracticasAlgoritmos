/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que describe a una Federacion de Automovilismo 
 */
public class FedAutom {
	private String lugar;
	private final int MAX_PIL = 100;
	private Piloto[] pilotos;
	private int totPilotos;
	
	public FedAutom() {
		pilotos = new Piloto[MAX_PIL];
		totPilotos = 0;
	}
	
	public FedAutom(String lugar) {
		this();
		this.lugar = lugar;
	}
	
	public boolean altaPiloto(String nombre, String genero, int peso, int estatura, int puntosOb, boolean campeonatoOb) {
		Piloto p = new Piloto(nombre, genero, peso, estatura, puntosOb, campeonatoOb);
		boolean alt = false;
		int inicio = 0, fin = totPilotos-1, mitad = (inicio+fin)/2;
		
		if (totPilotos < MAX_PIL) {
			while (inicio <= fin && !pilotos[mitad].equals(p)) {		
				if (pilotos[mitad].compareTo(p)>0) {
					fin = mitad - 1;
				}
				else {
					inicio = mitad + 1;
				}
				mitad = (inicio+fin)/2;
			}
			if (pilotos[mitad] == null || !pilotos[mitad].equals(p)) {
				for (int i = totPilotos; i > inicio; i--) {
					pilotos[i] = pilotos[i-1];
				}
				pilotos[inicio] = p;
				totPilotos++;
				alt = true;
			}
		}
		return alt;
	}
	
	public double promedioPun() {
		double res = 0;
		
		for (int i = 0; i < totPilotos; i++) {
			res += pilotos[i].getPuntosOb();
		}
		res /= totPilotos;
		return res;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nFederacion de Automovilismo");
		cad.append("\nLugar:");
		cad.append(lugar);
		cad.append("\nTotal de pilotos registrados:");
		cad.append(totPilotos);
		for (int i = 0; i < totPilotos; i++) {
			cad.append("\nPiloto " + i + ": ");
			cad.append(pilotos[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(FedAutom otro) {
		int res;
		
		if(this.lugar.equals(otro.lugar)) {
			res = 0;
		}
		else {
			if (this.lugar.compareTo(otro.lugar)>0) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals(FedAutom otro) {
		boolean res;
		
		if(this.lugar.equals(otro.lugar)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}