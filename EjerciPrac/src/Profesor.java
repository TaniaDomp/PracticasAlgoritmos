/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Clase que describe a un profesor
 */
public class Profesor {
	private int claveU;
	private static int consecutivoClaveU = 200;
	private String nombre;
	private String areaC;
	private char nivelC;
	private int puntaje;
	
	public Profesor() {
		claveU = consecutivoClaveU;
		consecutivoClaveU ++;
	}
	
	public Profesor (String nombre, String areaC, char nivelC, int puntaje) {
		this();
		this.nombre = nombre;
		this.areaC = areaC;
		this.nivelC = nivelC;
		this.puntaje = puntaje;
	}
	
	public int getClaveU () {
		return claveU;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAreaC() {
		return areaC;
	}
	
	public char getNivelC() {
		return nivelC;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public boolean retaAl(int n) {
		boolean resF;
	
		resF = MetodosProfesor.retaA(n);
		if (resF == true) {
			this.puntaje +=10;
		}
		return resF;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Profesor Clave unica:");
		cad.append(claveU);
		cad.append("\n         Nombre:");
		cad.append(nombre);
		cad.append("\n         Area de conocimiento:");
		cad.append(areaC);
		cad.append("\n         Nivel de conocimiento:");
		cad.append(nivelC);
		cad.append("\n         Puntaje obtenido:");
		cad.append(puntaje);
		return cad.toString();
	}
	
	public int compareTo (Profesor otro) {
		int res;
		
		if (this.claveU==otro.claveU) {
			res = 0;
		}
		else {
			if(this.claveU>otro.claveU) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (Profesor otro) {
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
