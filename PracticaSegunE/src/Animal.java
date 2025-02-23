/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Describe a un animal de un zoologico
 */
public class Animal {
	private String nombre;
	private String raza;
	private int edad;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public Animal (String nombre, String raza, int edad) {
		this(nombre);
		this.raza = raza;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Animal Nombre: ");
		cad.append(nombre);
		cad.append("\n       Raza: ");
		cad.append(raza);
		cad.append("\n       Edad: ");
		cad.append(edad);
		return cad.toString();
	}
	
	public int compareTo(Animal otro) {
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
	
	public boolean equals(Animal otro) {
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
