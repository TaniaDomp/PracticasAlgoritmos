/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que describe un campamento de verano
 */
public class CampamentoVerano {
	private String lugar;
	private String fechaR;
	private String responsable;
	private Persona[] asistentes;
	private int totAsistentes;
	private final int MAX_ASIS = 100;
	
	public CampamentoVerano(){
		totAsistentes = 0;
		asistentes = new Persona[MAX_ASIS];
	}
	
	public CampamentoVerano(String lugar, String fechaR, String responsable) {
		this();
		this.lugar = lugar;
		this.fechaR = fechaR;
		this.responsable = responsable;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public String getFechaR() {
		return fechaR;
	}
	
	public String getResponsable() {
		return responsable;
	}
	
	public String getUnAsistente(String curp) {
		Persona p = new Persona(curp);
		int i = 0;
		String res;
		
		while (i < MAX_ASIS && asistentes[i].compareTo(p)<0) {
			i++;
		}
		if (i == MAX_ASIS || !asistentes[i].equals(p)) {
			res = "Asistente no registrado";
		}
		else {
			res = asistentes[i].toString();
		}
		return res;
	}
	
	public void setFechaR(String fechaR) {
		this.fechaR = fechaR;
	}
	
	public boolean altaAsistente(String curp, String nombres, String apellidoP, String apellidoM, String genero, int edad, String nacionalidad) {
		boolean alt = false;
		
		if (totAsistentes < MAX_ASIS) {
			asistentes[totAsistentes] = new Persona(curp, nombres, apellidoP, apellidoM, genero, edad, nacionalidad);
			totAsistentes++;
			alt = true;
		}
		return alt;
	}
	
	public boolean bajaAsistente(String curp) {
		Persona p = new Persona(curp);
		int i = 0;
		boolean baj = false;
		
		while (i < totAsistentes && !asistentes[i].equals(p)) {
			i++;
		}
		if (i < totAsistentes) {
			for (int a = i; a < totAsistentes-1; a++) {
				asistentes[a] = asistentes[a+1];
			}
			totAsistentes--;
			asistentes[totAsistentes] = null;
			baj = true;
		}
		return baj;
	}
	
	public int asisHombres() {
		int res = 0;
		
		for (int i = 0; i < totAsistentes; i++) {
			if (asistentes[i].getGenero().equals("hombre")) {
				res++;
			}
		}
		return res;
	}
	
	public int asisMujeres() {
		int res = 0;
		
		for (int i = 0; i < totAsistentes; i++) {
			if (asistentes[i].getGenero().equals("mujer")) {
				res++;
			}
		}
		return res;
	}
	
	public int asisNacio() {
		int res = 0;
		
		for (int i = 0; i < totAsistentes; i++) {
			if (asistentes[i].getNacionalidad().equals("mexicano")) {
				res++;
			}
		}
		return res;
	}
	
	public String edadAsist() {
		StringBuilder cad = new StringBuilder();
		int tre = 0, treDi = 0, diVei = 0, vei = 0; 
		
		for (int i = 0; i < totAsistentes; i++) {
			if (asistentes[i].getEdad() < 13) {
				tre++;
			}
			else {
				if (asistentes[i].getEdad() <= 16) {
					treDi++;
				}
				else {
					if (asistentes[i].getEdad() <= 21) {
						diVei++;
					}
					else {
						vei++;
					}
				}
			}
		}
		cad.append("\nAsistentes menores de 13 años: ");
		cad.append(tre);
		cad.append("\nAsistentes de 13 - 16 años: ");
		cad.append(treDi);
		cad.append("\nAsistentes 17 - 21 años: ");
		cad.append(diVei);
		cad.append("\nAsistentes mayores de 21 años: ");
		cad.append(vei);
		return cad.toString();
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Campamento Verano Lugar: ");
		cad.append(lugar);
		cad.append("\n                 Fecha de realizacion: ");
		cad.append(fechaR);
		cad.append("\n                 Responsable: ");
		cad.append(responsable);
		cad.append("\n                 Numero de asistentes: ");
		cad.append(totAsistentes);
		for (int i = 0; i < totAsistentes; i++) {
			cad.append("\n                 Persona " + i + ":");
			cad.append(asistentes[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(CampamentoVerano otro) {
		int res;
		
		if (this.lugar.equals(otro.lugar)) {
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
	
	public boolean equals(CampamentoVerano otro) {
		boolean res;
		
		if (this.lugar.equals(otro.lugar)) {
			res = true;
		}
		else {
			res = false;		
		}
		return res;
	}
}
