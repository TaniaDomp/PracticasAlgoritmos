/*Tania Ariadna Dominguez Palma
 * 03/dic/2021
 * Clase que describe un alimento de un Restaurante
 */
public class Alimento implements Comparable<Alimento>{
	private String clave;
	private String nombre;
	private String descripcion;
	private double precio;
	
	Alimento(String clave){
		this.clave = clave;
	}
	
	Alimento(String clave, String nombre, String descripcion, double precio){
		this.clave = clave;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Alimento Clave: ");
		cad.append(clave);
		cad.append("\n         Nombre: ");
		cad.append(nombre);
		cad.append("\n         Descripcion: ");
		cad.append(descripcion);
		cad.append("\n         Precio: ");
		cad.append(precio);
		return cad.toString();
	}
	
	public int compareTo(Alimento otro) {
		return this.clave.compareTo(otro.clave);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alimento other = (Alimento) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}
	
}
