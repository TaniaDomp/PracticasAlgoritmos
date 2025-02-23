/*Tania Ariadna Dominguez Palma
 * 16/oct/2021
 * Clase que describe a una persona de nacionalidad 
 */
public class Persona {
	private String curp;
	private String nombres;
	private String apellidoP;
	private String apellidoM;
	private String genero;
	private int edad;
	private String nacionalidad;
	
	public Persona(String curp) {
		this.curp = curp;
	}
	
	public Persona(String curp, String nombres, String apellidoP, String apellidoM, String genero, int edad, String nacionalidad) {
		this(curp);
		this.nombres = nombres;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.genero = genero;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}
	
	public String getCurp() {
		return curp;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public String getApellidoP() {
		return apellidoP;
	}
	
	public String getApellidoM() {
		return apellidoM;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nPersona CURP:");
		cad.append(curp);
		cad.append("\n        Nombre(s):");
		cad.append(nombres);
		cad.append("\n        Apellido paterno:");
		cad.append(apellidoP);
		cad.append("\n        Apellido materno:");
		cad.append(apellidoM);
		cad.append("\n        Edad:");
		cad.append(edad);
		cad.append("\n        Nacionalidad:");
		cad.append(nacionalidad);
		cad.append("\n        Genero:");
		cad.append(genero);
		
		return cad.toString();
	}
	
	public int compareTo(Persona otro) {
		int res;
		
		if (this.curp.equals(otro.curp)) {
			res = 0;
		}
		else {
			if(this.curp.compareTo(otro.curp)>0) {
				res = 1; 
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals(Persona otro) {
		boolean res;
		
		if (this.curp.equals(otro.curp)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
