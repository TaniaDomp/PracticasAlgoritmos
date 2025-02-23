/*Tania Ariadna Dominguez Palma
 * 8/nov/2021
 * Clase que describe una serpiente
 */
public class Serpiente implements Comparable<Serpiente>{
	private int clave;
	private static int generadorClave = 101;
	private String tipo;
	private String longitud;
	private double peso;
	private String alimento;
	private char genero;
	
	public Serpiente(int clave) {
		this.clave = clave;
	}
	
	public Serpiente(String tipo, String longitud, double peso, String alimento, char genero) {
		this.clave = generadorClave;
		generadorClave++;
		this.tipo = tipo;
		this.longitud = longitud;
		this.peso = peso;
		this.alimento = alimento;
		this.genero = genero;
	}

	public int getClave() {
		return clave;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLongitud() {
		return longitud;
	}

	public double getPeso() {
		return peso;
	}

	public String getAlimento() {
		return alimento;
	}

	public char getGenero() {
		return genero;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Serpiente Clave: ");
		cad.append(clave);
		cad.append("\n          Tipo: ");
		cad.append(tipo);
		cad.append("\n          Longitud: ");
		cad.append(longitud);
		cad.append("\n          Peso: ");
		cad.append(peso);
		cad.append("\n          Alimento: ");
		cad.append(alimento);
		cad.append("\n          Genero: ");
		cad.append(genero);
		return cad.toString();
	}
	
	public int compareTo(Serpiente otro) {
		return this.clave - otro.clave;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clave;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serpiente other = (Serpiente) obj;
		if (clave != other.clave)
			return false;
		return true;
	}
}
