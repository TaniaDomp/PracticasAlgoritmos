/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Describe a un zoologico
 */
public class Zoologico {
	private String nombre;
	private String lugar;
	private Animal[] animales;
	private int totAnimales;
	private final int MAX_AN = 20;
	
	public Zoologico() {
		animales = new Animal[MAX_AN];
		totAnimales = 0;
	}
	
	public Zoologico(String nombre, String lugar) {
		this();
		this.nombre = nombre;
		this.lugar = lugar;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public String getUnAnimal(String nombre) {
		Animal an = new Animal(nombre);
		int i = 0;
		String res;
		
		while (i < totAnimales && animales[i].compareTo(an)<0) {
			i++;
		}
		if (i == totAnimales || !animales[i].equals(an)) {
			res = "Animal no registrado";
		}
		else {
			res = animales[i].toString();
		}
		return res;
	}
	
	public boolean altaAnimal(String nombre, String raza, int edad) {
		boolean res = false;
				
		if (totAnimales < MAX_AN) {
			animales[totAnimales] = new Animal (nombre, raza, edad);
			totAnimales++;
			res = true;
		}
		return res;
	}
	
	public int animalesRaza(String raza) {
		int res = 0;
		
		for (int i = 0; i < totAnimales; i++) {
			if (animales[i].getRaza().equals(raza)) {
				res++;
			}
		}
		return res;
	}
	
	public double promedioEdad() {
		int res = 0, promE;
		
		for (int i = 0; i < totAnimales; i++) {
			res += animales[i].getEdad();
		}
		promE = res / totAnimales;
		return promE;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Zoologico Nombre: ");
		cad.append(nombre);
		cad.append("\n         Lugar: ");
		cad.append(lugar);
		cad.append("\n         Total de animales registrados: ");
		cad.append(totAnimales);
		for (int i = 0; i < totAnimales; i++) {
			cad.append("\n         Animal " + i + ": ");
			cad.append(animales[i].toString());
		}
		return cad.toString();
	}
	
	public int compareTo(Zoologico otro) {
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
	
	public boolean equals(Zoologico otro) {
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
