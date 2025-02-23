/*Tania Ariadna Dominguez Palma
 * 17/oct/2021
 * Describe un participante de un concurso de programacion
 */
public class Participante {
	private String nombre;
	private int lenguajesD;
	private int edad;
	
	public Participante() {
		
	}
	
	public Participante(String nombre, int lenguajesD, int edad) {
		this.nombre = nombre;
		this.lenguajesD = lenguajesD;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getLenguajesD() {
		return lenguajesD;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setLenguajesD(int lenguajesD) {
		this.lenguajesD = lenguajesD;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nParticipante Nombre: ");
		cad.append(nombre);
		cad.append("\n             Lenguajes que domina: ");
		cad.append(lenguajesD);
		cad.append("\n             Edad: ");
		cad.append(edad);
		return cad.toString();
	}
	
	public int compareTo(Participante otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
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
	
	public boolean equals(Participante otro) {
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
